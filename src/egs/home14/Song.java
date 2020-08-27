package egs.home14;

import java.util.Objects;

public class Song implements Comparable<Song> {
    String title;
    String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return this.title +" "+ this.artist;
    }


    @Override
    public int compareTo(Song o) {
        return title.compareTo(o.title);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Song)) return false;
        Song song = (Song) o;
        return Objects.equals(getTitle(), song.getTitle()) &&
                Objects.equals(getArtist(), song.getArtist());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getArtist());
    }
}

