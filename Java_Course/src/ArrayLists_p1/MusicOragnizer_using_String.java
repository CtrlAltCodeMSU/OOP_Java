package ArrayLists_p1;

import java.util.ArrayList;

public class MusicOragnizer_using_String {
	private ArrayList<String[]> files;
	private MusicPlayer player;

	public MusicOragnizer_using_String() {
		// Initialize an ArrayList to hold arrays of Strings
		files = new ArrayList<String[]>();
		// Initialize the MusicPlayer object
		player = new MusicPlayer();
	}

	// Method to add a music file
	public void addMusicFile(String songName, String artist, String album) {
		// Create a String array to hold the song details
		String[] songDetails = {songName, artist, album};
		// Add the song details to the files list
		files.add(songDetails);
	}

	// Print all the music files stored in the list
	public void listMusicFiles() {
		for (String[] song : files) {
			System.out.println("Song: " + song[0] + ", Artist: " + song[1] + ", Album: " + song[2]);
		}
	}

	public static void main(String[] args) {
		MusicOragnizer_using_String organizer = new MusicOragnizer_using_String();
		organizer.addMusicFile("Shape of You", "Ed Sheeran", "Divide");
		organizer.addMusicFile("Blinding Lights", "The Weeknd", "After Hours");

		// List all the music files
		organizer.listMusicFiles();
	}
}

class MusicPlayer_ {
	// Simulate playing music
	public void play(String songName) {
		System.out.println("Playing: " + songName);
	}
}

