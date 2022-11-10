package mk.finki.ukim.mk.lab1nova.service.impl;

import mk.finki.ukim.mk.lab1nova.model.Manufacturer;
import mk.finki.ukim.mk.lab1nova.repository.ManufacturerRepository;
import mk.finki.ukim.mk.lab1nova.service.ManufacturerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerServiceImpl implements ManufacturerService {
    private final ManufacturerRepository manufacturerRepository;

    public ManufacturerServiceImpl(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerRepository.findAll();
    }
}
