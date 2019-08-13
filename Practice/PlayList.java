/*
This project is aim to practice the method of using ArrayList.
Author: Tony
Date: 8/10/2019
*/ 

import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
  	ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Song1");
    desertIslandPlaylist.add("Song2");
    desertIslandPlaylist.add("Song3");
    desertIslandPlaylist.add("Song4");
    desertIslandPlaylist.add("Song5");
    desertIslandPlaylist.add("Song6");
    System.out.println(desertIslandPlaylist.size());
    //remove one song
    desertIslandPlaylist.remove(5);
    System.out.println(desertIslandPlaylist.size());
    // swap songs 3 1
    String tmp;
    tmp = desertIslandPlaylist.get(3);
    desertIslandPlaylist.set(3,desertIslandPlaylist.get(1) );
    desertIslandPlaylist.set(1, tmp);
    System.out.println(desertIslandPlaylist);
  }
  
}