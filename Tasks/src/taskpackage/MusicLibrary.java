package taskpackage;

import java.util.ArrayList;
import java.util.Random;
public class MusicLibrary {
	
	ArrayList<String> songs = new ArrayList<String>();
	Random rand = new Random();
	
	
	public void addSong(String x) {	
		songs.add(x);
	}
	public void removeSong(String x) {		
		
		songs.remove(x);
	}
	
	public void showSongs() {
			
			System.out.println("\nSong List: \n");
			
			for (String i : songs) {
				System.out.println(i);			
			}
		}
	
	public void randomSong() {
		boolean complete = false;
		
		while (complete == false) {
			int rindex = rand.nextInt(songs.size());
			
			System.out.println(songs.get(rindex));
			complete = true;
		}
	}
		
	public static void main(String[] args) {
		
		MusicLibrary myMusic = new MusicLibrary();
		
		myMusic.addSong("Happy");
		myMusic.addSong("Sad");
		myMusic.addSong("Neutral");
		myMusic.removeSong("Neutral");
		myMusic.randomSong();
		
		
	}
}
