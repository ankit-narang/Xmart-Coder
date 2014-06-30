package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDecimalNumber extends NSNumber  {
    
    public NSDecimalNumber() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithMantissa:(unsigned long long)mantissa exponent:(short)exponent isNegative:(BOOL)flag;", selector = "initWithMantissa:exponent:isNegative:")
    public native NSDecimalNumber initWithMantissa$exponent$isNegative$(@Unsigned @LongLong long mantissa, short exponent, boolean flag);

    @ObjCMethodSign(sign = "- (id)initWithDecimal:(NSDecimal)dcm;", selector = "initWithDecimal:")
    public native NSDecimalNumber initWithDecimal$(@ObjCByValue NSDecimal dcm);

    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)numberValue;", selector = "initWithString:")
    public native NSDecimalNumber initWithString$(NSString numberValue);

    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)numberValue locale:(id)locale;", selector = "initWithString:locale:")
    public native NSDecimalNumber initWithString$locale$(NSString numberValue, NSObject locale);

    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCMethodSign(sign = "- (NSDecimal)decimalValue;", selector = "decimalValue")
    public native @ObjCByValue NSDecimal decimalValue();

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByAdding:(NSDecimalNumber *)decimalNumber;", selector = "decimalNumberByAdding:")
    public native NSDecimalNumber decimalNumberByAdding$(NSDecimalNumber decimalNumber);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByAdding:(NSDecimalNumber *)decimalNumber withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByAdding:withBehavior:")
    public native NSDecimalNumber decimalNumberByAdding$withBehavior$(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberBySubtracting:(NSDecimalNumber *)decimalNumber;", selector = "decimalNumberBySubtracting:")
    public native NSDecimalNumber decimalNumberBySubtracting$(NSDecimalNumber decimalNumber);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberBySubtracting:(NSDecimalNumber *)decimalNumber withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberBySubtracting:withBehavior:")
    public native NSDecimalNumber decimalNumberBySubtracting$withBehavior$(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByMultiplyingBy:(NSDecimalNumber *)decimalNumber;", selector = "decimalNumberByMultiplyingBy:")
    public native NSDecimalNumber decimalNumberByMultiplyingBy$(NSDecimalNumber decimalNumber);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByMultiplyingBy:(NSDecimalNumber *)decimalNumber withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByMultiplyingBy:withBehavior:")
    public native NSDecimalNumber decimalNumberByMultiplyingBy$withBehavior$(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByDividingBy:(NSDecimalNumber *)decimalNumber;", selector = "decimalNumberByDividingBy:")
    public native NSDecimalNumber decimalNumberByDividingBy$(NSDecimalNumber decimalNumber);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByDividingBy:(NSDecimalNumber *)decimalNumber withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByDividingBy:withBehavior:")
    public native NSDecimalNumber decimalNumberByDividingBy$withBehavior$(NSDecimalNumber decimalNumber, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByRaisingToPower:(NSUInteger)power;", selector = "decimalNumberByRaisingToPower:")
    public native NSDecimalNumber decimalNumberByRaisingToPower$(@NSUInteger long power);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByRaisingToPower:(NSUInteger)power withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByRaisingToPower:withBehavior:")
    public native NSDecimalNumber decimalNumberByRaisingToPower$withBehavior$(@NSUInteger long power, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByMultiplyingByPowerOf10:(short)power;", selector = "decimalNumberByMultiplyingByPowerOf10:")
    public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10$(short power);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByMultiplyingByPowerOf10:(short)power withBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByMultiplyingByPowerOf10:withBehavior:")
    public native NSDecimalNumber decimalNumberByMultiplyingByPowerOf10$withBehavior$(short power, NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)decimalNumberByRoundingAccordingToBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "decimalNumberByRoundingAccordingToBehavior:")
    public native NSDecimalNumber decimalNumberByRoundingAccordingToBehavior$(NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSNumber *)decimalNumber;", selector = "compare:")
    public native NSComparisonResult compare$(NSNumber decimalNumber);

    @ObjCMethodSign(sign = "- (const char *)objCType NS_RETURNS_INNER_POINTER;", selector = "objCType")
    public native byte[] objCType();

    @ObjCMethodSign(sign = "- (double)doubleValue;", selector = "doubleValue")
    public native double doubleValue();

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)decimalNumberWithMantissa:(unsigned long long)mantissa exponent:(short)exponent isNegative:(BOOL)flag;", selector = "decimalNumberWithMantissa:exponent:isNegative:")
    public static native NSDecimalNumber decimalNumberWithMantissa$exponent$isNegative$(@Unsigned @LongLong long mantissa, short exponent, boolean flag);

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)decimalNumberWithDecimal:(NSDecimal)dcm;", selector = "decimalNumberWithDecimal:")
    public static native NSDecimalNumber decimalNumberWithDecimal$(@ObjCByValue NSDecimal dcm);

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)decimalNumberWithString:(NSString *)numberValue;", selector = "decimalNumberWithString:")
    public static native NSDecimalNumber decimalNumberWithString$(NSString numberValue);

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)decimalNumberWithString:(NSString *)numberValue locale:(id)locale;", selector = "decimalNumberWithString:locale:")
    public static native NSDecimalNumber decimalNumberWithString$locale$(NSString numberValue, NSObject locale);

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)zero;", selector = "zero")
    public static native NSDecimalNumber zero();

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)one;", selector = "one")
    public static native NSDecimalNumber one();

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)minimumDecimalNumber;", selector = "minimumDecimalNumber")
    public static native NSDecimalNumber minimumDecimalNumber();

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)maximumDecimalNumber;", selector = "maximumDecimalNumber")
    public static native NSDecimalNumber maximumDecimalNumber();

    @ObjCMethodSign(sign = "+ (NSDecimalNumber *)notANumber;", selector = "notANumber")
    public static native NSDecimalNumber notANumber();

    @ObjCMethodSign(sign = "+ (void)setDefaultBehavior:(id <NSDecimalNumberBehaviors>)behavior;", selector = "setDefaultBehavior:")
    public static native void setDefaultBehavior(NSDecimalNumberBehaviors behavior);

    @ObjCMethodSign(sign = "+ (id <NSDecimalNumberBehaviors>)defaultBehavior;", selector = "defaultBehavior")
    public static native NSDecimalNumberBehaviors defaultBehavior();
}
