package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIAttachmentBehavior extends UIDynamicBehavior  {
    
    public UIAttachmentBehavior() {}
    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "attachedBehaviorType")
    public native UIAttachmentBehaviorType getAttachedBehaviorType();
    @ObjCProperty public UIAttachmentBehaviorType attachedBehaviorType;

    @ObjCPropertyGetter(selector = "anchorPoint")
    public native @ObjCByValue CGPoint getAnchorPoint();
    @ObjCPropertySetter(selector = "setAnchorPoint:")
    public native void setAnchorPoint(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint anchorPoint;

    @ObjCPropertyGetter(selector = "length")
    public native float getLength();
    @ObjCPropertySetter(selector = "setLength:")
    public native void setLength(float v);
    @ObjCProperty public float length;

    @ObjCPropertyGetter(selector = "damping")
    public native float getDamping();
    @ObjCPropertySetter(selector = "setDamping:")
    public native void setDamping(float v);
    @ObjCProperty public float damping;

    @ObjCPropertyGetter(selector = "frequency")
    public native float getFrequency();
    @ObjCPropertySetter(selector = "setFrequency:")
    public native void setFrequency(float v);
    @ObjCProperty public float frequency;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItem:(id <UIDynamicItem>)item attachedToAnchor:(CGPoint)point;", selector = "initWithItem:attachedToAnchor:")
    public native UIAttachmentBehavior initWithItem$attachedToAnchor$(UIDynamicItem item, @ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (instancetype)initWithItem:(id <UIDynamicItem>)item offsetFromCenter:(UIOffset)offset attachedToAnchor:(CGPoint)point;", selector = "initWithItem:offsetFromCenter:attachedToAnchor:")
    public native UIAttachmentBehavior initWithItem$offsetFromCenter$attachedToAnchor$(UIDynamicItem item, @ObjCByValue UIOffset offset, @ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (instancetype)initWithItem:(id <UIDynamicItem>)item1 attachedToItem:(id <UIDynamicItem>)item2;", selector = "initWithItem:attachedToItem:")
    public native UIAttachmentBehavior initWithItem$attachedToItem$(UIDynamicItem item1, UIDynamicItem item2);

    @ObjCMethodSign(sign = "- (instancetype)initWithItem:(id <UIDynamicItem>)item1 offsetFromCenter:(UIOffset)offset1 attachedToItem:(id <UIDynamicItem>)item2 offsetFromCenter:(UIOffset)offset2;", selector = "initWithItem:offsetFromCenter:attachedToItem:offsetFromCenter:")
    public native UIAttachmentBehavior initWithItem$offsetFromCenter$attachedToItem$offsetFromCenter$(UIDynamicItem item1, @ObjCByValue UIOffset offset1, UIDynamicItem item2, @ObjCByValue UIOffset offset2);
}
