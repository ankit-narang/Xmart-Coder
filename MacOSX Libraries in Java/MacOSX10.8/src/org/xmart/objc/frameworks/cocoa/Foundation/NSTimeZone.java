package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSTimeZone extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSTimeZone() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (NSData *)data;", selector = "data")
    public native NSData data();

    @ObjCMethodSign(sign = "- (NSInteger)secondsFromGMTForDate:(NSDate *)aDate;", selector = "secondsFromGMTForDate:")
    public native @NSInteger long secondsFromGMTForDate$(NSDate aDate);

    @ObjCMethodSign(sign = "- (NSString *)abbreviationForDate:(NSDate *)aDate;", selector = "abbreviationForDate:")
    public native NSString abbreviationForDate$(NSDate aDate);

    @ObjCMethodSign(sign = "- (BOOL)isDaylightSavingTimeForDate:(NSDate *)aDate;", selector = "isDaylightSavingTimeForDate:")
    public native boolean isDaylightSavingTimeForDate$(NSDate aDate);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSTimeInterval)daylightSavingTimeOffsetForDate:(NSDate *)aDate NS_AVAILABLE(10_5, 2_0);", selector = "daylightSavingTimeOffsetForDate:")
    public native double daylightSavingTimeOffsetForDate$(NSDate aDate);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDate *)nextDaylightSavingTimeTransitionAfterDate:(NSDate *)aDate NS_AVAILABLE(10_5, 2_0);", selector = "nextDaylightSavingTimeTransitionAfterDate:")
    public native NSDate nextDaylightSavingTimeTransitionAfterDate$(NSDate aDate);

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSInteger)secondsFromGMT;", selector = "secondsFromGMT")
    public native @NSInteger long secondsFromGMT();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSString *)abbreviation;", selector = "abbreviation")
    public native NSString abbreviation();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (BOOL)isDaylightSavingTime;", selector = "isDaylightSavingTime")
    public native boolean isDaylightSavingTime();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSTimeInterval)daylightSavingTimeOffset NS_AVAILABLE(10_5, 2_0);", selector = "daylightSavingTimeOffset")
    public native double daylightSavingTimeOffset();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSDate *)nextDaylightSavingTimeTransition NS_AVAILABLE(10_5, 2_0);", selector = "nextDaylightSavingTimeTransition")
    public native NSDate nextDaylightSavingTimeTransition();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToTimeZone:(NSTimeZone *)aTimeZone;", selector = "isEqualToTimeZone:")
    public native boolean isEqualToTimeZone$(NSTimeZone aTimeZone);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (NSString *)localizedName:(NSTimeZoneNameStyle)style locale:(NSLocale *)locale NS_AVAILABLE(10_5, 2_0);", selector = "localizedName:locale:")
    public native NSString localizedName$locale$(NSTimeZoneNameStyle style, NSLocale locale);

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSTimeZone *)systemTimeZone;", selector = "systemTimeZone")
    public static native NSTimeZone systemTimeZone();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (void)resetSystemTimeZone;", selector = "resetSystemTimeZone")
    public static native void resetSystemTimeZone();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSTimeZone *)defaultTimeZone;", selector = "defaultTimeZone")
    public static native NSTimeZone defaultTimeZone();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (void)setDefaultTimeZone:(NSTimeZone *)aTimeZone;", selector = "setDefaultTimeZone:")
    public static native void setDefaultTimeZone(NSTimeZone aTimeZone);

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSTimeZone *)localTimeZone;", selector = "localTimeZone")
    public static native NSTimeZone localTimeZone();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSArray *)knownTimeZoneNames;", selector = "knownTimeZoneNames")
    public static native NSArray knownTimeZoneNames();

    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSDictionary *)abbreviationDictionary;", selector = "abbreviationDictionary")
    public static native NSDictionary abbreviationDictionary();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (void)setAbbreviationDictionary:(NSDictionary *)dict NS_AVAILABLE(10_6, 4_0);", selector = "setAbbreviationDictionary:")
    public static native void setAbbreviationDictionary(NSDictionary dict);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedTimeZone", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (NSString *)timeZoneDataVersion NS_AVAILABLE(10_6, 4_0);", selector = "timeZoneDataVersion")
    public static native NSString timeZoneDataVersion();

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (id)initWithName:(NSString *)tzName;", selector = "initWithName:")
    public native NSTimeZone initWithName$(NSString tzName);

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "- (id)initWithName:(NSString *)tzName data:(NSData *)aData;", selector = "initWithName:data:")
    public native NSTimeZone initWithName$data$(NSString tzName, NSData aData);

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (id)timeZoneWithName:(NSString *)tzName;", selector = "timeZoneWithName:")
    public static native NSObject timeZoneWithName$(NSString tzName);

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (id)timeZoneWithName:(NSString *)tzName data:(NSData *)aData;", selector = "timeZoneWithName:data:")
    public static native NSObject timeZoneWithName$data$(NSString tzName, NSData aData);

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (id)timeZoneForSecondsFromGMT:(NSInteger)seconds;", selector = "timeZoneForSecondsFromGMT:")
    public static native NSObject timeZoneForSecondsFromGMT$(@NSInteger long seconds);

    @ObjCCategoryMethod(catname = "NSTimeZoneCreation", catownername = "NSTimeZone")
    @ObjCMethodSign(sign = "+ (id)timeZoneWithAbbreviation:(NSString *)abbreviation;", selector = "timeZoneWithAbbreviation:")
    public static native NSObject timeZoneWithAbbreviation$(NSString abbreviation);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSTimeZone initWithCoder$(NSCoder aDecoder);
}
