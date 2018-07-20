package jsoniter_codegen.cfg9223372036100299902.encoder.com.jsoniter.test;
public class Pojo implements com.jsoniter.spi.Encoder {
public void encode(java.lang.Object obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj == null) { stream.writeNull(); return; }
stream.writeRaw("{\"value1\":", 10);
encode_((com.jsoniter.test.Pojo)obj, stream);
stream.write((byte)'}');
}
public static void encode_(com.jsoniter.test.Pojo obj, com.jsoniter.output.JsonStream stream) throws java.io.IOException {
if (obj.value1 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value1);
}
stream.writeRaw(",\"value2\":", 10);
if (obj.value2 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value2);
}
stream.writeRaw(",\"value3\":", 10);
if (obj.value3 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value3);
}
stream.writeRaw(",\"value4\":", 10);
if (obj.value4 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value4);
}
stream.writeRaw(",\"value5\":", 10);
if (obj.value5 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value5);
}
stream.writeRaw(",\"value6\":", 10);
if (obj.value6 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value6);
}
stream.writeRaw(",\"value7\":", 10);
if (obj.value7 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value7);
}
stream.writeRaw(",\"value8\":", 10);
if (obj.value8 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value8);
}
stream.writeRaw(",\"value9\":", 10);
if (obj.value9 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value9);
}
stream.writeRaw(",\"value10\":", 11);
if (obj.value10 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value10);
}
stream.writeRaw(",\"value11\":", 11);
if (obj.value11 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value11);
}
stream.writeRaw(",\"value12\":", 11);
if (obj.value12 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value12);
}
stream.writeRaw(",\"value13\":", 11);
if (obj.value13 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value13);
}
stream.writeRaw(",\"value14\":", 11);
if (obj.value14 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value14);
}
stream.writeRaw(",\"value15\":", 11);
if (obj.value15 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value15);
}
stream.writeRaw(",\"value16\":", 11);
if (obj.value16 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value16);
}
stream.writeRaw(",\"value17\":", 11);
if (obj.value17 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value17);
}
stream.writeRaw(",\"value18\":", 11);
if (obj.value18 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value18);
}
stream.writeRaw(",\"value19\":", 11);
if (obj.value19 == null) { stream.writeNull(); } else {
stream.writeVal((java.lang.String)obj.value19);
}
}
}
