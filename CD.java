import java.util.ArrayList;
/**
 * CD class implementing DigitalAlbum
 * @author Jackson Carroll
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() {
        return "Playing song 1: " + songs.get(0);
        // Will also advance to the next song
    }

    public String playSong(int num) {
        if(num < songs.size() && num > 0)
            return "Playing: " + songs.get(currentIndex);
        return "Not a valid song number";
    }

    public String prevSong() {
        if(currentIndex - 1 > 0)
            return "Skipping back and playing: " + songs.get(currentIndex);
        return "Already at the beginning";
    }

    public String nextSong() {
        if(currentIndex + 1 < songs.size())
            return "Playing " + currentIndex + ":" + songs.get(currentIndex);
        return "Playing 1: " + songs.get(0);
    }

    public String stop() {
        currentIndex = 0;
        return "Stopping digital album";
    }

    public String pause() {
        return "Pausing " + songs.get(currentIndex);
    }
    
}
