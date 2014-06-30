package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSTimer extends NSObject  {
    
    public NSTimer() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithFireDate:(NSDate *)date interval:(NSTimeInterval)ti target:(id)t selector:(SEL)s userInfo:(id)ui repeats:(BOOL)rep;", selector = "initWithFireDate:interval:target:selector:userInfo:repeats:")
    public native NSTimer initWithFireDate$interval$target$selector$userInfo$repeats$(NSDate date, double ti, NSObject t, ObjCSelector s, NSObject ui, boolean rep);

    @ObjCMethodSign(sign = "- (void)fire;", selector = "fire")
    public native void fire();

    @ObjCMethodSign(sign = "- (NSDate *)fireDate;", selector = "fireDate")
    public native NSDate fireDate();

    @ObjCMethodSign(sign = "- (void)setFireDate:(NSDate *)date;", selector = "setFireDate:")
    public native void setFireDate(NSDate date);

    @ObjCMethodSign(sign = "- (NSTimeInterval)timeInterval;", selector = "timeInterval")
    public native double timeInterval();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSTimeInterval)tolerance NS_AVAILABLE(10_9, 7_0);", selector = "tolerance")
    public native double tolerance();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTolerance:(NSTimeInterval)tolerance NS_AVAILABLE(10_9, 7_0);", selector = "setTolerance:")
    public native void setTolerance(double tolerance);

    @ObjCMethodSign(sign = "- (void)invalidate;", selector = "invalidate")
    public native void invalidate();

    @ObjCMethodSign(sign = "- (BOOL)isValid;", selector = "isValid")
    public native boolean isValid();

    @ObjCMethodSign(sign = "- (id)userInfo;", selector = "userInfo")
    public native NSObject userInfo();

    @ObjCMethodSign(sign = "+ (NSTimer *)timerWithTimeInterval:(NSTimeInterval)ti invocation:(NSInvocation *)invocation repeats:(BOOL)yesOrNo;", selector = "timerWithTimeInterval:invocation:repeats:")
    public static native NSTimer timerWithTimeInterval$invocation$repeats$(double ti, NSInvocation invocation, boolean yesOrNo);

    @ObjCMethodSign(sign = "+ (NSTimer *)scheduledTimerWithTimeInterval:(NSTimeInterval)ti invocation:(NSInvocation *)invocation repeats:(BOOL)yesOrNo;", selector = "scheduledTimerWithTimeInterval:invocation:repeats:")
    public static native NSTimer scheduledTimerWithTimeInterval$invocation$repeats$(double ti, NSInvocation invocation, boolean yesOrNo);

    @ObjCMethodSign(sign = "+ (NSTimer *)timerWithTimeInterval:(NSTimeInterval)ti target:(id)aTarget selector:(SEL)aSelector userInfo:(id)userInfo repeats:(BOOL)yesOrNo;", selector = "timerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer timerWithTimeInterval$target$selector$userInfo$repeats$(double ti, NSObject aTarget, ObjCSelector aSelector, NSObject userInfo, boolean yesOrNo);

    @ObjCMethodSign(sign = "+ (NSTimer *)scheduledTimerWithTimeInterval:(NSTimeInterval)ti target:(id)aTarget selector:(SEL)aSelector userInfo:(id)userInfo repeats:(BOOL)yesOrNo;", selector = "scheduledTimerWithTimeInterval:target:selector:userInfo:repeats:")
    public static native NSTimer scheduledTimerWithTimeInterval$target$selector$userInfo$repeats$(double ti, NSObject aTarget, ObjCSelector aSelector, NSObject userInfo, boolean yesOrNo);
}
