package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIGestureRecognizer extends NSObject  {
    
    public UIGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "state")
    public native UIGestureRecognizerState getState();
    @ObjCProperty public UIGestureRecognizerState state;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIGestureRecognizerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIGestureRecognizerDelegate v);
    @ObjCProperty public UIGestureRecognizerDelegate delegate;

    @ObjCPropertyGetter(selector = "isEnabled")
    public native boolean isEnabled();
    @ObjCPropertySetter(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @ObjCProperty public boolean enabled;

    @ObjCPropertyGetter(selector = "view")
    public native UIView getView();
    @ObjCProperty public UIView view;

    @ObjCPropertyGetter(selector = "cancelsTouchesInView")
    public native boolean isCancelsTouchesInView();
    @ObjCPropertySetter(selector = "setCancelsTouchesInView:")
    public native void setCancelsTouchesInView(boolean v);
    @ObjCProperty public boolean cancelsTouchesInView;

    @ObjCPropertyGetter(selector = "delaysTouchesBegan")
    public native boolean isDelaysTouchesBegan();
    @ObjCPropertySetter(selector = "setDelaysTouchesBegan:")
    public native void setDelaysTouchesBegan(boolean v);
    @ObjCProperty public boolean delaysTouchesBegan;

    @ObjCPropertyGetter(selector = "delaysTouchesEnded")
    public native boolean isDelaysTouchesEnded();
    @ObjCPropertySetter(selector = "setDelaysTouchesEnded:")
    public native void setDelaysTouchesEnded(boolean v);
    @ObjCProperty public boolean delaysTouchesEnded;
    
    @ObjCMethodSign(sign = "- (id)initWithTarget:(id)target action:(SEL)action;", selector = "initWithTarget:action:")
    public native UIGestureRecognizer initWithTarget$action$(NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (void)addTarget:(id)target action:(SEL)action;", selector = "addTarget:action:")
    public native void addTarget$action$(NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (void)removeTarget:(id)target action:(SEL)action;", selector = "removeTarget:action:")
    public native void removeTarget$action$(NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (void)requireGestureRecognizerToFail:(UIGestureRecognizer *)otherGestureRecognizer;", selector = "requireGestureRecognizerToFail:")
    public native void requireGestureRecognizerToFail$(UIGestureRecognizer otherGestureRecognizer);

    @ObjCMethodSign(sign = "- (CGPoint)locationInView:(UIView*)view;", selector = "locationInView:")
    public native @ObjCByValue CGPoint locationInView$(UIView view);

    @ObjCMethodSign(sign = "- (NSUInteger)numberOfTouches;", selector = "numberOfTouches")
    public native @NSUInteger long numberOfTouches();

    @ObjCMethodSign(sign = "- (CGPoint)locationOfTouch:(NSUInteger)touchIndex inView:(UIView*)view;", selector = "locationOfTouch:inView:")
    public native @ObjCByValue CGPoint locationOfTouch$inView$(@NSUInteger long touchIndex, UIView view);
}
