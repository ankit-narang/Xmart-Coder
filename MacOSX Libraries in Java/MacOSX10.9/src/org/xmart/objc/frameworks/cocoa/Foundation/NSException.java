package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSException extends NSObject implements NSCopying, NSCoding {
    
    public NSException() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithName:(NSString *)aName reason:(NSString *)aReason userInfo:(NSDictionary *)aUserInfo;", selector = "initWithName:reason:userInfo:")
    public native NSException initWithName$reason$userInfo$(NSString aName, NSString aReason, NSDictionary aUserInfo);

    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (NSString *)reason;", selector = "reason")
    public native NSString reason();

    @ObjCMethodSign(sign = "- (NSDictionary *)userInfo;", selector = "userInfo")
    public native NSDictionary userInfo();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)callStackReturnAddresses NS_AVAILABLE(10_5, 2_0);", selector = "callStackReturnAddresses")
    public native NSArray callStackReturnAddresses();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)callStackSymbols NS_AVAILABLE(10_6, 4_0);", selector = "callStackSymbols")
    public native NSArray callStackSymbols();

    @ObjCMethodSign(sign = "- (void)raise;", selector = "raise")
    public native void raise();

    @ObjCMethodSign(sign = "+ (NSException *)exceptionWithName:(NSString *)name reason:(NSString *)reason userInfo:(NSDictionary *)userInfo;", selector = "exceptionWithName:reason:userInfo:")
    public static native NSException exceptionWithName$reason$userInfo$(NSString name, NSString reason, NSDictionary userInfo);

    @ObjCCategoryMethod(catname = "NSExceptionRaisingConveniences", catownername = "NSException")
    @ObjCMethodSign(sign = "+ (void)raise:(NSString *)name format:(NSString *)format, ... NS_FORMAT_FUNCTION(2,3);", selector = "raise:format:")
    public static native void raise$format$(NSString name, NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSExceptionRaisingConveniences", catownername = "NSException")
    @ObjCMethodSign(sign = "+ (void)raise:(NSString *)name format:(NSString *)format arguments:(va_list)argList NS_FORMAT_FUNCTION(2,0);", selector = "raise:format:arguments:")
    public static native void raise$format$arguments$(NSString name, NSString format, NSObject... argList);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSException initWithCoder$(NSCoder aDecoder);
}
