package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CIColor extends NSObject implements NSCoding, NSCopying {
    
    public CIColor() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithCGColor:(CGColorRef)c;", selector = "initWithCGColor:")
    public native CIColor initWithCGColor$(CGColor c);

    @ObjCMethodSign(sign = "- (size_t)numberOfComponents;", selector = "numberOfComponents")
    public native @Unsigned long numberOfComponents();

    @ObjCMethodSign(sign = "- (const CGFloat *)components;", selector = "components")
    public native float[] components();

    @ObjCMethodSign(sign = "- (CGFloat)alpha;", selector = "alpha")
    public native float alpha();

    @ObjCMethodSign(sign = "- (CGColorSpaceRef)colorSpace;", selector = "colorSpace")
    public native CGColorSpace colorSpace();

    @ObjCMethodSign(sign = "- (CGFloat)red;", selector = "red")
    public native float red();

    @ObjCMethodSign(sign = "- (CGFloat)green;", selector = "green")
    public native float green();

    @ObjCMethodSign(sign = "- (CGFloat)blue;", selector = "blue")
    public native float blue();

    @ObjCMethodSign(sign = "- (NSString *)stringRepresentation;", selector = "stringRepresentation")
    public native NSString stringRepresentation();

    @ObjCMethodSign(sign = "+ (CIColor *)colorWithCGColor:(CGColorRef)c;", selector = "colorWithCGColor:")
    public static native CIColor colorWithCGColor$(CGColor c);

    @ObjCMethodSign(sign = "+ (CIColor *)colorWithRed:(CGFloat)r green:(CGFloat)g blue:(CGFloat)b alpha:(CGFloat)a;", selector = "colorWithRed:green:blue:alpha:")
    public static native CIColor colorWithRed$green$blue$alpha$(float r, float g, float b, float a);

    @ObjCMethodSign(sign = "+ (CIColor *)colorWithRed:(CGFloat)r green:(CGFloat)g blue:(CGFloat)b;", selector = "colorWithRed:green:blue:")
    public static native CIColor colorWithRed$green$blue$(float r, float g, float b);

    @ObjCMethodSign(sign = "+ (CIColor *)colorWithString:(NSString *)representation;", selector = "colorWithString:")
    public static native CIColor colorWithString$(NSString representation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIKitAdditions", catownername = "CIColor")
    @ObjCMethodSign(sign = "- (id)initWithColor:(UIColor *)color NS_AVAILABLE_IOS(5_0);", selector = "initWithColor:")
    public native CIColor initWithColor$(UIColor color);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native CIColor initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
