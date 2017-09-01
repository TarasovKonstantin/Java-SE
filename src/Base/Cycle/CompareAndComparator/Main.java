package Base.Cycle.CompareAndComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("R U Mine", 345));
        songs.add(new Song("Arabella", 300));
        songs.add(new Song("Suck it and see", 250));
        songs.add(new Song("Black treacle", 200));

        for (Song song:songs){
            System.out.println(song.toString());
        }

        Collections.sort(songs);

        for (Song song:songs){
            System.out.println(song.toString());
        }





    }
}
