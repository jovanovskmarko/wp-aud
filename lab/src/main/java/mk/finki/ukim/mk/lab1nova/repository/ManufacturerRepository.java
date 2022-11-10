package mk.finki.ukim.mk.lab1nova.repository;

import mk.finki.ukim.mk.lab1nova.bootstrap.DataHolder;
import mk.finki.ukim.mk.lab1nova.model.Manufacturer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ManufacturerRepository {
    public List<Manufacturer> findAll(){
        return DataHolder.manufacturers;
    }


}
