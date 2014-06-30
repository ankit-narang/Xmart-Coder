package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSString")
@ObjCFramework("UIKit")
public final class NSStringUIKitCategories extends NSString  {
    
    private NSStringUIKitCategories() {}
    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithFont:(UIFont *)font NS_DEPRECATED_IOS(2_0, 7_0, \"Use -sizeWithAttributes:\");", selector = "sizeWithFont:")
    public static native @ObjCByValue CGSize sizeWithFont$(UIFont font);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithFont:(UIFont *)font forWidth:(CGFloat)width lineBreakMode:(NSLineBreakMode)lineBreakMode NS_DEPRECATED_IOS(2_0, 7_0, \"Use -boundingRectWithSize:options:attributes:context:\");", selector = "sizeWithFont:forWidth:lineBreakMode:")
    public static native @ObjCByValue CGSize sizeWithFont$forWidth$lineBreakMode$(UIFont font, float width, NSLineBreakMode lineBreakMode);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawAtPoint:(CGPoint)point withFont:(UIFont *)font NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawAtPoint:withAttributes:\");", selector = "drawAtPoint:withFont:")
    public static native @ObjCByValue CGSize drawAtPoint$withFont$(@ObjCByValue CGPoint point, UIFont font);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawAtPoint:(CGPoint)point forWidth:(CGFloat)width withFont:(UIFont *)font lineBreakMode:(NSLineBreakMode)lineBreakMode  NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawAtPoint:forWidth:withFont:lineBreakMode:")
    public static native @ObjCByValue CGSize drawAtPoint$forWidth$withFont$lineBreakMode$(@ObjCByValue CGPoint point, float width, UIFont font, NSLineBreakMode lineBreakMode);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithFont:(UIFont *)font constrainedToSize:(CGSize)size NS_DEPRECATED_IOS(2_0, 7_0, \"Use -boundingRectWithSize:options:attributes:context:\");", selector = "sizeWithFont:constrainedToSize:")
    public static native @ObjCByValue CGSize sizeWithFont$constrainedToSize$(UIFont font, @ObjCByValue CGSize size);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithFont:(UIFont *)font constrainedToSize:(CGSize)size lineBreakMode:(NSLineBreakMode)lineBreakMode NS_DEPRECATED_IOS(2_0, 7_0, \"Use -boundingRectWithSize:options:attributes:context:\");", selector = "sizeWithFont:constrainedToSize:lineBreakMode:")
    public static native @ObjCByValue CGSize sizeWithFont$constrainedToSize$lineBreakMode$(UIFont font, @ObjCByValue CGSize size, NSLineBreakMode lineBreakMode);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawInRect:(CGRect)rect withFont:(UIFont *)font NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawInRect:withFont:")
    public static native @ObjCByValue CGSize drawInRect$withFont$(@ObjCByValue CGRect rect, UIFont font);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawInRect:(CGRect)rect withFont:(UIFont *)font lineBreakMode:(NSLineBreakMode)lineBreakMode NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawInRect:withFont:lineBreakMode:")
    public static native @ObjCByValue CGSize drawInRect$withFont$lineBreakMode$(@ObjCByValue CGRect rect, UIFont font, NSLineBreakMode lineBreakMode);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawInRect:(CGRect)rect withFont:(UIFont *)font lineBreakMode:(NSLineBreakMode)lineBreakMode alignment:(NSTextAlignment)alignment NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawInRect:withFont:lineBreakMode:alignment:")
    public static native @ObjCByValue CGSize drawInRect$withFont$lineBreakMode$alignment$(@ObjCByValue CGRect rect, UIFont font, NSLineBreakMode lineBreakMode, NSTextAlignment alignment);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithFont:(UIFont *)font minFontSize:(CGFloat)minFontSize actualFontSize:(CGFloat *)actualFontSize forWidth:(CGFloat)width lineBreakMode:(NSLineBreakMode)lineBreakMode NS_DEPRECATED_IOS(2_0, 7_0);", selector = "sizeWithFont:minFontSize:actualFontSize:forWidth:lineBreakMode:")
    public static native @ObjCByValue CGSize sizeWithFont$minFontSize$actualFontSize$forWidth$lineBreakMode$(UIFont font, float minFontSize, float[] actualFontSize, float width, NSLineBreakMode lineBreakMode);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawAtPoint:(CGPoint)point forWidth:(CGFloat)width withFont:(UIFont *)font fontSize:(CGFloat)fontSize lineBreakMode:(NSLineBreakMode)lineBreakMode baselineAdjustment:(UIBaselineAdjustment)baselineAdjustment NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawAtPoint:forWidth:withFont:fontSize:lineBreakMode:baselineAdjustment:")
    public static native @ObjCByValue CGSize drawAtPoint$forWidth$withFont$fontSize$lineBreakMode$baselineAdjustment$(@ObjCByValue CGPoint point, float width, UIFont font, float fontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)drawAtPoint:(CGPoint)point forWidth:(CGFloat)width withFont:(UIFont *)font minFontSize:(CGFloat)minFontSize actualFontSize:(CGFloat *)actualFontSize lineBreakMode:(NSLineBreakMode)lineBreakMode baselineAdjustment:(UIBaselineAdjustment)baselineAdjustment NS_DEPRECATED_IOS(2_0, 7_0, \"Use -drawInRect:withAttributes:\");", selector = "drawAtPoint:forWidth:withFont:minFontSize:actualFontSize:lineBreakMode:baselineAdjustment:")
    public static native @ObjCByValue CGSize drawAtPoint$forWidth$withFont$minFontSize$actualFontSize$lineBreakMode$baselineAdjustment$(@ObjCByValue CGPoint point, float width, UIFont font, float minFontSize, float[] actualFontSize, NSLineBreakMode lineBreakMode, UIBaselineAdjustment baselineAdjustment);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGSize)sizeWithAttributes:(NSDictionary *)attrs NS_AVAILABLE_IOS(7_0);", selector = "sizeWithAttributes:")
    public static native @ObjCByValue CGSize sizeWithAttributes$(NSDictionary attrs);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)drawAtPoint:(CGPoint)point withAttributes:(NSDictionary *)attrs NS_AVAILABLE_IOS(7_0);", selector = "drawAtPoint:withAttributes:")
    public static native void drawAtPoint$withAttributes$(@ObjCByValue CGPoint point, NSDictionary attrs);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)drawInRect:(CGRect)rect withAttributes:(NSDictionary *)attrs NS_AVAILABLE_IOS(7_0);", selector = "drawInRect:withAttributes:")
    public static native void drawInRect$withAttributes$(@ObjCByValue CGRect rect, NSDictionary attrs);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)drawWithRect:(CGRect)rect options:(NSStringDrawingOptions)options attributes:(NSDictionary *)attributes context:(NSStringDrawingContext *)context NS_AVAILABLE_IOS(7_0);", selector = "drawWithRect:options:attributes:context:")
    public static native void drawWithRect$options$attributes$context$(@ObjCByValue CGRect rect, NSStringDrawingOptions options, NSDictionary attributes, NSStringDrawingContext context);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedStringDrawing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (CGRect)boundingRectWithSize:(CGSize)size options:(NSStringDrawingOptions)options attributes:(NSDictionary *)attributes context:(NSStringDrawingContext *)context NS_AVAILABLE_IOS(7_0);", selector = "boundingRectWithSize:options:attributes:context:")
    public static native @ObjCByValue CGRect boundingRectWithSize$options$attributes$context$(@ObjCByValue CGSize size, NSStringDrawingOptions options, NSDictionary attributes, NSStringDrawingContext context);
}
