package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("JSONKit")
public class JSONDecoder extends NSObject  {
    
    public JSONDecoder() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "initWithParseOptions:")
    public native JSONDecoder initWithParseOptions$(JKParseOptionFlags parseOptionFlags);

    @ObjCMethodSign(sign = "- (void)clearCache;", selector = "clearCache")
    public native void clearCache();

    @ObjCMethodSign(sign = "- (id)objectWithUTF8String:(const unsigned char *)string length:(NSUInteger)length;", selector = "objectWithUTF8String:length:")
    public native NSObject objectWithUTF8String$length$(byte[] string, @NSUInteger long length);

    @ObjCMethodSign(sign = "- (id)objectWithUTF8String:(const unsigned char *)string length:(NSUInteger)length error:(NSError **)error;", selector = "objectWithUTF8String:length:error:")
    public native NSObject objectWithUTF8String$length$error$(byte[] string, @NSUInteger long length, NSError[] error);

    @ObjCMethodSign(sign = "- (id)objectWithData:(NSData *)jsonData;", selector = "objectWithData:")
    public native NSObject objectWithData$(NSData jsonData);

    @ObjCMethodSign(sign = "- (id)objectWithData:(NSData *)jsonData error:(NSError **)error;", selector = "objectWithData:error:")
    public native NSObject objectWithData$error$(NSData jsonData, NSError[] error);

    @ObjCMethodSign(sign = "- (id)mutableObjectWithUTF8String:(const unsigned char *)string length:(NSUInteger)length;", selector = "mutableObjectWithUTF8String:length:")
    public native NSObject mutableObjectWithUTF8String$length$(byte[] string, @NSUInteger long length);

    @ObjCMethodSign(sign = "- (id)mutableObjectWithUTF8String:(const unsigned char *)string length:(NSUInteger)length error:(NSError **)error;", selector = "mutableObjectWithUTF8String:length:error:")
    public native NSObject mutableObjectWithUTF8String$length$error$(byte[] string, @NSUInteger long length, NSError[] error);

    @ObjCMethodSign(sign = "- (id)mutableObjectWithData:(NSData *)jsonData;", selector = "mutableObjectWithData:")
    public native NSObject mutableObjectWithData$(NSData jsonData);

    @ObjCMethodSign(sign = "- (id)mutableObjectWithData:(NSData *)jsonData error:(NSError **)error;", selector = "mutableObjectWithData:error:")
    public native NSObject mutableObjectWithData$error$(NSData jsonData, NSError[] error);

    @ObjCMethodSign(sign = "+ (id)decoder;", selector = "decoder")
    public static native NSObject decoder();

    @ObjCMethodSign(sign = "+ (id)decoderWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "decoderWithParseOptions:")
    public static native NSObject decoderWithParseOptions$(JKParseOptionFlags parseOptionFlags);
}
