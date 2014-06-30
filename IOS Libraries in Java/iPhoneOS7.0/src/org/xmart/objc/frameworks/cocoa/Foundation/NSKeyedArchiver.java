package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSKeyedArchiver extends NSCoder  {
    
    public NSKeyedArchiver() {}
    
    
    @ObjCMethodSign(sign = "- (id)initForWritingWithMutableData:(NSMutableData *)data;", selector = "initForWritingWithMutableData:")
    public native NSKeyedArchiver initForWritingWithMutableData$(NSMutableData data);

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSKeyedArchiverDelegate>)delegate;", selector = "setDelegate:")
    public native void setDelegate(NSKeyedArchiverDelegate delegate);

    @ObjCMethodSign(sign = "- (id <NSKeyedArchiverDelegate>)delegate;", selector = "delegate")
    public native NSKeyedArchiverDelegate delegate();

    @ObjCMethodSign(sign = "- (void)setOutputFormat:(NSPropertyListFormat)format;", selector = "setOutputFormat:")
    public native void setOutputFormat(NSPropertyListFormat format);

    @ObjCMethodSign(sign = "- (NSPropertyListFormat)outputFormat;", selector = "outputFormat")
    public native NSPropertyListFormat outputFormat();

    @ObjCMethodSign(sign = "- (void)finishEncoding;", selector = "finishEncoding")
    public native void finishEncoding();

    @ObjCMethodSign(sign = "- (void)setClassName:(NSString *)codedName forClass:(Class)cls;", selector = "setClassName:forClass:")
    public native void setClassName$forClass$(NSString codedName, ObjCClass cls);

    @ObjCMethodSign(sign = "- (NSString *)classNameForClass:(Class)cls;", selector = "classNameForClass:")
    public native NSString classNameForClass$(ObjCClass cls);

    @ObjCMethodSign(sign = "- (void)encodeObject:(id)objv forKey:(NSString *)key;", selector = "encodeObject:forKey:")
    public native void encodeObject$forKey$(NSObject objv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeConditionalObject:(id)objv forKey:(NSString *)key;", selector = "encodeConditionalObject:forKey:")
    public native void encodeConditionalObject$forKey$(NSObject objv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeBool:(BOOL)boolv forKey:(NSString *)key;", selector = "encodeBool:forKey:")
    public native void encodeBool$forKey$(boolean boolv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeInt:(int)intv forKey:(NSString *)key;", selector = "encodeInt:forKey:")
    public native void encodeInt$forKey$(int intv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeInt32:(int32_t)intv forKey:(NSString *)key;", selector = "encodeInt32:forKey:")
    public native void encodeInt32$forKey$(int intv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeInt64:(int64_t)intv forKey:(NSString *)key;", selector = "encodeInt64:forKey:")
    public native void encodeInt64$forKey$(@LongLong long intv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeFloat:(float)realv forKey:(NSString *)key;", selector = "encodeFloat:forKey:")
    public native void encodeFloat$forKey$(float realv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeDouble:(double)realv forKey:(NSString *)key;", selector = "encodeDouble:forKey:")
    public native void encodeDouble$forKey$(double realv, NSString key);

    @ObjCMethodSign(sign = "- (void)encodeBytes:(const uint8_t *)bytesp length:(NSUInteger)lenv forKey:(NSString *)key;", selector = "encodeBytes:length:forKey:")
    public native void encodeBytes$length$forKey$(@Uint8 byte[] bytesp, @NSUInteger long lenv, NSString key);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setRequiresSecureCoding:(BOOL)b NS_AVAILABLE(10_8, 6_0);", selector = "setRequiresSecureCoding:")
    public native void setRequiresSecureCoding(boolean b);

    @ObjCMethodSign(sign = "+ (NSData *)archivedDataWithRootObject:(id)rootObject;", selector = "archivedDataWithRootObject:")
    public static native NSData archivedDataWithRootObject$(NSObject rootObject);

    @ObjCMethodSign(sign = "+ (BOOL)archiveRootObject:(id)rootObject toFile:(NSString *)path;", selector = "archiveRootObject:toFile:")
    public static native boolean archiveRootObject$toFile$(NSObject rootObject, NSString path);

    @ObjCMethodSign(sign = "+ (void)setClassName:(NSString *)codedName forClass:(Class)cls;", selector = "setClassName:forClass:")
    public static native void setClassName$forClass$__STATIC(NSString codedName, ObjCClass cls);

    @ObjCMethodSign(sign = "+ (NSString *)classNameForClass:(Class)cls;", selector = "classNameForClass:")
    public static native NSString classNameForClass$__STATIC(ObjCClass cls);
}
