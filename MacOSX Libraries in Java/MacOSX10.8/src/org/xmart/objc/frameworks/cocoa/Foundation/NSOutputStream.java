package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSOutputStream extends NSStream  {
    
    public NSOutputStream() {}
    
    
    @ObjCMethodSign(sign = "- (NSInteger)write:(const uint8_t *)buffer maxLength:(NSUInteger)len;", selector = "write:maxLength:")
    public native @NSInteger long write$maxLength$(@Uint8 byte[] buffer, @NSUInteger long len);

    @ObjCMethodSign(sign = "- (BOOL)hasSpaceAvailable;", selector = "hasSpaceAvailable")
    public native boolean hasSpaceAvailable();

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "- (id)initToMemory;", selector = "initToMemory")
    public native NSOutputStream initToMemory();

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "- (id)initToBuffer:(uint8_t *)buffer capacity:(NSUInteger)capacity;", selector = "initToBuffer:capacity:")
    public native NSOutputStream initToBuffer$capacity$(@Uint8 byte[] buffer, @NSUInteger long capacity);

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "- (id)initToFileAtPath:(NSString *)path append:(BOOL)shouldAppend;", selector = "initToFileAtPath:append:")
    public native NSOutputStream initToFileAtPath$append$(NSString path, boolean shouldAppend);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)url append:(BOOL)shouldAppend NS_AVAILABLE(10_6, 4_0);", selector = "initWithURL:append:")
    public native NSOutputStream initWithURL$append$(NSURL url, boolean shouldAppend);

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "+ (id)outputStreamToMemory;", selector = "outputStreamToMemory")
    public static native NSObject outputStreamToMemory();

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "+ (id)outputStreamToBuffer:(uint8_t *)buffer capacity:(NSUInteger)capacity;", selector = "outputStreamToBuffer:capacity:")
    public static native NSObject outputStreamToBuffer$capacity$(@Uint8 byte[] buffer, @NSUInteger long capacity);

    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "+ (id)outputStreamToFileAtPath:(NSString *)path append:(BOOL)shouldAppend;", selector = "outputStreamToFileAtPath:append:")
    public static native NSObject outputStreamToFileAtPath$append$(NSString path, boolean shouldAppend);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSOutputStreamExtensions", catownername = "NSOutputStream")
    @ObjCMethodSign(sign = "+ (id)outputStreamWithURL:(NSURL *)url append:(BOOL)shouldAppend NS_AVAILABLE(10_6, 4_0);", selector = "outputStreamWithURL:append:")
    public static native NSObject outputStreamWithURL$append$(NSURL url, boolean shouldAppend);
}
