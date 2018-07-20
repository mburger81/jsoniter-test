package jsoniter_codegen.cfg9223372036100299902.decoder.com.jsoniter.test;
public class Pojo implements com.jsoniter.spi.Decoder {
public static java.lang.Object decode_(com.jsoniter.JsonIterator iter) throws java.io.IOException { java.lang.Object existingObj = com.jsoniter.CodegenAccess.resetExistingObject(iter);
byte nextToken = com.jsoniter.CodegenAccess.readByte(iter);
if (nextToken != '{') {
if (nextToken == 'n') {
com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
return null;
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == 'n') {
com.jsoniter.CodegenAccess.skipFixedBytes(iter, 3);
return null;
}
} // end of if null
} // end of if {
nextToken = com.jsoniter.CodegenAccess.readByte(iter);
if (nextToken != '"') {
if (nextToken == '}') {
return (existingObj == null ? new com.jsoniter.test.Pojo() : (com.jsoniter.test.Pojo)existingObj);
} else {
nextToken = com.jsoniter.CodegenAccess.nextToken(iter);
if (nextToken == '}') {
return (existingObj == null ? new com.jsoniter.test.Pojo() : (com.jsoniter.test.Pojo)existingObj);
} else {
com.jsoniter.CodegenAccess.unreadByte(iter);
}
} // end of if end
} else { com.jsoniter.CodegenAccess.unreadByte(iter); }// end of if not quote
java.lang.String _value1_ = null;
java.lang.String _value2_ = null;
java.lang.String _value3_ = null;
java.lang.String _value4_ = null;
java.lang.String _value5_ = null;
java.lang.String _value6_ = null;
java.lang.String _value7_ = null;
java.lang.String _value8_ = null;
java.lang.String _value9_ = null;
java.lang.String _value10_ = null;
java.lang.String _value11_ = null;
java.lang.String _value12_ = null;
java.lang.String _value13_ = null;
java.lang.String _value14_ = null;
java.lang.String _value15_ = null;
java.lang.String _value16_ = null;
java.lang.String _value17_ = null;
java.lang.String _value18_ = null;
java.lang.String _value19_ = null;
do {
switch (com.jsoniter.CodegenAccess.readObjectFieldAsHash(iter)) {
case 1122006320: 
_value11_ = (java.lang.String)iter.readString();
continue;
case 1138783939: 
_value10_ = (java.lang.String)iter.readString();
continue;
case 1155561558: 
_value13_ = (java.lang.String)iter.readString();
continue;
case 1172339177: 
_value12_ = (java.lang.String)iter.readString();
continue;
case 1189116796: 
_value15_ = (java.lang.String)iter.readString();
continue;
case 1205894415: 
_value14_ = (java.lang.String)iter.readString();
continue;
case 1222672034: 
_value17_ = (java.lang.String)iter.readString();
continue;
case 1239449653: 
_value16_ = (java.lang.String)iter.readString();
continue;
case 1256227272: 
_value19_ = (java.lang.String)iter.readString();
continue;
case 1273004891: 
_value18_ = (java.lang.String)iter.readString();
continue;
case 1833412086: 
_value8_ = (java.lang.String)iter.readString();
continue;
case 1850189705: 
_value9_ = (java.lang.String)iter.readString();
continue;
case 1934077800: 
_value2_ = (java.lang.String)iter.readString();
continue;
case 1950855419: 
_value3_ = (java.lang.String)iter.readString();
continue;
case 1984410657: 
_value1_ = (java.lang.String)iter.readString();
continue;
case 2001188276: 
_value6_ = (java.lang.String)iter.readString();
continue;
case 2017965895: 
_value7_ = (java.lang.String)iter.readString();
continue;
case 2034743514: 
_value4_ = (java.lang.String)iter.readString();
continue;
case 2051521133: 
_value5_ = (java.lang.String)iter.readString();
continue;
}
iter.skip();
} while (com.jsoniter.CodegenAccess.nextTokenIsComma(iter));
com.jsoniter.test.Pojo obj = (existingObj == null ? new com.jsoniter.test.Pojo() : (com.jsoniter.test.Pojo)existingObj);
obj.value1 = _value1_;
obj.value2 = _value2_;
obj.value3 = _value3_;
obj.value4 = _value4_;
obj.value5 = _value5_;
obj.value6 = _value6_;
obj.value7 = _value7_;
obj.value8 = _value8_;
obj.value9 = _value9_;
obj.value10 = _value10_;
obj.value11 = _value11_;
obj.value12 = _value12_;
obj.value13 = _value13_;
obj.value14 = _value14_;
obj.value15 = _value15_;
obj.value16 = _value16_;
obj.value17 = _value17_;
obj.value18 = _value18_;
obj.value19 = _value19_;
return obj;
}public java.lang.Object decode(com.jsoniter.JsonIterator iter) throws java.io.IOException {
return decode_(iter);
}
}
