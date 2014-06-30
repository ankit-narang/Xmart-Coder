package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSProcessInfo extends NSObject  {
    
    public NSProcessInfo() {}
    
    
    @ObjCMethodSign(sign = "- (NSDictionary *)environment;", selector = "environment")
    public native NSDictionary environment();

    @ObjCMethodSign(sign = "- (NSArray *)arguments;", selector = "arguments")
    public native NSArray arguments();

    @ObjCMethodSign(sign = "- (NSString *)hostName;", selector = "hostName")
    public native NSString hostName();

    @ObjCMethodSign(sign = "- (NSString *)processName;", selector = "processName")
    public native NSString processName();

    @ObjCMethodSign(sign = "- (int)processIdentifier;", selector = "processIdentifier")
    public native int processIdentifier();

    @ObjCMethodSign(sign = "- (void)setProcessName:(NSString *)newName;", selector = "setProcessName:")
    public native void setProcessName(NSString newName);

    @ObjCMethodSign(sign = "- (NSString *)globallyUniqueString;", selector = "globallyUniqueString")
    public native NSString globallyUniqueString();

    @ObjCMethodSign(sign = "- (NSUInteger)operatingSystem;", selector = "operatingSystem")
    public native @NSUInteger long operatingSystem();

    @ObjCMethodSign(sign = "- (NSString *)operatingSystemName;", selector = "operatingSystemName")
    public native NSString operatingSystemName();

    @ObjCMethodSign(sign = "- (NSString *)operatingSystemVersionString;", selector = "operatingSystemVersionString")
    public native NSString operatingSystemVersionString();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)processorCount NS_AVAILABLE(10_5, 2_0);", selector = "processorCount")
    public native @NSUInteger long processorCount();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)activeProcessorCount NS_AVAILABLE(10_5, 2_0);", selector = "activeProcessorCount")
    public native @NSUInteger long activeProcessorCount();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (unsigned long long)physicalMemory NS_AVAILABLE(10_5, 2_0);", selector = "physicalMemory")
    public native @Unsigned @LongLong long physicalMemory();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSTimeInterval)systemUptime NS_AVAILABLE(10_6, 4_0);", selector = "systemUptime")
    public native double systemUptime();

    @ObjCMethodSign(sign = "+ (NSProcessInfo *)processInfo;", selector = "processInfo")
    public static native NSProcessInfo processInfo();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "", catownername = "NSProcessInfo")
    @ObjCMethodSign(sign = "- (id <NSObject>)beginActivityWithOptions:(NSActivityOptions)options reason:(NSString *)reason NS_AVAILABLE(10_9, 7_0);", selector = "beginActivityWithOptions:reason:")
    public native NSObject beginActivityWithOptions$reason$(NSActivityOptions options, NSString reason);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "", catownername = "NSProcessInfo")
    @ObjCMethodSign(sign = "- (void)endActivity:(id <NSObject>)activity NS_AVAILABLE(10_9, 7_0);", selector = "endActivity:")
    public native void endActivity$(NSObject activity);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "", catownername = "NSProcessInfo")
    @ObjCMethodSign(sign = "- (void)performActivityWithOptions:(NSActivityOptions)options reason:(NSString *)reason usingBlock:(void (^)(void))block NS_AVAILABLE(10_9, 7_0);", selector = "performActivityWithOptions:reason:usingBlock:")
    public native void performActivityWithOptions$reason$usingBlock$(NSActivityOptions options, NSString reason, ObjCBlock block);
}
