package adapterdesignpattern;

import java.util.ArrayList;
/**
 * Class for Cassett song list implementing AnalogAlbum interface
 * @author Jackson Carroll
 */
public class Cassett implements AnalogAlbum {
    private ArrayList<String> songs = new ArrayList<>();
    private int currentIndex = 0;

    /**
     * Parameterized Constructor accepting 5 song titles then adding them to the local songs ArrayList
     * @param song1 a String for the first song name on the cassett
     * @param song2 a String for the second song name on the cassett
     * @param song3 a String for the third song name on the cassett
     * @param song4 a String for the fourth song name on the cassett
     * @param song5 a String for the fifth song name on the cassett
     */
    public Cassett(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays the current song on the cassett
     * @return a String for the song currently playing or rewind message
     */
    public String play() {
        if(currentIndex <= songs.size())
            return "Playing song " + (1 + currentIndex) + ": " + songs.get(currentIndex++);
        return "At the end of the cassett you need to rewind";
        
    }

    /**
     * Attempts to rewind the cassett by one song
     * @return a String for the song it's rewinding to or, if at the beginning, a String for being fully re-wound
     */
    public String rewind() {
        if(currentIndex > 0)
            return "Rewinding to song " + (currentIndex--);
        return "Fully Re-Wound";
    }

    /**
     * Attempts to fast forward up the list by one song 
     * @return a String if there is a next song or returns a String saying the end has been reached
     */
    public String ffwd() {
        if(++currentIndex <= songs.size())
            return "Forwarding to song " + (currentIndex + 1);
        return "Forwarded to the end of the cassett";
    }

    /**
     * Pause method to pause the cassett
     * @return a String for pausing the cassett
     */
    public String pause() {
        return "Pausing...";
    }

    /**
     * Stops the casset and ejects it from the player
     * @return a String for stopping the casset and ejecting the tape
     */
    public String stopEject() {
        return "Stopping cassett and ejecting";
    }
}
