package adapterdesignpattern;

import java.util.ArrayList;
/**
 * CD class implementing DigitalAlbum
 * @author Jackson Carroll
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<>();
    private int currentIndex = 0;

    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String playFromBeginning() {
        return playSong(1);
    }

    public String playSong(int num) {
        currentIndex = num - 1;
        if(currentIndex < songs.size() && currentIndex > 0)
            return "Playing song " + num + ": " + songs.get(currentIndex) + "\n" + nextSong();
        return "Not a valid song number";
    }

    public String prevSong() {
        if(--currentIndex > 0)
            return "Skipping back and playing: " + songs.get(currentIndex - 1);
        return "Already at the beginning";
    }

    public String nextSong() {
        if(currentIndex <= songs.size())
            return "Playing: " + (currentIndex + 1) + ": " + songs.get(currentIndex++);
        return playFromBeginning();
    }

    public String stop() {
        playFromBeginning();
        return "Stopping CD and ejecting";
    }

    public String pause() {
        return "Pausing " + songs.get(currentIndex);
    }
    
}
