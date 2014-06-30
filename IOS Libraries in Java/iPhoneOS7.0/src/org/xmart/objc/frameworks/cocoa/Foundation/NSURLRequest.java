package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLRequest extends NSObject implements NSSecureCoding, NSCopying, NSMutableCopying {
    
    public NSURLRequest() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)URL;", selector = "initWithURL:")
    public native NSURLRequest initWithURL$(NSURL URL);

    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)URL cachePolicy:(NSURLRequestCachePolicy)cachePolicy timeoutInterval:(NSTimeInterval)timeoutInterval;", selector = "initWithURL:cachePolicy:timeoutInterval:")
    public native NSURLRequest initWithURL$cachePolicy$timeoutInterval$(NSURL URL, NSURLRequestCachePolicy cachePolicy, double timeoutInterval);

    @ObjCMethodSign(sign = "- (NSURL *)URL;", selector = "URL")
    public native NSURL URL();

    @ObjCMethodSign(sign = "- (NSURLRequestCachePolicy)cachePolicy;", selector = "cachePolicy")
    public native NSURLRequestCachePolicy cachePolicy();

    @ObjCMethodSign(sign = "- (NSTimeInterval)timeoutInterval;", selector = "timeoutInterval")
    public native double timeoutInterval();

    @ObjCMethodSign(sign = "- (NSURL *)mainDocumentURL;", selector = "mainDocumentURL")
    public native NSURL mainDocumentURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURLRequestNetworkServiceType)networkServiceType NS_AVAILABLE(10_7, 4_0);", selector = "networkServiceType")
    public native NSURLRequestNetworkServiceType networkServiceType();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)allowsCellularAccess  NS_AVAILABLE(10_8, 6_0);", selector = "allowsCellularAccess")
    public native boolean allowsCellularAccess();

    @ObjCMethodSign(sign = "+ (id)requestWithURL:(NSURL *)URL;", selector = "requestWithURL:")
    public static native NSObject requestWithURL$(NSURL URL);

    @ObjCMethodSign(sign = "+ (BOOL)supportsSecureCoding;", selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @ObjCMethodSign(sign = "+ (id)requestWithURL:(NSURL *)URL cachePolicy:(NSURLRequestCachePolicy)cachePolicy timeoutInterval:(NSTimeInterval)timeoutInterval;", selector = "requestWithURL:cachePolicy:timeoutInterval:")
    public static native NSObject requestWithURL$cachePolicy$timeoutInterval$(NSURL URL, NSURLRequestCachePolicy cachePolicy, double timeoutInterval);

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (NSString *)HTTPMethod;", selector = "HTTPMethod")
    public native NSString HTTPMethod();

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (NSDictionary *)allHTTPHeaderFields;", selector = "allHTTPHeaderFields")
    public native NSDictionary allHTTPHeaderFields();

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (NSString *)valueForHTTPHeaderField:(NSString *)field;", selector = "valueForHTTPHeaderField:")
    public native NSString valueForHTTPHeaderField$(NSString field);

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (NSData *)HTTPBody;", selector = "HTTPBody")
    public native NSData HTTPBody();

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (NSInputStream *)HTTPBodyStream;", selector = "HTTPBodyStream")
    public native NSInputStream HTTPBodyStream();

    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (BOOL)HTTPShouldHandleCookies;", selector = "HTTPShouldHandleCookies")
    public native boolean HTTPShouldHandleCookies();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSHTTPURLRequest", catownername = "NSURLRequest")
    @ObjCMethodSign(sign = "- (BOOL)HTTPShouldUsePipelining NS_AVAILABLE(10_7, 4_0);", selector = "HTTPShouldUsePipelining")
    public native boolean HTTPShouldUsePipelining();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURLRequest initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);
}
