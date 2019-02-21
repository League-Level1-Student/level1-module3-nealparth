/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for each
	 * instruction. Work in seconds when testing, then change to minutes
	 */

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
CowTimer cow= new CowTimer();
cow.setTime(5);
cow.start();



	}

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		
		 // 2. Count down the minutes, print the current minute then sleep for 60 seconds
		 // using Thread.sleep(int milliseconds)
		//Thread.sleep(10000);
		
		for(int i=minutes;i>0;i--)	{
			Thread.sleep(10000);
			minutes--;
			System.out.println(minutes);
			
}
		if(minutes==1) {
			playSound("moo.wav");
		}
	 //System.out.println("4");
	// Thread.sleep(10000);
	// System.out.println("3");
	// Thread.sleep(10000);
	///(10000);
		
		
	
		// 3. When the timer is finished, use the playSound method to play a moo sound.
		//  You can use the .wav file in the default package, or you can download one
		 //from freesound.org, then drag it intothe default package.

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
