package com.jsoniter.test;

import java.util.List;
import java.util.Map;

import com.jsoniter.JsonIterator;
import com.jsoniter.output.EncodingMode;
import com.jsoniter.output.JsonStream;
import com.jsoniter.spi.DecodingMode;
import com.jsoniter.spi.TypeLiteral;
import com.jsoniter.static_codegen.StaticCodegenConfig;

public class DemoCodegenConfig implements StaticCodegenConfig {

    @Override
	public void setup() {
        // register custom decoder or extensions before codegen
        // so that we doing codegen, we know in which case, we need to callback
//    	Any.registerEncoders();
        JsonIterator.setMode(DecodingMode.STATIC_MODE); // must set to static mode
        JsonStream.setMode(EncodingMode.STATIC_MODE);
//        JsonStream.setIndentionStep(2);
    }

    @Override
	public TypeLiteral[] whatToCodegen() {
        return new TypeLiteral[]{
                // generic types, need to use this syntax
                new TypeLiteral<List<Integer>>() {
                },
                new TypeLiteral<Map<String, Object>>() {
                },
                // array
                TypeLiteral.create(int[].class),
                // object
                TypeLiteral.create(Pojo.class)
        };
    }
}

