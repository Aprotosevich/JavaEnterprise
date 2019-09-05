package by.pvt.springHomeProject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringTask2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        RockMusic testSinglone = context.getBean("rockMusic", RockMusic.class);
        System.out.println(testSinglone.getSong());

        MetalMusic metalMusic = context.getBean("metalMusic", MetalMusic.class);
        MetalMusic metalMusic1 = context.getBean("metalMusic", MetalMusic.class);
        System.out.println(metalMusic.getName());
        System.out.println(metalMusic1.getName());

        System.out.println("Some logic before closing context");
        context.close();
        System.out.println("Some logic after closing context, ending appl");
    }
}
