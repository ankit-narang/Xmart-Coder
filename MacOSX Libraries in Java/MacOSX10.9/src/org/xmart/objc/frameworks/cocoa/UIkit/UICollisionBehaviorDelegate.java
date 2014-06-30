package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UICollisionBehaviorDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)collisionBehavior:(UICollisionBehavior*)behavior beganContactForItem:(id <UIDynamicItem>)item1 withItem:(id <UIDynamicItem>)item2 atPoint:(CGPoint)p;", selector = "collisionBehavior:beganContactForItem:withItem:atPoint:")
    void collisionBehavior$beganContactForItem$withItem$atPoint$(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2, @ObjCByValue CGPoint p);

    @ObjCMethodSign(sign = "- (void)collisionBehavior:(UICollisionBehavior*)behavior endedContactForItem:(id <UIDynamicItem>)item1 withItem:(id <UIDynamicItem>)item2;", selector = "collisionBehavior:endedContactForItem:withItem:")
    void collisionBehavior$endedContactForItem$withItem$(UICollisionBehavior behavior, UIDynamicItem item1, UIDynamicItem item2);

    @ObjCMethodSign(sign = "- (void)collisionBehavior:(UICollisionBehavior*)behavior beganContactForItem:(id <UIDynamicItem>)item withBoundaryIdentifier:(id <NSCopying>)identifier atPoint:(CGPoint)p;", selector = "collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
    void collisionBehavior$beganContactForItem$withBoundaryIdentifier$atPoint$(UICollisionBehavior behavior, UIDynamicItem item, NSCopying identifier, @ObjCByValue CGPoint p);

    @ObjCMethodSign(sign = "- (void)collisionBehavior:(UICollisionBehavior*)behavior endedContactForItem:(id <UIDynamicItem>)item withBoundaryIdentifier:(id <NSCopying>)identifier;", selector = "collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
    void collisionBehavior$endedContactForItem$withBoundaryIdentifier$(UICollisionBehavior behavior, UIDynamicItem item, NSCopying identifier);
}
