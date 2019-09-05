package by.pvt.springAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotion {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotationAppl.xml");

        //init and destroy method's defined in MusicPlayer bean;
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // playing random music (need to chose type from enum);
        musicPlayer.playMusic(MusicType.Classic_Music);
        musicPlayer.playMusic(MusicType.Rock_Music);

        System.out.println("Get name frome Value annotation with propertie file: "  + musicPlayer.getName());

        // Scope annotation test;
        ClassicalMusic classicalMusic = context.getBean("classicMusicAnnotaion", ClassicalMusic.class);
        ClassicalMusic classicalMusic1 = context.getBean("classicMusicAnnotaion", ClassicalMusic.class);
        System.out.println("is Singleton = " + (classicalMusic == classicalMusic1));
        
        context.close();
    }
}
