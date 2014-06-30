package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSTextCheckingResult extends NSObject implements NSCopying, NSCoding {
    
    public NSTextCheckingResult() {}
    @ObjCPropertyGetter(selector = "resultType")
    public native NSTextCheckingType getResultType();
    @ObjCProperty public NSTextCheckingType resultType;

    @ObjCPropertyGetter(selector = "range")
    public native @ObjCByValue NSRange getRange();
    @ObjCProperty public @ObjCByValue NSRange range;

    @ObjCPropertyGetter(selector = "orthography")
    public native NSOrthography getOrthography();
    @ObjCProperty public NSOrthography orthography;

    @ObjCPropertyGetter(selector = "grammarDetails")
    public native NSArray getGrammarDetails();
    @ObjCProperty public NSArray grammarDetails;

    @ObjCPropertyGetter(selector = "date")
    public native NSDate getDate();
    @ObjCProperty public NSDate date;

    @ObjCPropertyGetter(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @ObjCProperty public NSTimeZone timeZone;

    @ObjCPropertyGetter(selector = "duration")
    public native double getDuration();
    @ObjCProperty public double duration;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "components")
    public native NSDictionary getComponents();
    @ObjCProperty public NSDictionary components;

    @ObjCPropertyGetter(selector = "URL")
    public native NSURL getURL();
    @ObjCProperty public NSURL URL;

    @ObjCPropertyGetter(selector = "replacementString")
    public native NSString getReplacementString();
    @ObjCProperty public NSString replacementString;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "alternativeStrings")
    public native NSArray getAlternativeStrings();
    @ObjCProperty public NSArray alternativeStrings;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "regularExpression")
    public native NSRegularExpression getRegularExpression();
    @ObjCProperty public NSRegularExpression regularExpression;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "phoneNumber")
    public native NSString getPhoneNumber();
    @ObjCProperty public NSString phoneNumber;

    @ObjCPropertyGetter(selector = "addressComponents")
    public native NSDictionary getAddressComponents();
    @ObjCProperty public NSDictionary addressComponents;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "numberOfRanges")
    public native @NSUInteger long getNumberOfRanges();
    @ObjCProperty public @NSUInteger long numberOfRanges;
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultOptional", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "- (NSRange)rangeAtIndex:(NSUInteger)idx NS_AVAILABLE(10_7, 4_0);", selector = "rangeAtIndex:")
    public native @ObjCByValue NSRange rangeAtIndex$(@NSUInteger long idx);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultOptional", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "- (NSTextCheckingResult *)resultByAdjustingRangesWithOffset:(NSInteger)offset NS_AVAILABLE(10_7, 5_0);", selector = "resultByAdjustingRangesWithOffset:")
    public native NSTextCheckingResult resultByAdjustingRangesWithOffset$(@NSInteger long offset);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)orthographyCheckingResultWithRange:(NSRange)range orthography:(NSOrthography *)orthography;", selector = "orthographyCheckingResultWithRange:orthography:")
    public static native NSTextCheckingResult orthographyCheckingResultWithRange$orthography$(@ObjCByValue NSRange range, NSOrthography orthography);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)spellCheckingResultWithRange:(NSRange)range;", selector = "spellCheckingResultWithRange:")
    public static native NSTextCheckingResult spellCheckingResultWithRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)grammarCheckingResultWithRange:(NSRange)range details:(NSArray *)details;", selector = "grammarCheckingResultWithRange:details:")
    public static native NSTextCheckingResult grammarCheckingResultWithRange$details$(@ObjCByValue NSRange range, NSArray details);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)dateCheckingResultWithRange:(NSRange)range date:(NSDate *)date;", selector = "dateCheckingResultWithRange:date:")
    public static native NSTextCheckingResult dateCheckingResultWithRange$date$(@ObjCByValue NSRange range, NSDate date);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)dateCheckingResultWithRange:(NSRange)range date:(NSDate *)date timeZone:(NSTimeZone *)timeZone duration:(NSTimeInterval)duration;", selector = "dateCheckingResultWithRange:date:timeZone:duration:")
    public static native NSTextCheckingResult dateCheckingResultWithRange$date$timeZone$duration$(@ObjCByValue NSRange range, NSDate date, NSTimeZone timeZone, double duration);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)addressCheckingResultWithRange:(NSRange)range components:(NSDictionary *)components;", selector = "addressCheckingResultWithRange:components:")
    public static native NSTextCheckingResult addressCheckingResultWithRange$components$(@ObjCByValue NSRange range, NSDictionary components);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)linkCheckingResultWithRange:(NSRange)range URL:(NSURL *)url;", selector = "linkCheckingResultWithRange:URL:")
    public static native NSTextCheckingResult linkCheckingResultWithRange$URL$(@ObjCByValue NSRange range, NSURL url);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)quoteCheckingResultWithRange:(NSRange)range replacementString:(NSString *)replacementString;", selector = "quoteCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult quoteCheckingResultWithRange$replacementString$(@ObjCByValue NSRange range, NSString replacementString);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)dashCheckingResultWithRange:(NSRange)range replacementString:(NSString *)replacementString;", selector = "dashCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult dashCheckingResultWithRange$replacementString$(@ObjCByValue NSRange range, NSString replacementString);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)replacementCheckingResultWithRange:(NSRange)range replacementString:(NSString *)replacementString;", selector = "replacementCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult replacementCheckingResultWithRange$replacementString$(@ObjCByValue NSRange range, NSString replacementString);

    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)correctionCheckingResultWithRange:(NSRange)range replacementString:(NSString *)replacementString;", selector = "correctionCheckingResultWithRange:replacementString:")
    public static native NSTextCheckingResult correctionCheckingResultWithRange$replacementString$(@ObjCByValue NSRange range, NSString replacementString);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)correctionCheckingResultWithRange:(NSRange)range replacementString:(NSString *)replacementString alternativeStrings:(NSArray *)alternativeStrings     NS_AVAILABLE(10_9, 7_0);", selector = "correctionCheckingResultWithRange:replacementString:alternativeStrings:")
    public static native NSTextCheckingResult correctionCheckingResultWithRange$replacementString$alternativeStrings$(@ObjCByValue NSRange range, NSString replacementString, NSArray alternativeStrings);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)regularExpressionCheckingResultWithRanges:(NSRangePointer)ranges count:(NSUInteger)count regularExpression:(NSRegularExpression *)regularExpression   NS_AVAILABLE(10_7, 4_0);", selector = "regularExpressionCheckingResultWithRanges:count:regularExpression:")
    public static native NSTextCheckingResult regularExpressionCheckingResultWithRanges$count$regularExpression$(NSRange ranges, @NSUInteger long count, NSRegularExpression regularExpression);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)phoneNumberCheckingResultWithRange:(NSRange)range phoneNumber:(NSString *)phoneNumber             NS_AVAILABLE(10_7, 4_0);", selector = "phoneNumberCheckingResultWithRange:phoneNumber:")
    public static native NSTextCheckingResult phoneNumberCheckingResultWithRange$phoneNumber$(@ObjCByValue NSRange range, NSString phoneNumber);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSTextCheckingResultCreation", catownername = "NSTextCheckingResult")
    @ObjCMethodSign(sign = "+ (NSTextCheckingResult *)transitInformationCheckingResultWithRange:(NSRange)range components:(NSDictionary *)components    NS_AVAILABLE(10_7, 4_0);", selector = "transitInformationCheckingResultWithRange:components:")
    public static native NSTextCheckingResult transitInformationCheckingResultWithRange$components$(@ObjCByValue NSRange range, NSDictionary components);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSTextCheckingResult initWithCoder$(NSCoder aDecoder);
}
