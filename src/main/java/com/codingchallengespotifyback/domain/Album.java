package com.codingchallengespotifyback.domain;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Album {

    private @Id String id;
    private boolean isLiked;
    private @ElementCollection List<String> tags;

    public Album() {}

    public Album(String id) {
        this.id = id;
        this.isLiked = false;
        this.tags = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isLiked() {
        return isLiked;
    }

    public void setLiked(boolean liked) {
        isLiked = liked;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return isLiked == album.isLiked && id.equals(album.id) && Objects.equals(tags, album.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isLiked, tags);
    }

    @Override
    public String toString() {
        return "Album{" +
                "id='" + id + '\'' +
                ", isLiked=" + isLiked +
                ", tags=" + tags +
                '}';
    }
}
