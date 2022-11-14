package com.bootcamp.demo.adapterdesign;

// We want to make AudioPlayer to play other formats as well.
// AudioPlayer uses the adapter class MediaAdapter passing it 
// the desired audio type
public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;

	// AudioPlayer can play mp3 format audio files by default.
	@Override
	public void play(AdvancedMediaPlayer advancedMediaPlayer) {
		
		if (!(advancedMediaPlayer instanceof AdvancedMediaPlayer)) {
			System.out.println("Audio Player playing mp3");
		} else {
			mediaAdapter = new MediaAdapter(advancedMediaPlayer);
			mediaAdapter.play(advancedMediaPlayer);
		}
	}

}
