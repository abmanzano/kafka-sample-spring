package com.abmanzano.kafkasamplespring.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Object Product does not intend to reflect what a Product would look like in a real project
 * For this POC we are including product quantity on the actual product to simplify.
 * If you prefer, think of this object as a Product record on an invoice.
 */
@JsonIgnoreProperties({"totalProductPrice"})
public class Product implements Serializable {

    private String id;
    private String name;
    private Brand brand;
    private ProductCondition productCondition;
    private byte[] image;
    private float price;
    private int quantity;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductCondition getProductCondition() {
        return productCondition;
    }

    public void setProductCondition(ProductCondition productCondition) {
        this.productCondition = productCondition;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] fileBytes) {
        this.image = fileBytes;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float calculateTotalProductPrice() {
        return this.price * this.quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", productCondition=" + productCondition +
                ", image=" + Arrays.toString(image) +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
