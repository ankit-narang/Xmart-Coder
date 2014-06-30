package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLCache extends NSObject  {
    
    public NSURLCache() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithMemoryCapacity:(NSUInteger)memoryCapacity diskCapacity:(NSUInteger)diskCapacity diskPath:(NSString *)path;", selector = "initWithMemoryCapacity:diskCapacity:diskPath:")
    public native NSURLCache initWithMemoryCapacity$diskCapacity$diskPath$(@NSUInteger long memoryCapacity, @NSUInteger long diskCapacity, NSString path);

    @ObjCMethodSign(sign = "- (NSCachedURLResponse *)cachedResponseForRequest:(NSURLRequest *)request;", selector = "cachedResponseForRequest:")
    public native NSCachedURLResponse cachedResponseForRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (void)storeCachedResponse:(NSCachedURLResponse *)cachedResponse forRequest:(NSURLRequest *)request;", selector = "storeCachedResponse:forRequest:")
    public native void storeCachedResponse$forRequest$(NSCachedURLResponse cachedResponse, NSURLRequest request);

    @ObjCMethodSign(sign = "- (void)removeCachedResponseForRequest:(NSURLRequest *)request;", selector = "removeCachedResponseForRequest:")
    public native void removeCachedResponseForRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (void)removeAllCachedResponses;", selector = "removeAllCachedResponses")
    public native void removeAllCachedResponses();

    @ObjCMethodSign(sign = "- (NSUInteger)memoryCapacity;", selector = "memoryCapacity")
    public native @NSUInteger long memoryCapacity();

    @ObjCMethodSign(sign = "- (NSUInteger)diskCapacity;", selector = "diskCapacity")
    public native @NSUInteger long diskCapacity();

    @ObjCMethodSign(sign = "- (void)setMemoryCapacity:(NSUInteger)memoryCapacity;", selector = "setMemoryCapacity:")
    public native void setMemoryCapacity(@NSUInteger long memoryCapacity);

    @ObjCMethodSign(sign = "- (void)setDiskCapacity:(NSUInteger)diskCapacity;", selector = "setDiskCapacity:")
    public native void setDiskCapacity(@NSUInteger long diskCapacity);

    @ObjCMethodSign(sign = "- (NSUInteger)currentMemoryUsage;", selector = "currentMemoryUsage")
    public native @NSUInteger long currentMemoryUsage();

    @ObjCMethodSign(sign = "- (NSUInteger)currentDiskUsage;", selector = "currentDiskUsage")
    public native @NSUInteger long currentDiskUsage();

    @ObjCMethodSign(sign = "+ (NSURLCache *)sharedURLCache;", selector = "sharedURLCache")
    public static native NSURLCache sharedURLCache();

    @ObjCMethodSign(sign = "+ (void)setSharedURLCache:(NSURLCache *)cache;", selector = "setSharedURLCache:")
    public static native void setSharedURLCache(NSURLCache cache);
}
