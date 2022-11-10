package mk.finki.ukim.mk.lab1nova.service;

import mk.finki.ukim.mk.lab1nova.model.Balloon;

import java.util.List;
import java.util.Optional;

public interface BalloonService {
    List<Balloon> listAll();
    List<Balloon> searchByNameOrDescription(String text);
    Optional<Balloon> save(String name, String description, Long id);
    void deleteById(Long id);
}
