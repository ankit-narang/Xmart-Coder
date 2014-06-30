package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLProtocol extends NSObject  {
    
    public NSURLProtocol() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithRequest:(NSURLRequest *)request cachedResponse:(NSCachedURLResponse *)cachedResponse client:(id <NSURLProtocolClient>)client;", selector = "initWithRequest:cachedResponse:client:")
    public native NSURLProtocol initWithRequest$cachedResponse$client$(NSURLRequest request, NSCachedURLResponse cachedResponse, NSURLProtocolClient client);

    @ObjCMethodSign(sign = "- (id <NSURLProtocolClient>)client;", selector = "client")
    public native NSURLProtocolClient client();

    @ObjCMethodSign(sign = "- (NSURLRequest *)request;", selector = "request")
    public native NSURLRequest request();

    @ObjCMethodSign(sign = "- (NSCachedURLResponse *)cachedResponse;", selector = "cachedResponse")
    public native NSCachedURLResponse cachedResponse();

    @ObjCMethodSign(sign = "- (void)startLoading;", selector = "startLoading")
    public native void startLoading();

    @ObjCMethodSign(sign = "- (void)stopLoading;", selector = "stopLoading")
    public native void stopLoading();

    @ObjCMethodSign(sign = "+ (BOOL)canInitWithRequest:(NSURLRequest *)request;", selector = "canInitWithRequest:")
    public static native boolean canInitWithRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "+ (NSURLRequest *)canonicalRequestForRequest:(NSURLRequest *)request;", selector = "canonicalRequestForRequest:")
    public static native NSURLRequest canonicalRequestForRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "+ (BOOL)requestIsCacheEquivalent:(NSURLRequest *)a toRequest:(NSURLRequest *)b;", selector = "requestIsCacheEquivalent:toRequest:")
    public static native boolean requestIsCacheEquivalent$toRequest$(NSURLRequest a, NSURLRequest b);

    @ObjCMethodSign(sign = "+ (id)propertyForKey:(NSString *)key inRequest:(NSURLRequest *)request;", selector = "propertyForKey:inRequest:")
    public static native NSObject propertyForKey$inRequest$(NSString key, NSURLRequest request);

    @ObjCMethodSign(sign = "+ (void)setProperty:(id)value forKey:(NSString *)key inRequest:(NSMutableURLRequest *)request;", selector = "setProperty:forKey:inRequest:")
    public static native void setProperty$forKey$inRequest$(NSObject value, NSString key, NSMutableURLRequest request);

    @ObjCMethodSign(sign = "+ (void)removePropertyForKey:(NSString *)key inRequest:(NSMutableURLRequest *)request;", selector = "removePropertyForKey:inRequest:")
    public static native void removePropertyForKey$inRequest$(NSString key, NSMutableURLRequest request);

    @ObjCMethodSign(sign = "+ (BOOL)registerClass:(Class)protocolClass;", selector = "registerClass:")
    public static native boolean registerClass$(ObjCClass protocolClass);

    @ObjCMethodSign(sign = "+ (void)unregisterClass:(Class)protocolClass;", selector = "unregisterClass:")
    public static native void unregisterClass$(ObjCClass protocolClass);
}
