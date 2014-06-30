package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLProtectionSpace extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSURLProtectionSpace() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithHost:(NSString *)host port:(NSInteger)port protocol:(NSString *)protocol realm:(NSString *)realm authenticationMethod:(NSString *)authenticationMethod;", selector = "initWithHost:port:protocol:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithHost$port$protocol$realm$authenticationMethod$(NSString host, @NSInteger long port, NSString protocol, NSString realm, NSString authenticationMethod);

    @ObjCMethodSign(sign = "- (id)initWithProxyHost:(NSString *)host port:(NSInteger)port type:(NSString *)type realm:(NSString *)realm  authenticationMethod:(NSString *)authenticationMethod;", selector = "initWithProxyHost:port:type:realm:authenticationMethod:")
    public native NSURLProtectionSpace initWithProxyHost$port$type$realm$authenticationMethod$(NSString host, @NSInteger long port, NSString type, NSString realm, NSString authenticationMethod);

    @ObjCMethodSign(sign = "- (NSString *)realm;", selector = "realm")
    public native NSString realm();

    @ObjCMethodSign(sign = "- (BOOL)receivesCredentialSecurely;", selector = "receivesCredentialSecurely")
    public native boolean receivesCredentialSecurely();

    @ObjCMethodSign(sign = "- (BOOL)isProxy;", selector = "isProxy")
    public native boolean isProxy();

    @ObjCMethodSign(sign = "- (NSString *)host;", selector = "host")
    public native NSString host();

    @ObjCMethodSign(sign = "- (NSInteger)port;", selector = "port")
    public native @NSInteger long port();

    @ObjCMethodSign(sign = "- (NSString *)proxyType;", selector = "proxyType")
    public native NSString proxyType();

    @ObjCMethodSign(sign = "- (NSString *)protocol;", selector = "protocol")
    public native NSString protocol();

    @ObjCMethodSign(sign = "- (NSString *)authenticationMethod;", selector = "authenticationMethod")
    public native NSString authenticationMethod();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSClientCertificateSpace", catownername = "NSURLProtectionSpace")
    @ObjCMethodSign(sign = "- (NSArray *)distinguishedNames NS_AVAILABLE(10_6, 3_0);", selector = "distinguishedNames")
    public native NSArray distinguishedNames();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSServerTrustValidationSpace", catownername = "NSURLProtectionSpace")
    @ObjCMethodSign(sign = "- (SecTrustRef)serverTrust NS_AVAILABLE(10_6, 3_0);", selector = "serverTrust")
    public native SecTrustRef serverTrust();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURLProtectionSpace initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
