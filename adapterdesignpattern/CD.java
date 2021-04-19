package adapterdesignpattern;

import java.util.ArrayList;
/**
 * CD class implementing DigitalAlbum
 * @author Jackson Carroll
 */
public class CD implements DigitalAlbum {
    private ArrayList<String> songs = new ArrayList<>();
    private int currentIndex = 0;

    /**
     * Parameterized Constructor that accepts 5 songs and adds them to the ArrayList
     * @param song1 a String for the album's first song name
     * @param song2 a String for the album's second song name
     * @param song3 a String for the album's third song name
     * @param song4 a String for the album's fourth song name
     * @param song5 a String for the album's fifth song name
     */
    public CD(String song1, String song2, String song3, String song4, String song5) {
        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
        songs.add(song4);
        songs.add(song5);
    }

    /**
     * Plays the CD from the beginning
     * Advances to the next song through the playSong method
     * @return playSong method with 1 to start at the beginning
     */
    public String playFromBeginning() {
        return playSong(1);
    }

    /**
     * Checks for valid index then plays the song if it is valid
     * And advances to the next song
     * @return a String for the song number and name or a String for an invalid number method
     */
    public String playSong(int num) {
        currentIndex = num - 1;
        if(currentIndex < songs.size() && currentIndex > 0)
            return "Playing song " + num + ": " + songs.get(currentIndex) + "\n" + nextSong();
        return "Not a valid song number";
    }

    /**
     * Attempts to reverse the currentIndex by one to get the previous song in the album
     * @return a String for the song being skipped or a String to signify it is at the beginning 
     */
    public String prevSong() {
        if(--currentIndex > 0)
            return "Skipping back and playing: " + songs.get(currentIndex - 1);
        return "Already at the beginning";
    }

    /**
     * Attempts to get the next song on the album
     * @return a String for the next song name and number and once at the end it goes back to the beginning
     */
    public String nextSong() {
        if(currentIndex <= songs.size())
            return "Playing: " + (currentIndex + 1) + ": " + songs.get(currentIndex++);
        return playFromBeginning();
    }

    /**
     * Goes back to the beginning of the CD then stops and ejects the CD
     * @return a String for stopping and ejecting the CD
     */
    public String stop() {
        playFromBeginning();
        return "Stopping CD and ejecting";
    }

    /**
     * Returns the current song that is being paused 
     * @return a String for the song being paused
     */
    public String pause() {
        return "Pausing " + songs.get(currentIndex);
    }
    
}
