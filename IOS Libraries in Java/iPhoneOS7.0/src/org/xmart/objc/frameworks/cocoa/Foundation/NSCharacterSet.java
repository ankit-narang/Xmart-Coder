package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCharacterSet extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    
    public NSCharacterSet() {}
    
    
    @ObjCMethodSign(sign = "- (BOOL)characterIsMember:(unichar)aCharacter;", selector = "characterIsMember:")
    public native boolean characterIsMember$(@Unsigned short aCharacter);

    @ObjCMethodSign(sign = "- (NSData *)bitmapRepresentation;", selector = "bitmapRepresentation")
    public native NSData bitmapRepresentation();

    @ObjCMethodSign(sign = "- (NSCharacterSet *)invertedSet;", selector = "invertedSet")
    public native NSCharacterSet invertedSet();

    @ObjCMethodSign(sign = "- (BOOL)longCharacterIsMember:(UTF32Char)theLongChar;", selector = "longCharacterIsMember:")
    public native boolean longCharacterIsMember$(@UTF32Char int theLongChar);

    @ObjCMethodSign(sign = "- (BOOL)isSupersetOfSet:(NSCharacterSet *)theOtherSet;", selector = "isSupersetOfSet:")
    public native boolean isSupersetOfSet$(NSCharacterSet theOtherSet);

    @ObjCMethodSign(sign = "- (BOOL)hasMemberInPlane:(uint8_t)thePlane;", selector = "hasMemberInPlane:")
    public native boolean hasMemberInPlane$(@Uint8 byte thePlane);

    @ObjCMethodSign(sign = "+ (id)controlCharacterSet;", selector = "controlCharacterSet")
    public static native NSObject controlCharacterSet();

    @ObjCMethodSign(sign = "+ (id)whitespaceCharacterSet;", selector = "whitespaceCharacterSet")
    public static native NSObject whitespaceCharacterSet();

    @ObjCMethodSign(sign = "+ (id)whitespaceAndNewlineCharacterSet;", selector = "whitespaceAndNewlineCharacterSet")
    public static native NSObject whitespaceAndNewlineCharacterSet();

    @ObjCMethodSign(sign = "+ (id)decimalDigitCharacterSet;", selector = "decimalDigitCharacterSet")
    public static native NSObject decimalDigitCharacterSet();

    @ObjCMethodSign(sign = "+ (id)letterCharacterSet;", selector = "letterCharacterSet")
    public static native NSObject letterCharacterSet();

    @ObjCMethodSign(sign = "+ (id)lowercaseLetterCharacterSet;", selector = "lowercaseLetterCharacterSet")
    public static native NSObject lowercaseLetterCharacterSet();

    @ObjCMethodSign(sign = "+ (id)uppercaseLetterCharacterSet;", selector = "uppercaseLetterCharacterSet")
    public static native NSObject uppercaseLetterCharacterSet();

    @ObjCMethodSign(sign = "+ (id)nonBaseCharacterSet;", selector = "nonBaseCharacterSet")
    public static native NSObject nonBaseCharacterSet();

    @ObjCMethodSign(sign = "+ (id)alphanumericCharacterSet;", selector = "alphanumericCharacterSet")
    public static native NSObject alphanumericCharacterSet();

    @ObjCMethodSign(sign = "+ (id)decomposableCharacterSet;", selector = "decomposableCharacterSet")
    public static native NSObject decomposableCharacterSet();

    @ObjCMethodSign(sign = "+ (id)illegalCharacterSet;", selector = "illegalCharacterSet")
    public static native NSObject illegalCharacterSet();

    @ObjCMethodSign(sign = "+ (id)punctuationCharacterSet;", selector = "punctuationCharacterSet")
    public static native NSObject punctuationCharacterSet();

    @ObjCMethodSign(sign = "+ (id)capitalizedLetterCharacterSet;", selector = "capitalizedLetterCharacterSet")
    public static native NSObject capitalizedLetterCharacterSet();

    @ObjCMethodSign(sign = "+ (id)symbolCharacterSet;", selector = "symbolCharacterSet")
    public static native NSObject symbolCharacterSet();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)newlineCharacterSet NS_AVAILABLE(10_5, 2_0);", selector = "newlineCharacterSet")
    public static native NSObject newlineCharacterSet();

    @ObjCMethodSign(sign = "+ (id)characterSetWithRange:(NSRange)aRange;", selector = "characterSetWithRange:")
    public static native NSObject characterSetWithRange$(@ObjCByValue NSRange aRange);

    @ObjCMethodSign(sign = "+ (id)characterSetWithCharactersInString:(NSString *)aString;", selector = "characterSetWithCharactersInString:")
    public static native NSObject characterSetWithCharactersInString$(NSString aString);

    @ObjCMethodSign(sign = "+ (id)characterSetWithBitmapRepresentation:(NSData *)data;", selector = "characterSetWithBitmapRepresentation:")
    public static native NSObject characterSetWithBitmapRepresentation$(NSData data);

    @ObjCMethodSign(sign = "+ (id)characterSetWithContentsOfFile:(NSString *)fName;", selector = "characterSetWithContentsOfFile:")
    public static native NSObject characterSetWithContentsOfFile$(NSString fName);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLUserAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLUserAllowedCharacterSet")
    public static native NSObject URLUserAllowedCharacterSet();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLPasswordAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLPasswordAllowedCharacterSet")
    public static native NSObject URLPasswordAllowedCharacterSet();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLHostAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLHostAllowedCharacterSet")
    public static native NSObject URLHostAllowedCharacterSet();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLPathAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLPathAllowedCharacterSet")
    public static native NSObject URLPathAllowedCharacterSet();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLQueryAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLQueryAllowedCharacterSet")
    public static native NSObject URLQueryAllowedCharacterSet();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLUtilities", catownername = "NSCharacterSet")
    @ObjCMethodSign(sign = "+ (id)URLFragmentAllowedCharacterSet NS_AVAILABLE(10_9, 7_0);", selector = "URLFragmentAllowedCharacterSet")
    public static native NSObject URLFragmentAllowedCharacterSet();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSCharacterSet initWithCoder$(NSCoder aDecoder);
}
