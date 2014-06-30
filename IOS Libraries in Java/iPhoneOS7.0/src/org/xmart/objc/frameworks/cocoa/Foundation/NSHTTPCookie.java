package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSHTTPCookie extends NSObject  {
    
    public NSHTTPCookie() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithProperties:(NSDictionary *)properties;", selector = "initWithProperties:")
    public native NSHTTPCookie initWithProperties$(NSDictionary properties);

    @ObjCMethodSign(sign = "- (NSDictionary *)properties;", selector = "properties")
    public native NSDictionary properties();

    @ObjCMethodSign(sign = "- (NSUInteger)version;", selector = "version")
    public native @NSUInteger long version();

    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (NSString *)value;", selector = "value")
    public native NSString value();

    @ObjCMethodSign(sign = "- (NSDate *)expiresDate;", selector = "expiresDate")
    public native NSDate expiresDate();

    @ObjCMethodSign(sign = "- (BOOL)isSessionOnly;", selector = "isSessionOnly")
    public native boolean isSessionOnly();

    @ObjCMethodSign(sign = "- (NSString *)domain;", selector = "domain")
    public native NSString domain();

    @ObjCMethodSign(sign = "- (NSString *)path;", selector = "path")
    public native NSString path();

    @ObjCMethodSign(sign = "- (BOOL)isSecure;", selector = "isSecure")
    public native boolean isSecure();

    @ObjCMethodSign(sign = "- (BOOL)isHTTPOnly;", selector = "isHTTPOnly")
    public native boolean isHTTPOnly();

    @ObjCMethodSign(sign = "- (NSString *)comment;", selector = "comment")
    public native NSString comment();

    @ObjCMethodSign(sign = "- (NSURL *)commentURL;", selector = "commentURL")
    public native NSURL commentURL();

    @ObjCMethodSign(sign = "- (NSArray *)portList;", selector = "portList")
    public native NSArray portList();

    @ObjCMethodSign(sign = "+ (id)cookieWithProperties:(NSDictionary *)properties;", selector = "cookieWithProperties:")
    public static native NSObject cookieWithProperties$(NSDictionary properties);

    @ObjCMethodSign(sign = "+ (NSDictionary *)requestHeaderFieldsWithCookies:(NSArray *)cookies;", selector = "requestHeaderFieldsWithCookies:")
    public static native NSDictionary requestHeaderFieldsWithCookies$(NSArray cookies);

    @ObjCMethodSign(sign = "+ (NSArray *)cookiesWithResponseHeaderFields:(NSDictionary *)headerFields forURL:(NSURL *)URL;", selector = "cookiesWithResponseHeaderFields:forURL:")
    public static native NSArray cookiesWithResponseHeaderFields$forURL$(NSDictionary headerFields, NSURL URL);
}
