package by.pvt.springHomeProject;

import java.util.Random;

public class MetalMusic implements Music {

    private String name;

    public static MetalMusic getMetalMusicInstance(){
        return new MetalMusic();
    }

    private MetalMusic(){
        name = ("MetalMusic #" + new Random().nextInt());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getSong() {
        return "MetalMusic";
    }

    void doInit(){
        System.out.println("Init logic of " + name);
    }

    void doDestroy(){
        System.out.println("Destroy logic of " + name);
    }
}
