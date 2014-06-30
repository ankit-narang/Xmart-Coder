package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSInputStream extends NSStream  {
    
    public NSInputStream() {}
    
    
    @ObjCMethodSign(sign = "- (NSInteger)read:(uint8_t *)buffer maxLength:(NSUInteger)len;", selector = "read:maxLength:")
    public native @NSInteger long read$maxLength$(@Uint8 byte[] buffer, @NSUInteger long len);

    @ObjCMethodSign(sign = "- (BOOL)getBuffer:(uint8_t **)buffer length:(NSUInteger *)len;", selector = "getBuffer:length:")
    public native boolean getBuffer$length$(@Uint8 byte[][] buffer, @NSUInteger long[] len);

    @ObjCMethodSign(sign = "- (BOOL)hasBytesAvailable;", selector = "hasBytesAvailable")
    public native boolean hasBytesAvailable();

    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data;", selector = "initWithData:")
    public native NSInputStream initWithData$(NSData data);

    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "- (id)initWithFileAtPath:(NSString *)path;", selector = "initWithFileAtPath:")
    public native NSInputStream initWithFileAtPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "initWithURL:")
    public native NSInputStream initWithURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "+ (id)inputStreamWithData:(NSData *)data;", selector = "inputStreamWithData:")
    public static native NSObject inputStreamWithData$(NSData data);

    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "+ (id)inputStreamWithFileAtPath:(NSString *)path;", selector = "inputStreamWithFileAtPath:")
    public static native NSObject inputStreamWithFileAtPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSInputStreamExtensions", catownername = "NSInputStream")
    @ObjCMethodSign(sign = "+ (id)inputStreamWithURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "inputStreamWithURL:")
    public static native NSObject inputStreamWithURL$(NSURL url);
}
