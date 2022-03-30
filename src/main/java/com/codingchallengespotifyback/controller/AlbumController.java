package com.codingchallengespotifyback.controller;

import com.codingchallengespotifyback.domain.Album;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlbumController {

    private final AlbumRepository repository;

    public AlbumController(AlbumRepository repository) {
        this.repository = repository;
    }

    @PutMapping("/album/{albumId}")
    Album newAlbum(@PathVariable String albumId) {
        return repository.save(new Album(albumId));
    }
}
