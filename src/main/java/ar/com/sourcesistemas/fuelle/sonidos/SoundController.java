package ar.com.sourcesistemas.fuelle.sonidos;

import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SoundController {

	
	
	
	public void play(String keyPressed){
		
		ClassLoader CLDR = this.getClass().getClassLoader();
		InputStream soundName = CLDR.getResourceAsStream("numbers/"+keyPressed.replaceAll("button","")+".wav");
		AudioStream audioStream=null;
		try {
			audioStream = new AudioStream(soundName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AudioPlayer.player.start(audioStream);
		
	}
	
	
}
