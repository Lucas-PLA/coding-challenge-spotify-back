package com.codingchallengespotifyback.controller;

import com.codingchallengespotifyback.domain.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, String> {
}
