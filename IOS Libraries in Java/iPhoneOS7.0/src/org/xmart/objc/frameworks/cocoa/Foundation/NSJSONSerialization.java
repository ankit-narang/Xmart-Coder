package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSJSONSerialization extends NSObject  {
    
    public NSJSONSerialization() {}
    
    
    @ObjCMethodSign(sign = "+ (BOOL)isValidJSONObject:(id)obj;", selector = "isValidJSONObject:")
    public static native boolean isValidJSONObject$(NSObject obj);

    @ObjCMethodSign(sign = "+ (NSData *)dataWithJSONObject:(id)obj options:(NSJSONWritingOptions)opt error:(NSError **)error;", selector = "dataWithJSONObject:options:error:")
    public static native NSData dataWithJSONObject$options$error$(NSObject obj, NSJSONWritingOptions opt, NSError[] error);

    @ObjCMethodSign(sign = "+ (id)JSONObjectWithData:(NSData *)data options:(NSJSONReadingOptions)opt error:(NSError **)error;", selector = "JSONObjectWithData:options:error:")
    public static native NSObject JSONObjectWithData$options$error$(NSData data, NSJSONReadingOptions opt, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSInteger)writeJSONObject:(id)obj toStream:(NSOutputStream *)stream options:(NSJSONWritingOptions)opt error:(NSError **)error;", selector = "writeJSONObject:toStream:options:error:")
    public static native @NSInteger long writeJSONObject$toStream$options$error$(NSObject obj, NSOutputStream stream, NSJSONWritingOptions opt, NSError[] error);

    @ObjCMethodSign(sign = "+ (id)JSONObjectWithStream:(NSInputStream *)stream options:(NSJSONReadingOptions)opt error:(NSError **)error;", selector = "JSONObjectWithStream:options:error:")
    public static native NSObject JSONObjectWithStream$options$error$(NSInputStream stream, NSJSONReadingOptions opt, NSError[] error);
}
