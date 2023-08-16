package code.vn.service;

import code.vn.modell.Song;

import java.util.List;

public interface SongService {
    List<Song>findAll();
    void save(Song song);
}
