package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSScanner extends NSObject implements NSCopying {
    
    public NSScanner() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)string;", selector = "string")
    public native NSString string();

    @ObjCMethodSign(sign = "- (NSUInteger)scanLocation;", selector = "scanLocation")
    public native @NSUInteger long scanLocation();

    @ObjCMethodSign(sign = "- (void)setScanLocation:(NSUInteger)pos;", selector = "setScanLocation:")
    public native void setScanLocation(@NSUInteger long pos);

    @ObjCMethodSign(sign = "- (void)setCharactersToBeSkipped:(NSCharacterSet *)set;", selector = "setCharactersToBeSkipped:")
    public native void setCharactersToBeSkipped(NSCharacterSet set);

    @ObjCMethodSign(sign = "- (void)setCaseSensitive:(BOOL)flag;", selector = "setCaseSensitive:")
    public native void setCaseSensitive(boolean flag);

    @ObjCMethodSign(sign = "- (void)setLocale:(id)locale;", selector = "setLocale:")
    public native void setLocale(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (NSCharacterSet *)charactersToBeSkipped;", selector = "charactersToBeSkipped")
    public native NSCharacterSet charactersToBeSkipped();

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)caseSensitive;", selector = "caseSensitive")
    public native boolean caseSensitive();

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (id)locale;", selector = "locale")
    public native NSObject locale();

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanInt:(int *)result;", selector = "scanInt:")
    public native boolean scanInt$(int[] result);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanInteger:(NSInteger *)result NS_AVAILABLE(10_5, 2_0);", selector = "scanInteger:")
    public native boolean scanInteger$(@NSInteger long[] result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanLongLong:(long long *)result;", selector = "scanLongLong:")
    public native boolean scanLongLong$(@LongLong long[] result);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanUnsignedLongLong:(unsigned long long *)result NS_AVAILABLE(10_9, 7_0);", selector = "scanUnsignedLongLong:")
    public native boolean scanUnsignedLongLong$(@Unsigned @LongLong long[] result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanFloat:(float *)result;", selector = "scanFloat:")
    public native boolean scanFloat$(float[] result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanDouble:(double *)result;", selector = "scanDouble:")
    public native boolean scanDouble$(double[] result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanHexInt:(unsigned *)result;", selector = "scanHexInt:")
    public native boolean scanHexInt$(@Unsigned int[] result);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanHexLongLong:(unsigned long long *)result NS_AVAILABLE(10_5, 2_0);", selector = "scanHexLongLong:")
    public native boolean scanHexLongLong$(@Unsigned @LongLong long[] result);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanHexFloat:(float *)result NS_AVAILABLE(10_5, 2_0);", selector = "scanHexFloat:")
    public native boolean scanHexFloat$(float[] result);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanHexDouble:(double *)result NS_AVAILABLE(10_5, 2_0);", selector = "scanHexDouble:")
    public native boolean scanHexDouble$(double[] result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanString:(NSString *)string intoString:(NSString **)result;", selector = "scanString:intoString:")
    public native boolean scanString$intoString$(NSString string, ObjCPtr<NSString> result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanCharactersFromSet:(NSCharacterSet *)set intoString:(NSString **)result;", selector = "scanCharactersFromSet:intoString:")
    public native boolean scanCharactersFromSet$intoString$(NSCharacterSet set, ObjCPtr<NSString> result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanUpToString:(NSString *)string intoString:(NSString **)result;", selector = "scanUpToString:intoString:")
    public native boolean scanUpToString$intoString$(NSString string, ObjCPtr<NSString> result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanUpToCharactersFromSet:(NSCharacterSet *)set intoString:(NSString **)result;", selector = "scanUpToCharactersFromSet:intoString:")
    public native boolean scanUpToCharactersFromSet$intoString$(NSCharacterSet set, ObjCPtr<NSString> result);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)isAtEnd;", selector = "isAtEnd")
    public native boolean isAtEnd();

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (id)initWithString:(NSString *)string;", selector = "initWithString:")
    public native NSScanner initWithString$(NSString string);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "+ (id)scannerWithString:(NSString *)string;", selector = "scannerWithString:")
    public static native NSObject scannerWithString$(NSString string);

    @ObjCCategoryMethod(catname = "NSExtendedScanner", catownername = "NSScanner")
    @ObjCMethodSign(sign = "+ (id)localizedScannerWithString:(NSString *)string;", selector = "localizedScannerWithString:")
    public static native NSObject localizedScannerWithString$(NSString string);

    @ObjCCategoryMethod(catname = "NSDecimalNumberScanning", catownername = "NSScanner")
    @ObjCMethodSign(sign = "- (BOOL)scanDecimal:(NSDecimal *)dcm;", selector = "scanDecimal:")
    public native boolean scanDecimal$(NSDecimal dcm);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
