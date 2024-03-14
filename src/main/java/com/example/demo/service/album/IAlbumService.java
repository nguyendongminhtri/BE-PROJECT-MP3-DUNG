package com.example.demo.service.album;

import com.example.demo.model.Album;
import com.example.demo.model.Song;
import com.example.demo.service.IGenericService;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAlbumService extends IGenericService<Album> {
    Boolean existsByName(String name);
    List<Album> findAllByUserId(Long userId);

    List<Song> findByIdAlbum(Long id);
}
