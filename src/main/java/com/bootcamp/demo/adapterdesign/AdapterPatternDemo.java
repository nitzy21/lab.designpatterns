package com.bootcamp.demo.adapterdesign;

//will use AudioPlayer class to play various formats.
public class AdapterPatternDemo {

	public static void main(String[] args) {

		System.out.println("--- Audio Player ----");
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play(null);
		
		System.out.println("\n --- VLC ----");
		AdvancedMediaPlayer vlc = new VLCPlayer();
		audioPlayer.play(vlc);
//		vlc.playMp4();
//		vlc.playVLC();
		
		System.out.println("\n --- Mp4 ----");
		AdvancedMediaPlayer mp4 = new Mp4Player();
		audioPlayer.play(mp4);
//		mp4.playMp4();
//		mp4.playVLC();
	
	}

}
