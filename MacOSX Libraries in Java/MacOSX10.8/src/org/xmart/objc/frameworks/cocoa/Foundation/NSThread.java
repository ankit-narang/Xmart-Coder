package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSThread extends NSObject  {
    
    public NSThread() {}
    
    
    @ObjCMethodSign(sign = "- (NSMutableDictionary *)threadDictionary;", selector = "threadDictionary")
    public native NSMutableDictionary threadDictionary();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (double)threadPriority NS_AVAILABLE(10_6, 4_0);", selector = "threadPriority")
    public native double threadPriority();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setThreadPriority:(double)p NS_AVAILABLE(10_6, 4_0);", selector = "setThreadPriority:")
    public native void setThreadPriority(double p);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setName:(NSString *)n NS_AVAILABLE(10_5, 2_0);", selector = "setName:")
    public native void setName(NSString n);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)name NS_AVAILABLE(10_5, 2_0);", selector = "name")
    public native NSString name();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)stackSize NS_AVAILABLE(10_5, 2_0);", selector = "stackSize")
    public native @NSUInteger long stackSize();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setStackSize:(NSUInteger)s NS_AVAILABLE(10_5, 2_0);", selector = "setStackSize:")
    public native void setStackSize(@NSUInteger long s);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isMainThread NS_AVAILABLE(10_5, 2_0);", selector = "isMainThread")
    public native boolean isMainThread();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)init NS_AVAILABLE(10_5, 2_0);", selector = "init")
    public native NSThread init();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithTarget:(id)target selector:(SEL)selector object:(id)argument NS_AVAILABLE(10_5, 2_0);", selector = "initWithTarget:selector:object:")
    public native NSThread initWithTarget$selector$object$(NSObject target, ObjCSelector selector, NSObject argument);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isExecuting NS_AVAILABLE(10_5, 2_0);", selector = "isExecuting")
    public native boolean isExecuting();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isFinished NS_AVAILABLE(10_5, 2_0);", selector = "isFinished")
    public native boolean isFinished();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isCancelled NS_AVAILABLE(10_5, 2_0);", selector = "isCancelled")
    public native boolean isCancelled();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)cancel NS_AVAILABLE(10_5, 2_0);", selector = "cancel")
    public native void cancel();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)start NS_AVAILABLE(10_5, 2_0);", selector = "start")
    public native void start();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)main NS_AVAILABLE(10_5, 2_0);", selector = "main")
    public native void main();

    @ObjCMethodSign(sign = "+ (NSThread *)currentThread;", selector = "currentThread")
    public static native NSThread currentThread();

    @ObjCMethodSign(sign = "+ (void)detachNewThreadSelector:(SEL)selector toTarget:(id)target withObject:(id)argument;", selector = "detachNewThreadSelector:toTarget:withObject:")
    public static native void detachNewThreadSelector$toTarget$withObject$(ObjCSelector selector, NSObject target, NSObject argument);

    @ObjCMethodSign(sign = "+ (BOOL)isMultiThreaded;", selector = "isMultiThreaded")
    public static native boolean isMultiThreaded();

    @ObjCMethodSign(sign = "+ (void)sleepUntilDate:(NSDate *)date;", selector = "sleepUntilDate:")
    public static native void sleepUntilDate$(NSDate date);

    @ObjCMethodSign(sign = "+ (void)sleepForTimeInterval:(NSTimeInterval)ti;", selector = "sleepForTimeInterval:")
    public static native void sleepForTimeInterval$(double ti);

    @ObjCMethodSign(sign = "+ (void)exit;", selector = "exit")
    public static native void exit();

    @ObjCMethodSign(sign = "+ (double)threadPriority;", selector = "threadPriority")
    public static native double threadPriority__STATIC();

    @ObjCMethodSign(sign = "+ (BOOL)setThreadPriority:(double)p;", selector = "setThreadPriority:")
    public static native boolean setThreadPriority$__STATIC(double p);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)callStackReturnAddresses NS_AVAILABLE(10_5, 2_0);", selector = "callStackReturnAddresses")
    public static native NSArray callStackReturnAddresses();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)callStackSymbols NS_AVAILABLE(10_6, 4_0);", selector = "callStackSymbols")
    public static native NSArray callStackSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)isMainThread NS_AVAILABLE(10_5, 2_0);", selector = "isMainThread")
    public static native boolean isMainThread__STATIC();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSThread *)mainThread NS_AVAILABLE(10_5, 2_0);", selector = "mainThread")
    public static native NSThread mainThread();
}
