package by.pvt.springAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSongName() {
        List<String> list = new ArrayList<>();
        list.add("Rock song-1");
        list.add("Rock song-2");
        list.add("Rock song-3");
        return list;
    }
}