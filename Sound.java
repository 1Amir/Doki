package Overtext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * A simple Java sound file example (i.e., Java code to play a sound file).
 * AudioStream and AudioPlayer code comes from a javaworld.com example.
 * @author alvin alexander, devdaily.com.
 */
public class Sound extends Openworld
{
  public Sound() throws IOException {
		super();
		
		// TODO Auto-generated constructor stub
	}
public void playSound() throws IOException{
  
    // open the sound file as a Java input stream
	    // create an audiostream from the inputstream
	    InputStream inputStream = getClass().getResourceAsStream("Dokistartmusic.wav");
	    AudioStream audioStream = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
		// TODO Auto-generated catch block
	    if(stop == true){
	    	AudioPlayer.player.stop(audioStream);		
	    }
  }
  public void storemusic() throws IOException{
	  InputStream inputStream = getClass().getResourceAsStream("jazz.wav");
	   AudioStream audioStream = new AudioStream(inputStream);
	   // play the audio clip with the audioplayer class
	   AudioPlayer.player.start(audioStream);
		
  }
  public void staticsound() throws IOException{
	  InputStream inputStream = getClass().getResourceAsStream("superrape.wav");
	    AudioStream audioStream = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
  }
  //method for stepping sound 
  public void stepsound() throws IOException{
	    InputStream inputStream = getClass().getResourceAsStream("hitmarker_2.wav");
	    AudioStream audioStream = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
  }
  public void scream() throws IOException{
	    InputStream inputStream = getClass().getResourceAsStream("femalescream.wav");
	    AudioStream audioStream = new AudioStream(inputStream);
	    // play the audio clip with the audioplayer class
	    AudioPlayer.player.start(audioStream);
}
}