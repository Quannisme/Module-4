package code.vn.service;

import code.vn.modell.Song;

import java.util.ArrayList;
import java.util.List;

public class SongServiceImp implements SongService{
    private List<Song>songs=new ArrayList<>();
    @Override
    public List<Song> findAll() {
        return songs;
    }

    @Override
    public void save(Song song) {
        songs.add(song);
    }
}
