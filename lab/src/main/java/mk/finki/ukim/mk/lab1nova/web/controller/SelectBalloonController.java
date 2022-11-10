package mk.finki.ukim.mk.lab1nova.web.controller;

import mk.finki.ukim.mk.lab1nova.service.impl.BalloonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/selectBalloon")
public class SelectBalloonController {
    private final BalloonServiceImpl balloonService;

    public SelectBalloonController(BalloonServiceImpl balloonService) {
        this.balloonService = balloonService;
    }

    @GetMapping
    public String getSelectBalloonPage(){
        return "selectBalloon";
    }




}
