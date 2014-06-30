package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITouch extends NSObject  {
    
    public UITouch() {}
    @ObjCPropertyGetter(selector = "timestamp")
    public native double getTimestamp();
    @ObjCProperty public double timestamp;

    @ObjCPropertyGetter(selector = "phase")
    public native UITouchPhase getPhase();
    @ObjCProperty public UITouchPhase phase;

    @ObjCPropertyGetter(selector = "tapCount")
    public native @NSUInteger long getTapCount();
    @ObjCProperty public @NSUInteger long tapCount;

    @ObjCPropertyGetter(selector = "window")
    public native UIWindow getWindow();
    @ObjCProperty public UIWindow window;

    @ObjCPropertyGetter(selector = "view")
    public native UIView getView();
    @ObjCProperty public UIView view;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "gestureRecognizers")
    public native NSArray getGestureRecognizers();
    @ObjCProperty public NSArray gestureRecognizers;
    
    @ObjCMethodSign(sign = "- (CGPoint)locationInView:(UIView *)view;", selector = "locationInView:")
    public native @ObjCByValue CGPoint locationInView$(UIView view);

    @ObjCMethodSign(sign = "- (CGPoint)previousLocationInView:(UIView *)view;", selector = "previousLocationInView:")
    public native @ObjCByValue CGPoint previousLocationInView$(UIView view);
}
