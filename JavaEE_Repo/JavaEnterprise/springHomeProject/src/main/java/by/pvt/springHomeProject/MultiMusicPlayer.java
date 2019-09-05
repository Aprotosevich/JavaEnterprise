package by.pvt.springHomeProject;

import java.util.Collections;
import java.util.List;

public class MultiMusicPlayer {
    private List<Music> musicList;

    void playMusic(){
        System.out.print("Printing list of MultiPlayer music: ");
        for(Music element: musicList){
            System.out.println(element.getSong());
        }
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }
}
