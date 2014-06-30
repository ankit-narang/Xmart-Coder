package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSLinguisticTagger extends NSObject  {
    
    public NSLinguisticTagger() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithTagSchemes:(NSArray *)tagSchemes options:(NSUInteger)opts NS_AVAILABLE(10_7, 5_0);", selector = "initWithTagSchemes:options:")
    public native NSLinguisticTagger initWithTagSchemes$options$(NSArray tagSchemes, @NSUInteger long opts);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)tagSchemes NS_AVAILABLE(10_7, 5_0);", selector = "tagSchemes")
    public native NSArray tagSchemes();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setString:(NSString *)string NS_AVAILABLE(10_7, 5_0);", selector = "setString:")
    public native void setString(NSString string);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)string NS_AVAILABLE(10_7, 5_0);", selector = "string")
    public native NSString string();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setOrthography:(NSOrthography *)orthography range:(NSRange)range NS_AVAILABLE(10_7, 5_0);", selector = "setOrthography:range:")
    public native void setOrthography$range$(NSOrthography orthography, @ObjCByValue NSRange range);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSOrthography *)orthographyAtIndex:(NSUInteger)charIndex effectiveRange:(NSRangePointer)effectiveRange NS_AVAILABLE(10_7, 5_0);", selector = "orthographyAtIndex:effectiveRange:")
    public native NSOrthography orthographyAtIndex$effectiveRange$(@NSUInteger long charIndex, NSRange effectiveRange);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)stringEditedInRange:(NSRange)newRange changeInLength:(NSInteger)delta NS_AVAILABLE(10_7, 5_0);", selector = "stringEditedInRange:changeInLength:")
    public native void stringEditedInRange$changeInLength$(@ObjCByValue NSRange newRange, @NSInteger long delta);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateTagsInRange:(NSRange)range scheme:(NSString *)tagScheme options:(NSLinguisticTaggerOptions)opts usingBlock:(void (^)(NSString *tag, NSRange tokenRange, NSRange sentenceRange, BOOL *stop))block NS_AVAILABLE(10_7, 5_0);", selector = "enumerateTagsInRange:scheme:options:usingBlock:")
    public native void enumerateTagsInRange$scheme$options$usingBlock$(@ObjCByValue NSRange range, NSString tagScheme, NSLinguisticTaggerOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSRange)sentenceRangeForRange:(NSRange)range NS_AVAILABLE(10_7, 5_0);", selector = "sentenceRangeForRange:")
    public native @ObjCByValue NSRange sentenceRangeForRange$(@ObjCByValue NSRange range);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)tagAtIndex:(NSUInteger)charIndex scheme:(NSString *)tagScheme tokenRange:(NSRangePointer)tokenRange sentenceRange:(NSRangePointer)sentenceRange NS_AVAILABLE(10_7, 5_0);", selector = "tagAtIndex:scheme:tokenRange:sentenceRange:")
    public native NSString tagAtIndex$scheme$tokenRange$sentenceRange$(@NSUInteger long charIndex, NSString tagScheme, NSRange tokenRange, NSRange sentenceRange);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)tagsInRange:(NSRange)range scheme:(NSString *)tagScheme options:(NSLinguisticTaggerOptions)opts tokenRanges:(NSArray **)tokenRanges NS_AVAILABLE(10_7, 5_0);", selector = "tagsInRange:scheme:options:tokenRanges:")
    public native NSArray tagsInRange$scheme$options$tokenRanges$(@ObjCByValue NSRange range, NSString tagScheme, NSLinguisticTaggerOptions opts, ObjCPtr<NSArray> tokenRanges);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)possibleTagsAtIndex:(NSUInteger)charIndex scheme:(NSString *)tagScheme tokenRange:(NSRangePointer)tokenRange sentenceRange:(NSRangePointer)sentenceRange scores:(NSArray **)scores NS_AVAILABLE(10_7, 5_0);", selector = "possibleTagsAtIndex:scheme:tokenRange:sentenceRange:scores:")
    public native NSArray possibleTagsAtIndex$scheme$tokenRange$sentenceRange$scores$(@NSUInteger long charIndex, NSString tagScheme, NSRange tokenRange, NSRange sentenceRange, ObjCPtr<NSArray> scores);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)availableTagSchemesForLanguage:(NSString *)language NS_AVAILABLE(10_7, 5_0);", selector = "availableTagSchemesForLanguage:")
    public static native NSArray availableTagSchemesForLanguage$(NSString language);
}
