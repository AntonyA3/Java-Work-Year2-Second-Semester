package binaryio;

public class PlayListIOdemo {

	public static void main(String[] args) {
		PlayList playlist = new PlayList("Work");
		playlist.addSong(new Song("Lol", 124, "Meme Lord"));
		playlist.addSong(new Song("Good", 420, "Meme Lord"));
		playlist.addSong(new Song("Plot", 143, "Movie Music"));
		playlist.addSong(new Song("Plain", 123, "Critique"));
		playlist.addSong(new Song("Bland", 321, "Critique"));
		
		playlist.writePlayListToFile();
		System.out.println(playlist.toString());
		playlist.readPlayListFromFile();
		System.out.println(playlist.toString());

	}

}
