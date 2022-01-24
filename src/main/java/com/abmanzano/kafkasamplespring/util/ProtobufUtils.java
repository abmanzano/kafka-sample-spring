package com.abmanzano.kafkasamplespring.util;

import com.abmanzano.kafkasamplespring.dto.protobuf.BrandOuterClass;
import com.abmanzano.kafkasamplespring.dto.protobuf.Order;
import com.abmanzano.kafkasamplespring.dto.protobuf.ProductOuterClass;
import com.google.protobuf.ByteString;

public class ProtobufUtils {

    public static Order.OrderRequest getDummyOrderProtobuf() {
        byte[] bytes = {0b0010_0101};

        Order.OrderRequest.Builder order = Order.OrderRequest.newBuilder();
        order.setId("FG645HGF877667HH");
        order.setShortId((short) 10000);
        order.setIntId(123);
        order.setLongId(13_123_123L);
        order.setCharId("c");
        order.setByteId(ByteString.copyFrom(bytes));
        // TODO: Change loop condition to generate more or less Products to be added to the Order.
        //  e.g. 100000
        for(int i=0; i<10; i++) {
            order.addProducts(dummyProductProtobuf());
        }
        order.setTotal(4444f);
        order.setPaid(true);
        order.setDate(20211112);
        return order.build();
    }

    private static ProductOuterClass.Product dummyProductProtobuf() {
        BrandOuterClass.Brand brand = BrandOuterClass.Brand.newBuilder()
                .setId(123_456_789L)
                .setName("Vertex")
                .build();

        byte[] bytes = {0b0010_0101};

        return ProductOuterClass.Product.newBuilder()
                .setId("AS15478GT15484")
                .setName("Tornillo Radial")
                .setBrand(brand)
                .setProductCondition(ProductOuterClass.Product.ProductCondition.NEW)
                .setImage(ByteString.copyFrom(bytes))
                .setPrice(0.05f)
                .setQuantity(800)
                .build();
    }
}
