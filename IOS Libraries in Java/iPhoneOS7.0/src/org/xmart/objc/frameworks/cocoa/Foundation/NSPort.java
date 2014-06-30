package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPort extends NSObject implements NSCopying, NSCoding {
    
    public NSPort() {}
    
    
    @ObjCMethodSign(sign = "- (void)invalidate;", selector = "invalidate")
    public native void invalidate();

    @ObjCMethodSign(sign = "- (BOOL)isValid;", selector = "isValid")
    public native boolean isValid();

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSPortDelegate>)anObject;", selector = "setDelegate:")
    public native void setDelegate(NSPortDelegate anObject);

    @ObjCMethodSign(sign = "- (id <NSPortDelegate>)delegate;", selector = "delegate")
    public native NSPortDelegate delegate();

    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)runLoop forMode:(NSString *)mode;", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop runLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)runLoop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop runLoop, NSString mode);

    @ObjCMethodSign(sign = "- (NSUInteger)reservedSpaceLength;", selector = "reservedSpaceLength")
    public native @NSUInteger long reservedSpaceLength();

    @ObjCMethodSign(sign = "- (BOOL)sendBeforeDate:(NSDate *)limitDate components:(NSMutableArray *)components from:(NSPort *) receivePort reserved:(NSUInteger)headerSpaceReserved;", selector = "sendBeforeDate:components:from:reserved:")
    public native boolean sendBeforeDate$components$from$reserved$(NSDate limitDate, NSMutableArray components, NSPort receivePort, @NSUInteger long headerSpaceReserved);

    @ObjCMethodSign(sign = "- (BOOL)sendBeforeDate:(NSDate *)limitDate msgid:(NSUInteger)msgID components:(NSMutableArray *)components from:(NSPort *)receivePort reserved:(NSUInteger)headerSpaceReserved;", selector = "sendBeforeDate:msgid:components:from:reserved:")
    public native boolean sendBeforeDate$msgid$components$from$reserved$(NSDate limitDate, @NSUInteger long msgID, NSMutableArray components, NSPort receivePort, @NSUInteger long headerSpaceReserved);

    @ObjCMethodSign(sign = "+ (NSPort *)port;", selector = "port")
    public static native NSPort port();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSPort initWithCoder$(NSCoder aDecoder);
}
