package by.pvt.springHomeProject;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }

    void doInit(){
        System.out.println("Init logic of Rock Music");
    }

    void doDestroy(){
        System.out.println("Destroy logic of Rock Music");
    }
}
