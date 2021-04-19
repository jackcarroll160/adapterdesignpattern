//package csce247.assignments.adapter;

public class MusicDriver {

	public void RunMusicDriver() {
		AnalogAlbum beatlesTape = new Cassett("A hard Day's Night", "I should Have Known Better", "If I Fell", "I'm Happy Just To Dance With You", "And I Love Her");
		DigitalAlbum oasisCD = new CD("Hello", "Hey Now!", "She's Electric", "Wonderwall", "Champagne Supernova");
		AnalogAlbum oasisTape = new AnalogAdapter(oasisCD);
		
		System.out.println("*********** Displaying a Beatles Cassett ***************");
		runAnalogAlbumFeatures(beatlesTape);
		
		System.out.println("\n*********** Displaying an Oasis CD ***************");
		runAnalogAlbumFeatures(oasisTape);
	}
	
	private void runAnalogAlbumFeatures(AnalogAlbum album) {
		System.out.println(album.play());
		System.out.println(album.play());
		System.out.println(album.ffwd());
		System.out.println(album.play());
		System.out.println(album.play());
		System.out.println(album.rewind());
		System.out.println(album.rewind());
		System.out.println(album.rewind());
		System.out.println(album.play());
		
	}
	
	public static void main(String[] args) {
		MusicDriver mDriver = new MusicDriver();
		mDriver.RunMusicDriver();
		
	}
}
