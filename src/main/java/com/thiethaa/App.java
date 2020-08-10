package com.thiethaa;

import com.thiethaa.info.Info;
import com.thiethaa.info.ListInfo;
import com.thiethaa.info.MapInfo;
import com.thiethaa.info.SetInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        //list allow duplicate
        System.out.println("LIST");
        Info info = (ListInfo)context.getBean("listInfo");
        info.showInfo();
        //set
        System.out.println("SET");
        Info info2 = (SetInfo)context.getBean("setInfo");
        info2.showInfo();
        //map
        System.out.println("\nMAP");
        Info info1 = (MapInfo)context.getBean("mapInfo");
        info1.showInfo();

    }
}
