package java006_class.part09;

//import java.util.Arrays;
//Arrays.toString(composer)
//작곡가: [Benny Andersson, Bjorn Ulvaeus]
public class Song {
	
	String title;
	String artist;
	String album;
	String[] composer;
	int year;
	int track;
	
	public Song(String title, String artist, String album, String[] composer, int year, int track) {		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
//	
//	 * [실행결과]
//			 * 노래제목: Dansing Queen
//			 * 가수:ABBA
//			 * 앨범:Arrival
//			 * 작곡가: Benny Andersson, Bjorn Ulvaeus
//			 * 년도: 1977
//			 * 트랙: 2
	public void show() {
		String composers = String.join(", ", composer);
		System.out.printf("노래제목: %s\n가수:%s\n앨범:%s\n작곡가: %s\n년도: %d\n트랙: %d",title,artist,album,composers,year,track);
		 
	}
	

}
