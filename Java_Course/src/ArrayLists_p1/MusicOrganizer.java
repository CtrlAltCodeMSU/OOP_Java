package ArrayLists_p1;
import java.util.*;
public class MusicOrganizer {
	private ArrayList<String> files;
	private MusicPlayer player;

	public MusicOrganizer() {
		files = new ArrayList<String>();
		player = new MusicPlayer();
	}

	// Method to add a file name
	public void addMusicFile(String fileName) {
		files.add(fileName);
	}

	// Print all the file names
	public void listMusicFiles() {
		for (String file : files) {
			System.out.println("File: " + file);
		}
	}

	public static void main(String[] args) {
		MusicOrganizer organizer = new MusicOrganizer();
		organizer.addMusicFile("song1.mp3");
		organizer.addMusicFile("song2.mp3");

		// List all the music files
		organizer.listMusicFiles();
	}
}

class MusicPlayer {
	// Simulate playing music
	public void play(String fileName) {
		System.out.println("Playing: " + fileName);
	}
}

