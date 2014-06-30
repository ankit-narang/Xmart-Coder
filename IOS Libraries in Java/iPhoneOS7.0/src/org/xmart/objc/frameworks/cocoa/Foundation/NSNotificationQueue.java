package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNotificationQueue extends NSObject  {
    
    public NSNotificationQueue() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithNotificationCenter:(NSNotificationCenter *)notificationCenter;", selector = "initWithNotificationCenter:")
    public native NSNotificationQueue initWithNotificationCenter$(NSNotificationCenter notificationCenter);

    @ObjCMethodSign(sign = "- (void)enqueueNotification:(NSNotification *)notification postingStyle:(NSPostingStyle)postingStyle;", selector = "enqueueNotification:postingStyle:")
    public native void enqueueNotification$postingStyle$(NSNotification notification, NSPostingStyle postingStyle);

    @ObjCMethodSign(sign = "- (void)enqueueNotification:(NSNotification *)notification postingStyle:(NSPostingStyle)postingStyle coalesceMask:(NSUInteger)coalesceMask forModes:(NSArray *)modes;", selector = "enqueueNotification:postingStyle:coalesceMask:forModes:")
    public native void enqueueNotification$postingStyle$coalesceMask$forModes$(NSNotification notification, NSPostingStyle postingStyle, @NSUInteger long coalesceMask, NSArray modes);

    @ObjCMethodSign(sign = "- (void)dequeueNotificationsMatching:(NSNotification *)notification coalesceMask:(NSUInteger)coalesceMask;", selector = "dequeueNotificationsMatching:coalesceMask:")
    public native void dequeueNotificationsMatching$coalesceMask$(NSNotification notification, @NSUInteger long coalesceMask);

    @ObjCMethodSign(sign = "+ (id)defaultQueue;", selector = "defaultQueue")
    public static native NSObject defaultQueue();
}
