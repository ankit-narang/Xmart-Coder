package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSValue")
@ObjCFramework("UIKit")
public final class NSValueUIKitCategories extends NSValue  {
    
    private NSValueUIKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (CGPoint)CGPointValue;", selector = "CGPointValue")
    public static native @ObjCByValue CGPoint CGPointValue();

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (CGSize)CGSizeValue;", selector = "CGSizeValue")
    public static native @ObjCByValue CGSize CGSizeValue();

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (CGRect)CGRectValue;", selector = "CGRectValue")
    public static native @ObjCByValue CGRect CGRectValue();

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (CGAffineTransform)CGAffineTransformValue;", selector = "CGAffineTransformValue")
    public static native @ObjCByValue CGAffineTransform CGAffineTransformValue();

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (UIEdgeInsets)UIEdgeInsetsValue;", selector = "UIEdgeInsetsValue")
    public static native @ObjCByValue UIEdgeInsets UIEdgeInsetsValue();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (UIOffset)UIOffsetValue NS_AVAILABLE_IOS(5_0);", selector = "UIOffsetValue")
    public static native @ObjCByValue UIOffset UIOffsetValue();

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithCGPoint:(CGPoint)point;", selector = "valueWithCGPoint:")
    public static native NSValue valueWithCGPoint$(@ObjCByValue CGPoint point);

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithCGSize:(CGSize)size;", selector = "valueWithCGSize:")
    public static native NSValue valueWithCGSize$(@ObjCByValue CGSize size);

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithCGRect:(CGRect)rect;", selector = "valueWithCGRect:")
    public static native NSValue valueWithCGRect$(@ObjCByValue CGRect rect);

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithCGAffineTransform:(CGAffineTransform)transform;", selector = "valueWithCGAffineTransform:")
    public static native NSValue valueWithCGAffineTransform$(@ObjCByValue CGAffineTransform transform);

    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithUIEdgeInsets:(UIEdgeInsets)insets;", selector = "valueWithUIEdgeInsets:")
    public static native NSValue valueWithUIEdgeInsets$(@ObjCByValue UIEdgeInsets insets);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSValueUIGeometryExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithUIOffset:(UIOffset)insets NS_AVAILABLE_IOS(5_0);", selector = "valueWithUIOffset:")
    public static native NSValue valueWithUIOffset$(@ObjCByValue UIOffset insets);
}
