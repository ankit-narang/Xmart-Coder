package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPushBehavior extends UIDynamicBehavior  {
    
    public UIPushBehavior() {}
    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "mode")
    public native UIPushBehaviorMode getMode();
    @ObjCProperty public UIPushBehaviorMode mode;

    @ObjCPropertyGetter(selector = "active")
    public native boolean isActive();
    @ObjCPropertySetter(selector = "setActive:")
    public native void setActive(boolean v);
    @ObjCProperty public boolean active;

    @ObjCPropertyGetter(selector = "angle")
    public native float getAngle();
    @ObjCPropertySetter(selector = "setAngle:")
    public native void setAngle(float v);
    @ObjCProperty public float angle;

    @ObjCPropertyGetter(selector = "magnitude")
    public native float getMagnitude();
    @ObjCPropertySetter(selector = "setMagnitude:")
    public native void setMagnitude(float v);
    @ObjCProperty public float magnitude;

    @ObjCPropertyGetter(selector = "pushDirection")
    public native @ObjCByValue CGVector getPushDirection();
    @ObjCPropertySetter(selector = "setPushDirection:")
    public native void setPushDirection(@ObjCByValue CGVector v);
    @ObjCProperty public @ObjCByValue CGVector pushDirection;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItems:(NSArray *)items mode:(UIPushBehaviorMode)mode;", selector = "initWithItems:mode:")
    public native UIPushBehavior initWithItems$mode$(NSArray items, UIPushBehaviorMode mode);

    @ObjCMethodSign(sign = "- (void)addItem:(id <UIDynamicItem>)item;", selector = "addItem:")
    public native void addItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)removeItem:(id <UIDynamicItem>)item;", selector = "removeItem:")
    public native void removeItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (UIOffset)targetOffsetFromCenterForItem:(id <UIDynamicItem>)item;", selector = "targetOffsetFromCenterForItem:")
    public native @ObjCByValue UIOffset targetOffsetFromCenterForItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)setTargetOffsetFromCenter:(UIOffset)o forItem:(id <UIDynamicItem>)item;", selector = "setTargetOffsetFromCenter:forItem:")
    public native void setTargetOffsetFromCenter$forItem$(@ObjCByValue UIOffset o, UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)setAngle:(CGFloat)angle magnitude:(CGFloat)magnitude;", selector = "setAngle:magnitude:")
    public native void setAngle$magnitude$(float angle, float magnitude);
}
