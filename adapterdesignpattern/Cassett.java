package adapterdesignpattern;

import java.util.ArrayList;
/**
 * Class for Cassett song list implementing AnalogAlbum interface
 * @author Jackson Carroll
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<>();
    private int currentIndex = 0;

    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    public String play() {
        if(currentIndex <= songs.size())
            return "Playing song " + (1 + currentIndex) + ": " + songs.get(currentIndex++);
        return "At the end of the cassett you need to rewind";
        
    }

    public String rewind() {
        if(currentIndex > 0)
            return "Rewinding to song " + (currentIndex--);
        return "Fully Re-Wound";
    }

    public String ffwd() {
        if(++currentIndex <= songs.size())
            return "Forwarding to song " + (currentIndex + 1);
        return "Forwarded to the end of the cassett";
    }

    public String pause() {
        return "Pausing...";
    }

    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
