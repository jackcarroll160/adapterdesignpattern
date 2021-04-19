package adapterdesignpattern;
/**
 * Interface for Analog Album
 * @author Jackson Carroll
 */
public interface AnalogAlbum {
    public String play();
    public String rewind();
    public String ffwd();
    public String pause();
    public String stopEject();
}
