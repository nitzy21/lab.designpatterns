package com.bootcamp.demo.adapterdesign;

public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter (AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	@Override
	public void play(AdvancedMediaPlayer advancedMediaPlayer) {
		if(advancedMediaPlayer instanceof VLCPlayer) {
			this.advancedMediaPlayer.playVLC();
		} else {
			this.advancedMediaPlayer.playMp4();
		}
	}
	
}
