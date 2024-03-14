package com.example.demo.repository;

import com.example.demo.model.Album;
import com.example.demo.model.PlayList;
import com.example.demo.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAlbumRepository extends JpaRepository<Album, Long> {
    Boolean existsByName(String name);
    List<Album> findAllByUserId(Long userId);
    @Query("select ab.songList from Album ab WHERE ab.id = :id")
    List<Song> findByIdAlbum(Long id);
}
