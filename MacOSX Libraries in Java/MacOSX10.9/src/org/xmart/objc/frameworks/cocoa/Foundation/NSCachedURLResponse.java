package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCachedURLResponse extends NSObject implements NSCoding, NSCopying {
    
    public NSCachedURLResponse() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithResponse:(NSURLResponse *)response data:(NSData *)data;", selector = "initWithResponse:data:")
    public native NSCachedURLResponse initWithResponse$data$(NSURLResponse response, NSData data);

    @ObjCMethodSign(sign = "- (id)initWithResponse:(NSURLResponse *)response data:(NSData *)data userInfo:(NSDictionary *)userInfo storagePolicy:(NSURLCacheStoragePolicy)storagePolicy;", selector = "initWithResponse:data:userInfo:storagePolicy:")
    public native NSCachedURLResponse initWithResponse$data$userInfo$storagePolicy$(NSURLResponse response, NSData data, NSDictionary userInfo, NSURLCacheStoragePolicy storagePolicy);

    @ObjCMethodSign(sign = "- (NSURLResponse *)response;", selector = "response")
    public native NSURLResponse response();

    @ObjCMethodSign(sign = "- (NSData *)data;", selector = "data")
    public native NSData data();

    @ObjCMethodSign(sign = "- (NSDictionary *)userInfo;", selector = "userInfo")
    public native NSDictionary userInfo();

    @ObjCMethodSign(sign = "- (NSURLCacheStoragePolicy)storagePolicy;", selector = "storagePolicy")
    public native NSURLCacheStoragePolicy storagePolicy();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSCachedURLResponse initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
