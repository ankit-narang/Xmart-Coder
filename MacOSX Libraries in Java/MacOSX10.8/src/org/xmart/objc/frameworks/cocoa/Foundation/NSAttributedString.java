package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSAttributedString extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    
    public NSAttributedString() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)string;", selector = "string")
    public native NSString string();

    @ObjCMethodSign(sign = "- (NSDictionary *)attributesAtIndex:(NSUInteger)location effectiveRange:(NSRangePointer)range;", selector = "attributesAtIndex:effectiveRange:")
    public native NSDictionary attributesAtIndex$effectiveRange$(@NSUInteger long location, NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (NSUInteger)length;", selector = "length")
    public native @NSUInteger long length();

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)attribute:(NSString *)attrName atIndex:(NSUInteger)location effectiveRange:(NSRangePointer)range;", selector = "attribute:atIndex:effectiveRange:")
    public native NSObject attribute$atIndex$effectiveRange$(NSString attrName, @NSUInteger long location, NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (NSAttributedString *)attributedSubstringFromRange:(NSRange)range;", selector = "attributedSubstringFromRange:")
    public native NSAttributedString attributedSubstringFromRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (NSDictionary *)attributesAtIndex:(NSUInteger)location longestEffectiveRange:(NSRangePointer)range inRange:(NSRange)rangeLimit;", selector = "attributesAtIndex:longestEffectiveRange:inRange:")
    public native NSDictionary attributesAtIndex$longestEffectiveRange$inRange$(@NSUInteger long location, NSRange range, @ObjCByValue NSRange rangeLimit);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)attribute:(NSString *)attrName atIndex:(NSUInteger)location longestEffectiveRange:(NSRangePointer)range inRange:(NSRange)rangeLimit;", selector = "attribute:atIndex:longestEffectiveRange:inRange:")
    public native NSObject attribute$atIndex$longestEffectiveRange$inRange$(NSString attrName, @NSUInteger long location, NSRange range, @ObjCByValue NSRange rangeLimit);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToAttributedString:(NSAttributedString *)other;", selector = "isEqualToAttributedString:")
    public native boolean isEqualToAttributedString$(NSAttributedString other);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)str;", selector = "initWithString:")
    public native NSAttributedString initWithString$(NSString str);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)str attributes:(NSDictionary *)attrs;", selector = "initWithString:attributes:")
    public native NSAttributedString initWithString$attributes$(NSString str, NSDictionary attrs);

    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)initWithAttributedString:(NSAttributedString *)attrStr;", selector = "initWithAttributedString:")
    public native NSAttributedString initWithAttributedString$(NSAttributedString attrStr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (void)enumerateAttributesInRange:(NSRange)enumerationRange options:(NSAttributedStringEnumerationOptions)opts usingBlock:(void (^)(NSDictionary *attrs, NSRange range, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateAttributesInRange:options:usingBlock:")
    public native void enumerateAttributesInRange$options$usingBlock$(@ObjCByValue NSRange enumerationRange, NSAttributedStringEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedAttributedString", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (void)enumerateAttribute:(NSString *)attrName inRange:(NSRange)enumerationRange options:(NSAttributedStringEnumerationOptions)opts usingBlock:(void (^)(id value, NSRange range, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateAttribute:inRange:options:usingBlock:")
    public native void enumerateAttribute$inRange$options$usingBlock$(NSString attrName, @ObjCByValue NSRange enumerationRange, NSAttributedStringEnumerationOptions opts, ObjCBlock block);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSAttributedString initWithCoder$(NSCoder aDecoder);
}
