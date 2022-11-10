package mk.finki.ukim.mk.lab1nova.service;

import mk.finki.ukim.mk.lab1nova.model.Order;

public interface OrderService {
    Order placeOrder(String balloonColor, String clientName, String address);
}
