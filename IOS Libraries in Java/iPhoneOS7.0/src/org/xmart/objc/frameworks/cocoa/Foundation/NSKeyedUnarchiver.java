package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSKeyedUnarchiver extends NSCoder  {
    
    public NSKeyedUnarchiver() {}
    
    
    @ObjCMethodSign(sign = "- (id)initForReadingWithData:(NSData *)data;", selector = "initForReadingWithData:")
    public native NSKeyedUnarchiver initForReadingWithData$(NSData data);

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSKeyedUnarchiverDelegate>)delegate;", selector = "setDelegate:")
    public native void setDelegate(NSKeyedUnarchiverDelegate delegate);

    @ObjCMethodSign(sign = "- (id <NSKeyedUnarchiverDelegate>)delegate;", selector = "delegate")
    public native NSKeyedUnarchiverDelegate delegate();

    @ObjCMethodSign(sign = "- (void)finishDecoding;", selector = "finishDecoding")
    public native void finishDecoding();

    @ObjCMethodSign(sign = "- (void)setClass:(Class)cls forClassName:(NSString *)codedName;", selector = "setClass:forClassName:")
    public native void setClass$forClassName$(ObjCClass cls, NSString codedName);

    @ObjCMethodSign(sign = "- (Class)classForClassName:(NSString *)codedName;", selector = "classForClassName:")
    public native ObjCClass classForClassName$(NSString codedName);

    @ObjCMethodSign(sign = "- (BOOL)containsValueForKey:(NSString *)key;", selector = "containsValueForKey:")
    public native boolean containsValueForKey$(NSString key);

    @ObjCMethodSign(sign = "- (id)decodeObjectForKey:(NSString *)key;", selector = "decodeObjectForKey:")
    public native NSObject decodeObjectForKey$(NSString key);

    @ObjCMethodSign(sign = "- (BOOL)decodeBoolForKey:(NSString *)key;", selector = "decodeBoolForKey:")
    public native boolean decodeBoolForKey$(NSString key);

    @ObjCMethodSign(sign = "- (int)decodeIntForKey:(NSString *)key;", selector = "decodeIntForKey:")
    public native int decodeIntForKey$(NSString key);

    @ObjCMethodSign(sign = "- (int32_t)decodeInt32ForKey:(NSString *)key;", selector = "decodeInt32ForKey:")
    public native int decodeInt32ForKey$(NSString key);

    @ObjCMethodSign(sign = "- (int64_t)decodeInt64ForKey:(NSString *)key;", selector = "decodeInt64ForKey:")
    public native @LongLong long decodeInt64ForKey$(NSString key);

    @ObjCMethodSign(sign = "- (float)decodeFloatForKey:(NSString *)key;", selector = "decodeFloatForKey:")
    public native float decodeFloatForKey$(NSString key);

    @ObjCMethodSign(sign = "- (double)decodeDoubleForKey:(NSString *)key;", selector = "decodeDoubleForKey:")
    public native double decodeDoubleForKey$(NSString key);

    @ObjCMethodSign(sign = "- (const uint8_t *)decodeBytesForKey:(NSString *)key returnedLength:(NSUInteger *)lengthp NS_RETURNS_INNER_POINTER;", selector = "decodeBytesForKey:returnedLength:")
    public native @Uint8 byte[] decodeBytesForKey$returnedLength$(NSString key, @NSUInteger long[] lengthp);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setRequiresSecureCoding:(BOOL)b NS_AVAILABLE(10_8, 6_0);", selector = "setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean b);

    @ObjCMethodSign(sign = "+ (id)unarchiveObjectWithData:(NSData *)data;", selector = "unarchiveObjectWithData:")
    public static native NSObject unarchiveObjectWithData$(NSData data);

    @ObjCMethodSign(sign = "+ (id)unarchiveObjectWithFile:(NSString *)path;", selector = "unarchiveObjectWithFile:")
    public static native NSObject unarchiveObjectWithFile$(NSString path);

    @ObjCMethodSign(sign = "+ (void)setClass:(Class)cls forClassName:(NSString *)codedName;", selector = "setClass:forClassName:")
    public static native void setClass$forClassName$__STATIC(ObjCClass cls, NSString codedName);

    @ObjCMethodSign(sign = "+ (Class)classForClassName:(NSString *)codedName;", selector = "classForClassName:")
    public static native ObjCClass classForClassName$__STATIC(NSString codedName);
}
