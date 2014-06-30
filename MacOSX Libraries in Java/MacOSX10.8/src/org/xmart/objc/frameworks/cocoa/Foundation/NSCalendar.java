package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCalendar extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSCalendar() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithCalendarIdentifier:(NSString *)ident;", selector = "initWithCalendarIdentifier:")
    public native NSCalendar initWithCalendarIdentifier$(NSString ident);

    @ObjCMethodSign(sign = "- (NSString *)calendarIdentifier;", selector = "calendarIdentifier")
    public native NSString calendarIdentifier();

    @ObjCMethodSign(sign = "- (void)setLocale:(NSLocale *)locale;", selector = "setLocale:")
    public native void setLocale(NSLocale locale);

    @ObjCMethodSign(sign = "- (NSLocale *)locale;", selector = "locale")
    public native NSLocale locale();

    @ObjCMethodSign(sign = "- (void)setTimeZone:(NSTimeZone *)tz;", selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone tz);

    @ObjCMethodSign(sign = "- (NSTimeZone *)timeZone;", selector = "timeZone")
    public native NSTimeZone timeZone();

    @ObjCMethodSign(sign = "- (void)setFirstWeekday:(NSUInteger)weekday;", selector = "setFirstWeekday:")
    public native void setFirstWeekday(@NSUInteger long weekday);

    @ObjCMethodSign(sign = "- (NSUInteger)firstWeekday;", selector = "firstWeekday")
    public native @NSUInteger long firstWeekday();

    @ObjCMethodSign(sign = "- (void)setMinimumDaysInFirstWeek:(NSUInteger)mdw;", selector = "setMinimumDaysInFirstWeek:")
    public native void setMinimumDaysInFirstWeek(@NSUInteger long mdw);

    @ObjCMethodSign(sign = "- (NSUInteger)minimumDaysInFirstWeek;", selector = "minimumDaysInFirstWeek")
    public native @NSUInteger long minimumDaysInFirstWeek();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)eraSymbols      NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "eraSymbols")
    public native NSArray eraSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)longEraSymbols  NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "longEraSymbols")
    public native NSArray longEraSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)monthSymbols                    NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "monthSymbols")
    public native NSArray monthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortMonthSymbols               NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortMonthSymbols")
    public native NSArray shortMonthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortMonthSymbols           NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "veryShortMonthSymbols")
    public native NSArray veryShortMonthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneMonthSymbols          NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "standaloneMonthSymbols")
    public native NSArray standaloneMonthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneMonthSymbols     NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortStandaloneMonthSymbols")
    public native NSArray shortStandaloneMonthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortStandaloneMonthSymbols NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "veryShortStandaloneMonthSymbols")
    public native NSArray veryShortStandaloneMonthSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)weekdaySymbols                    NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "weekdaySymbols")
    public native NSArray weekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortWeekdaySymbols               NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortWeekdaySymbols")
    public native NSArray shortWeekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortWeekdaySymbols           NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "veryShortWeekdaySymbols")
    public native NSArray veryShortWeekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneWeekdaySymbols          NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "standaloneWeekdaySymbols")
    public native NSArray standaloneWeekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneWeekdaySymbols     NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortStandaloneWeekdaySymbols")
    public native NSArray shortStandaloneWeekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)veryShortStandaloneWeekdaySymbols NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "veryShortStandaloneWeekdaySymbols")
    public native NSArray veryShortStandaloneWeekdaySymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)quarterSymbols                 NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "quarterSymbols")
    public native NSArray quarterSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortQuarterSymbols            NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortQuarterSymbols")
    public native NSArray shortQuarterSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)standaloneQuarterSymbols       NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "standaloneQuarterSymbols")
    public native NSArray standaloneQuarterSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)shortStandaloneQuarterSymbols  NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "shortStandaloneQuarterSymbols")
    public native NSArray shortStandaloneQuarterSymbols();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)AMSymbol  NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "AMSymbol")
    public native NSString AMSymbol();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)PMSymbol  NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "PMSymbol")
    public native NSString PMSymbol();

    @ObjCMethodSign(sign = "- (NSRange)minimumRangeOfUnit:(NSCalendarUnit)unit;", selector = "minimumRangeOfUnit:")
    public native @ObjCByValue NSRange minimumRangeOfUnit$(NSCalendarUnit unit);

    @ObjCMethodSign(sign = "- (NSRange)maximumRangeOfUnit:(NSCalendarUnit)unit;", selector = "maximumRangeOfUnit:")
    public native @ObjCByValue NSRange maximumRangeOfUnit$(NSCalendarUnit unit);

    @ObjCMethodSign(sign = "- (NSRange)rangeOfUnit:(NSCalendarUnit)smaller inUnit:(NSCalendarUnit)larger forDate:(NSDate *)date;", selector = "rangeOfUnit:inUnit:forDate:")
    public native @ObjCByValue NSRange rangeOfUnit$inUnit$forDate$(NSCalendarUnit smaller, NSCalendarUnit larger, NSDate date);

    @ObjCMethodSign(sign = "- (NSUInteger)ordinalityOfUnit:(NSCalendarUnit)smaller inUnit:(NSCalendarUnit)larger forDate:(NSDate *)date;", selector = "ordinalityOfUnit:inUnit:forDate:")
    public native @NSUInteger long ordinalityOfUnit$inUnit$forDate$(NSCalendarUnit smaller, NSCalendarUnit larger, NSDate date);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)rangeOfUnit:(NSCalendarUnit)unit startDate:(NSDate **)datep interval:(NSTimeInterval *)tip forDate:(NSDate *)date NS_AVAILABLE(10_5, 2_0);", selector = "rangeOfUnit:startDate:interval:forDate:")
    public native boolean rangeOfUnit$startDate$interval$forDate$(NSCalendarUnit unit, NSDate[] datep, double[] tip, NSDate date);

    @ObjCMethodSign(sign = "- (NSDate *)dateFromComponents:(NSDateComponents *)comps;", selector = "dateFromComponents:")
    public native NSDate dateFromComponents$(NSDateComponents comps);

    @ObjCMethodSign(sign = "- (NSDateComponents *)components:(NSCalendarUnit)unitFlags fromDate:(NSDate *)date;", selector = "components:fromDate:")
    public native NSDateComponents components$fromDate$(NSCalendarUnit unitFlags, NSDate date);

    @ObjCMethodSign(sign = "- (NSDate *)dateByAddingComponents:(NSDateComponents *)comps toDate:(NSDate *)date options:(NSCalendarOptions)opts;", selector = "dateByAddingComponents:toDate:options:")
    public native NSDate dateByAddingComponents$toDate$options$(NSDateComponents comps, NSDate date, NSCalendarOptions opts);

    @ObjCMethodSign(sign = "- (NSDateComponents *)components:(NSCalendarUnit)unitFlags fromDate:(NSDate *)startingDate toDate:(NSDate *)resultDate options:(NSCalendarOptions)opts;", selector = "components:fromDate:toDate:options:")
    public native NSDateComponents components$fromDate$toDate$options$(NSCalendarUnit unitFlags, NSDate startingDate, NSDate resultDate, NSCalendarOptions opts);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)getEra:(out NSInteger *)eraValuePointer year:(out NSInteger *)yearValuePointer month:(out NSInteger *)monthValuePointer day:(out NSInteger *)dayValuePointer fromDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "getEra:year:month:day:fromDate:")
    public native void getEra$year$month$day$fromDate$(@NSInteger long[] eraValuePointer, @NSInteger long[] yearValuePointer, @NSInteger long[] monthValuePointer, @NSInteger long[] dayValuePointer, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)getEra:(out NSInteger *)eraValuePointer yearForWeekOfYear:(out NSInteger *)yearValuePointer weekOfYear:(out NSInteger *)weekValuePointer weekday:(out NSInteger *)weekdayValuePointer fromDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "getEra:yearForWeekOfYear:weekOfYear:weekday:fromDate:")
    public native void getEra$yearForWeekOfYear$weekOfYear$weekday$fromDate$(@NSInteger long[] eraValuePointer, @NSInteger long[] yearValuePointer, @NSInteger long[] weekValuePointer, @NSInteger long[] weekdayValuePointer, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)getHour:(out NSInteger *)hourValuePointer minute:(out NSInteger *)minuteValuePointer second:(out NSInteger *)secondValuePointer nanosecond:(out NSInteger *)nanosecondValuePointer fromDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "getHour:minute:second:nanosecond:fromDate:")
    public native void getHour$minute$second$nanosecond$fromDate$(@NSInteger long[] hourValuePointer, @NSInteger long[] minuteValuePointer, @NSInteger long[] secondValuePointer, @NSInteger long[] nanosecondValuePointer, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)component:(NSCalendarUnit)unit fromDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "component:fromDate:")
    public native @NSInteger long component$fromDate$(NSCalendarUnit unit, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)dateWithEra:(NSInteger)eraValue year:(NSInteger)yearValue month:(NSInteger)monthValue day:(NSInteger)dayValue hour:(NSInteger)hourValue minute:(NSInteger)minuteValue second:(NSInteger)secondValue nanosecond:(NSInteger)nanosecondValue NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "dateWithEra:year:month:day:hour:minute:second:nanosecond:")
    public native NSDate dateWithEra$year$month$day$hour$minute$second$nanosecond$(@NSInteger long eraValue, @NSInteger long yearValue, @NSInteger long monthValue, @NSInteger long dayValue, @NSInteger long hourValue, @NSInteger long minuteValue, @NSInteger long secondValue, @NSInteger long nanosecondValue);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)dateWithEra:(NSInteger)eraValue yearForWeekOfYear:(NSInteger)yearValue weekOfYear:(NSInteger)weekValue weekday:(NSInteger)weekdayValue hour:(NSInteger)hourValue minute:(NSInteger)minuteValue second:(NSInteger)secondValue nanosecond:(NSInteger)nanosecondValue NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "dateWithEra:yearForWeekOfYear:weekOfYear:weekday:hour:minute:second:nanosecond:")
    public native NSDate dateWithEra$yearForWeekOfYear$weekOfYear$weekday$hour$minute$second$nanosecond$(@NSInteger long eraValue, @NSInteger long yearValue, @NSInteger long weekValue, @NSInteger long weekdayValue, @NSInteger long hourValue, @NSInteger long minuteValue, @NSInteger long secondValue, @NSInteger long nanosecondValue);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)startOfDayForDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "startOfDayForDate:")
    public native NSDate startOfDayForDate$(NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDateComponents *)componentsInTimeZone:(NSTimeZone *)timezone fromDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "componentsInTimeZone:fromDate:")
    public native NSDateComponents componentsInTimeZone$fromDate$(NSTimeZone timezone, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSComparisonResult)compareDate:(NSDate *)date1 toDate:(NSDate *)date2 toUnitGranularity:(NSCalendarUnit)unit NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "compareDate:toDate:toUnitGranularity:")
    public native NSComparisonResult compareDate$toDate$toUnitGranularity$(NSDate date1, NSDate date2, NSCalendarUnit unit);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDate:(NSDate *)date1 equalToDate:(NSDate *)date2 toUnitGranularity:(NSCalendarUnit)unit NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDate:equalToDate:toUnitGranularity:")
    public native boolean isDate$equalToDate$toUnitGranularity$(NSDate date1, NSDate date2, NSCalendarUnit unit);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDate:(NSDate *)date1 inSameDayAsDate:(NSDate *)date2 NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDate:inSameDayAsDate:")
    public native boolean isDate$inSameDayAsDate$(NSDate date1, NSDate date2);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDateInToday:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDateInToday:")
    public native boolean isDateInToday$(NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDateInYesterday:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDateInYesterday:")
    public native boolean isDateInYesterday$(NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDateInTomorrow:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDateInTomorrow:")
    public native boolean isDateInTomorrow$(NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isDateInWeekend:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "isDateInWeekend:")
    public native boolean isDateInWeekend$(NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)rangeOfWeekendStartDate:(out NSDate **)datep interval:(out NSTimeInterval *)tip containingDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "rangeOfWeekendStartDate:interval:containingDate:")
    public native boolean rangeOfWeekendStartDate$interval$containingDate$(NSDate[] datep, double[] tip, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)nextWeekendStartDate:(out NSDate **)datep interval:(out NSTimeInterval *)tip options:(NSCalendarOptions)options afterDate:(NSDate *)date NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "nextWeekendStartDate:interval:options:afterDate:")
    public native boolean nextWeekendStartDate$interval$options$afterDate$(NSDate[] datep, double[] tip, NSCalendarOptions options, NSDate date);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDateComponents *)components:(NSCalendarUnit)unitFlags fromDateComponents:(NSDateComponents *)startingDateComp toDateComponents:(NSDateComponents *)resultDateComp options:(NSCalendarOptions)options NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "components:fromDateComponents:toDateComponents:options:")
    public native NSDateComponents components$fromDateComponents$toDateComponents$options$(NSCalendarUnit unitFlags, NSDateComponents startingDateComp, NSDateComponents resultDateComp, NSCalendarOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)dateByAddingUnit:(NSCalendarUnit)unit value:(NSInteger)value toDate:(NSDate *)date options:(NSCalendarOptions)options NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "dateByAddingUnit:value:toDate:options:")
    public native NSDate dateByAddingUnit$value$toDate$options$(NSCalendarUnit unit, @NSInteger long value, NSDate date, NSCalendarOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateDatesStartingAfterDate:(NSDate *)start matchingComponents:(NSDateComponents *)comps options:(NSCalendarOptions)opts usingBlock:(void (^)(NSDate *date, BOOL exactMatch, BOOL *stop))block NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "enumerateDatesStartingAfterDate:matchingComponents:options:usingBlock:")
    public native void enumerateDatesStartingAfterDate$matchingComponents$options$usingBlock$(NSDate start, NSDateComponents comps, NSCalendarOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)nextDateAfterDate:(NSDate *)date matchingComponents:(NSDateComponents *)comps options:(NSCalendarOptions)options NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "nextDateAfterDate:matchingComponents:options:")
    public native NSDate nextDateAfterDate$matchingComponents$options$(NSDate date, NSDateComponents comps, NSCalendarOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)nextDateAfterDate:(NSDate *)date matchingUnit:(NSCalendarUnit)unit value:(NSInteger)value options:(NSCalendarOptions)options NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "nextDateAfterDate:matchingUnit:value:options:")
    public native NSDate nextDateAfterDate$matchingUnit$value$options$(NSDate date, NSCalendarUnit unit, @NSInteger long value, NSCalendarOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)nextDateAfterDate:(NSDate *)date matchingHour:(NSInteger)hourValue minute:(NSInteger)minuteValue second:(NSInteger)secondValue options:(NSCalendarOptions)options NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "nextDateAfterDate:matchingHour:minute:second:options:")
    public native NSDate nextDateAfterDate$matchingHour$minute$second$options$(NSDate date, @NSInteger long hourValue, @NSInteger long minuteValue, @NSInteger long secondValue, NSCalendarOptions options);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)dateBySettingUnit:(NSCalendarUnit)unit value:(NSInteger)v ofDate:(NSDate *)date options:(NSCalendarOptions)opts NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "dateBySettingUnit:value:ofDate:options:")
    public native NSDate dateBySettingUnit$value$ofDate$options$(NSCalendarUnit unit, @NSInteger long v, NSDate date, NSCalendarOptions opts);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)dateBySettingHour:(NSInteger)h minute:(NSInteger)m second:(NSInteger)s ofDate:(NSDate *)date options:(NSCalendarOptions)opts NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "dateBySettingHour:minute:second:ofDate:options:")
    public native NSDate dateBySettingHour$minute$second$ofDate$options$(@NSInteger long h, @NSInteger long m, @NSInteger long s, NSDate date, NSCalendarOptions opts);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)date:(NSDate *)date matchesComponents:(NSDateComponents *)components NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "date:matchesComponents:")
    public native boolean date$matchesComponents$(NSDate date, NSDateComponents components);

    @ObjCMethodSign(sign = "+ (id)currentCalendar;", selector = "currentCalendar")
    public static native NSObject currentCalendar();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)autoupdatingCurrentCalendar NS_AVAILABLE(10_5, 2_0);", selector = "autoupdatingCurrentCalendar")
    public static native NSObject autoupdatingCurrentCalendar();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)calendarWithIdentifier:(NSString *)calendarIdentifierConstant NS_AVAILABLE(10_9, __NSCALENDAR_COND_IOS_7_0);", selector = "calendarWithIdentifier:")
    public static native NSObject calendarWithIdentifier$(NSString calendarIdentifierConstant);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSCalendar initWithCoder$(NSCoder aDecoder);
}
