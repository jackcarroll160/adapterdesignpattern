package adapterdesignpattern;
/**
 * Interface for Digital Album
 * @author Jackson Carroll
 */
public interface DigitalAlbum {
    public String playFromBeginning();
    public String playSong(int num);
    public String prevSong();
    public String nextSong();
    public String stop();
    public String pause();
}
