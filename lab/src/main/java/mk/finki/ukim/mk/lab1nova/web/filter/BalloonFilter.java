//package mk.finki.ukim.mk.lab1nova.web.filter;
//
//import mk.finki.ukim.mk.lab1nova.model.Balloon;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebFilter
//public class BalloonFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) servletRequest;
//        HttpServletResponse resp = (HttpServletResponse) servletResponse;
//        Balloon balloon = (Balloon) req.getSession().getAttribute("color");
//
//        String path = req.getServletPath();
//        if(!("").equals(path) && balloon == null){
//            resp.sendRedirect("");
//        }
//        else{
//            filterChain.doFilter(servletRequest,servletResponse);
//        }
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//}
