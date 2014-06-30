package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNumber extends NSValue  {
    
    public NSNumber() {}
    
    
    @ObjCMethodSign(sign = "- (char)charValue;", selector = "charValue")
    public native byte charValue();

    @ObjCMethodSign(sign = "- (unsigned char)unsignedCharValue;", selector = "unsignedCharValue")
    public native byte unsignedCharValue();

    @ObjCMethodSign(sign = "- (short)shortValue;", selector = "shortValue")
    public native short shortValue();

    @ObjCMethodSign(sign = "- (unsigned short)unsignedShortValue;", selector = "unsignedShortValue")
    public native @Unsigned short unsignedShortValue();

    @ObjCMethodSign(sign = "- (int)intValue;", selector = "intValue")
    public native int intValue();

    @ObjCMethodSign(sign = "- (unsigned int)unsignedIntValue;", selector = "unsignedIntValue")
    public native @Unsigned int unsignedIntValue();

    @ObjCMethodSign(sign = "- (long)longValue;", selector = "longValue")
    public native long longValue();

    @ObjCMethodSign(sign = "- (unsigned long)unsignedLongValue;", selector = "unsignedLongValue")
    public native @Unsigned long unsignedLongValue();

    @ObjCMethodSign(sign = "- (long long)longLongValue;", selector = "longLongValue")
    public native @LongLong long longLongValue();

    @ObjCMethodSign(sign = "- (unsigned long long)unsignedLongLongValue;", selector = "unsignedLongLongValue")
    public native @Unsigned @LongLong long unsignedLongLongValue();

    @ObjCMethodSign(sign = "- (float)floatValue;", selector = "floatValue")
    public native float floatValue();

    @ObjCMethodSign(sign = "- (double)doubleValue;", selector = "doubleValue")
    public native double doubleValue();

    @ObjCMethodSign(sign = "- (BOOL)boolValue;", selector = "boolValue")
    public native boolean boolValue();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)integerValue NS_AVAILABLE(10_5, 2_0);", selector = "integerValue")
    public native @NSInteger long integerValue();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)unsignedIntegerValue NS_AVAILABLE(10_5, 2_0);", selector = "unsignedIntegerValue")
    public native @NSUInteger long unsignedIntegerValue();

    @ObjCMethodSign(sign = "- (NSString *)stringValue;", selector = "stringValue")
    public native NSString stringValue();

    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSNumber *)otherNumber;", selector = "compare:")
    public native NSComparisonResult compare$(NSNumber otherNumber);

    @ObjCMethodSign(sign = "- (BOOL)isEqualToNumber:(NSNumber *)number;", selector = "isEqualToNumber:")
    public native boolean isEqualToNumber$(NSNumber number);

    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithChar:(char)value;", selector = "initWithChar:")
    public native NSNumber initWithChar$(byte value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedChar:(unsigned char)value;", selector = "initWithUnsignedChar:")
    public native NSNumber initWithUnsignedChar$(byte value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithShort:(short)value;", selector = "initWithShort:")
    public native NSNumber initWithShort$(short value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedShort:(unsigned short)value;", selector = "initWithUnsignedShort:")
    public native NSNumber initWithUnsignedShort$(@Unsigned short value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithInt:(int)value;", selector = "initWithInt:")
    public native NSNumber initWithInt$(int value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedInt:(unsigned int)value;", selector = "initWithUnsignedInt:")
    public native NSNumber initWithUnsignedInt$(@Unsigned int value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithLong:(long)value;", selector = "initWithLong:")
    public native NSNumber initWithLong$(long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedLong:(unsigned long)value;", selector = "initWithUnsignedLong:")
    public native NSNumber initWithUnsignedLong$(@Unsigned long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithLongLong:(long long)value;", selector = "initWithLongLong:")
    public native NSNumber initWithLongLong$(@LongLong long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedLongLong:(unsigned long long)value;", selector = "initWithUnsignedLongLong:")
    public native NSNumber initWithUnsignedLongLong$(@Unsigned @LongLong long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithFloat:(float)value;", selector = "initWithFloat:")
    public native NSNumber initWithFloat$(float value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithDouble:(double)value;", selector = "initWithDouble:")
    public native NSNumber initWithDouble$(double value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithBool:(BOOL)value;", selector = "initWithBool:")
    public native NSNumber initWithBool$(boolean value);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithInteger:(NSInteger)value NS_AVAILABLE(10_5, 2_0);", selector = "initWithInteger:")
    public native NSNumber initWithInteger$(@NSInteger long value);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (id)initWithUnsignedInteger:(NSUInteger)value NS_AVAILABLE(10_5, 2_0);", selector = "initWithUnsignedInteger:")
    public native NSNumber initWithUnsignedInteger$(@NSUInteger long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithChar:(char)value;", selector = "numberWithChar:")
    public static native NSNumber numberWithChar$(byte value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedChar:(unsigned char)value;", selector = "numberWithUnsignedChar:")
    public static native NSNumber numberWithUnsignedChar$(byte value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithShort:(short)value;", selector = "numberWithShort:")
    public static native NSNumber numberWithShort$(short value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedShort:(unsigned short)value;", selector = "numberWithUnsignedShort:")
    public static native NSNumber numberWithUnsignedShort$(@Unsigned short value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithInt:(int)value;", selector = "numberWithInt:")
    public static native NSNumber numberWithInt$(int value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedInt:(unsigned int)value;", selector = "numberWithUnsignedInt:")
    public static native NSNumber numberWithUnsignedInt$(@Unsigned int value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithLong:(long)value;", selector = "numberWithLong:")
    public static native NSNumber numberWithLong$(long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedLong:(unsigned long)value;", selector = "numberWithUnsignedLong:")
    public static native NSNumber numberWithUnsignedLong$(@Unsigned long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithLongLong:(long long)value;", selector = "numberWithLongLong:")
    public static native NSNumber numberWithLongLong$(@LongLong long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedLongLong:(unsigned long long)value;", selector = "numberWithUnsignedLongLong:")
    public static native NSNumber numberWithUnsignedLongLong$(@Unsigned @LongLong long value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithFloat:(float)value;", selector = "numberWithFloat:")
    public static native NSNumber numberWithFloat$(float value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithDouble:(double)value;", selector = "numberWithDouble:")
    public static native NSNumber numberWithDouble$(double value);

    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithBool:(BOOL)value;", selector = "numberWithBool:")
    public static native NSNumber numberWithBool$(boolean value);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithInteger:(NSInteger)value NS_AVAILABLE(10_5, 2_0);", selector = "numberWithInteger:")
    public static native NSNumber numberWithInteger$(@NSInteger long value);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSNumberCreation", catownername = "NSNumber")
    @ObjCMethodSign(sign = "+ (NSNumber *)numberWithUnsignedInteger:(NSUInteger)value NS_AVAILABLE(10_5, 2_0);", selector = "numberWithUnsignedInteger:")
    public static native NSNumber numberWithUnsignedInteger$(@NSUInteger long value);

    @ObjCCategoryMethod(catname = "NSDecimalNumberExtensions", catownername = "NSNumber")
    @ObjCMethodSign(sign = "- (NSDecimal)decimalValue;", selector = "decimalValue")
    public native @ObjCByValue NSDecimal decimalValue();
}
