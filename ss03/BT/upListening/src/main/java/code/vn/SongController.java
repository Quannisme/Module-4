package code.vn;

import code.vn.modell.Song;
import code.vn.modell.SongForm;
import code.vn.service.SongService;
import code.vn.service.SongServiceImp;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/music")
@PropertySource("classpath:file-update.properties")
public class SongController {
    private final SongService service=new SongServiceImp();

    @Value("${file-upload}")
    private String fileUpload;
    @GetMapping("/")
    public String viewList(Model model)
    {
        model.addAttribute("musicList",service.findAll());
        List<Song> songs = service.findAll();
        return "/music/list";
    }
    @GetMapping("/create")
    public String viewCreate(Model model)
    {
        model.addAttribute("songForm",new Song());
        model.addAttribute("types",getFormatSong());
        return "/music/create";
    }
    @PostMapping("/create")
    public String doCreate(Model model, @ModelAttribute SongForm songForm)
    {
        MultipartFile multipartFile = songForm.getLink();
        String fileName = multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(songForm.getLink().getBytes(), new File(fileUpload + fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Song song=new Song(songForm.getName(),songForm.getAuthor(),songForm.getType(),fileName);
        service.save(song);
        model.addAttribute("songForm", songForm);
        model.addAttribute("message", "Created new product successfully !");
        return "redirect:/music/";
    }
    private List<String> getFormatSong() {
        List<String> formatSongs = new ArrayList<>();
        formatSongs.add("Nhạc trẻ");
        formatSongs.add("Nhạc cổ điển");
        formatSongs.add("Nhạc rock");
        formatSongs.add("Nhạc trữ tình");
        return formatSongs;
    }
}
