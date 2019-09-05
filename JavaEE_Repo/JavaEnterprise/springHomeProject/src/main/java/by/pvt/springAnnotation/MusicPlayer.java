package by.pvt.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

import static by.pvt.springAnnotation.MusicType.Classic_Music;
import static by.pvt.springAnnotation.MusicType.Rock_Music;

/**
 * @author Neil Alishev
 */

@Component
public class MusicPlayer {

    @Value("${musicPlayer.volume}")
    private int volume;

    @Value("${musicPlayer.name}")
    private String name;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    @Autowired
    private ClassicalMusic classicalMusic;

    @Autowired
    private RockMusic rockMusic;

    public String getRandomSong(List<String> list){
        return list.get(((int)(Math.random()*3)));
    }


    public void playMusic(MusicType musicType) {
        if(musicType == Rock_Music){
            System.out.println("Playing " + getRandomSong(rockMusic.getSongName()));
        }
        else if(musicType == Classic_Music){
            System.out.println("Playing " + getRandomSong(classicalMusic.getSongName()));
        }
    }

    @PostConstruct
    public void doInit(){
        System.out.println("Init music player");
    }

    @PreDestroy
    public void doDestroy(){
        System.out.println("Destroy music player");
    }
}