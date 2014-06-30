package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSRunLoop extends NSObject  {
    
    public NSRunLoop() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)currentMode;", selector = "currentMode")
    public native NSString currentMode();

    @ObjCMethodSign(sign = "- (CFRunLoopRef)getCFRunLoop;", selector = "getCFRunLoop")
    public native __CFRunLoop getCFRunLoop();

    @ObjCMethodSign(sign = "- (void)addTimer:(NSTimer *)timer forMode:(NSString *)mode;", selector = "addTimer:forMode:")
    public native void addTimer$forMode$(NSTimer timer, NSString mode);

    @ObjCMethodSign(sign = "- (void)addPort:(NSPort *)aPort forMode:(NSString *)mode;", selector = "addPort:forMode:")
    public native void addPort$forMode$(NSPort aPort, NSString mode);

    @ObjCMethodSign(sign = "- (void)removePort:(NSPort *)aPort forMode:(NSString *)mode;", selector = "removePort:forMode:")
    public native void removePort$forMode$(NSPort aPort, NSString mode);

    @ObjCMethodSign(sign = "- (NSDate *)limitDateForMode:(NSString *)mode;", selector = "limitDateForMode:")
    public native NSDate limitDateForMode$(NSString mode);

    @ObjCMethodSign(sign = "- (void)acceptInputForMode:(NSString *)mode beforeDate:(NSDate *)limitDate;", selector = "acceptInputForMode:beforeDate:")
    public native void acceptInputForMode$beforeDate$(NSString mode, NSDate limitDate);

    @ObjCMethodSign(sign = "+ (NSRunLoop *)currentRunLoop;", selector = "currentRunLoop")
    public static native NSRunLoop currentRunLoop();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSRunLoop *)mainRunLoop NS_AVAILABLE(10_5, 2_0);", selector = "mainRunLoop")
    public static native NSRunLoop mainRunLoop();

    @ObjCCategoryMethod(catname = "NSRunLoopConveniences", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (void)run;", selector = "run")
    public native void run();

    @ObjCCategoryMethod(catname = "NSRunLoopConveniences", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (void)runUntilDate:(NSDate *)limitDate;", selector = "runUntilDate:")
    public native void runUntilDate$(NSDate limitDate);

    @ObjCCategoryMethod(catname = "NSRunLoopConveniences", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (BOOL)runMode:(NSString *)mode beforeDate:(NSDate *)limitDate;", selector = "runMode:beforeDate:")
    public native boolean runMode$beforeDate$(NSString mode, NSDate limitDate);

    @ObjCCategoryMethod(catname = "NSOrderedPerform", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (void)performSelector:(SEL)aSelector target:(id)target argument:(id)arg order:(NSUInteger)order modes:(NSArray *)modes;", selector = "performSelector:target:argument:order:modes:")
    public native void performSelector$target$argument$order$modes$(ObjCSelector aSelector, NSObject target, NSObject arg, @NSUInteger long order, NSArray modes);

    @ObjCCategoryMethod(catname = "NSOrderedPerform", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (void)cancelPerformSelector:(SEL)aSelector target:(id)target argument:(id)arg;", selector = "cancelPerformSelector:target:argument:")
    public native void cancelPerformSelector$target$argument$(ObjCSelector aSelector, NSObject target, NSObject arg);

    @ObjCCategoryMethod(catname = "NSOrderedPerform", catownername = "NSRunLoop")
    @ObjCMethodSign(sign = "- (void)cancelPerformSelectorsWithTarget:(id)target;", selector = "cancelPerformSelectorsWithTarget:")
    public native void cancelPerformSelectorsWithTarget$(NSObject target);
}
