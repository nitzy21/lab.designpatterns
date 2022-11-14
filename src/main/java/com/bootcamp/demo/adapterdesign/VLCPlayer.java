package com.bootcamp.demo.adapterdesign;

public class VLCPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVLC() {
		System.out.println("VLC Player playing VLC");
	}

	@Override
	public void playMp4() {
		System.out.println("VLC Player playing Mp4");
	}

}
