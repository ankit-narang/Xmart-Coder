package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIImage extends NSObject implements NSCoding, UIAccessibilityIdentification {
    
    public UIImage() {}
    @ObjCPropertyGetter(selector = "size")
    public native @ObjCByValue CGSize getSize();
    @ObjCProperty public @ObjCByValue CGSize size;

    @ObjCPropertyGetter(selector = "CGImage")
    public native CGImage getCGImage();
    @ObjCProperty public CGImage CGImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "CIImage")
    public native CIImage getCIImage();
    @ObjCProperty public CIImage CIImage;

    @ObjCPropertyGetter(selector = "imageOrientation")
    public native UIImageOrientation getImageOrientation();
    @ObjCProperty public UIImageOrientation imageOrientation;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "scale")
    public native float getScale();
    @ObjCProperty public float scale;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "images")
    public native NSArray getImages();
    @ObjCProperty public NSArray images;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "duration")
    public native double getDuration();
    @ObjCProperty public double duration;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "capInsets")
    public native @ObjCByValue UIEdgeInsets getCapInsets();
    @ObjCProperty public @ObjCByValue UIEdgeInsets capInsets;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "resizingMode")
    public native UIImageResizingMode getResizingMode();
    @ObjCProperty public UIImageResizingMode resizingMode;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "alignmentRectInsets")
    public native @ObjCByValue UIEdgeInsets getAlignmentRectInsets();
    @ObjCProperty public @ObjCByValue UIEdgeInsets alignmentRectInsets;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "renderingMode")
    public native UIImageRenderingMode getRenderingMode();
    @ObjCProperty public UIImageRenderingMode renderingMode;

    @ObjCPropertyGetter(selector = "leftCapWidth")
    public native @NSInteger long getLeftCapWidth();
    @ObjCProperty public @NSInteger long leftCapWidth;

    @ObjCPropertyGetter(selector = "topCapHeight")
    public native @NSInteger long getTopCapHeight();
    @ObjCProperty public @NSInteger long topCapHeight;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityIdentifier")
    public native NSString getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(NSString v);
    @ObjCProperty public NSString accessibilityIdentifier;
    
    @ObjCMethodSign(sign = "- (id)initWithContentsOfFile:(NSString *)path;", selector = "initWithContentsOfFile:")
    public native UIImage initWithContentsOfFile$(NSString path);

    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data;", selector = "initWithData:")
    public native UIImage initWithData$(NSData data);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data scale:(CGFloat)scale NS_AVAILABLE_IOS(6_0);", selector = "initWithData:scale:")
    public native UIImage initWithData$scale$(NSData data, float scale);

    @ObjCMethodSign(sign = "- (id)initWithCGImage:(CGImageRef)cgImage;", selector = "initWithCGImage:")
    public native UIImage initWithCGImage$(CGImage cgImage);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithCGImage:(CGImageRef)cgImage scale:(CGFloat)scale orientation:(UIImageOrientation)orientation NS_AVAILABLE_IOS(4_0);", selector = "initWithCGImage:scale:orientation:")
    public native UIImage initWithCGImage$scale$orientation$(CGImage cgImage, float scale, UIImageOrientation orientation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithCIImage:(CIImage *)ciImage NS_AVAILABLE_IOS(5_0);", selector = "initWithCIImage:")
    public native UIImage initWithCIImage$(CIImage ciImage);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithCIImage:(CIImage *)ciImage scale:(CGFloat)scale orientation:(UIImageOrientation)orientation NS_AVAILABLE_IOS(6_0);", selector = "initWithCIImage:scale:orientation:")
    public native UIImage initWithCIImage$scale$orientation$(CIImage ciImage, float scale, UIImageOrientation orientation);

    @ObjCMethodSign(sign = "- (void)drawAtPoint:(CGPoint)point;", selector = "drawAtPoint:")
    public native void drawAtPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (void)drawAtPoint:(CGPoint)point blendMode:(CGBlendMode)blendMode alpha:(CGFloat)alpha;", selector = "drawAtPoint:blendMode:alpha:")
    public native void drawAtPoint$blendMode$alpha$(@ObjCByValue CGPoint point, CGBlendMode blendMode, float alpha);

    @ObjCMethodSign(sign = "- (void)drawInRect:(CGRect)rect;", selector = "drawInRect:")
    public native void drawInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "- (void)drawInRect:(CGRect)rect blendMode:(CGBlendMode)blendMode alpha:(CGFloat)alpha;", selector = "drawInRect:blendMode:alpha:")
    public native void drawInRect$blendMode$alpha$(@ObjCByValue CGRect rect, CGBlendMode blendMode, float alpha);

    @ObjCMethodSign(sign = "- (void)drawAsPatternInRect:(CGRect)rect;", selector = "drawAsPatternInRect:")
    public native void drawAsPatternInRect$(@ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)resizableImageWithCapInsets:(UIEdgeInsets)capInsets NS_AVAILABLE_IOS(5_0);", selector = "resizableImageWithCapInsets:")
    public native UIImage resizableImageWithCapInsets$(@ObjCByValue UIEdgeInsets capInsets);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)resizableImageWithCapInsets:(UIEdgeInsets)capInsets resizingMode:(UIImageResizingMode)resizingMode NS_AVAILABLE_IOS(6_0);", selector = "resizableImageWithCapInsets:resizingMode:")
    public native UIImage resizableImageWithCapInsets$resizingMode$(@ObjCByValue UIEdgeInsets capInsets, UIImageResizingMode resizingMode);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)imageWithAlignmentRectInsets:(UIEdgeInsets)alignmentInsets NS_AVAILABLE_IOS(6_0);", selector = "imageWithAlignmentRectInsets:")
    public native UIImage imageWithAlignmentRectInsets$(@ObjCByValue UIEdgeInsets alignmentInsets);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)imageWithRenderingMode:(UIImageRenderingMode)renderingMode NS_AVAILABLE_IOS(7_0);", selector = "imageWithRenderingMode:")
    public native UIImage imageWithRenderingMode$(UIImageRenderingMode renderingMode);

    @ObjCMethodSign(sign = "+ (UIImage *)imageNamed:(NSString *)name;", selector = "imageNamed:")
    public static native UIImage imageNamed$(NSString name);

    @ObjCMethodSign(sign = "+ (UIImage *)imageWithContentsOfFile:(NSString *)path;", selector = "imageWithContentsOfFile:")
    public static native UIImage imageWithContentsOfFile$(NSString path);

    @ObjCMethodSign(sign = "+ (UIImage *)imageWithData:(NSData *)data;", selector = "imageWithData:")
    public static native UIImage imageWithData$(NSData data);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)imageWithData:(NSData *)data scale:(CGFloat)scale NS_AVAILABLE_IOS(6_0);", selector = "imageWithData:scale:")
    public static native UIImage imageWithData$scale$(NSData data, float scale);

    @ObjCMethodSign(sign = "+ (UIImage *)imageWithCGImage:(CGImageRef)cgImage;", selector = "imageWithCGImage:")
    public static native UIImage imageWithCGImage$(CGImage cgImage);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)imageWithCGImage:(CGImageRef)cgImage scale:(CGFloat)scale orientation:(UIImageOrientation)orientation NS_AVAILABLE_IOS(4_0);", selector = "imageWithCGImage:scale:orientation:")
    public static native UIImage imageWithCGImage$scale$orientation$(CGImage cgImage, float scale, UIImageOrientation orientation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)imageWithCIImage:(CIImage *)ciImage NS_AVAILABLE_IOS(5_0);", selector = "imageWithCIImage:")
    public static native UIImage imageWithCIImage$(CIImage ciImage);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)imageWithCIImage:(CIImage *)ciImage scale:(CGFloat)scale orientation:(UIImageOrientation)orientation NS_AVAILABLE_IOS(6_0);", selector = "imageWithCIImage:scale:orientation:")
    public static native UIImage imageWithCIImage$scale$orientation$(CIImage ciImage, float scale, UIImageOrientation orientation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)animatedImageNamed:(NSString *)name duration:(NSTimeInterval)duration NS_AVAILABLE_IOS(5_0);", selector = "animatedImageNamed:duration:")
    public static native UIImage animatedImageNamed$duration$(NSString name, double duration);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)animatedResizableImageNamed:(NSString *)name capInsets:(UIEdgeInsets)capInsets duration:(NSTimeInterval)duration NS_AVAILABLE_IOS(5_0);", selector = "animatedResizableImageNamed:capInsets:duration:")
    public static native UIImage animatedResizableImageNamed$capInsets$duration$(NSString name, @ObjCByValue UIEdgeInsets capInsets, double duration);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)animatedResizableImageNamed:(NSString *)name capInsets:(UIEdgeInsets)capInsets resizingMode:(UIImageResizingMode)resizingMode duration:(NSTimeInterval)duration NS_AVAILABLE_IOS(6_0);", selector = "animatedResizableImageNamed:capInsets:resizingMode:duration:")
    public static native UIImage animatedResizableImageNamed$capInsets$resizingMode$duration$(NSString name, @ObjCByValue UIEdgeInsets capInsets, UIImageResizingMode resizingMode, double duration);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIImage *)animatedImageWithImages:(NSArray *)images duration:(NSTimeInterval)duration NS_AVAILABLE_IOS(5_0);", selector = "animatedImageWithImages:duration:")
    public static native UIImage animatedImageWithImages$duration$(NSArray images, double duration);

    @ObjCCategoryMethod(catname = "UIImageDeprecated", catownername = "UIImage")
    @ObjCMethodSign(sign = "- (UIImage *)stretchableImageWithLeftCapWidth:(NSInteger)leftCapWidth topCapHeight:(NSInteger)topCapHeight;", selector = "stretchableImageWithLeftCapWidth:topCapHeight:")
    public native UIImage stretchableImageWithLeftCapWidth$topCapHeight$(@NSInteger long leftCapWidth, @NSInteger long topCapHeight);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIImage initWithCoder$(NSCoder aDecoder);
}
