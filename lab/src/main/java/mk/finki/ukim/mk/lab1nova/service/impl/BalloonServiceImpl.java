package mk.finki.ukim.mk.lab1nova.service.impl;

import mk.finki.ukim.mk.lab1nova.model.Balloon;
import mk.finki.ukim.mk.lab1nova.repository.BalloonRepository;
import mk.finki.ukim.mk.lab1nova.service.BalloonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BalloonServiceImpl implements BalloonService {
    private final BalloonRepository balloonRepository;

    public BalloonServiceImpl(BalloonRepository balloonRepository) {
        this.balloonRepository = balloonRepository;
    }

    @Override
    public List<Balloon> listAll() {
        return balloonRepository.findAllBalloons();
    }

    @Override
    public List<Balloon> searchByNameOrDescription(String text) {
        return balloonRepository.findAllByNameOrDescription(text);
    }

    @Override
    public Optional<Balloon> save(String name, String description, Long id) {
       return Optional.of(balloonRepository.save(name,description,id));
    }

    @Override
    public void deleteById(Long id) {
        balloonRepository.deleteById(id);
    }


}
