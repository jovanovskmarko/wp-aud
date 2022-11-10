package mk.finki.ukim.mk.lab1nova.web.servlet;

import mk.finki.ukim.mk.lab1nova.service.impl.BalloonServiceImpl;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "balloon-list-servlet",urlPatterns = "/servlet/balloons")
public class BalloonServlet extends HttpServlet {

    private final BalloonServiceImpl balloonService;
    private final SpringTemplateEngine springTemplateEngine;

    public BalloonServlet(BalloonServiceImpl balloonService, SpringTemplateEngine springTemplateEngine) {
        this.balloonService = balloonService;
        this.springTemplateEngine = springTemplateEngine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WebContext context = new WebContext(req, resp, req.getServletContext());
        context.setVariable("balloons",balloonService.listAll());

        this.springTemplateEngine.process("listBalloons.html", context, resp.getWriter());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("color",req.getParameter("color"));
        resp.sendRedirect("/selectBalloon");

    }
}
