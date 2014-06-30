package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDynamicItemBehavior extends UIDynamicBehavior  {
    
    public UIDynamicItemBehavior() {}
    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "elasticity")
    public native float getElasticity();
    @ObjCPropertySetter(selector = "setElasticity:")
    public native void setElasticity(float v);
    @ObjCProperty public float elasticity;

    @ObjCPropertyGetter(selector = "friction")
    public native float getFriction();
    @ObjCPropertySetter(selector = "setFriction:")
    public native void setFriction(float v);
    @ObjCProperty public float friction;

    @ObjCPropertyGetter(selector = "density")
    public native float getDensity();
    @ObjCPropertySetter(selector = "setDensity:")
    public native void setDensity(float v);
    @ObjCProperty public float density;

    @ObjCPropertyGetter(selector = "resistance")
    public native float getResistance();
    @ObjCPropertySetter(selector = "setResistance:")
    public native void setResistance(float v);
    @ObjCProperty public float resistance;

    @ObjCPropertyGetter(selector = "angularResistance")
    public native float getAngularResistance();
    @ObjCPropertySetter(selector = "setAngularResistance:")
    public native void setAngularResistance(float v);
    @ObjCProperty public float angularResistance;

    @ObjCPropertyGetter(selector = "allowsRotation")
    public native boolean isAllowsRotation();
    @ObjCPropertySetter(selector = "setAllowsRotation:")
    public native void setAllowsRotation(boolean v);
    @ObjCProperty public boolean allowsRotation;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItems:(NSArray *)items;", selector = "initWithItems:")
    public native UIDynamicItemBehavior initWithItems$(NSArray items);

    @ObjCMethodSign(sign = "- (void)addItem:(id <UIDynamicItem>)item;", selector = "addItem:")
    public native void addItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)removeItem:(id <UIDynamicItem>)item;", selector = "removeItem:")
    public native void removeItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)addLinearVelocity:(CGPoint)velocity forItem:(id <UIDynamicItem>)item;", selector = "addLinearVelocity:forItem:")
    public native void addLinearVelocity$forItem$(@ObjCByValue CGPoint velocity, UIDynamicItem item);

    @ObjCMethodSign(sign = "- (CGPoint)linearVelocityForItem:(id <UIDynamicItem>)item;", selector = "linearVelocityForItem:")
    public native @ObjCByValue CGPoint linearVelocityForItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)addAngularVelocity:(CGFloat)velocity forItem:(id <UIDynamicItem>)item;", selector = "addAngularVelocity:forItem:")
    public native void addAngularVelocity$forItem$(float velocity, UIDynamicItem item);

    @ObjCMethodSign(sign = "- (CGFloat)angularVelocityForItem:(id <UIDynamicItem>)item;", selector = "angularVelocityForItem:")
    public native float angularVelocityForItem$(UIDynamicItem item);
}
