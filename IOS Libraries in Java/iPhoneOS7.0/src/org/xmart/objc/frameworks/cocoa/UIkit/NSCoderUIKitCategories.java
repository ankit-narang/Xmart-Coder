package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSCoder")
@ObjCFramework("UIKit")
public final class NSCoderUIKitCategories extends NSCoder  {
    
    private NSCoderUIKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeCGPoint:(CGPoint)point forKey:(NSString *)key;", selector = "encodeCGPoint:forKey:")
    public static native void encodeCGPoint$forKey$(@ObjCByValue CGPoint point, NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeCGSize:(CGSize)size forKey:(NSString *)key;", selector = "encodeCGSize:forKey:")
    public static native void encodeCGSize$forKey$(@ObjCByValue CGSize size, NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeCGRect:(CGRect)rect forKey:(NSString *)key;", selector = "encodeCGRect:forKey:")
    public static native void encodeCGRect$forKey$(@ObjCByValue CGRect rect, NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeCGAffineTransform:(CGAffineTransform)transform forKey:(NSString *)key;", selector = "encodeCGAffineTransform:forKey:")
    public static native void encodeCGAffineTransform$forKey$(@ObjCByValue CGAffineTransform transform, NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeUIEdgeInsets:(UIEdgeInsets)insets forKey:(NSString *)key;", selector = "encodeUIEdgeInsets:forKey:")
    public static native void encodeUIEdgeInsets$forKey$(@ObjCByValue UIEdgeInsets insets, NSString key);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeUIOffset:(UIOffset)offset forKey:(NSString *)key NS_AVAILABLE_IOS(5_0);", selector = "encodeUIOffset:forKey:")
    public static native void encodeUIOffset$forKey$(@ObjCByValue UIOffset offset, NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (CGPoint)decodeCGPointForKey:(NSString *)key;", selector = "decodeCGPointForKey:")
    public static native @ObjCByValue CGPoint decodeCGPointForKey$(NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (CGSize)decodeCGSizeForKey:(NSString *)key;", selector = "decodeCGSizeForKey:")
    public static native @ObjCByValue CGSize decodeCGSizeForKey$(NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (CGRect)decodeCGRectForKey:(NSString *)key;", selector = "decodeCGRectForKey:")
    public static native @ObjCByValue CGRect decodeCGRectForKey$(NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (CGAffineTransform)decodeCGAffineTransformForKey:(NSString *)key;", selector = "decodeCGAffineTransformForKey:")
    public static native @ObjCByValue CGAffineTransform decodeCGAffineTransformForKey$(NSString key);

    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (UIEdgeInsets)decodeUIEdgeInsetsForKey:(NSString *)key;", selector = "decodeUIEdgeInsetsForKey:")
    public static native @ObjCByValue UIEdgeInsets decodeUIEdgeInsetsForKey$(NSString key);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIGeometryKeyedCoding", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (UIOffset)decodeUIOffsetForKey:(NSString *)key NS_AVAILABLE_IOS(5_0);", selector = "decodeUIOffsetForKey:")
    public static native @ObjCByValue UIOffset decodeUIOffsetForKey$(NSString key);
}
