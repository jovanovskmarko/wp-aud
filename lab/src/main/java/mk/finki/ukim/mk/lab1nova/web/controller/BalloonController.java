package mk.finki.ukim.mk.lab1nova.web.controller;

import mk.finki.ukim.mk.lab1nova.service.impl.BalloonServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/balloons")
public class BalloonController {
    private final BalloonServiceImpl balloonService;

    public BalloonController(BalloonServiceImpl balloonService) {
        this.balloonService = balloonService;
    }

    @GetMapping
    public String getBalloonsPage(@RequestParam(required = false) String error, Model model) {
        List balloons = this.balloonService.listAll();
        model.addAttribute("balloons", balloons);
        return "listBalloons";
    }

    @PostMapping
    public String selectBalloon(HttpServletRequest req,Model model){
        HttpSession session = req.getSession();
        session.setAttribute("color",req.getParameter("color"));
        return "redirect:/selectBalloon";
    }

    @PostMapping("/add")
    public String saveBalloon(@RequestParam String name,@RequestParam String description,@RequestParam Long id){
        this.balloonService.save(name,description,id);
        return "redirect:/balloons";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBalloon(@PathVariable Long id){

        return "redirect:/balloons";
    }
}