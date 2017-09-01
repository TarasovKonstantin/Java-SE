package Base.Cycle.CompareAndComparator;

public class Song implements Comparable<Song>{
    private String name;
    private int lenght;

    Song(String s, int l){
        name = s;
        lenght = l;
    }

    @Override
    public int compareTo(Song song) {
        System.out.println(this.lenght + "  ---   " + song.lenght);
        return this.lenght - song.lenght;
    }

    public String getName() {
        return name;
    }

    public int getLenght() {
        return lenght;
    }

    public String toString(){
        return name;
    }
}
