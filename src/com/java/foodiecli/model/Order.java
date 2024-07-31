package com.java.foodiecli.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Order {
    //String id, Customer customer, Restaurant restaurant, List<Dish> dishes,double price,double totalPrice,LocalDate orderDate
    private String id;
    private Customer customer;
    private Restaurant restaurant;
    private List<Dish> dishes;
    private double totalPrice;
    private LocalDate orderDate;

    public  Order(){

    }

    public Customer getCustomer() {
        return customer;
    }

    public  Order setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Order setDishes(List<Dish> dishes) {
        this.dishes = dishes;
        return this;
    }

    public String getOrderId() {
        return id;
    }

    public Order setOrderId(String id) {
        this.id = id;
        return this;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(totalPrice, order.totalPrice) == 0 && Objects.equals(id, order.id) && Objects.equals(customer, order.customer) && Objects.equals(restaurant, order.restaurant) && Objects.equals(dishes, order.dishes) && Objects.equals(orderDate, order.orderDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, restaurant, dishes, totalPrice, orderDate);
    }

    public Order setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
        return this;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Order  setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Order setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", id='" + id + '\'' +
                ", restaurant=" + restaurant +
                ", dishes=" + dishes +
                ", totalPrice=" + totalPrice +
                ", orderDate=" + orderDate +
                '}';
    }
}
