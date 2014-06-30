package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDate extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSDate() {}
    
    
    @ObjCMethodSign(sign = "- (NSTimeInterval)timeIntervalSinceReferenceDate;", selector = "timeIntervalSinceReferenceDate")
    public native double timeIntervalSinceReferenceDate();

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSTimeInterval)timeIntervalSinceDate:(NSDate *)anotherDate;", selector = "timeIntervalSinceDate:")
    public native double timeIntervalSinceDate$(NSDate anotherDate);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSTimeInterval)timeIntervalSinceNow;", selector = "timeIntervalSinceNow")
    public native double timeIntervalSinceNow();

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSTimeInterval)timeIntervalSince1970;", selector = "timeIntervalSince1970")
    public native double timeIntervalSince1970();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 4.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (id)addTimeInterval:(NSTimeInterval)seconds NS_DEPRECATED(10_0, 10_6, 2_0, 4_0);", selector = "addTimeInterval:")
    public native NSObject addTimeInterval$(double seconds);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (id)dateByAddingTimeInterval:(NSTimeInterval)ti NS_AVAILABLE(10_6, 2_0);", selector = "dateByAddingTimeInterval:")
    public native NSObject dateByAddingTimeInterval$(double ti);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSDate *)earlierDate:(NSDate *)anotherDate;", selector = "earlierDate:")
    public native NSDate earlierDate$(NSDate anotherDate);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSDate *)laterDate:(NSDate *)anotherDate;", selector = "laterDate:")
    public native NSDate laterDate$(NSDate anotherDate);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSDate *)other;", selector = "compare:")
    public native NSComparisonResult compare$(NSDate other);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToDate:(NSDate *)otherDate;", selector = "isEqualToDate:")
    public native boolean isEqualToDate$(NSDate otherDate);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedDate", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (NSTimeInterval)timeIntervalSinceReferenceDate;", selector = "timeIntervalSinceReferenceDate")
    public static native double timeIntervalSinceReferenceDate__STATIC();

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSDate init();

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (instancetype)initWithTimeIntervalSinceReferenceDate:(NSTimeInterval)ti;", selector = "initWithTimeIntervalSinceReferenceDate:")
    public native NSDate initWithTimeIntervalSinceReferenceDate$(double ti);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (instancetype)initWithTimeIntervalSinceNow:(NSTimeInterval)secs;", selector = "initWithTimeIntervalSinceNow:")
    public native NSDate initWithTimeIntervalSinceNow$(double secs);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (instancetype)initWithTimeIntervalSince1970:(NSTimeInterval)secs;", selector = "initWithTimeIntervalSince1970:")
    public native NSDate initWithTimeIntervalSince1970$(double secs);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "- (instancetype)initWithTimeInterval:(NSTimeInterval)secsToBeAdded sinceDate:(NSDate *)date;", selector = "initWithTimeInterval:sinceDate:")
    public native NSDate initWithTimeInterval$sinceDate$(double secsToBeAdded, NSDate date);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (instancetype)date;", selector = "date")
    public static native NSDate date();

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (instancetype)dateWithTimeIntervalSinceNow:(NSTimeInterval)secs;", selector = "dateWithTimeIntervalSinceNow:")
    public static native NSDate dateWithTimeIntervalSinceNow$(double secs);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (instancetype)dateWithTimeIntervalSinceReferenceDate:(NSTimeInterval)ti;", selector = "dateWithTimeIntervalSinceReferenceDate:")
    public static native NSDate dateWithTimeIntervalSinceReferenceDate$(double ti);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (instancetype)dateWithTimeIntervalSince1970:(NSTimeInterval)secs;", selector = "dateWithTimeIntervalSince1970:")
    public static native NSDate dateWithTimeIntervalSince1970$(double secs);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (instancetype)dateWithTimeInterval:(NSTimeInterval)secsToBeAdded sinceDate:(NSDate *)date;", selector = "dateWithTimeInterval:sinceDate:")
    public static native NSDate dateWithTimeInterval$sinceDate$(double secsToBeAdded, NSDate date);

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (id /* NSDate * */)distantFuture;", selector = "distantFuture")
    public static native NSObject distantFuture();

    @ObjCCategoryMethod(catname = "NSDateCreation", catownername = "NSDate")
    @ObjCMethodSign(sign = "+ (id /* NSDate * */)distantPast;", selector = "distantPast")
    public static native NSObject distantPast();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSDate initWithCoder$(NSCoder aDecoder);
}
