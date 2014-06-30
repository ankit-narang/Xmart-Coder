package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDateComponents extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSDateComponents() {}
    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSCalendar *)calendar NS_AVAILABLE(10_7, 4_0);", selector = "calendar")
    public native NSCalendar calendar();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSTimeZone *)timeZone NS_AVAILABLE(10_7, 4_0);", selector = "timeZone")
    public native NSTimeZone timeZone();

    @ObjCMethodSign(sign = "- (NSInteger)era;", selector = "era")
    public native @NSInteger long era();

    @ObjCMethodSign(sign = "- (NSInteger)year;", selector = "year")
    public native @NSInteger long year();

    @ObjCMethodSign(sign = "- (NSInteger)month;", selector = "month")
    public native @NSInteger long month();

    @ObjCMethodSign(sign = "- (NSInteger)day;", selector = "day")
    public native @NSInteger long day();

    @ObjCMethodSign(sign = "- (NSInteger)hour;", selector = "hour")
    public native @NSInteger long hour();

    @ObjCMethodSign(sign = "- (NSInteger)minute;", selector = "minute")
    public native @NSInteger long minute();

    @ObjCMethodSign(sign = "- (NSInteger)second;", selector = "second")
    public native @NSInteger long second();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)nanosecond NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "nanosecond")
    public native @NSInteger long nanosecond();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSInteger)week NS_CALENDAR_DEPRECATED(10_4, 10_9, 2_0, 7_0, \"Use weekOfMonth or weekOfYear, depending on which you mean\");", selector = "week")
    public native @NSInteger long week();

    @ObjCMethodSign(sign = "- (NSInteger)weekday;", selector = "weekday")
    public native @NSInteger long weekday();

    @ObjCMethodSign(sign = "- (NSInteger)weekdayOrdinal;", selector = "weekdayOrdinal")
    public native @NSInteger long weekdayOrdinal();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)quarter NS_AVAILABLE(10_6, 4_0);", selector = "quarter")
    public native @NSInteger long quarter();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)weekOfMonth NS_AVAILABLE(10_7, 5_0);", selector = "weekOfMonth")
    public native @NSInteger long weekOfMonth();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)weekOfYear NS_AVAILABLE(10_7, 5_0);", selector = "weekOfYear")
    public native @NSInteger long weekOfYear();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)yearForWeekOfYear NS_AVAILABLE(10_7, 5_0);", selector = "yearForWeekOfYear")
    public native @NSInteger long yearForWeekOfYear();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isLeapMonth NS_AVAILABLE(10_8, 6_0);", selector = "isLeapMonth")
    public native boolean isLeapMonth();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setCalendar:(NSCalendar *)cal NS_AVAILABLE(10_7, 4_0);", selector = "setCalendar:")
    public native void setCalendar(NSCalendar cal);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTimeZone:(NSTimeZone *)tz NS_AVAILABLE(10_7, 4_0);", selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone tz);

    @ObjCMethodSign(sign = "- (void)setEra:(NSInteger)v;", selector = "setEra:")
    public native void setEra(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setYear:(NSInteger)v;", selector = "setYear:")
    public native void setYear(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setMonth:(NSInteger)v;", selector = "setMonth:")
    public native void setMonth(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setDay:(NSInteger)v;", selector = "setDay:")
    public native void setDay(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setHour:(NSInteger)v;", selector = "setHour:")
    public native void setHour(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setMinute:(NSInteger)v;", selector = "setMinute:")
    public native void setMinute(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setSecond:(NSInteger)v;", selector = "setSecond:")
    public native void setSecond(@NSInteger long v);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setNanosecond:(NSInteger)value NS_AVAILABLE(10_7, __NSCALENDAR_COND_IOS_5_0);", selector = "setNanosecond:")
    public native void setNanosecond(@NSInteger long value);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)setWeek:(NSInteger)v NS_CALENDAR_DEPRECATED(10_4, 10_9, 2_0, 7_0, \"Use setWeekOfMonth: or setWeekOfYear:, depending on which you mean\");", selector = "setWeek:")
    public native void setWeek(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setWeekday:(NSInteger)v;", selector = "setWeekday:")
    public native void setWeekday(@NSInteger long v);

    @ObjCMethodSign(sign = "- (void)setWeekdayOrdinal:(NSInteger)v;", selector = "setWeekdayOrdinal:")
    public native void setWeekdayOrdinal(@NSInteger long v);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setQuarter:(NSInteger)v NS_AVAILABLE(10_6, 4_0);", selector = "setQuarter:")
    public native void setQuarter(@NSInteger long v);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setWeekOfMonth:(NSInteger)w NS_AVAILABLE(10_7, 5_0);", selector = "setWeekOfMonth:")
    public native void setWeekOfMonth(@NSInteger long w);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setWeekOfYear:(NSInteger)w NS_AVAILABLE(10_7, 5_0);", selector = "setWeekOfYear:")
    public native void setWeekOfYear(@NSInteger long w);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setYearForWeekOfYear:(NSInteger)y NS_AVAILABLE(10_7, 5_0);", selector = "setYearForWeekOfYear:")
    public native void setYearForWeekOfYear(@NSInteger long y);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setLeapMonth:(BOOL)lm NS_AVAILABLE(10_8, 6_0);", selector = "setLeapMonth:")
    public native void setLeapMonth(boolean lm);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)date NS_AVAILABLE(10_7, 4_0);", selector = "date")
    public native NSDate date();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSDateComponents initWithCoder$(NSCoder aDecoder);
}
