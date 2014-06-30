package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPanGestureRecognizer extends UIGestureRecognizer  {
    
    public UIPanGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "minimumNumberOfTouches")
    public native @NSUInteger long getMinimumNumberOfTouches();
    @ObjCPropertySetter(selector = "setMinimumNumberOfTouches:")
    public native void setMinimumNumberOfTouches(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long minimumNumberOfTouches;

    @ObjCPropertyGetter(selector = "maximumNumberOfTouches")
    public native @NSUInteger long getMaximumNumberOfTouches();
    @ObjCPropertySetter(selector = "setMaximumNumberOfTouches:")
    public native void setMaximumNumberOfTouches(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long maximumNumberOfTouches;
    
    @ObjCMethodSign(sign = "- (CGPoint)translationInView:(UIView *)view;", selector = "translationInView:")
    public native @ObjCByValue CGPoint translationInView$(UIView view);

    @ObjCMethodSign(sign = "- (void)setTranslation:(CGPoint)translation inView:(UIView *)view;", selector = "setTranslation:inView:")
    public native void setTranslation$inView$(@ObjCByValue CGPoint translation, UIView view);

    @ObjCMethodSign(sign = "- (CGPoint)velocityInView:(UIView *)view;", selector = "velocityInView:")
    public native @ObjCByValue CGPoint velocityInView$(UIView view);
}
