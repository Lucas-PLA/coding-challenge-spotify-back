package com.codingchallengespotifyback.controller;

import com.codingchallengespotifyback.domain.Album;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlbumController {

    private final AlbumRepository repository;

    public AlbumController(AlbumRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/album")
    List<Album> getAllAlbums() {
        return repository.findAll();
    }

    @PutMapping("/album/{albumId}")
    Album addNewSavedAlbum(@PathVariable String albumId) {
        return repository.save(new Album(albumId));
    }
}
