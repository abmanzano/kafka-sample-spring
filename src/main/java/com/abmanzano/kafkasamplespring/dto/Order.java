package com.abmanzano.kafkasamplespring.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Some of the fields on the Order object are just for the sake of having those primitive types
 * as part of the object. They have no meaning at all other than this.
 */
public class Order implements Serializable {

    private String id;
    private short shortId;
    private int intId;
    private long longId;
    private char charId;
    private byte byteId;
    private List<Product> products;
    private float total;
    private boolean paid;
    private Date date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public short getShortId() {
        return shortId;
    }

    public void setShortId(short shortId) {
        this.shortId = shortId;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public long getLongId() {
        return longId;
    }

    public void setLongId(long longId) {
        this.longId = longId;
    }

    public char getCharId() {
        return charId;
    }

    public void setCharId(char charId) {
        this.charId = charId;
    }

    public byte getByteId() {
        return byteId;
    }

    public void setByteId(byte byteId) {
        this.byteId = byteId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void calculateTotalBasedOnProducts(List<Product> products) {
        this.total = products.stream()
                .map(Product::calculateTotalProductPrice)
                .reduce(0.0f, Float::sum);
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", shortId=" + shortId +
                ", intId=" + intId +
                ", longId=" + longId +
                ", charId=" + charId +
                ", byteId=" + byteId +
                ", products=" + products +
                ", total=" + total +
                ", paid=" + paid +
                ", date=" + date +
                '}';
    }

    public String printOrderSummary() {
        return "Order{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", paid=" + paid +
                ", date=" + date +
                '}';
    }
}
