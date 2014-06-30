package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSError extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSError() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithDomain:(NSString *)domain code:(NSInteger)code userInfo:(NSDictionary *)dict;", selector = "initWithDomain:code:userInfo:")
    public native NSError initWithDomain$code$userInfo$(NSString domain, @NSInteger long code, NSDictionary dict);

    @ObjCMethodSign(sign = "- (NSString *)domain;", selector = "domain")
    public native NSString domain();

    @ObjCMethodSign(sign = "- (NSInteger)code;", selector = "code")
    public native @NSInteger long code();

    @ObjCMethodSign(sign = "- (NSDictionary *)userInfo;", selector = "userInfo")
    public native NSDictionary userInfo();

    @ObjCMethodSign(sign = "- (NSString *)localizedDescription;", selector = "localizedDescription")
    public native NSString localizedDescription();

    @ObjCMethodSign(sign = "- (NSString *)localizedFailureReason;", selector = "localizedFailureReason")
    public native NSString localizedFailureReason();

    @ObjCMethodSign(sign = "- (NSString *)localizedRecoverySuggestion;", selector = "localizedRecoverySuggestion")
    public native NSString localizedRecoverySuggestion();

    @ObjCMethodSign(sign = "- (NSArray *)localizedRecoveryOptions;", selector = "localizedRecoveryOptions")
    public native NSArray localizedRecoveryOptions();

    @ObjCMethodSign(sign = "- (id)recoveryAttempter;", selector = "recoveryAttempter")
    public native NSObject recoveryAttempter();

    @ObjCMethodSign(sign = "- (NSString *)helpAnchor;", selector = "helpAnchor")
    public native NSString helpAnchor();

    @ObjCMethodSign(sign = "+ (id)errorWithDomain:(NSString *)domain code:(NSInteger)code userInfo:(NSDictionary *)dict;", selector = "errorWithDomain:code:userInfo:")
    public static native NSObject errorWithDomain$code$userInfo$(NSString domain, @NSInteger long code, NSDictionary dict);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSError initWithCoder$(NSCoder aDecoder);
}
