package egs.home14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Jukebox3 {
    List<Song> listSong = new ArrayList<>();

    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        getSong();
        System.out.println("by add " + listSong);
        Collections.sort(listSong);
        System.out.println("by  Artist " + listSong);
        Comparator<Song> comparator = new Comparator<Song>() {
            @Override
            public int compare(Song song, Song t1) {
                return song.artist.compareTo(t1.artist);
            }
        };
        Collections.sort(listSong, comparator);
        System.out.println("by title " + listSong);
        HashSet<Song> hashSet = new HashSet<>();
        hashSet.addAll(listSong);
        System.out.println("whiteout duplicet " + hashSet);


    }

    public void getSong() {
        File fileSong = new File("/home/arsen/Desktop/fileSong.txt");
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileSong))) {
            while ((line = bufferedReader.readLine()) != null) {
                addSong(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void addSong(String line) {
        String[] tokes = line.split("/");
        Song nextSong = new Song(tokes[0], tokes[1]);
        listSong.add(nextSong);
    }
}
