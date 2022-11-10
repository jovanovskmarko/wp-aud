package mk.finki.ukim.mk.lab1nova.bootstrap;

import lombok.Data;
import mk.finki.ukim.mk.lab1nova.model.Balloon;
import mk.finki.ukim.mk.lab1nova.model.Manufacturer;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Balloon> balloonList = new ArrayList<>();
    public static List<Manufacturer> manufacturers = new ArrayList<>();

    @PostConstruct
    public void init(){
        balloonList.add(new Balloon("Red Balloon", "description for balloon 1"));
        balloonList.add(new Balloon("Blue Balloon", "description for balloon 2"));
        balloonList.add(new Balloon("Green Balloon", "description for balloon 3"));
        balloonList.add(new Balloon("Yellow Balloon", "description for balloon 4"));
        balloonList.add(new Balloon("Orange Balloon", "description for balloon 5"));
        balloonList.add(new Balloon("Purple Balloon", "description for balloon 6"));
        balloonList.add(new Balloon("Pink Balloon", "description for balloon 7"));
        balloonList.add(new Balloon("Black Balloon", "description for balloon 8"));
        balloonList.add(new Balloon("White Balloon 9", "description for balloon 9"));
        balloonList.add(new Balloon("Gray Balloon 10", "description for balloon 10"));

        Manufacturer manufacturer1 = new Manufacturer("Manufacturer 1","Country 1","Address 1");
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer 2","Country 2","Address 2");
        Manufacturer manufacturer3 = new Manufacturer("Manufacturer 3","Country 3","Address 3");
        Manufacturer manufacturer4 = new Manufacturer("Manufacturer 4","Country 4","Address 4");
        Manufacturer manufacturer5 = new Manufacturer("Manufacturer 5","Country 5","Address 5");
        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);
        manufacturers.add(manufacturer3);
        manufacturers.add(manufacturer4);
        manufacturers.add(manufacturer5);
    }
}
