package by.pvt.springHomeProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.management.MemoryUsage;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        /*TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean.getName());*/

        /*Music music = context.getBean("classicMusic", Music.class);
        Music anotherMusic = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer1 = new MusicPlayer(anotherMusic);
        musicPlayer.playMusic();
        musicPlayer1.playMusic();*/

       /* MusicPlayer musicPlayer = context.getBean("MPlayerWithRock", MusicPlayer.class);
        musicPlayer.playMusic();

        MusicPlayer musicPlayer1 = context.getBean("Mplayer", MusicPlayer.class);
        musicPlayer1.playMusic();

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());*/

        MultiMusicPlayer multiMusicPlayer = context.getBean("MultiMusicPlayer",
                MultiMusicPlayer.class);
        multiMusicPlayer.playMusic();


        context.close();
    }
}
