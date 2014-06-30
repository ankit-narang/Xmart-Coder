package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLCredential extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSURLCredential() {}
    
    
    @ObjCMethodSign(sign = "- (NSURLCredentialPersistence)persistence;", selector = "persistence")
    public native NSURLCredentialPersistence persistence();

    @ObjCCategoryMethod(catname = "NSInternetPassword", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (id)initWithUser:(NSString *)user password:(NSString *)password persistence:(NSURLCredentialPersistence)persistence;", selector = "initWithUser:password:persistence:")
    public native NSURLCredential initWithUser$password$persistence$(NSString user, NSString password, NSURLCredentialPersistence persistence);

    @ObjCCategoryMethod(catname = "NSInternetPassword", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (NSString *)user;", selector = "user")
    public native NSString user();

    @ObjCCategoryMethod(catname = "NSInternetPassword", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (NSString *)password;", selector = "password")
    public native NSString password();

    @ObjCCategoryMethod(catname = "NSInternetPassword", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (BOOL)hasPassword;", selector = "hasPassword")
    public native boolean hasPassword();

    @ObjCCategoryMethod(catname = "NSInternetPassword", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "+ (NSURLCredential *)credentialWithUser:(NSString *)user password:(NSString *)password persistence:(NSURLCredentialPersistence)persistence;", selector = "credentialWithUser:password:persistence:")
    public static native NSURLCredential credentialWithUser$password$persistence$(NSString user, NSString password, NSURLCredentialPersistence persistence);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSClientCertificate", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (id)initWithIdentity:(SecIdentityRef)identity certificates:(NSArray *)certArray persistence:(NSURLCredentialPersistence)persistence NS_AVAILABLE(10_6, 3_0);", selector = "initWithIdentity:certificates:persistence:")
    public native NSURLCredential initWithIdentity$certificates$persistence$(SecIdentityRef identity, NSArray certArray, NSURLCredentialPersistence persistence);

    @ObjCCategoryMethod(catname = "NSClientCertificate", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (SecIdentityRef)identity;", selector = "identity")
    public native SecIdentityRef identity();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSClientCertificate", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (NSArray *)certificates NS_AVAILABLE(10_6, 3_0);", selector = "certificates")
    public native NSArray certificates();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSClientCertificate", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "+ (NSURLCredential *)credentialWithIdentity:(SecIdentityRef)identity certificates:(NSArray *)certArray persistence:(NSURLCredentialPersistence)persistence NS_AVAILABLE(10_6, 3_0);", selector = "credentialWithIdentity:certificates:persistence:")
    public static native NSURLCredential credentialWithIdentity$certificates$persistence$(SecIdentityRef identity, NSArray certArray, NSURLCredentialPersistence persistence);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSServerTrust", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "- (id)initWithTrust:(SecTrustRef)trust NS_AVAILABLE(10_6, 3_0);", selector = "initWithTrust:")
    public native NSURLCredential initWithTrust$(SecTrustRef trust);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSServerTrust", catownername = "NSURLCredential")
    @ObjCMethodSign(sign = "+ (NSURLCredential *)credentialForTrust:(SecTrustRef)trust NS_AVAILABLE(10_6, 3_0);", selector = "credentialForTrust:")
    public static native NSURLCredential credentialForTrust$(SecTrustRef trust);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURLCredential initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
