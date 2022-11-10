package mk.finki.ukim.mk.lab1nova.repository;

import mk.finki.ukim.mk.lab1nova.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab1nova.model.Balloon;
import org.springframework.stereotype.Repository;

import javax.xml.crypto.Data;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class BalloonRepository {

    public List<Balloon> findAllBalloons(){
        return DataHolder.balloonList;
    }

    public List<Balloon> findAllByNameOrDescription(String text){
        return DataHolder.balloonList.stream().filter(r->r.getName().contains(text) || r.getDescription().contains(text)).collect(Collectors.toList());
    }


    public Balloon save(String name,String description,Long id) {
        DataHolder.balloonList.removeIf(r->r.getName().equals(name));
        Balloon balloon = new Balloon(name,description,id);
        DataHolder.balloonList.add(balloon);
        return balloon;
    }

    public void deleteById(Long id){
        DataHolder.balloonList.removeIf(r->r.getId().equals(id));
    }
}
