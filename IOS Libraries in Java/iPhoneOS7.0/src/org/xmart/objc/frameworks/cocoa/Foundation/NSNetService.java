package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNetService extends NSObject  {
    
    public NSNetService() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native NSNetServiceDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSNetServiceDelegate v);
    @ObjCProperty public NSNetServiceDelegate delegate;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "includesPeerToPeer")
    public native boolean isIncludesPeerToPeer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean v);
    @ObjCProperty public boolean includesPeerToPeer;

    @ObjCPropertyGetter(selector = "name")
    public native NSString getName();
    @ObjCProperty public NSString name;

    @ObjCPropertyGetter(selector = "type")
    public native NSString getType();
    @ObjCProperty public NSString type;

    @ObjCPropertyGetter(selector = "domain")
    public native NSString getDomain();
    @ObjCProperty public NSString domain;

    @ObjCPropertyGetter(selector = "hostName")
    public native NSString getHostName();
    @ObjCProperty public NSString hostName;

    @ObjCPropertyGetter(selector = "addresses")
    public native NSArray getAddresses();
    @ObjCProperty public NSArray addresses;

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCPropertyGetter(selector = "port")
    public native @NSInteger long getPort();
    @ObjCProperty public @NSInteger long port;
    
    @ObjCMethodSign(sign = "- (id)initWithDomain:(NSString *)domain type:(NSString *)type name:(NSString *)name port:(int)port;", selector = "initWithDomain:type:name:port:")
    public native NSNetService initWithDomain$type$name$port$(NSString domain, NSString type, NSString name, int port);

    @ObjCMethodSign(sign = "- (id)initWithDomain:(NSString *)domain type:(NSString *)type name:(NSString *)name;", selector = "initWithDomain:type:name:")
    public native NSNetService initWithDomain$type$name$(NSString domain, NSString type, NSString name);

    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)publish;", selector = "publish")
    public native void publish();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)publishWithOptions:(NSNetServiceOptions)options NS_AVAILABLE(10_5, 2_0);", selector = "publishWithOptions:")
    public native void publishWithOptions$(NSNetServiceOptions options);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)resolve NS_DEPRECATED(10_2, 10_4, 2_0, 2_0);", selector = "resolve")
    public native void resolve();

    @ObjCMethodSign(sign = "- (void)stop;", selector = "stop")
    public native void stop();

    @ObjCMethodSign(sign = "- (void)resolveWithTimeout:(NSTimeInterval)timeout;", selector = "resolveWithTimeout:")
    public native void resolveWithTimeout$(double timeout);

    @ObjCMethodSign(sign = "- (BOOL)getInputStream:(out __strong NSInputStream **)inputStream outputStream:(out __strong NSOutputStream **)outputStream;", selector = "getInputStream:outputStream:")
    public native boolean getInputStream$outputStream$(NSInputStream[] inputStream, NSOutputStream[] outputStream);

    @ObjCMethodSign(sign = "- (BOOL)setTXTRecordData:(NSData *)recordData;", selector = "setTXTRecordData:")
    public native boolean setTXTRecordData$(NSData recordData);

    @ObjCMethodSign(sign = "- (NSData *)TXTRecordData;", selector = "TXTRecordData")
    public native NSData TXTRecordData();

    @ObjCMethodSign(sign = "- (void)startMonitoring;", selector = "startMonitoring")
    public native void startMonitoring();

    @ObjCMethodSign(sign = "- (void)stopMonitoring;", selector = "stopMonitoring")
    public native void stopMonitoring();

    @ObjCMethodSign(sign = "+ (NSDictionary *)dictionaryFromTXTRecordData:(NSData *)txtData;", selector = "dictionaryFromTXTRecordData:")
    public static native NSDictionary dictionaryFromTXTRecordData$(NSData txtData);

    @ObjCMethodSign(sign = "+ (NSData *)dataFromTXTRecordDictionary:(NSDictionary *)txtDictionary;", selector = "dataFromTXTRecordDictionary:")
    public static native NSData dataFromTXTRecordDictionary$(NSDictionary txtDictionary);
}
