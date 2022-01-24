package com.abmanzano.kafkasamplespring;

import com.abmanzano.kafkasamplespring.dto.Order;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.avro.AvroFactory;
import com.fasterxml.jackson.dataformat.avro.AvroSchema;
import com.fasterxml.jackson.dataformat.avro.schema.AvroSchemaGenerator;
import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class KafkaSampleSpringApplicationTests {

	/**
	 * Actually, not a test but a tool to generate avro schema
	 */
	@Test
	void generateOrderAvroSchema() {
		Schema brand = SchemaBuilder.record("Brand")
				.namespace("com.abmanzano.avro.model")
				.fields()
				.requiredLong("id")
				.requiredString("name")
				.endRecord();

		Schema product = SchemaBuilder.record("Product")
				.namespace("com.abmanzano.avro.model")
				.fields()
				.requiredString("id")
				.requiredString("name")
				.name("brand").type(brand).noDefault()
				.name("productCondition").type().enumeration("ProductCondition")
					.symbols("NEW","AS_GOOD_AS_NEW","GOOD","WITH_SIGNE_OF_USE").noDefault()
				.optionalBytes("image")
				.requiredFloat("price")
				.requiredInt("quantity")
				.endRecord();

		//Schema dateSchema = LogicalTypes.date().addToSchema(Schema.create(Schema.Type.INT));

		Schema order = SchemaBuilder.record("Order")
				.namespace("com.abmanzano.avro.model")
				.fields()
				.requiredString("id")
				.requiredInt("shortId")
				.requiredInt("intId")
				.requiredLong("longId")
				.requiredString("charId")
				.requiredBytes("byteId")
				.name("products").type().array().items().type(product).arrayDefault(new ArrayList<>())
				.requiredFloat("total")
				.requiredBoolean("paid")
				//.name("date").type(dateSchema).noDefault()
				.requiredInt("date")
				.endRecord();

		System.out.println(order.toString());
	}

	@Test
	void generateOrderAvroSchemaFromPojo() {
		ObjectMapper mapper = new ObjectMapper(new AvroFactory());
		AvroSchemaGenerator gen = new AvroSchemaGenerator();
		try {
			mapper.acceptJsonFormatVisitor(Order.class, gen);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		}
		AvroSchema schemaWrapper = gen.getGeneratedSchema();
		Schema avroSchema = schemaWrapper.getAvroSchema();
		String asJson = avroSchema.toString(true);

		System.out.println(asJson);
	}
}
