package com.abmanzano.kafkasamplespring.util;

import com.abmanzano.avrojacksonlib.dto.Brand;
import com.abmanzano.avrojacksonlib.dto.Order;
import com.abmanzano.avrojacksonlib.dto.Product;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class AvroJacksonLibUtils {

    public static Order getDummyOrderAvro() {
        Order order = new Order();
        order.setId("FG645HGF877667HH");
        order.setShortId((short) 10000);
        order.setIntId(123);
        order.setLongId(13_123_123L);
        order.setCharId('c');
        byte[] bytes = {0b0010_0101};
        order.setByteId(0b0010_0101);

        // TODO: Change loop condition to generate more or less Products to be added to the Order.
        //  e.g. 100000
        List<Product> products = new ArrayList<>();
        for(int i=0; i<10; i++) {
            products.add(dummyProductAvro());
        }
        order.setProducts(products);

        order.setTotal(4444f);
        order.setPaid(true);
        order.setDate(20211112L);

        return order;
    }

    private static Product dummyProductAvro() {
        Product product = new Product();
        Brand brand = new Brand(123_456_789L, "Vertex");
        product.setId("AS15478GT15484");
        product.setName("Tornillo Radial");
        product.setBrand(brand);
        product.setProductCondition(com.abmanzano.avrojacksonlib.dto.ProductCondition.NEW);
        byte[] bytes = {0b0010_0101};
        product.setImage(ByteBuffer.wrap(bytes));
        product.setPrice(0.05f);
        product.setQuantity(800);
        return product;
    }
}
