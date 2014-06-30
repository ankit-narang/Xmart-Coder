package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNumberFormatter extends NSFormatter  {
    
    public NSNumberFormatter() {}
    
    
    @ObjCMethodSign(sign = "- (BOOL)getObjectValue:(out id *)obj forString:(NSString *)string range:(inout NSRange *)rangep error:(out NSError **)error;", selector = "getObjectValue:forString:range:error:")
    public native boolean getObjectValue$forString$range$error$(NSObject obj, NSString string, NSRange rangep, NSError[] error);

    @ObjCMethodSign(sign = "- (NSString *)stringFromNumber:(NSNumber *)number;", selector = "stringFromNumber:")
    public native NSString stringFromNumber$(NSNumber number);

    @ObjCMethodSign(sign = "- (NSNumber *)numberFromString:(NSString *)string;", selector = "numberFromString:")
    public native NSNumber numberFromString$(NSString string);

    @ObjCMethodSign(sign = "- (NSNumberFormatterStyle)numberStyle;", selector = "numberStyle")
    public native NSNumberFormatterStyle numberStyle();

    @ObjCMethodSign(sign = "- (void)setNumberStyle:(NSNumberFormatterStyle)style;", selector = "setNumberStyle:")
    public native void setNumberStyle(NSNumberFormatterStyle style);

    @ObjCMethodSign(sign = "- (NSLocale *)locale;", selector = "locale")
    public native NSLocale locale();

    @ObjCMethodSign(sign = "- (void)setLocale:(NSLocale *)locale;", selector = "setLocale:")
    public native void setLocale(NSLocale locale);

    @ObjCMethodSign(sign = "- (BOOL)generatesDecimalNumbers;", selector = "generatesDecimalNumbers")
    public native boolean generatesDecimalNumbers();

    @ObjCMethodSign(sign = "- (void)setGeneratesDecimalNumbers:(BOOL)b;", selector = "setGeneratesDecimalNumbers:")
    public native void setGeneratesDecimalNumbers(boolean b);

    @ObjCMethodSign(sign = "- (NSNumberFormatterBehavior)formatterBehavior;", selector = "formatterBehavior")
    public native NSNumberFormatterBehavior formatterBehavior();

    @ObjCMethodSign(sign = "- (void)setFormatterBehavior:(NSNumberFormatterBehavior)behavior;", selector = "setFormatterBehavior:")
    public native void setFormatterBehavior(NSNumberFormatterBehavior behavior);

    @ObjCMethodSign(sign = "- (NSString *)negativeFormat;", selector = "negativeFormat")
    public native NSString negativeFormat();

    @ObjCMethodSign(sign = "- (void)setNegativeFormat:(NSString *)format;", selector = "setNegativeFormat:")
    public native void setNegativeFormat(NSString format);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForNegativeValues;", selector = "textAttributesForNegativeValues")
    public native NSDictionary textAttributesForNegativeValues();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForNegativeValues:(NSDictionary *)newAttributes;", selector = "setTextAttributesForNegativeValues:")
    public native void setTextAttributesForNegativeValues(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)positiveFormat;", selector = "positiveFormat")
    public native NSString positiveFormat();

    @ObjCMethodSign(sign = "- (void)setPositiveFormat:(NSString *)format;", selector = "setPositiveFormat:")
    public native void setPositiveFormat(NSString format);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForPositiveValues;", selector = "textAttributesForPositiveValues")
    public native NSDictionary textAttributesForPositiveValues();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForPositiveValues:(NSDictionary *)newAttributes;", selector = "setTextAttributesForPositiveValues:")
    public native void setTextAttributesForPositiveValues(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (BOOL)allowsFloats;", selector = "allowsFloats")
    public native boolean allowsFloats();

    @ObjCMethodSign(sign = "- (void)setAllowsFloats:(BOOL)flag;", selector = "setAllowsFloats:")
    public native void setAllowsFloats(boolean flag);

    @ObjCMethodSign(sign = "- (NSString *)decimalSeparator;", selector = "decimalSeparator")
    public native NSString decimalSeparator();

    @ObjCMethodSign(sign = "- (void)setDecimalSeparator:(NSString *)string;", selector = "setDecimalSeparator:")
    public native void setDecimalSeparator(NSString string);

    @ObjCMethodSign(sign = "- (BOOL)alwaysShowsDecimalSeparator;", selector = "alwaysShowsDecimalSeparator")
    public native boolean alwaysShowsDecimalSeparator();

    @ObjCMethodSign(sign = "- (void)setAlwaysShowsDecimalSeparator:(BOOL)b;", selector = "setAlwaysShowsDecimalSeparator:")
    public native void setAlwaysShowsDecimalSeparator(boolean b);

    @ObjCMethodSign(sign = "- (NSString *)currencyDecimalSeparator;", selector = "currencyDecimalSeparator")
    public native NSString currencyDecimalSeparator();

    @ObjCMethodSign(sign = "- (void)setCurrencyDecimalSeparator:(NSString *)string;", selector = "setCurrencyDecimalSeparator:")
    public native void setCurrencyDecimalSeparator(NSString string);

    @ObjCMethodSign(sign = "- (BOOL)usesGroupingSeparator;", selector = "usesGroupingSeparator")
    public native boolean usesGroupingSeparator();

    @ObjCMethodSign(sign = "- (void)setUsesGroupingSeparator:(BOOL)b;", selector = "setUsesGroupingSeparator:")
    public native void setUsesGroupingSeparator(boolean b);

    @ObjCMethodSign(sign = "- (NSString *)groupingSeparator;", selector = "groupingSeparator")
    public native NSString groupingSeparator();

    @ObjCMethodSign(sign = "- (void)setGroupingSeparator:(NSString *)string;", selector = "setGroupingSeparator:")
    public native void setGroupingSeparator(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)zeroSymbol;", selector = "zeroSymbol")
    public native NSString zeroSymbol();

    @ObjCMethodSign(sign = "- (void)setZeroSymbol:(NSString *)string;", selector = "setZeroSymbol:")
    public native void setZeroSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForZero;", selector = "textAttributesForZero")
    public native NSDictionary textAttributesForZero();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForZero:(NSDictionary *)newAttributes;", selector = "setTextAttributesForZero:")
    public native void setTextAttributesForZero(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)nilSymbol;", selector = "nilSymbol")
    public native NSString nilSymbol();

    @ObjCMethodSign(sign = "- (void)setNilSymbol:(NSString *)string;", selector = "setNilSymbol:")
    public native void setNilSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForNil;", selector = "textAttributesForNil")
    public native NSDictionary textAttributesForNil();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForNil:(NSDictionary *)newAttributes;", selector = "setTextAttributesForNil:")
    public native void setTextAttributesForNil(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)notANumberSymbol;", selector = "notANumberSymbol")
    public native NSString notANumberSymbol();

    @ObjCMethodSign(sign = "- (void)setNotANumberSymbol:(NSString *)string;", selector = "setNotANumberSymbol:")
    public native void setNotANumberSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForNotANumber;", selector = "textAttributesForNotANumber")
    public native NSDictionary textAttributesForNotANumber();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForNotANumber:(NSDictionary *)newAttributes;", selector = "setTextAttributesForNotANumber:")
    public native void setTextAttributesForNotANumber(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)positiveInfinitySymbol;", selector = "positiveInfinitySymbol")
    public native NSString positiveInfinitySymbol();

    @ObjCMethodSign(sign = "- (void)setPositiveInfinitySymbol:(NSString *)string;", selector = "setPositiveInfinitySymbol:")
    public native void setPositiveInfinitySymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForPositiveInfinity;", selector = "textAttributesForPositiveInfinity")
    public native NSDictionary textAttributesForPositiveInfinity();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForPositiveInfinity:(NSDictionary *)newAttributes;", selector = "setTextAttributesForPositiveInfinity:")
    public native void setTextAttributesForPositiveInfinity(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)negativeInfinitySymbol;", selector = "negativeInfinitySymbol")
    public native NSString negativeInfinitySymbol();

    @ObjCMethodSign(sign = "- (void)setNegativeInfinitySymbol:(NSString *)string;", selector = "setNegativeInfinitySymbol:")
    public native void setNegativeInfinitySymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSDictionary *)textAttributesForNegativeInfinity;", selector = "textAttributesForNegativeInfinity")
    public native NSDictionary textAttributesForNegativeInfinity();

    @ObjCMethodSign(sign = "- (void)setTextAttributesForNegativeInfinity:(NSDictionary *)newAttributes;", selector = "setTextAttributesForNegativeInfinity:")
    public native void setTextAttributesForNegativeInfinity(NSDictionary newAttributes);

    @ObjCMethodSign(sign = "- (NSString *)positivePrefix;", selector = "positivePrefix")
    public native NSString positivePrefix();

    @ObjCMethodSign(sign = "- (void)setPositivePrefix:(NSString *)string;", selector = "setPositivePrefix:")
    public native void setPositivePrefix(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)positiveSuffix;", selector = "positiveSuffix")
    public native NSString positiveSuffix();

    @ObjCMethodSign(sign = "- (void)setPositiveSuffix:(NSString *)string;", selector = "setPositiveSuffix:")
    public native void setPositiveSuffix(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)negativePrefix;", selector = "negativePrefix")
    public native NSString negativePrefix();

    @ObjCMethodSign(sign = "- (void)setNegativePrefix:(NSString *)string;", selector = "setNegativePrefix:")
    public native void setNegativePrefix(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)negativeSuffix;", selector = "negativeSuffix")
    public native NSString negativeSuffix();

    @ObjCMethodSign(sign = "- (void)setNegativeSuffix:(NSString *)string;", selector = "setNegativeSuffix:")
    public native void setNegativeSuffix(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)currencyCode;", selector = "currencyCode")
    public native NSString currencyCode();

    @ObjCMethodSign(sign = "- (void)setCurrencyCode:(NSString *)string;", selector = "setCurrencyCode:")
    public native void setCurrencyCode(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)currencySymbol;", selector = "currencySymbol")
    public native NSString currencySymbol();

    @ObjCMethodSign(sign = "- (void)setCurrencySymbol:(NSString *)string;", selector = "setCurrencySymbol:")
    public native void setCurrencySymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)internationalCurrencySymbol;", selector = "internationalCurrencySymbol")
    public native NSString internationalCurrencySymbol();

    @ObjCMethodSign(sign = "- (void)setInternationalCurrencySymbol:(NSString *)string;", selector = "setInternationalCurrencySymbol:")
    public native void setInternationalCurrencySymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)percentSymbol;", selector = "percentSymbol")
    public native NSString percentSymbol();

    @ObjCMethodSign(sign = "- (void)setPercentSymbol:(NSString *)string;", selector = "setPercentSymbol:")
    public native void setPercentSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)perMillSymbol;", selector = "perMillSymbol")
    public native NSString perMillSymbol();

    @ObjCMethodSign(sign = "- (void)setPerMillSymbol:(NSString *)string;", selector = "setPerMillSymbol:")
    public native void setPerMillSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)minusSign;", selector = "minusSign")
    public native NSString minusSign();

    @ObjCMethodSign(sign = "- (void)setMinusSign:(NSString *)string;", selector = "setMinusSign:")
    public native void setMinusSign(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)plusSign;", selector = "plusSign")
    public native NSString plusSign();

    @ObjCMethodSign(sign = "- (void)setPlusSign:(NSString *)string;", selector = "setPlusSign:")
    public native void setPlusSign(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)exponentSymbol;", selector = "exponentSymbol")
    public native NSString exponentSymbol();

    @ObjCMethodSign(sign = "- (void)setExponentSymbol:(NSString *)string;", selector = "setExponentSymbol:")
    public native void setExponentSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSUInteger)groupingSize;", selector = "groupingSize")
    public native @NSUInteger long groupingSize();

    @ObjCMethodSign(sign = "- (void)setGroupingSize:(NSUInteger)number;", selector = "setGroupingSize:")
    public native void setGroupingSize(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSUInteger)secondaryGroupingSize;", selector = "secondaryGroupingSize")
    public native @NSUInteger long secondaryGroupingSize();

    @ObjCMethodSign(sign = "- (void)setSecondaryGroupingSize:(NSUInteger)number;", selector = "setSecondaryGroupingSize:")
    public native void setSecondaryGroupingSize(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSNumber *)multiplier;", selector = "multiplier")
    public native NSNumber multiplier();

    @ObjCMethodSign(sign = "- (void)setMultiplier:(NSNumber *)number;", selector = "setMultiplier:")
    public native void setMultiplier(NSNumber number);

    @ObjCMethodSign(sign = "- (NSUInteger)formatWidth;", selector = "formatWidth")
    public native @NSUInteger long formatWidth();

    @ObjCMethodSign(sign = "- (void)setFormatWidth:(NSUInteger)number;", selector = "setFormatWidth:")
    public native void setFormatWidth(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSString *)paddingCharacter;", selector = "paddingCharacter")
    public native NSString paddingCharacter();

    @ObjCMethodSign(sign = "- (void)setPaddingCharacter:(NSString *)string;", selector = "setPaddingCharacter:")
    public native void setPaddingCharacter(NSString string);

    @ObjCMethodSign(sign = "- (NSNumberFormatterPadPosition)paddingPosition;", selector = "paddingPosition")
    public native NSNumberFormatterPadPosition paddingPosition();

    @ObjCMethodSign(sign = "- (void)setPaddingPosition:(NSNumberFormatterPadPosition)position;", selector = "setPaddingPosition:")
    public native void setPaddingPosition(NSNumberFormatterPadPosition position);

    @ObjCMethodSign(sign = "- (NSNumberFormatterRoundingMode)roundingMode;", selector = "roundingMode")
    public native NSNumberFormatterRoundingMode roundingMode();

    @ObjCMethodSign(sign = "- (void)setRoundingMode:(NSNumberFormatterRoundingMode)mode;", selector = "setRoundingMode:")
    public native void setRoundingMode(NSNumberFormatterRoundingMode mode);

    @ObjCMethodSign(sign = "- (NSNumber *)roundingIncrement;", selector = "roundingIncrement")
    public native NSNumber roundingIncrement();

    @ObjCMethodSign(sign = "- (void)setRoundingIncrement:(NSNumber *)number;", selector = "setRoundingIncrement:")
    public native void setRoundingIncrement(NSNumber number);

    @ObjCMethodSign(sign = "- (NSUInteger)minimumIntegerDigits;", selector = "minimumIntegerDigits")
    public native @NSUInteger long minimumIntegerDigits();

    @ObjCMethodSign(sign = "- (void)setMinimumIntegerDigits:(NSUInteger)number;", selector = "setMinimumIntegerDigits:")
    public native void setMinimumIntegerDigits(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSUInteger)maximumIntegerDigits;", selector = "maximumIntegerDigits")
    public native @NSUInteger long maximumIntegerDigits();

    @ObjCMethodSign(sign = "- (void)setMaximumIntegerDigits:(NSUInteger)number;", selector = "setMaximumIntegerDigits:")
    public native void setMaximumIntegerDigits(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSUInteger)minimumFractionDigits;", selector = "minimumFractionDigits")
    public native @NSUInteger long minimumFractionDigits();

    @ObjCMethodSign(sign = "- (void)setMinimumFractionDigits:(NSUInteger)number;", selector = "setMinimumFractionDigits:")
    public native void setMinimumFractionDigits(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSUInteger)maximumFractionDigits;", selector = "maximumFractionDigits")
    public native @NSUInteger long maximumFractionDigits();

    @ObjCMethodSign(sign = "- (void)setMaximumFractionDigits:(NSUInteger)number;", selector = "setMaximumFractionDigits:")
    public native void setMaximumFractionDigits(@NSUInteger long number);

    @ObjCMethodSign(sign = "- (NSNumber *)minimum;", selector = "minimum")
    public native NSNumber minimum();

    @ObjCMethodSign(sign = "- (void)setMinimum:(NSNumber *)number;", selector = "setMinimum:")
    public native void setMinimum(NSNumber number);

    @ObjCMethodSign(sign = "- (NSNumber *)maximum;", selector = "maximum")
    public native NSNumber maximum();

    @ObjCMethodSign(sign = "- (void)setMaximum:(NSNumber *)number;", selector = "setMaximum:")
    public native void setMaximum(NSNumber number);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)currencyGroupingSeparator NS_AVAILABLE(10_5, 2_0);", selector = "currencyGroupingSeparator")
    public native NSString currencyGroupingSeparator();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setCurrencyGroupingSeparator:(NSString *)string NS_AVAILABLE(10_5, 2_0);", selector = "setCurrencyGroupingSeparator:")
    public native void setCurrencyGroupingSeparator(NSString string);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isLenient NS_AVAILABLE(10_5, 2_0);", selector = "isLenient")
    public native boolean isLenient();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setLenient:(BOOL)b NS_AVAILABLE(10_5, 2_0);", selector = "setLenient:")
    public native void setLenient(boolean b);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)usesSignificantDigits NS_AVAILABLE(10_5, 2_0);", selector = "usesSignificantDigits")
    public native boolean usesSignificantDigits();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setUsesSignificantDigits:(BOOL)b NS_AVAILABLE(10_5, 2_0);", selector = "setUsesSignificantDigits:")
    public native void setUsesSignificantDigits(boolean b);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)minimumSignificantDigits NS_AVAILABLE(10_5, 2_0);", selector = "minimumSignificantDigits")
    public native @NSUInteger long minimumSignificantDigits();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setMinimumSignificantDigits:(NSUInteger)number NS_AVAILABLE(10_5, 2_0);", selector = "setMinimumSignificantDigits:")
    public native void setMinimumSignificantDigits(@NSUInteger long number);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)maximumSignificantDigits NS_AVAILABLE(10_5, 2_0);", selector = "maximumSignificantDigits")
    public native @NSUInteger long maximumSignificantDigits();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setMaximumSignificantDigits:(NSUInteger)number NS_AVAILABLE(10_5, 2_0);", selector = "setMaximumSignificantDigits:")
    public native void setMaximumSignificantDigits(@NSUInteger long number);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isPartialStringValidationEnabled NS_AVAILABLE(10_5, 2_0);", selector = "isPartialStringValidationEnabled")
    public native boolean isPartialStringValidationEnabled();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setPartialStringValidationEnabled:(BOOL)b NS_AVAILABLE(10_5, 2_0);", selector = "setPartialStringValidationEnabled:")
    public native void setPartialStringValidationEnabled(boolean b);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSString *)localizedStringFromNumber:(NSNumber *)num numberStyle:(NSNumberFormatterStyle)nstyle NS_AVAILABLE(10_6, 4_0);", selector = "localizedStringFromNumber:numberStyle:")
    public static native NSString localizedStringFromNumber$numberStyle$(NSNumber num, NSNumberFormatterStyle nstyle);

    @ObjCMethodSign(sign = "+ (NSNumberFormatterBehavior)defaultFormatterBehavior;", selector = "defaultFormatterBehavior")
    public static native NSNumberFormatterBehavior defaultFormatterBehavior();

    @ObjCMethodSign(sign = "+ (void)setDefaultFormatterBehavior:(NSNumberFormatterBehavior)behavior;", selector = "setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(NSNumberFormatterBehavior behavior);
}
