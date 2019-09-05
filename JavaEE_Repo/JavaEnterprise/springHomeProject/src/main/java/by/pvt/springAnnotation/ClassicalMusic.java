package by.pvt.springAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("classicMusicAnnotaion")
@Scope("singleton")
public class ClassicalMusic implements Music {

    @Override
    public List<String> getSongName() {
        List<String> list = new ArrayList<>();
        list.add("classic Song-1");
        list.add("classic Song-2");
        list.add("classic Song-3");
        return list;
    }

    public void doInit(){}
}
