package C4010117;

import java.util.Arrays;

public class Song {

    Song(String title, String artist, String album, String[] composer, String year, String track) {

        this.title = title;
        this.artist = artist;
        this.album = album;
        this.composer = composer;
        this.year = year;
        this.track = track;
    }


    private String getTitle() {
        return title;
    }

    private String getArtist() {
        return artist;
    }

    private String getAlbum() {
        return album;
    }


    private String getYear() {
        return year;
    }

    private String getTrack() {
        return track;
    }

    private String getComposer() {
        StringBuilder newComposer = new StringBuilder();
        Arrays.stream(composer).forEachOrdered(aComposer -> newComposer.append(aComposer).append(" "));
        return newComposer.toString();
    }

    private String title;
    private String artist;
    private String album;
    private String[] composer;
    private String year;
    private String track;

    void show(){
        System.out.println("타이틀: " + getTitle());
        System.out.println("아티스트: " + getArtist());
    }
    void allShow() {

        System.out.println("타이틀: " + getTitle());
        System.out.println("아티스트: " + getArtist());
        System.out.println("앨범: " + getAlbum());
        System.out.println("작곡가: " + getComposer());
        System.out.println("년도: " + getYear());
        System.out.println("트랙: " + getTrack());

    }
}