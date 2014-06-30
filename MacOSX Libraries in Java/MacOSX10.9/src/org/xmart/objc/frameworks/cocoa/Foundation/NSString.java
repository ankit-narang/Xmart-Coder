package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;

import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSString extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding {
    
    public NSString() {}
    
    @ObjCMethodSign(sign = "- (instancetype)initWithString:(NSString *)aString;", selector = "initWithString:")    
    public NSString(String string) {
		// TODO Auto-generated constructor stub
	}


	@ObjCMethodSign(sign = "- (NSUInteger)length;", selector = "length")
    public native @NSUInteger long length();

    @ObjCMethodSign(sign = "- (unichar)characterAtIndex:(NSUInteger)index;", selector = "characterAtIndex:")
    public native @Unsigned short characterAtIndex$(@NSUInteger long index);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getCharacters:(unichar *)buffer range:(NSRange)aRange;", selector = "getCharacters:range:")
    public native void getCharacters$range$(@Unsigned short[] buffer, @ObjCByValue NSRange aRange);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)substringFromIndex:(NSUInteger)from;", selector = "substringFromIndex:")
    public native NSString substringFromIndex$(@NSUInteger long from);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)substringToIndex:(NSUInteger)to;", selector = "substringToIndex:")
    public native NSString substringToIndex$(@NSUInteger long to);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)substringWithRange:(NSRange)range;", selector = "substringWithRange:")
    public native NSString substringWithRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSString *)string;", selector = "compare:")
    public native NSComparisonResult compare$(NSString string);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSString *)string options:(NSStringCompareOptions)mask;", selector = "compare:options:")
    public native NSComparisonResult compare$options$(NSString string, NSStringCompareOptions mask);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSString *)string options:(NSStringCompareOptions)mask range:(NSRange)compareRange;", selector = "compare:options:range:")
    public native NSComparisonResult compare$options$range$(NSString string, NSStringCompareOptions mask, @ObjCByValue NSRange compareRange);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSString *)string options:(NSStringCompareOptions)mask range:(NSRange)compareRange locale:(id)locale;", selector = "compare:options:range:locale:")
    public native NSComparisonResult compare$options$range$locale$(NSString string, NSStringCompareOptions mask, @ObjCByValue NSRange compareRange, NSObject locale);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)caseInsensitiveCompare:(NSString *)string;", selector = "caseInsensitiveCompare:")
    public native NSComparisonResult caseInsensitiveCompare$(NSString string);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)localizedCompare:(NSString *)string;", selector = "localizedCompare:")
    public native NSComparisonResult localizedCompare$(NSString string);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)localizedCaseInsensitiveCompare:(NSString *)string;", selector = "localizedCaseInsensitiveCompare:")
    public native NSComparisonResult localizedCaseInsensitiveCompare$(NSString string);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSComparisonResult)localizedStandardCompare:(NSString *)string NS_AVAILABLE(10_6, 4_0);", selector = "localizedStandardCompare:")
    public native NSComparisonResult localizedStandardCompare$(NSString string);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToString:(NSString *)aString;", selector = "isEqualToString:")
    public native boolean isEqualToString$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)hasPrefix:(NSString *)aString;", selector = "hasPrefix:")
    public native boolean hasPrefix$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)hasSuffix:(NSString *)aString;", selector = "hasSuffix:")
    public native boolean hasSuffix$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfString:(NSString *)aString;", selector = "rangeOfString:")
    public native @ObjCByValue NSRange rangeOfString$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfString:(NSString *)aString options:(NSStringCompareOptions)mask;", selector = "rangeOfString:options:")
    public native @ObjCByValue NSRange rangeOfString$options$(NSString aString, NSStringCompareOptions mask);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfString:(NSString *)aString options:(NSStringCompareOptions)mask range:(NSRange)searchRange;", selector = "rangeOfString:options:range:")
    public native @ObjCByValue NSRange rangeOfString$options$range$(NSString aString, NSStringCompareOptions mask, @ObjCByValue NSRange searchRange);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfString:(NSString *)aString options:(NSStringCompareOptions)mask range:(NSRange)searchRange locale:(NSLocale *)locale NS_AVAILABLE(10_5, 2_0);", selector = "rangeOfString:options:range:locale:")
    public native @ObjCByValue NSRange rangeOfString$options$range$locale$(NSString aString, NSStringCompareOptions mask, @ObjCByValue NSRange searchRange, NSLocale locale);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfCharacterFromSet:(NSCharacterSet *)aSet;", selector = "rangeOfCharacterFromSet:")
    public native @ObjCByValue NSRange rangeOfCharacterFromSet$(NSCharacterSet aSet);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfCharacterFromSet:(NSCharacterSet *)aSet options:(NSStringCompareOptions)mask;", selector = "rangeOfCharacterFromSet:options:")
    public native @ObjCByValue NSRange rangeOfCharacterFromSet$options$(NSCharacterSet aSet, NSStringCompareOptions mask);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfCharacterFromSet:(NSCharacterSet *)aSet options:(NSStringCompareOptions)mask range:(NSRange)searchRange;", selector = "rangeOfCharacterFromSet:options:range:")
    public native @ObjCByValue NSRange rangeOfCharacterFromSet$options$range$(NSCharacterSet aSet, NSStringCompareOptions mask, @ObjCByValue NSRange searchRange);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfComposedCharacterSequenceAtIndex:(NSUInteger)index;", selector = "rangeOfComposedCharacterSequenceAtIndex:")
    public native @ObjCByValue NSRange rangeOfComposedCharacterSequenceAtIndex$(@NSUInteger long index);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)rangeOfComposedCharacterSequencesForRange:(NSRange)range NS_AVAILABLE(10_5, 2_0);", selector = "rangeOfComposedCharacterSequencesForRange:")
    public native @ObjCByValue NSRange rangeOfComposedCharacterSequencesForRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAppendingString:(NSString *)aString;", selector = "stringByAppendingString:")
    public native NSString stringByAppendingString$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAppendingFormat:(NSString *)format, ... NS_FORMAT_FUNCTION(1,2);", selector = "stringByAppendingFormat:")
    public native NSString stringByAppendingFormat$(NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (double)doubleValue;", selector = "doubleValue")
    public native double doubleValue();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (float)floatValue;", selector = "floatValue")
    public native float floatValue();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (int)intValue;", selector = "intValue")
    public native int intValue();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSInteger)integerValue NS_AVAILABLE(10_5, 2_0);", selector = "integerValue")
    public native @NSInteger long integerValue();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (long long)longLongValue NS_AVAILABLE(10_5, 2_0);", selector = "longLongValue")
    public native @LongLong long longLongValue();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)boolValue NS_AVAILABLE(10_5, 2_0);", selector = "boolValue")
    public native boolean boolValue();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSArray *)componentsSeparatedByString:(NSString *)separator;", selector = "componentsSeparatedByString:")
    public native NSArray componentsSeparatedByString$(NSString separator);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSArray *)componentsSeparatedByCharactersInSet:(NSCharacterSet *)separator NS_AVAILABLE(10_5, 2_0);", selector = "componentsSeparatedByCharactersInSet:")
    public native NSArray componentsSeparatedByCharactersInSet$(NSCharacterSet separator);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)commonPrefixWithString:(NSString *)aString options:(NSStringCompareOptions)mask;", selector = "commonPrefixWithString:options:")
    public native NSString commonPrefixWithString$options$(NSString aString, NSStringCompareOptions mask);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)uppercaseString;", selector = "uppercaseString")
    public native NSString uppercaseString();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)lowercaseString;", selector = "lowercaseString")
    public native NSString lowercaseString();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)capitalizedString;", selector = "capitalizedString")
    public native NSString capitalizedString();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)uppercaseStringWithLocale:(NSLocale *)locale NS_AVAILABLE(10_8, 6_0);", selector = "uppercaseStringWithLocale:")
    public native NSString uppercaseStringWithLocale$(NSLocale locale);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)lowercaseStringWithLocale:(NSLocale *)locale NS_AVAILABLE(10_8, 6_0);", selector = "lowercaseStringWithLocale:")
    public native NSString lowercaseStringWithLocale$(NSLocale locale);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)capitalizedStringWithLocale:(NSLocale *)locale NS_AVAILABLE(10_8, 6_0);", selector = "capitalizedStringWithLocale:")
    public native NSString capitalizedStringWithLocale$(NSLocale locale);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByTrimmingCharactersInSet:(NSCharacterSet *)set;", selector = "stringByTrimmingCharactersInSet:")
    public native NSString stringByTrimmingCharactersInSet$(NSCharacterSet set);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByPaddingToLength:(NSUInteger)newLength withString:(NSString *)padString startingAtIndex:(NSUInteger)padIndex;", selector = "stringByPaddingToLength:withString:startingAtIndex:")
    public native NSString stringByPaddingToLength$withString$startingAtIndex$(@NSUInteger long newLength, NSString padString, @NSUInteger long padIndex);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getLineStart:(NSUInteger *)startPtr end:(NSUInteger *)lineEndPtr contentsEnd:(NSUInteger *)contentsEndPtr forRange:(NSRange)range;", selector = "getLineStart:end:contentsEnd:forRange:")
    public native void getLineStart$end$contentsEnd$forRange$(@NSUInteger long[] startPtr, @NSUInteger long[] lineEndPtr, @NSUInteger long[] contentsEndPtr, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)lineRangeForRange:(NSRange)range;", selector = "lineRangeForRange:")
    public native @ObjCByValue NSRange lineRangeForRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getParagraphStart:(NSUInteger *)startPtr end:(NSUInteger *)parEndPtr contentsEnd:(NSUInteger *)contentsEndPtr forRange:(NSRange)range;", selector = "getParagraphStart:end:contentsEnd:forRange:")
    public native void getParagraphStart$end$contentsEnd$forRange$(@NSUInteger long[] startPtr, @NSUInteger long[] parEndPtr, @NSUInteger long[] contentsEndPtr, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSRange)paragraphRangeForRange:(NSRange)range;", selector = "paragraphRangeForRange:")
    public native @ObjCByValue NSRange paragraphRangeForRange$(@ObjCByValue NSRange range);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)enumerateSubstringsInRange:(NSRange)range options:(NSStringEnumerationOptions)opts usingBlock:(void (^)(NSString *substring, NSRange substringRange, NSRange enclosingRange, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateSubstringsInRange:options:usingBlock:")
    public native void enumerateSubstringsInRange$options$usingBlock$(@ObjCByValue NSRange range, NSStringEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)enumerateLinesUsingBlock:(void (^)(NSString *line, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateLinesUsingBlock:")
    public native void enumerateLinesUsingBlock$(ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSUInteger)hash;", selector = "hash")
    public native @NSUInteger long hash();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSStringEncoding)fastestEncoding;", selector = "fastestEncoding")
    public native NSStringEncoding fastestEncoding();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSStringEncoding)smallestEncoding;", selector = "smallestEncoding")
    public native NSStringEncoding smallestEncoding();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSData *)dataUsingEncoding:(NSStringEncoding)encoding allowLossyConversion:(BOOL)lossy;", selector = "dataUsingEncoding:allowLossyConversion:")
    public native NSData dataUsingEncoding$allowLossyConversion$(NSStringEncoding encoding, boolean lossy);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSData *)dataUsingEncoding:(NSStringEncoding)encoding;", selector = "dataUsingEncoding:")
    public native NSData dataUsingEncoding$(NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)canBeConvertedToEncoding:(NSStringEncoding)encoding;", selector = "canBeConvertedToEncoding:")
    public native boolean canBeConvertedToEncoding$(NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (__strong const char *)cStringUsingEncoding:(NSStringEncoding)encoding NS_RETURNS_INNER_POINTER;", selector = "cStringUsingEncoding:")
    public native byte[] cStringUsingEncoding$(NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)getCString:(char *)buffer maxLength:(NSUInteger)maxBufferCount encoding:(NSStringEncoding)encoding;", selector = "getCString:maxLength:encoding:")
    public native boolean getCString$maxLength$encoding$(byte[] buffer, @NSUInteger long maxBufferCount, NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)getBytes:(void *)buffer maxLength:(NSUInteger)maxBufferCount usedLength:(NSUInteger *)usedBufferCount encoding:(NSStringEncoding)encoding options:(NSStringEncodingConversionOptions)options range:(NSRange)range remainingRange:(NSRangePointer)leftover;", selector = "getBytes:maxLength:usedLength:encoding:options:range:remainingRange:")
    public native boolean getBytes$maxLength$usedLength$encoding$options$range$remainingRange$(@VoidPointer() Object buffer, @NSUInteger long maxBufferCount, @NSUInteger long[] usedBufferCount, NSStringEncoding encoding, NSStringEncodingConversionOptions options, @ObjCByValue NSRange range, NSRange leftover);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSUInteger)maximumLengthOfBytesUsingEncoding:(NSStringEncoding)enc;", selector = "maximumLengthOfBytesUsingEncoding:")
    public native @NSUInteger long maximumLengthOfBytesUsingEncoding$(NSStringEncoding enc);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSUInteger)lengthOfBytesUsingEncoding:(NSStringEncoding)enc;", selector = "lengthOfBytesUsingEncoding:")
    public native @NSUInteger long lengthOfBytesUsingEncoding$(NSStringEncoding enc);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)decomposedStringWithCanonicalMapping;", selector = "decomposedStringWithCanonicalMapping")
    public native NSString decomposedStringWithCanonicalMapping();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)precomposedStringWithCanonicalMapping;", selector = "precomposedStringWithCanonicalMapping")
    public native NSString precomposedStringWithCanonicalMapping();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)decomposedStringWithCompatibilityMapping;", selector = "decomposedStringWithCompatibilityMapping")
    public native NSString decomposedStringWithCompatibilityMapping();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)precomposedStringWithCompatibilityMapping;", selector = "precomposedStringWithCompatibilityMapping")
    public native NSString precomposedStringWithCompatibilityMapping();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByFoldingWithOptions:(NSStringCompareOptions)options locale:(NSLocale *)locale NS_AVAILABLE(10_5, 2_0);", selector = "stringByFoldingWithOptions:locale:")
    public native NSString stringByFoldingWithOptions$locale$(NSStringCompareOptions options, NSLocale locale);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByReplacingOccurrencesOfString:(NSString *)target withString:(NSString *)replacement options:(NSStringCompareOptions)options range:(NSRange)searchRange NS_AVAILABLE(10_5, 2_0);", selector = "stringByReplacingOccurrencesOfString:withString:options:range:")
    public native NSString stringByReplacingOccurrencesOfString$withString$options$range$(NSString target, NSString replacement, NSStringCompareOptions options, @ObjCByValue NSRange searchRange);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByReplacingOccurrencesOfString:(NSString *)target withString:(NSString *)replacement NS_AVAILABLE(10_5, 2_0);", selector = "stringByReplacingOccurrencesOfString:withString:")
    public native NSString stringByReplacingOccurrencesOfString$withString$(NSString target, NSString replacement);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByReplacingCharactersInRange:(NSRange)range withString:(NSString *)replacement NS_AVAILABLE(10_5, 2_0);", selector = "stringByReplacingCharactersInRange:withString:")
    public native NSString stringByReplacingCharactersInRange$withString$(@ObjCByValue NSRange range, NSString replacement);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (__strong const char *)UTF8String NS_RETURNS_INNER_POINTER;", selector = "UTF8String")
    public native byte[] UTF8String();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSString init();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithCharactersNoCopy:(unichar *)characters length:(NSUInteger)length freeWhenDone:(BOOL)freeBuffer;", selector = "initWithCharactersNoCopy:length:freeWhenDone:")
    public native NSString initWithCharactersNoCopy$length$freeWhenDone$(@Unsigned short[] characters, @NSUInteger long length, boolean freeBuffer);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithCharacters:(const unichar *)characters length:(NSUInteger)length;", selector = "initWithCharacters:length:")
    public native NSString initWithCharacters$length$(@Unsigned short[] characters, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithUTF8String:(const char *)nullTerminatedCString;", selector = "initWithUTF8String:")
    public native NSString initWithUTF8String$(byte[] nullTerminatedCString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithString:(NSString *)aString;", selector = "initWithString:")
    public native NSString initWithString$(NSString aString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithFormat:(NSString *)format, ... NS_FORMAT_FUNCTION(1,2);", selector = "initWithFormat:")
    public native NSString initWithFormat$(NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithFormat:(NSString *)format arguments:(va_list)argList NS_FORMAT_FUNCTION(1,0);", selector = "initWithFormat:arguments:")
    public native NSString initWithFormat$arguments$(NSString format, NSObject... argList);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithFormat:(NSString *)format locale:(id)locale, ... NS_FORMAT_FUNCTION(1,3);", selector = "initWithFormat:locale:")
    public native NSString initWithFormat$locale$(NSString format, NSObject locale, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithFormat:(NSString *)format locale:(id)locale arguments:(va_list)argList NS_FORMAT_FUNCTION(1,0);", selector = "initWithFormat:locale:arguments:")
    public native NSString initWithFormat$locale$arguments$(NSString format, NSObject locale, NSObject... argList);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithData:(NSData *)data encoding:(NSStringEncoding)encoding;", selector = "initWithData:encoding:")
    public native NSString initWithData$encoding$(NSData data, NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithBytes:(const void *)bytes length:(NSUInteger)len encoding:(NSStringEncoding)encoding;", selector = "initWithBytes:length:encoding:")
    public native NSString initWithBytes$length$encoding$(@VoidPointer() Object bytes, @NSUInteger long len, NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithBytesNoCopy:(void *)bytes length:(NSUInteger)len encoding:(NSStringEncoding)encoding freeWhenDone:(BOOL)freeBuffer;", selector = "initWithBytesNoCopy:length:encoding:freeWhenDone:")
    public native NSString initWithBytesNoCopy$length$encoding$freeWhenDone$(@VoidPointer() Object bytes, @NSUInteger long len, NSStringEncoding encoding, boolean freeBuffer);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithCString:(const char *)nullTerminatedCString encoding:(NSStringEncoding)encoding;", selector = "initWithCString:encoding:")
    public native NSString initWithCString$encoding$(byte[] nullTerminatedCString, NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithContentsOfURL:(NSURL *)url encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "initWithContentsOfURL:encoding:error:")
    public native NSString initWithContentsOfURL$encoding$error$(NSURL url, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithContentsOfFile:(NSString *)path encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "initWithContentsOfFile:encoding:error:")
    public native NSString initWithContentsOfFile$encoding$error$(NSString path, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithContentsOfURL:(NSURL *)url usedEncoding:(NSStringEncoding *)enc error:(NSError **)error;", selector = "initWithContentsOfURL:usedEncoding:error:")
    public native NSString initWithContentsOfURL$usedEncoding$error$(NSURL url, @Unsigned int[] enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (instancetype)initWithContentsOfFile:(NSString *)path usedEncoding:(NSStringEncoding *)enc error:(NSError **)error;", selector = "initWithContentsOfFile:usedEncoding:error:")
    public native NSString initWithContentsOfFile$usedEncoding$error$(NSString path, @Unsigned int[] enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url atomically:(BOOL)useAuxiliaryFile encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "writeToURL:atomically:encoding:error:")
    public native boolean writeToURL$atomically$encoding$error$(NSURL url, boolean useAuxiliaryFile, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path atomically:(BOOL)useAuxiliaryFile encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "writeToFile:atomically:encoding:error:")
    public native boolean writeToFile$atomically$encoding$error$(NSString path, boolean useAuxiliaryFile, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (NSStringEncoding)defaultCStringEncoding;", selector = "defaultCStringEncoding")
    public static native NSStringEncoding defaultCStringEncoding();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (const NSStringEncoding *)availableStringEncodings;", selector = "availableStringEncodings")
    public static native @Unsigned int[] availableStringEncodings();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (NSString *)localizedNameOfStringEncoding:(NSStringEncoding)encoding;", selector = "localizedNameOfStringEncoding:")
    public static native NSString localizedNameOfStringEncoding$(NSStringEncoding encoding);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)string;", selector = "string")
    public static native NSString string();

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithString:(NSString *)string;", selector = "stringWithString:")
    public static native NSString stringWithString$(NSString string);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithCharacters:(const unichar *)characters length:(NSUInteger)length;", selector = "stringWithCharacters:length:")
    public static native NSString stringWithCharacters$length$(@Unsigned short[] characters, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithUTF8String:(const char *)nullTerminatedCString;", selector = "stringWithUTF8String:")
    public static native NSString stringWithUTF8String$(byte[] nullTerminatedCString);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithFormat:(NSString *)format, ... NS_FORMAT_FUNCTION(1,2);", selector = "stringWithFormat:")
    public static native NSString stringWithFormat$(NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)localizedStringWithFormat:(NSString *)format, ... NS_FORMAT_FUNCTION(1,2);", selector = "localizedStringWithFormat:")
    public static native NSString localizedStringWithFormat$(NSString format, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithCString:(const char *)cString encoding:(NSStringEncoding)enc;", selector = "stringWithCString:encoding:")
    public static native NSString stringWithCString$encoding$(byte[] cString, NSStringEncoding enc);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithContentsOfURL:(NSURL *)url encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "stringWithContentsOfURL:encoding:error:")
    public static native NSString stringWithContentsOfURL$encoding$error$(NSURL url, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithContentsOfFile:(NSString *)path encoding:(NSStringEncoding)enc error:(NSError **)error;", selector = "stringWithContentsOfFile:encoding:error:")
    public static native NSString stringWithContentsOfFile$encoding$error$(NSString path, NSStringEncoding enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithContentsOfURL:(NSURL *)url usedEncoding:(NSStringEncoding *)enc error:(NSError **)error;", selector = "stringWithContentsOfURL:usedEncoding:error:")
    public static native NSString stringWithContentsOfURL$usedEncoding$error$(NSURL url, @Unsigned int[] enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSStringExtensionMethods", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (instancetype)stringWithContentsOfFile:(NSString *)path usedEncoding:(NSStringEncoding *)enc error:(NSError **)error;", selector = "stringWithContentsOfFile:usedEncoding:error:")
    public static native NSString stringWithContentsOfFile$usedEncoding$error$(NSString path, @Unsigned int[] enc, NSError[] error);

    @ObjCCategoryMethod(catname = "NSExtendedStringPropertyListParsing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)propertyList;", selector = "propertyList")
    public native NSObject propertyList();

    @ObjCCategoryMethod(catname = "NSExtendedStringPropertyListParsing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSDictionary *)propertyListFromStringsFileFormat;", selector = "propertyListFromStringsFileFormat")
    public native NSDictionary propertyListFromStringsFileFormat();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (const char *)cString NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "cString")
    public native byte[] cString();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (const char *)lossyCString NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "lossyCString")
    public native byte[] lossyCString();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSUInteger)cStringLength NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "cStringLength")
    public native @NSUInteger long cStringLength();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getCString:(char *)bytes NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "getCString:")
    public native void getCString$(byte[] bytes);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getCString:(char *)bytes maxLength:(NSUInteger)maxLength NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "getCString:maxLength:")
    public native void getCString$maxLength$(byte[] bytes, @NSUInteger long maxLength);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getCString:(char *)bytes maxLength:(NSUInteger)maxLength range:(NSRange)aRange remainingRange:(NSRangePointer)leftoverRange NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "getCString:maxLength:range:remainingRange:")
    public native void getCString$maxLength$range$remainingRange$(byte[] bytes, @NSUInteger long maxLength, @ObjCByValue NSRange aRange, NSRange leftoverRange);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path atomically:(BOOL)useAuxiliaryFile NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "writeToFile:atomically:")
    public native boolean writeToFile$atomically$(NSString path, boolean useAuxiliaryFile);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url atomically:(BOOL)atomically NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "writeToURL:atomically:")
    public native boolean writeToURL$atomically$(NSURL url, boolean atomically);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfFile:(NSString *)path NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "initWithContentsOfFile:")
    public native NSString initWithContentsOfFile$(NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)initWithContentsOfURL:(NSURL *)url NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "initWithContentsOfURL:")
    public native NSString initWithContentsOfURL$(NSURL url);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)initWithCStringNoCopy:(char *)bytes length:(NSUInteger)length freeWhenDone:(BOOL)freeBuffer NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "initWithCStringNoCopy:length:freeWhenDone:")
    public native NSString initWithCStringNoCopy$length$freeWhenDone$(byte[] bytes, @NSUInteger long length, boolean freeBuffer);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)initWithCString:(const char *)bytes length:(NSUInteger)length NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "initWithCString:length:")
    public native NSString initWithCString$length$(byte[] bytes, @NSUInteger long length);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)initWithCString:(const char *)bytes NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "initWithCString:")
    public native NSString initWithCString$(byte[] bytes);

    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)getCharacters:(unichar *)buffer;", selector = "getCharacters:")
    public native void getCharacters$(@Unsigned short[] buffer);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (id)stringWithContentsOfFile:(NSString *)path NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "stringWithContentsOfFile:")
    public static native NSObject stringWithContentsOfFile$(NSString path);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (id)stringWithContentsOfURL:(NSURL *)url NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "stringWithContentsOfURL:")
    public static native NSObject stringWithContentsOfURL$(NSURL url);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (id)stringWithCString:(const char *)bytes length:(NSUInteger)length NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "stringWithCString:length:")
    public static native NSObject stringWithCString$length$(byte[] bytes, @NSUInteger long length);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 2.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSStringDeprecated", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (id)stringWithCString:(const char *)bytes NS_DEPRECATED(10_0, 10_4, 2_0, 2_0);", selector = "stringWithCString:")
    public static native NSObject stringWithCString$(byte[] bytes);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSArray *)pathComponents;", selector = "pathComponents")
    public native NSArray pathComponents();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)isAbsolutePath;", selector = "isAbsolutePath")
    public native boolean isAbsolutePath();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)lastPathComponent;", selector = "lastPathComponent")
    public native NSString lastPathComponent();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByDeletingLastPathComponent;", selector = "stringByDeletingLastPathComponent")
    public native NSString stringByDeletingLastPathComponent();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAppendingPathComponent:(NSString *)str;", selector = "stringByAppendingPathComponent:")
    public native NSString stringByAppendingPathComponent$(NSString str);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)pathExtension;", selector = "pathExtension")
    public native NSString pathExtension();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByDeletingPathExtension;", selector = "stringByDeletingPathExtension")
    public native NSString stringByDeletingPathExtension();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAppendingPathExtension:(NSString *)str;", selector = "stringByAppendingPathExtension:")
    public native NSString stringByAppendingPathExtension$(NSString str);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAbbreviatingWithTildeInPath;", selector = "stringByAbbreviatingWithTildeInPath")
    public native NSString stringByAbbreviatingWithTildeInPath();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByExpandingTildeInPath;", selector = "stringByExpandingTildeInPath")
    public native NSString stringByExpandingTildeInPath();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByStandardizingPath;", selector = "stringByStandardizingPath")
    public native NSString stringByStandardizingPath();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByResolvingSymlinksInPath;", selector = "stringByResolvingSymlinksInPath")
    public native NSString stringByResolvingSymlinksInPath();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSArray *)stringsByAppendingPaths:(NSArray *)paths;", selector = "stringsByAppendingPaths:")
    public native NSArray stringsByAppendingPaths$(NSArray paths);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSUInteger)completePathIntoString:(NSString **)outputName caseSensitive:(BOOL)flag matchesIntoArray:(NSArray **)outputArray filterTypes:(NSArray *)filterTypes;", selector = "completePathIntoString:caseSensitive:matchesIntoArray:filterTypes:")
    public native @NSUInteger long completePathIntoString$caseSensitive$matchesIntoArray$filterTypes$(ObjCPtr<NSString> outputName, boolean flag, ObjCPtr<NSArray> outputArray, NSArray filterTypes);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (__strong const char *)fileSystemRepresentation NS_RETURNS_INNER_POINTER;", selector = "fileSystemRepresentation")
    public native byte[] fileSystemRepresentation();

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "- (BOOL)getFileSystemRepresentation:(char *)cname maxLength:(NSUInteger)max;", selector = "getFileSystemRepresentation:maxLength:")
    public native boolean getFileSystemRepresentation$maxLength$(byte[] cname, @NSUInteger long max);

    @ObjCCategoryMethod(catname = "NSStringPathExtensions", catownername = "NSString")
    @ObjCMethodSign(sign = "+ (NSString *)pathWithComponents:(NSArray *)components;", selector = "pathWithComponents:")
    public static native NSString pathWithComponents$(NSArray components);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAddingPercentEncodingWithAllowedCharacters:(NSCharacterSet *)allowedCharacters NS_AVAILABLE(10_9, 7_0);", selector = "stringByAddingPercentEncodingWithAllowedCharacters:")
    public native NSString stringByAddingPercentEncodingWithAllowedCharacters$(NSCharacterSet allowedCharacters);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByRemovingPercentEncoding NS_AVAILABLE(10_9, 7_0);", selector = "stringByRemovingPercentEncoding")
    public native NSString stringByRemovingPercentEncoding();

    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByAddingPercentEscapesUsingEncoding:(NSStringEncoding)enc;", selector = "stringByAddingPercentEscapesUsingEncoding:")
    public native NSString stringByAddingPercentEscapesUsingEncoding$(NSStringEncoding enc);

    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)stringByReplacingPercentEscapesUsingEncoding:(NSStringEncoding)enc;", selector = "stringByReplacingPercentEscapesUsingEncoding:")
    public native NSString stringByReplacingPercentEscapesUsingEncoding$(NSStringEncoding enc);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLinguisticAnalysis", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSArray *)linguisticTagsInRange:(NSRange)range scheme:(NSString *)tagScheme options:(NSLinguisticTaggerOptions)opts orthography:(NSOrthography *)orthography tokenRanges:(NSArray **)tokenRanges NS_AVAILABLE(10_7, 5_0);", selector = "linguisticTagsInRange:scheme:options:orthography:tokenRanges:")
    public native NSArray linguisticTagsInRange$scheme$options$orthography$tokenRanges$(@ObjCByValue NSRange range, NSString tagScheme, NSLinguisticTaggerOptions opts, NSOrthography orthography, ObjCPtr<NSArray> tokenRanges);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLinguisticAnalysis", catownername = "NSString")
    @ObjCMethodSign(sign = "- (void)enumerateLinguisticTagsInRange:(NSRange)range scheme:(NSString *)tagScheme options:(NSLinguisticTaggerOptions)opts orthography:(NSOrthography *)orthography usingBlock:(void (^)(NSString *tag, NSRange tokenRange, NSRange sentenceRange, BOOL *stop))block NS_AVAILABLE(10_7, 5_0);", selector = "enumerateLinguisticTagsInRange:scheme:options:orthography:usingBlock:")
    public native void enumerateLinguisticTagsInRange$scheme$options$orthography$usingBlock$(@ObjCByValue NSRange range, NSString tagScheme, NSLinguisticTaggerOptions opts, NSOrthography orthography, ObjCBlock block);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSString initWithCoder$(NSCoder aDecoder);
}
