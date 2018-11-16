package java_project;

import java.io.*;

import javazoom.jl.player.*;

public class MusicPlayer {
	private String musicName;
	private Player player;
 
	void setMusic(String musicName){
		this.musicName=musicName;
	}

	public void close(){
		if(player !=null)
			player.close();
	}

	public void play(){
		try{
			FileInputStream fis=new FileInputStream(musicName);
			BufferedInputStream bis=new BufferedInputStream(fis);
			player=new Player(bis);         
		}catch(Exception e){
			e.printStackTrace();
			}
		new Thread(){
			@Override
			public void run(){
				try{player.play();
				}
			catch(Exception e){
				e.printStackTrace();
				}
			}
		}.start();
	}
}

