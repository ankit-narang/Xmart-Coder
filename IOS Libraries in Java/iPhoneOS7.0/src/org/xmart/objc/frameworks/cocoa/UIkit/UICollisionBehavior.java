package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollisionBehavior extends UIDynamicBehavior  {
    
    public UICollisionBehavior() {}
    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "collisionMode")
    public native UICollisionBehaviorMode getCollisionMode();
    @ObjCPropertySetter(selector = "setCollisionMode:")
    public native void setCollisionMode(UICollisionBehaviorMode v);
    @ObjCProperty public UICollisionBehaviorMode collisionMode;

    @ObjCPropertyGetter(selector = "translatesReferenceBoundsIntoBoundary")
    public native boolean isTranslatesReferenceBoundsIntoBoundary();
    @ObjCPropertySetter(selector = "setTranslatesReferenceBoundsIntoBoundary:")
    public native void setTranslatesReferenceBoundsIntoBoundary(boolean v);
    @ObjCProperty public boolean translatesReferenceBoundsIntoBoundary;

    @ObjCPropertyGetter(selector = "boundaryIdentifiers")
    public native NSArray getBoundaryIdentifiers();
    @ObjCProperty public NSArray boundaryIdentifiers;

    @ObjCPropertyGetter(selector = "collisionDelegate")
    public native UICollisionBehaviorDelegate getCollisionDelegate();
    @ObjCPropertySetter(selector = "setCollisionDelegate:", strongRef = true)
    public native void setCollisionDelegate(UICollisionBehaviorDelegate v);
    @ObjCProperty public UICollisionBehaviorDelegate collisionDelegate;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItems:(NSArray *)items;", selector = "initWithItems:")
    public native UICollisionBehavior initWithItems$(NSArray items);

    @ObjCMethodSign(sign = "- (void)addItem:(id <UIDynamicItem>)item;", selector = "addItem:")
    public native void addItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)removeItem:(id <UIDynamicItem>)item;", selector = "removeItem:")
    public native void removeItem$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (void)setTranslatesReferenceBoundsIntoBoundaryWithInsets:(UIEdgeInsets)insets;", selector = "setTranslatesReferenceBoundsIntoBoundaryWithInsets:")
    public native void setTranslatesReferenceBoundsIntoBoundaryWithInsets(@ObjCByValue UIEdgeInsets insets);

    @ObjCMethodSign(sign = "- (void)addBoundaryWithIdentifier:(id <NSCopying>)identifier forPath:(UIBezierPath*)bezierPath;", selector = "addBoundaryWithIdentifier:forPath:")
    public native void addBoundaryWithIdentifier$forPath$(NSCopying identifier, UIBezierPath bezierPath);

    @ObjCMethodSign(sign = "- (void)addBoundaryWithIdentifier:(id <NSCopying>)identifier fromPoint:(CGPoint)p1 toPoint:(CGPoint)p2;", selector = "addBoundaryWithIdentifier:fromPoint:toPoint:")
    public native void addBoundaryWithIdentifier$fromPoint$toPoint$(NSCopying identifier, @ObjCByValue CGPoint p1, @ObjCByValue CGPoint p2);

    @ObjCMethodSign(sign = "- (UIBezierPath*)boundaryWithIdentifier:(id <NSCopying>)identifier;", selector = "boundaryWithIdentifier:")
    public native UIBezierPath boundaryWithIdentifier$(NSCopying identifier);

    @ObjCMethodSign(sign = "- (void)removeBoundaryWithIdentifier:(id <NSCopying>)identifier;", selector = "removeBoundaryWithIdentifier:")
    public native void removeBoundaryWithIdentifier$(NSCopying identifier);

    @ObjCMethodSign(sign = "- (void)removeAllBoundaries;", selector = "removeAllBoundaries")
    public native void removeAllBoundaries();
}
