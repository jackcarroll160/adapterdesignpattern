package adapterdesignpattern;
/**
 * AnalogAdapter class implementing AnalogAlbum interface
 * @author Jackson Carroll
 */
public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    public String play() {
        return album.nextSong();
    }

    public String rewind() {
        return album.prevSong();
    }

    public String ffwd() {
        return album.nextSong();
    }

    public String pause() {
        return album.pause();
    }

    public String stopEject() {
        return album.stop();
    }
}
