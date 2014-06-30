package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSLayoutConstraint extends NSObject  {
    
    public NSLayoutConstraint() {}
    @ObjCPropertyGetter(selector = "priority")
    public native float getPriority();
    @ObjCPropertySetter(selector = "setPriority:")
    public native void setPriority(float v);
    @ObjCProperty public float priority;

    @ObjCPropertyGetter(selector = "shouldBeArchived")
    public native boolean isShouldBeArchived();
    @ObjCPropertySetter(selector = "setShouldBeArchived:")
    public native void setShouldBeArchived(boolean v);
    @ObjCProperty public boolean shouldBeArchived;

    @ObjCPropertyGetter(selector = "firstItem")
    public native NSObject getFirstItem();
    @ObjCProperty public NSObject firstItem;

    @ObjCPropertyGetter(selector = "firstAttribute")
    public native NSLayoutAttribute getFirstAttribute();
    @ObjCProperty public NSLayoutAttribute firstAttribute;

    @ObjCPropertyGetter(selector = "relation")
    public native NSLayoutRelation getRelation();
    @ObjCProperty public NSLayoutRelation relation;

    @ObjCPropertyGetter(selector = "secondItem")
    public native NSObject getSecondItem();
    @ObjCProperty public NSObject secondItem;

    @ObjCPropertyGetter(selector = "secondAttribute")
    public native NSLayoutAttribute getSecondAttribute();
    @ObjCProperty public NSLayoutAttribute secondAttribute;

    @ObjCPropertyGetter(selector = "multiplier")
    public native float getMultiplier();
    @ObjCProperty public float multiplier;

    @ObjCPropertyGetter(selector = "constant")
    public native float getConstant();
    @ObjCPropertySetter(selector = "setConstant:")
    public native void setConstant(float v);
    @ObjCProperty public float constant;
    
    @ObjCMethodSign(sign = "+ (NSArray *)constraintsWithVisualFormat:(NSString *)format options:(NSLayoutFormatOptions)opts metrics:(NSDictionary *)metrics views:(NSDictionary *)views;", selector = "constraintsWithVisualFormat:options:metrics:views:")
    public static native NSArray constraintsWithVisualFormat$options$metrics$views$(NSString format, NSLayoutFormatOptions opts, NSDictionary metrics, NSDictionary views);

    @ObjCMethodSign(sign = "+(id)constraintWithItem:(id)view1 attribute:(NSLayoutAttribute)attr1 relatedBy:(NSLayoutRelation)relation toItem:(id)view2 attribute:(NSLayoutAttribute)attr2 multiplier:(CGFloat)multiplier constant:(CGFloat)c;", selector = "constraintWithItem:attribute:relatedBy:toItem:attribute:multiplier:constant:")
    public static native NSObject constraintWithItem$attribute$relatedBy$toItem$attribute$multiplier$constant$(NSObject view1, NSLayoutAttribute attr1, NSLayoutRelation relation, NSObject view2, NSLayoutAttribute attr2, float multiplier, float c);
}
