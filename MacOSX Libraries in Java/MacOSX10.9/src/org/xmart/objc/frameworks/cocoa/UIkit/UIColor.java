package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIColor extends NSObject implements NSSecureCoding, NSCopying {
    
    public UIColor() {}
    @ObjCPropertyGetter(selector = "CGColor")
    public native CGColor getCGColor();
    @ObjCProperty public CGColor CGColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "CIColor")
    public native CIColor getCIColor();
    @ObjCProperty public CIColor CIColor;
    
    @ObjCMethodSign(sign = "- (UIColor *)initWithWhite:(CGFloat)white alpha:(CGFloat)alpha;", selector = "initWithWhite:alpha:")
    public native UIColor initWithWhite$alpha$(float white, float alpha);

    @ObjCMethodSign(sign = "- (UIColor *)initWithHue:(CGFloat)hue saturation:(CGFloat)saturation brightness:(CGFloat)brightness alpha:(CGFloat)alpha;", selector = "initWithHue:saturation:brightness:alpha:")
    public native UIColor initWithHue$saturation$brightness$alpha$(float hue, float saturation, float brightness, float alpha);

    @ObjCMethodSign(sign = "- (UIColor *)initWithRed:(CGFloat)red green:(CGFloat)green blue:(CGFloat)blue alpha:(CGFloat)alpha;", selector = "initWithRed:green:blue:alpha:")
    public native UIColor initWithRed$green$blue$alpha$(float red, float green, float blue, float alpha);

    @ObjCMethodSign(sign = "- (UIColor *)initWithCGColor:(CGColorRef)cgColor;", selector = "initWithCGColor:")
    public native UIColor initWithCGColor$(CGColor cgColor);

    @ObjCMethodSign(sign = "- (UIColor *)initWithPatternImage:(UIImage*)image;", selector = "initWithPatternImage:")
    public native UIColor initWithPatternImage$(UIImage image);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIColor *)initWithCIColor:(CIColor *)ciColor NS_AVAILABLE_IOS(5_0);", selector = "initWithCIColor:")
    public native UIColor initWithCIColor$(CIColor ciColor);

    @ObjCMethodSign(sign = "- (void)set;", selector = "set")
    public native void set();

    @ObjCMethodSign(sign = "- (void)setFill;", selector = "setFill")
    public native void setFill();

    @ObjCMethodSign(sign = "- (void)setStroke;", selector = "setStroke")
    public native void setStroke();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)getWhite:(CGFloat *)white alpha:(CGFloat *)alpha NS_AVAILABLE_IOS(5_0);", selector = "getWhite:alpha:")
    public native boolean getWhite$alpha$(float[] white, float[] alpha);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)getHue:(CGFloat *)hue saturation:(CGFloat *)saturation brightness:(CGFloat *)brightness alpha:(CGFloat *)alpha NS_AVAILABLE_IOS(5_0);", selector = "getHue:saturation:brightness:alpha:")
    public native boolean getHue$saturation$brightness$alpha$(float[] hue, float[] saturation, float[] brightness, float[] alpha);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)getRed:(CGFloat *)red green:(CGFloat *)green blue:(CGFloat *)blue alpha:(CGFloat *)alpha NS_AVAILABLE_IOS(5_0);", selector = "getRed:green:blue:alpha:")
    public native boolean getRed$green$blue$alpha$(float[] red, float[] green, float[] blue, float[] alpha);

    @ObjCMethodSign(sign = "- (UIColor *)colorWithAlphaComponent:(CGFloat)alpha;", selector = "colorWithAlphaComponent:")
    public native UIColor colorWithAlphaComponent$(float alpha);

    @ObjCMethodSign(sign = "+ (UIColor *)colorWithWhite:(CGFloat)white alpha:(CGFloat)alpha;", selector = "colorWithWhite:alpha:")
    public static native UIColor colorWithWhite$alpha$(float white, float alpha);

    @ObjCMethodSign(sign = "+ (UIColor *)colorWithHue:(CGFloat)hue saturation:(CGFloat)saturation brightness:(CGFloat)brightness alpha:(CGFloat)alpha;", selector = "colorWithHue:saturation:brightness:alpha:")
    public static native UIColor colorWithHue$saturation$brightness$alpha$(float hue, float saturation, float brightness, float alpha);

    @ObjCMethodSign(sign = "+ (UIColor *)colorWithRed:(CGFloat)red green:(CGFloat)green blue:(CGFloat)blue alpha:(CGFloat)alpha;", selector = "colorWithRed:green:blue:alpha:")
    public static native UIColor colorWithRed$green$blue$alpha$(float red, float green, float blue, float alpha);

    @ObjCMethodSign(sign = "+ (UIColor *)colorWithCGColor:(CGColorRef)cgColor;", selector = "colorWithCGColor:")
    public static native UIColor colorWithCGColor$(CGColor cgColor);

    @ObjCMethodSign(sign = "+ (UIColor *)colorWithPatternImage:(UIImage *)image;", selector = "colorWithPatternImage:")
    public static native UIColor colorWithPatternImage$(UIImage image);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIColor *)colorWithCIColor:(CIColor *)ciColor NS_AVAILABLE_IOS(5_0);", selector = "colorWithCIColor:")
    public static native UIColor colorWithCIColor$(CIColor ciColor);

    @ObjCMethodSign(sign = "+ (UIColor *)blackColor;", selector = "blackColor")
    public static native UIColor blackColor();

    @ObjCMethodSign(sign = "+ (UIColor *)darkGrayColor;", selector = "darkGrayColor")
    public static native UIColor darkGrayColor();

    @ObjCMethodSign(sign = "+ (UIColor *)lightGrayColor;", selector = "lightGrayColor")
    public static native UIColor lightGrayColor();

    @ObjCMethodSign(sign = "+ (UIColor *)whiteColor;", selector = "whiteColor")
    public static native UIColor whiteColor();

    @ObjCMethodSign(sign = "+ (UIColor *)grayColor;", selector = "grayColor")
    public static native UIColor grayColor();

    @ObjCMethodSign(sign = "+ (UIColor *)redColor;", selector = "redColor")
    public static native UIColor redColor();

    @ObjCMethodSign(sign = "+ (UIColor *)greenColor;", selector = "greenColor")
    public static native UIColor greenColor();

    @ObjCMethodSign(sign = "+ (UIColor *)blueColor;", selector = "blueColor")
    public static native UIColor blueColor();

    @ObjCMethodSign(sign = "+ (UIColor *)cyanColor;", selector = "cyanColor")
    public static native UIColor cyanColor();

    @ObjCMethodSign(sign = "+ (UIColor *)yellowColor;", selector = "yellowColor")
    public static native UIColor yellowColor();

    @ObjCMethodSign(sign = "+ (UIColor *)magentaColor;", selector = "magentaColor")
    public static native UIColor magentaColor();

    @ObjCMethodSign(sign = "+ (UIColor *)orangeColor;", selector = "orangeColor")
    public static native UIColor orangeColor();

    @ObjCMethodSign(sign = "+ (UIColor *)purpleColor;", selector = "purpleColor")
    public static native UIColor purpleColor();

    @ObjCMethodSign(sign = "+ (UIColor *)brownColor;", selector = "brownColor")
    public static native UIColor brownColor();

    @ObjCMethodSign(sign = "+ (UIColor *)clearColor;", selector = "clearColor")
    public static native UIColor clearColor();

    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)lightTextColor;", selector = "lightTextColor")
    public static native UIColor lightTextColor();

    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)darkTextColor;", selector = "darkTextColor")
    public static native UIColor darkTextColor();

    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)groupTableViewBackgroundColor;", selector = "groupTableViewBackgroundColor")
    public static native UIColor groupTableViewBackgroundColor();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)viewFlipsideBackgroundColor NS_DEPRECATED_IOS(2_0, 7_0);", selector = "viewFlipsideBackgroundColor")
    public static native UIColor viewFlipsideBackgroundColor();

    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)scrollViewTexturedBackgroundColor NS_DEPRECATED_IOS(3_2, 7_0);", selector = "scrollViewTexturedBackgroundColor")
    public static native UIColor scrollViewTexturedBackgroundColor();

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIColorSystemColors", catownername = "UIColor")
    @ObjCMethodSign(sign = "+ (UIColor *)underPageBackgroundColor NS_DEPRECATED_IOS(5_0, 7_0);", selector = "underPageBackgroundColor")
    public static native UIColor underPageBackgroundColor();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIColor initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
