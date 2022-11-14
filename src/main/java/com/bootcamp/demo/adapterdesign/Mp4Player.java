package com.bootcamp.demo.adapterdesign;

// uses AdvancedMediaPlayer objects to play the required format.
public class Mp4Player implements AdvancedMediaPlayer{

	@Override
	public void playVLC() {
		System.out.println("Mp4 Player playing VLC");
	}

	@Override
	public void playMp4() {
		System.out.println("Mp4 Player playing Mp4");
	}

}
