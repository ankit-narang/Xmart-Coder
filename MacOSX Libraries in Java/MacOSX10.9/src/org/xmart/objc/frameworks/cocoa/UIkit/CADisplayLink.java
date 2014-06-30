package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CADisplayLink extends NSObject  {
    
    public CADisplayLink() {}
    @ObjCPropertyGetter(selector = "timestamp")
    public native double getTimestamp();
    @ObjCProperty public double timestamp;

    @ObjCPropertyGetter(selector = "duration")
    public native double getDuration();
    @ObjCProperty public double duration;

    @ObjCPropertyGetter(selector = "isPaused")
    public native boolean isPaused();
    @ObjCPropertySetter(selector = "setPaused:")
    public native void setPaused(boolean v);
    @ObjCProperty public boolean paused;

    @ObjCPropertyGetter(selector = "frameInterval")
    public native @NSInteger long getFrameInterval();
    @ObjCPropertySetter(selector = "setFrameInterval:")
    public native void setFrameInterval(@NSInteger long v);
    @ObjCProperty public @NSInteger long frameInterval;
    
    @ObjCMethodSign(sign = "- (void)addToRunLoop:(NSRunLoop *)runloop forMode:(NSString *)mode;", selector = "addToRunLoop:forMode:")
    public native void addToRunLoop$forMode$(NSRunLoop runloop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)runloop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop runloop, NSString mode);

    @ObjCMethodSign(sign = "- (void)invalidate;", selector = "invalidate")
    public native void invalidate();

    @ObjCMethodSign(sign = "+ (CADisplayLink *)displayLinkWithTarget:(id)target selector:(SEL)sel;", selector = "displayLinkWithTarget:selector:")
    public static native CADisplayLink displayLinkWithTarget$selector$(NSObject target, ObjCSelector sel);
}
