package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNotification extends NSObject implements NSCopying, NSCoding {
    
    public NSNotification() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (id)object;", selector = "object")
    public native NSObject object();

    @ObjCMethodSign(sign = "- (NSDictionary *)userInfo;", selector = "userInfo")
    public native NSDictionary userInfo();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSNotificationCreation", catownername = "NSNotification")
    @ObjCMethodSign(sign = "- (instancetype)initWithName:(NSString *)name object:(id)object userInfo:(NSDictionary *)userInfo NS_AVAILABLE(10_6, 4_0);", selector = "initWithName:object:userInfo:")
    public native NSNotification initWithName$object$userInfo$(NSString name, NSObject object, NSDictionary userInfo);

    @ObjCCategoryMethod(catname = "NSNotificationCreation", catownername = "NSNotification")
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSNotification init();

    @ObjCCategoryMethod(catname = "NSNotificationCreation", catownername = "NSNotification")
    @ObjCMethodSign(sign = "+ (instancetype)notificationWithName:(NSString *)aName object:(id)anObject;", selector = "notificationWithName:object:")
    public static native NSNotification notificationWithName$object$(NSString aName, NSObject anObject);

    @ObjCCategoryMethod(catname = "NSNotificationCreation", catownername = "NSNotification")
    @ObjCMethodSign(sign = "+ (instancetype)notificationWithName:(NSString *)aName object:(id)anObject userInfo:(NSDictionary *)aUserInfo;", selector = "notificationWithName:object:userInfo:")
    public static native NSNotification notificationWithName$object$userInfo$(NSString aName, NSObject anObject, NSDictionary aUserInfo);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSNotification initWithCoder$(NSCoder aDecoder);
}
