package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDateFormatter extends NSFormatter  {
    
    public NSDateFormatter() {}
    
    
    @ObjCMethodSign(sign = "- (BOOL)getObjectValue:(out id *)obj forString:(NSString *)string range:(inout NSRange *)rangep error:(out NSError **)error;", selector = "getObjectValue:forString:range:error:")
    public native boolean getObjectValue$forString$range$error$(NSObject obj, NSString string, NSRange rangep, NSError[] error);

    @ObjCMethodSign(sign = "- (NSString *)stringFromDate:(NSDate *)date;", selector = "stringFromDate:")
    public native NSString stringFromDate$(NSDate date);

    @ObjCMethodSign(sign = "- (NSDate *)dateFromString:(NSString *)string;", selector = "dateFromString:")
    public native NSDate dateFromString$(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)dateFormat;", selector = "dateFormat")
    public native NSString dateFormat();

    @ObjCMethodSign(sign = "- (NSDateFormatterStyle)dateStyle;", selector = "dateStyle")
    public native NSDateFormatterStyle dateStyle();

    @ObjCMethodSign(sign = "- (void)setDateStyle:(NSDateFormatterStyle)style;", selector = "setDateStyle:")
    public native void setDateStyle(NSDateFormatterStyle style);

    @ObjCMethodSign(sign = "- (NSDateFormatterStyle)timeStyle;", selector = "timeStyle")
    public native NSDateFormatterStyle timeStyle();

    @ObjCMethodSign(sign = "- (void)setTimeStyle:(NSDateFormatterStyle)style;", selector = "setTimeStyle:")
    public native void setTimeStyle(NSDateFormatterStyle style);

    @ObjCMethodSign(sign = "- (NSLocale *)locale;", selector = "locale")
    public native NSLocale locale();

    @ObjCMethodSign(sign = "- (void)setLocale:(NSLocale *)locale;", selector = "setLocale:")
    public native void setLocale(NSLocale locale);

    @ObjCMethodSign(sign = "- (BOOL)generatesCalendarDates;", selector = "generatesCalendarDates")
    public native boolean generatesCalendarDates();

    @ObjCMethodSign(sign = "- (void)setGeneratesCalendarDates:(BOOL)b;", selector = "setGeneratesCalendarDates:")
    public native void setGeneratesCalendarDates(boolean b);

    @ObjCMethodSign(sign = "- (NSDateFormatterBehavior)formatterBehavior;", selector = "formatterBehavior")
    public native NSDateFormatterBehavior formatterBehavior();

    @ObjCMethodSign(sign = "- (void)setFormatterBehavior:(NSDateFormatterBehavior)behavior;", selector = "setFormatterBehavior:")
    public native void setFormatterBehavior(NSDateFormatterBehavior behavior);

    @ObjCMethodSign(sign = "- (void)setDateFormat:(NSString *)string;", selector = "setDateFormat:")
    public native void setDateFormat(NSString string);

    @ObjCMethodSign(sign = "- (NSTimeZone *)timeZone;", selector = "timeZone")
    public native NSTimeZone timeZone();

    @ObjCMethodSign(sign = "- (void)setTimeZone:(NSTimeZone *)tz;", selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone tz);

    @ObjCMethodSign(sign = "- (NSCalendar *)calendar;", selector = "calendar")
    public native NSCalendar calendar();

    @ObjCMethodSign(sign = "- (void)setCalendar:(NSCalendar *)calendar;", selector = "setCalendar:")
    public native void setCalendar(NSCalendar calendar);

    @ObjCMethodSign(sign = "- (BOOL)isLenient;", selector = "isLenient")
    public native boolean isLenient();

    @ObjCMethodSign(sign = "- (void)setLenient:(BOOL)b;", selector = "setLenient:")
    public native void setLenient(boolean b);

    @ObjCMethodSign(sign = "- (NSDate *)twoDigitStartDate;", selector = "twoDigitStartDate")
    public native NSDate twoDigitStartDate();

    @ObjCMethodSign(sign = "- (void)setTwoDigitStartDate:(NSDate *)date;", selector = "setTwoDigitStartDate:")
    public native void setTwoDigitStartDate(NSDate date);

    @ObjCMethodSign(sign = "- (NSDate *)defaultDate;", selector = "defaultDate")
    public native NSDate defaultDate();

    @ObjCMethodSign(sign = "- (void)setDefaultDate:(NSDate *)date;", selector = "setDefaultDate:")
    public native void setDefaultDate(NSDate date);

    @ObjCMethodSign(sign = "- (NSArray *)eraSymbols;", selector = "eraSymbols")
    public native NSArray eraSymbols();

    @ObjCMethodSign(sign = "- (void)setEraSymbols:(NSArray *)array;", selector = "setEraSymbols:")
    public native void setEraSymbols(NSArray array);

    @ObjCMethodSign(sign = "- (NSArray *)monthSymbols;", selector = "monthSymbols")
    public native NSArray monthSymbols();

    @ObjCMethodSign(sign = "- (void)setMonthSymbols:(NSArray *)array;", selector = "setMonthSymbols:")
    public native void setMonthSymbols(NSArray array);

    @ObjCMethodSign(sign = "- (NSArray *)shortMonthSymbols;", selector = "shortMonthSymbols")
    public native NSArray shortMonthSymbols();

    @ObjCMethodSign(sign = "- (void)setShortMonthSymbols:(NSArray *)array;", selector = "setShortMonthSymbols:")
    public native void setShortMonthSymbols(NSArray array);

    @ObjCMethodSign(sign = "- (NSArray *)weekdaySymbols;", selector = "weekdaySymbols")
    public native NSArray weekdaySymbols();

    @ObjCMethodSign(sign = "- (void)setWeekdaySymbols:(NSArray *)array;", selector = "setWeekdaySymbols:")
    public native void setWeekdaySymbols(NSArray array);

    @ObjCMethodSign(sign = "- (NSArray *)shortWeekdaySymbols;", selector = "shortWeekdaySymbols")
    public native NSArray shortWeekdaySymbols();

    @ObjCMethodSign(sign = "- (void)setShortWeekdaySymbols:(NSArray *)array;", selector = "setShortWeekdaySymbols:")
    public native void setShortWeekdaySymbols(NSArray array);

    @ObjCMethodSign(sign = "- (NSString *)AMSymbol;", selector = "AMSymbol")
    public native NSString AMSymbol();

    @ObjCMethodSign(sign = "- (void)setAMSymbol:(NSString *)string;", selector = "setAMSymbol:")
    public native void setAMSymbol(NSString string);

    @ObjCMethodSign(sign = "- (NSString *)PMSymbol;", selector = "PMSymbol")
    public native NSString PMSymbol();

    @ObjCMethodSign(sign = "- (void)setPMSymbol:(NSString *)string;", selector = "setPMSymbol:")
    public native void setPMSymbol(NSString string);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)longEraSymbols NS_AVAILABLE(10_5, 2_0);", selector = "longEraSymbols")
    public native NSArray longEraSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setLongEraSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setLongEraSymbols:")
    public native void setLongEraSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortMonthSymbols NS_AVAILABLE(10_5, 2_0);", selector = "veryShortMonthSymbols")
    public native NSArray veryShortMonthSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setVeryShortMonthSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setVeryShortMonthSymbols:")
    public native void setVeryShortMonthSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneMonthSymbols NS_AVAILABLE(10_5, 2_0);", selector = "standaloneMonthSymbols")
    public native NSArray standaloneMonthSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setStandaloneMonthSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setStandaloneMonthSymbols:")
    public native void setStandaloneMonthSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneMonthSymbols NS_AVAILABLE(10_5, 2_0);", selector = "shortStandaloneMonthSymbols")
    public native NSArray shortStandaloneMonthSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShortStandaloneMonthSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setShortStandaloneMonthSymbols:")
    public native void setShortStandaloneMonthSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortStandaloneMonthSymbols NS_AVAILABLE(10_5, 2_0);", selector = "veryShortStandaloneMonthSymbols")
    public native NSArray veryShortStandaloneMonthSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setVeryShortStandaloneMonthSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setVeryShortStandaloneMonthSymbols:")
    public native void setVeryShortStandaloneMonthSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortWeekdaySymbols NS_AVAILABLE(10_5, 2_0);", selector = "veryShortWeekdaySymbols")
    public native NSArray veryShortWeekdaySymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setVeryShortWeekdaySymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setVeryShortWeekdaySymbols:")
    public native void setVeryShortWeekdaySymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneWeekdaySymbols NS_AVAILABLE(10_5, 2_0);", selector = "standaloneWeekdaySymbols")
    public native NSArray standaloneWeekdaySymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setStandaloneWeekdaySymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setStandaloneWeekdaySymbols:")
    public native void setStandaloneWeekdaySymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneWeekdaySymbols NS_AVAILABLE(10_5, 2_0);", selector = "shortStandaloneWeekdaySymbols")
    public native NSArray shortStandaloneWeekdaySymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShortStandaloneWeekdaySymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setShortStandaloneWeekdaySymbols:")
    public native void setShortStandaloneWeekdaySymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortStandaloneWeekdaySymbols NS_AVAILABLE(10_5, 2_0);", selector = "veryShortStandaloneWeekdaySymbols")
    public native NSArray veryShortStandaloneWeekdaySymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setVeryShortStandaloneWeekdaySymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setVeryShortStandaloneWeekdaySymbols:")
    public native void setVeryShortStandaloneWeekdaySymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)quarterSymbols NS_AVAILABLE(10_5, 2_0);", selector = "quarterSymbols")
    public native NSArray quarterSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setQuarterSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setQuarterSymbols:")
    public native void setQuarterSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortQuarterSymbols NS_AVAILABLE(10_5, 2_0);", selector = "shortQuarterSymbols")
    public native NSArray shortQuarterSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShortQuarterSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setShortQuarterSymbols:")
    public native void setShortQuarterSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneQuarterSymbols NS_AVAILABLE(10_5, 2_0);", selector = "standaloneQuarterSymbols")
    public native NSArray standaloneQuarterSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setStandaloneQuarterSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setStandaloneQuarterSymbols:")
    public native void setStandaloneQuarterSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneQuarterSymbols NS_AVAILABLE(10_5, 2_0);", selector = "shortStandaloneQuarterSymbols")
    public native NSArray shortStandaloneQuarterSymbols();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShortStandaloneQuarterSymbols:(NSArray *)array NS_AVAILABLE(10_5, 2_0);", selector = "setShortStandaloneQuarterSymbols:")
    public native void setShortStandaloneQuarterSymbols(NSArray array);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)gregorianStartDate NS_AVAILABLE(10_5, 2_0);", selector = "gregorianStartDate")
    public native NSDate gregorianStartDate();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setGregorianStartDate:(NSDate *)date NS_AVAILABLE(10_5, 2_0);", selector = "setGregorianStartDate:")
    public native void setGregorianStartDate(NSDate date);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)doesRelativeDateFormatting NS_AVAILABLE(10_6, 4_0);", selector = "doesRelativeDateFormatting")
    public native boolean doesRelativeDateFormatting();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDoesRelativeDateFormatting:(BOOL)b NS_AVAILABLE(10_6, 4_0);", selector = "setDoesRelativeDateFormatting:")
    public native void setDoesRelativeDateFormatting(boolean b);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSString *)localizedStringFromDate:(NSDate *)date dateStyle:(NSDateFormatterStyle)dstyle timeStyle:(NSDateFormatterStyle)tstyle NS_AVAILABLE(10_6, 4_0);", selector = "localizedStringFromDate:dateStyle:timeStyle:")
    public static native NSString localizedStringFromDate$dateStyle$timeStyle$(NSDate date, NSDateFormatterStyle dstyle, NSDateFormatterStyle tstyle);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSString *)dateFormatFromTemplate:(NSString *)tmplate options:(NSUInteger)opts locale:(NSLocale *)locale NS_AVAILABLE(10_6, 4_0);", selector = "dateFormatFromTemplate:options:locale:")
    public static native NSString dateFormatFromTemplate$options$locale$(NSString tmplate, @NSUInteger long opts, NSLocale locale);

    @ObjCMethodSign(sign = "+ (NSDateFormatterBehavior)defaultFormatterBehavior;", selector = "defaultFormatterBehavior")
    public static native NSDateFormatterBehavior defaultFormatterBehavior();

    @ObjCMethodSign(sign = "+ (void)setDefaultFormatterBehavior:(NSDateFormatterBehavior)behavior;", selector = "setDefaultFormatterBehavior:")
    public static native void setDefaultFormatterBehavior(NSDateFormatterBehavior behavior);
}
