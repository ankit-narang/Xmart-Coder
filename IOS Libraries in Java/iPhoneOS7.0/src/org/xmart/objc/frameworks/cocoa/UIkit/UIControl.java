package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIControl extends UIView  {
    
    public UIControl() {}
    @ObjCPropertyGetter(selector = "isEnabled")
    public native boolean isEnabled();
    @ObjCPropertySetter(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @ObjCProperty public boolean enabled;

    @ObjCPropertyGetter(selector = "isSelected")
    public native boolean isSelected();
    @ObjCPropertySetter(selector = "setSelected:")
    public native void setSelected(boolean v);
    @ObjCProperty public boolean selected;

    @ObjCPropertyGetter(selector = "isHighlighted")
    public native boolean isHighlighted();
    @ObjCPropertySetter(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @ObjCProperty public boolean highlighted;

    @ObjCPropertyGetter(selector = "contentVerticalAlignment")
    public native UIControlContentVerticalAlignment getContentVerticalAlignment();
    @ObjCPropertySetter(selector = "setContentVerticalAlignment:")
    public native void setContentVerticalAlignment(UIControlContentVerticalAlignment v);
    @ObjCProperty public UIControlContentVerticalAlignment contentVerticalAlignment;

    @ObjCPropertyGetter(selector = "contentHorizontalAlignment")
    public native UIControlContentHorizontalAlignment getContentHorizontalAlignment();
    @ObjCPropertySetter(selector = "setContentHorizontalAlignment:")
    public native void setContentHorizontalAlignment(UIControlContentHorizontalAlignment v);
    @ObjCProperty public UIControlContentHorizontalAlignment contentHorizontalAlignment;

    @ObjCPropertyGetter(selector = "state")
    public native UIControlState getState();
    @ObjCProperty public UIControlState state;

    @ObjCPropertyGetter(selector = "isTracking")
    public native boolean isTracking();
    @ObjCProperty public boolean tracking;

    @ObjCPropertyGetter(selector = "isTouchInside")
    public native boolean isTouchInside();
    @ObjCProperty public boolean touchInside;
    
    @ObjCMethodSign(sign = "- (BOOL)beginTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event;", selector = "beginTrackingWithTouch:withEvent:")
    public native boolean beginTrackingWithTouch$withEvent$(UITouch touch, UIEvent event);

    @ObjCMethodSign(sign = "- (BOOL)continueTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event;", selector = "continueTrackingWithTouch:withEvent:")
    public native boolean continueTrackingWithTouch$withEvent$(UITouch touch, UIEvent event);

    @ObjCMethodSign(sign = "- (void)endTrackingWithTouch:(UITouch *)touch withEvent:(UIEvent *)event;", selector = "endTrackingWithTouch:withEvent:")
    public native void endTrackingWithTouch$withEvent$(UITouch touch, UIEvent event);

    @ObjCMethodSign(sign = "- (void)cancelTrackingWithEvent:(UIEvent *)event;", selector = "cancelTrackingWithEvent:")
    public native void cancelTrackingWithEvent$(UIEvent event);

    @ObjCMethodSign(sign = "- (void)addTarget:(id)target action:(SEL)action forControlEvents:(UIControlEvents)controlEvents;", selector = "addTarget:action:forControlEvents:")
    public native void addTarget$action$forControlEvents$(NSObject target, ObjCSelector action, UIControlEvents controlEvents);

    @ObjCMethodSign(sign = "- (void)removeTarget:(id)target action:(SEL)action forControlEvents:(UIControlEvents)controlEvents;", selector = "removeTarget:action:forControlEvents:")
    public native void removeTarget$action$forControlEvents$(NSObject target, ObjCSelector action, UIControlEvents controlEvents);

    @ObjCMethodSign(sign = "- (NSSet *)allTargets;", selector = "allTargets")
    public native NSSet allTargets();

    @ObjCMethodSign(sign = "- (UIControlEvents)allControlEvents;", selector = "allControlEvents")
    public native UIControlEvents allControlEvents();

    @ObjCMethodSign(sign = "- (NSArray *)actionsForTarget:(id)target forControlEvent:(UIControlEvents)controlEvent;", selector = "actionsForTarget:forControlEvent:")
    public native NSArray actionsForTarget$forControlEvent$(NSObject target, UIControlEvents controlEvent);

    @ObjCMethodSign(sign = "- (void)sendAction:(SEL)action to:(id)target forEvent:(UIEvent *)event;", selector = "sendAction:to:forEvent:")
    public native void sendAction$to$forEvent$(ObjCSelector action, NSObject target, UIEvent event);

    @ObjCMethodSign(sign = "- (void)sendActionsForControlEvents:(UIControlEvents)controlEvents;", selector = "sendActionsForControlEvents:")
    public native void sendActionsForControlEvents$(UIControlEvents controlEvents);
}
