package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSCalendarUnit {
    NSCalendarUnitEra($Foundation.NSCalendarUnitEra),
    NSCalendarUnitYear($Foundation.NSCalendarUnitYear),
    NSCalendarUnitMonth($Foundation.NSCalendarUnitMonth),
    NSCalendarUnitDay($Foundation.NSCalendarUnitDay),
    NSCalendarUnitHour($Foundation.NSCalendarUnitHour),
    NSCalendarUnitMinute($Foundation.NSCalendarUnitMinute),
    NSCalendarUnitSecond($Foundation.NSCalendarUnitSecond),
    NSCalendarUnitWeekday($Foundation.NSCalendarUnitWeekday),
    NSCalendarUnitWeekdayOrdinal($Foundation.NSCalendarUnitWeekdayOrdinal),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSCalendarUnitQuarter($Foundation.NSCalendarUnitQuarter),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSCalendarUnitWeekOfMonth($Foundation.NSCalendarUnitWeekOfMonth),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSCalendarUnitWeekOfYear($Foundation.NSCalendarUnitWeekOfYear),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSCalendarUnitYearForWeekOfYear($Foundation.NSCalendarUnitYearForWeekOfYear),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSCalendarUnitNanosecond($Foundation.NSCalendarUnitNanosecond),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSCalendarUnitCalendar($Foundation.NSCalendarUnitCalendar),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSCalendarUnitTimeZone($Foundation.NSCalendarUnitTimeZone),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSEraCalendarUnit($Foundation.NSEraCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSYearCalendarUnit($Foundation.NSYearCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSMonthCalendarUnit($Foundation.NSMonthCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSDayCalendarUnit($Foundation.NSDayCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSHourCalendarUnit($Foundation.NSHourCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSMinuteCalendarUnit($Foundation.NSMinuteCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSSecondCalendarUnit($Foundation.NSSecondCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSWeekCalendarUnit($Foundation.NSWeekCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSWeekdayCalendarUnit($Foundation.NSWeekdayCalendarUnit),
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSWeekdayOrdinalCalendarUnit($Foundation.NSWeekdayOrdinalCalendarUnit),
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSQuarterCalendarUnit($Foundation.NSQuarterCalendarUnit),
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSWeekOfMonthCalendarUnit($Foundation.NSWeekOfMonthCalendarUnit),
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSWeekOfYearCalendarUnit($Foundation.NSWeekOfYearCalendarUnit),
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSYearForWeekOfYearCalendarUnit($Foundation.NSYearForWeekOfYearCalendarUnit),
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSCalendarCalendarUnit($Foundation.NSCalendarCalendarUnit),
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSTimeZoneCalendarUnit($Foundation.NSTimeZoneCalendarUnit);

    private final long value;

    private NSCalendarUnit(long value) { this.value = value; }
}
