package com.abmanzano.kafkasamplespring.util;

import com.abmanzano.kafkasamplespring.dto.Brand;
import com.abmanzano.kafkasamplespring.dto.Order;
import com.abmanzano.kafkasamplespring.dto.Product;
import com.abmanzano.kafkasamplespring.dto.ProductCondition;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Utils {

    public static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.ints(min, (max + 1)).findFirst().getAsInt();
    }

    public static byte[] convertImgToByteArray(File file) {
        byte[] byteArray = null;

        if(file == null) {
            return byteArray;
        }

        BufferedImage bImage = null;
        try {
            bImage = ImageIO.read(file);
        } catch (IOException e) {
            System.out.println("Error while reading the image.");
            e.printStackTrace();
        }

        if(bImage != null) {
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                ImageIO.write(bImage, "jpg", bos);
                byteArray = bos.toByteArray();
            } catch (IOException e) {
                System.out.println("Error while converting buffered image to byte array stream.");
                e.printStackTrace();
            }
        }
        return byteArray;
    }

    public static Order getDummyOrder() {
        Order order = new Order();
        order.setId("FG645HGF877667HH");
        order.setShortId((short) 10000);
        order.setIntId(123);
        order.setLongId(13_123_123L);
        order.setCharId('c');
        order.setByteId((byte) 0b0010_0101);

        // TODO: Change loop condition to generate more or less Products to be added to the Order.
        //  e.g. 100000
        List<Product> products = new ArrayList<>();
        for(int i=0; i<10; i++) {
            products.add(dummyProduct());
        }
        order.setProducts(products);
        order.calculateTotalBasedOnProducts(products);

        order.setPaid(true);
        order.setDate(new Date());

        return order;
    }

    private static Product dummyProduct() {
        Product product = new Product();
        Brand brand = new Brand(123_456_789L, "Vertex");
        product.setId("AS15478GT15484");
        product.setName("Tornillo Radial");
        product.setBrand(brand);
        product.setProductCondition(ProductCondition.NEW);

        // TODO: Uncomment this code if you want to load an image as part of the Product
        File file = null;
        /*try {
            file = ResourceUtils.getFile("classpath:img/daniel-k-cheung-cPF2nlWcMY4-unsplash.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }*/
        product.setImage(Utils.convertImgToByteArray(file));

        product.setPrice(0.05f);
        product.setQuantity(800);
        return product;
    }

}
