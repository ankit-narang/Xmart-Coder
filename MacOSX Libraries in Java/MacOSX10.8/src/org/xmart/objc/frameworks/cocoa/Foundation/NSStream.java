package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSStream extends NSObject  {
    
    public NSStream() {}
    
    
    @ObjCMethodSign(sign = "- (void)open;", selector = "open")
    public native void open();

    @ObjCMethodSign(sign = "- (void)close;", selector = "close")
    public native void close();

    @ObjCMethodSign(sign = "- (id <NSStreamDelegate>)delegate;", selector = "delegate")
    public native NSStreamDelegate delegate();

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSStreamDelegate>)delegate;", selector = "setDelegate:")
    public native void setDelegate(NSStreamDelegate delegate);

    @ObjCMethodSign(sign = "- (id)propertyForKey:(NSString *)key;", selector = "propertyForKey:")
    public native NSObject propertyForKey$(NSString key);

    @ObjCMethodSign(sign = "- (BOOL)setProperty:(id)property forKey:(NSString *)key;", selector = "setProperty:forKey:")
    public native boolean setProperty$forKey$(NSObject property, NSString key);

    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (NSStreamStatus)streamStatus;", selector = "streamStatus")
    public native NSStreamStatus streamStatus();

    @ObjCMethodSign(sign = "- (NSError *)streamError;", selector = "streamError")
    public native NSError streamError();
}
