package com.jsoniter.test;

import java.util.Date;

import com.jsoniter.output.JsonStream;

/**
 * Hello world!
 *
 */
public class Main {

	static {
		// reflection
//		JsonIterator.setMode(DecodingMode.REFLECTION_MODE);
//		JsonStream.setMode(EncodingMode.REFLECTION_MODE);

		// dynamic code generation
//		JsonIterator.setMode(DecodingMode.DYNAMIC_MODE_AND_MATCH_FIELD_WITH_HASH);
//		JsonStream.setMode(EncodingMode.DYNAMIC_MODE);

		// static code generation
		new DemoCodegenConfig().setup();
	}

	public static void main(String[] args) {

		Pojo pojo = new Pojo();
		pojo.value1 = "asdfawerfafasdfasdfasdf";
		pojo.value2 = "asdfasdfasrawerfasefasfrawefasdfsda";
		pojo.value3 = "asdfasefaefasefdsafas";
		pojo.value4 = "asdfaerafasdf";
		pojo.value5 = "asdfaerqwerqefafasdf";
		pojo.value6 = "fgsdfgsdfgsdfgdsfg";
		pojo.value7 = "fgsadfgsdfgsrgsder";
		pojo.value8 = "twertwertwertwertrwe";
		pojo.value9 = "fgsgsfgsfdgsdfg";
		pojo.value10 = "xyvbxcvbxcvbxcvb";
		pojo.value11 = "sgsfgsfgsdfg";
		pojo.value12 = "wertwertwertwetew";
		pojo.value13 = "ghfdghdfhdfgh";
		pojo.value14 = "sdfgsfgsdfg";
		pojo.value15 = "shsdfhgfsdgsdfg";
		pojo.value16 = "wrtwertwertwetwert";
		pojo.value17 = "tretwertewrtert";
		pojo.value18 = "ertwertwertwertwert";
		pojo.value19 = "dfgdfgsfdgsfdgsdfgsdgfs";

		System.out.println(JsonStream.serialize(pojo));

		int count = 1000000;

		Long time1 = new Date().getTime();
		for (int i = 0; i < count; i++) {
			JsonStream.serialize(pojo);
		}
		System.out.println("total time for JsonStream.serialize(lhs): " + (new Date().getTime() - time1));
	}
}
