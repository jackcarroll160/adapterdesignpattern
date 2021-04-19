package adapterdesignpattern;
/**
 * AnalogAdapter class implementing AnalogAlbum interface for adapting execution
 * @author Jackson Carroll
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    /**
     * Parameterized Constructor for AnalogAdapter
     * @param album a DigitalAlbum to adapt the two albums
     */
    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    /**
     * When play is called, it executes and returns the digital album's next song
     * @return the album's next song
     */
    public String play() {
        return album.nextSong();
    }

    /**
     * When rewind is called, it executes and returns the digital album's previous song
     * @return the album's previous song
     */
    public String rewind() {
        return album.prevSong();
    }

    /**
     * When fast forward is called, it executes and returns the digital album's next song
     * @return the album's next song
     */
    public String ffwd() {
        return album.nextSong();
    }

    /**
     * When pause is called, it executes and returns the digital album's pause
     * @return the album's pause method
     */
    public String pause() {
        return album.pause();
    }

    /**
     * When stopEject is called, it executes and returns the digital album's stop method
     * @return the album's stop method
     */
    public String stopEject() {
        return album.stop();
    }
}
