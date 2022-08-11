package com.fluex404.dto.deserializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustomeDateDeserializeRequest extends StdDeserializer<LocalDate> {
    public CustomeDateDeserializeRequest() {
        this(null);
    }

    public CustomeDateDeserializeRequest(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String requestPropertie = jsonParser.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
        return LocalDate.parse(requestPropertie, formatter);
    }


}
