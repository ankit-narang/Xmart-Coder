package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMachPort extends NSPort  {
    
    public NSMachPort() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithMachPort:(uint32_t)machPort;", selector = "initWithMachPort:")
    public native NSMachPort initWithMachPort$(@Unsigned int machPort);

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSMachPortDelegate>)anObject;", selector = "setDelegate:")
    public native void setDelegate(NSMachPortDelegate anObject);

    @ObjCMethodSign(sign = "- (id <NSMachPortDelegate>)delegate;", selector = "delegate")
    public native NSMachPortDelegate delegate();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithMachPort:(uint32_t)machPort options:(NSUInteger)f NS_AVAILABLE(10_5, 2_0);", selector = "initWithMachPort:options:")
    public native NSMachPort initWithMachPort$options$(@Unsigned int machPort, @NSUInteger long f);

    @ObjCMethodSign(sign = "- (uint32_t)machPort;", selector = "machPort")
    public native @Unsigned int machPort();

    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)runLoop forMode:(NSString *)mode;", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop runLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)runLoop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop runLoop, NSString mode);

    @ObjCMethodSign(sign = "+ (NSPort *)portWithMachPort:(uint32_t)machPort;", selector = "portWithMachPort:")
    public static native NSPort portWithMachPort$(@Unsigned int machPort);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSPort *)portWithMachPort:(uint32_t)machPort options:(NSUInteger)f NS_AVAILABLE(10_5, 2_0);", selector = "portWithMachPort:options:")
    public static native NSPort portWithMachPort$options$(@Unsigned int machPort, @NSUInteger long f);
}
