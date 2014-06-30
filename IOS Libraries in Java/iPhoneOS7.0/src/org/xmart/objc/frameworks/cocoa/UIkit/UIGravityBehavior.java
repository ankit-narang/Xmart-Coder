package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIGravityBehavior extends UIDynamicBehavior  {
    
    public UIGravityBehavior() {}
    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "gravityDirection")
    public native @ObjCByValue CGVector getGravityDirection();
    @ObjCPropertySetter(selector = "setGravityDirection:")
    public native void setGravityDirection(@ObjCByValue CGVector v);
    @ObjCProperty public @ObjCByValue CGVector gravityDirection;

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
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItems:(NSArray *)items;", selector = "initWithItems:")
    public native UIGravityBehavior initWithItems$(NSArray items);

    @ObjCMethodSign(sign = "- (void)addItem:(id <UIDynamicItem>)item;", selector = "addItem:")
    public native void addItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)removeItem:(id <UIDynamicItem>)item;", selector = "removeItem:")
    public native void removeItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)setAngle:(CGFloat)angle magnitude:(CGFloat)magnitude;", selector = "setAngle:magnitude:")
    public native void setAngle$magnitude$(float angle, float magnitude);
}
