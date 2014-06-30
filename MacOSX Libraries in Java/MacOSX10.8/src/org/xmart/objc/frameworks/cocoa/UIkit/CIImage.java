package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CIImage extends NSObject implements NSCoding, NSCopying {
    
    public CIImage() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithCGImage:(CGImageRef)image;", selector = "initWithCGImage:")
    public native CIImage initWithCGImage$(CGImage image);

    @ObjCMethodSign(sign = "- (id)initWithCGImage:(CGImageRef)image options:(NSDictionary *)d;", selector = "initWithCGImage:options:")
    public native CIImage initWithCGImage$options$(CGImage image, NSDictionary d);

    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data;", selector = "initWithData:")
    public native CIImage initWithData$(NSData data);

    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data options:(NSDictionary *)d;", selector = "initWithData:options:")
    public native CIImage initWithData$options$(NSData data, NSDictionary d);

    @ObjCMethodSign(sign = "- (id)initWithBitmapData:(NSData *)d bytesPerRow:(size_t)bpr size:(CGSize)size  format:(CIFormat)f colorSpace:(CGColorSpaceRef)c;", selector = "initWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public native CIImage initWithBitmapData$bytesPerRow$size$format$colorSpace$(NSData d, @Unsigned long bpr, @ObjCByValue CGSize size, int f, CGColorSpace c);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithTexture:(unsigned int)name size:(CGSize)size flipped:(BOOL)flag colorSpace:(CGColorSpaceRef)cs __OSX_AVAILABLE_STARTING(__MAC_10_4, __IPHONE_6_0);", selector = "initWithTexture:size:flipped:colorSpace:")
    public native CIImage initWithTexture$size$flipped$colorSpace$(@Unsigned int name, @ObjCByValue CGSize size, boolean flag, CGColorSpace cs);

    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url;", selector = "initWithContentsOfURL:")
    public native CIImage initWithContentsOfURL$(NSURL url);

    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url options:(NSDictionary *)d;", selector = "initWithContentsOfURL:options:")
    public native CIImage initWithContentsOfURL$options$(NSURL url, NSDictionary d);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithCVPixelBuffer:(CVPixelBufferRef)buffer __OSX_AVAILABLE_STARTING(__MAC_NA, __IPHONE_5_0);", selector = "initWithCVPixelBuffer:")
    public native CIImage initWithCVPixelBuffer$(__CVBuffer buffer);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithCVPixelBuffer:(CVPixelBufferRef)buffer options:(NSDictionary *)dict __OSX_AVAILABLE_STARTING(__MAC_NA, __IPHONE_5_0);", selector = "initWithCVPixelBuffer:options:")
    public native CIImage initWithCVPixelBuffer$options$(__CVBuffer buffer, NSDictionary dict);

    @ObjCMethodSign(sign = "- (id)initWithColor:(CIColor *)color;", selector = "initWithColor:")
    public native CIImage initWithColor$(CIColor color);

    @ObjCMethodSign(sign = "- (CIImage *)imageByApplyingTransform:(CGAffineTransform)matrix;", selector = "imageByApplyingTransform:")
    public native CIImage imageByApplyingTransform$(@ObjCByValue CGAffineTransform matrix);

    @ObjCMethodSign(sign = "- (CIImage *)imageByCroppingToRect:(CGRect)r;", selector = "imageByCroppingToRect:")
    public native CIImage imageByCroppingToRect$(@ObjCByValue CGRect r);

    @ObjCMethodSign(sign = "- (CGRect)extent;", selector = "extent")
    public native @ObjCByValue CGRect extent();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary*)properties __OSX_AVAILABLE_STARTING(__MAC_10_8, __IPHONE_5_0);", selector = "properties")
    public native NSDictionary properties();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGRect)regionOfInterestForImage:(CIImage *)im inRect:(CGRect)r __OSX_AVAILABLE_STARTING(__MAC_NA, __IPHONE_6_0);", selector = "regionOfInterestForImage:inRect:")
    public native @ObjCByValue CGRect regionOfInterestForImage$inRect$(CIImage im, @ObjCByValue CGRect r);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithCGImage:(CGImageRef)image;", selector = "imageWithCGImage:")
    public static native CIImage imageWithCGImage$(CGImage image);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithCGImage:(CGImageRef)image options:(NSDictionary *)d;", selector = "imageWithCGImage:options:")
    public static native CIImage imageWithCGImage$options$(CGImage image, NSDictionary d);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithBitmapData:(NSData *)d bytesPerRow:(size_t)bpr  size:(CGSize)size format:(CIFormat)f colorSpace:(CGColorSpaceRef)cs;", selector = "imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public static native CIImage imageWithBitmapData$bytesPerRow$size$format$colorSpace$(NSData d, @Unsigned long bpr, @ObjCByValue CGSize size, int f, CGColorSpace cs);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (CIImage *)imageWithTexture:(unsigned int)name size:(CGSize)size  flipped:(BOOL)flag colorSpace:(CGColorSpaceRef)cs __OSX_AVAILABLE_STARTING(__MAC_10_4, __IPHONE_6_0);", selector = "imageWithTexture:size:flipped:colorSpace:")
    public static native CIImage imageWithTexture$size$flipped$colorSpace$(@Unsigned int name, @ObjCByValue CGSize size, boolean flag, CGColorSpace cs);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithContentsOfURL:(NSURL *)url;", selector = "imageWithContentsOfURL:")
    public static native CIImage imageWithContentsOfURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithContentsOfURL:(NSURL *)url options:(NSDictionary *)d;", selector = "imageWithContentsOfURL:options:")
    public static native CIImage imageWithContentsOfURL$options$(NSURL url, NSDictionary d);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithData:(NSData *)data;", selector = "imageWithData:")
    public static native CIImage imageWithData$(NSData data);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithData:(NSData *)data options:(NSDictionary *)d;", selector = "imageWithData:options:")
    public static native CIImage imageWithData$options$(NSData data, NSDictionary d);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (CIImage *)imageWithCVPixelBuffer:(CVPixelBufferRef)buffer __OSX_AVAILABLE_STARTING(__MAC_NA, __IPHONE_5_0);", selector = "imageWithCVPixelBuffer:")
    public static native CIImage imageWithCVPixelBuffer$(__CVBuffer buffer);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (CIImage *)imageWithCVPixelBuffer:(CVPixelBufferRef)buffer options:(NSDictionary *)dict __OSX_AVAILABLE_STARTING(__MAC_NA, __IPHONE_5_0);", selector = "imageWithCVPixelBuffer:options:")
    public static native CIImage imageWithCVPixelBuffer$options$(__CVBuffer buffer, NSDictionary dict);

    @ObjCMethodSign(sign = "+ (CIImage *)imageWithColor:(CIColor *)color;", selector = "imageWithColor:")
    public static native CIImage imageWithColor$(CIColor color);

    @ObjCMethodSign(sign = "+ (CIImage *)emptyImage;", selector = "emptyImage")
    public static native CIImage emptyImage();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "AutoAdjustment", catownername = "CIImage")
    @ObjCMethodSign(sign = "- (NSArray *)autoAdjustmentFilters __OSX_AVAILABLE_STARTING(__MAC_10_8, __IPHONE_5_0);", selector = "autoAdjustmentFilters")
    public native NSArray autoAdjustmentFilters();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "AutoAdjustment", catownername = "CIImage")
    @ObjCMethodSign(sign = "- (NSArray *)autoAdjustmentFiltersWithOptions:(NSDictionary *)dict __OSX_AVAILABLE_STARTING(__MAC_10_8, __IPHONE_5_0);", selector = "autoAdjustmentFiltersWithOptions:")
    public native NSArray autoAdjustmentFiltersWithOptions$(NSDictionary dict);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIKitAdditions", catownername = "CIImage")
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image NS_AVAILABLE_IOS(5_0);", selector = "initWithImage:")
    public native CIImage initWithImage$(UIImage image);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIKitAdditions", catownername = "CIImage")
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image options:(NSDictionary *)options NS_AVAILABLE_IOS(5_0);", selector = "initWithImage:options:")
    public native CIImage initWithImage$options$(UIImage image, NSDictionary options);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native CIImage initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
