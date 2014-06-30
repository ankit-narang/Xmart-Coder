package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCoder extends NSObject  {
    
    public NSCoder() {}
    
    
    @ObjCMethodSign(sign = "- (void)encodeValueOfObjCType:(const char *)type at:(const void *)addr;", selector = "encodeValueOfObjCType:at:")
    public native void encodeValueOfObjCType$at$(byte[] type, @VoidPointer() Object addr);

    @ObjCMethodSign(sign = "- (void)encodeDataObject:(NSData *)data;", selector = "encodeDataObject:")
    public native void encodeDataObject$(NSData data);

    @ObjCMethodSign(sign = "- (void)decodeValueOfObjCType:(const char *)type at:(void *)data;", selector = "decodeValueOfObjCType:at:")
    public native void decodeValueOfObjCType$at$(byte[] type, @VoidPointer() Object data);

    @ObjCMethodSign(sign = "- (NSData *)decodeDataObject;", selector = "decodeDataObject")
    public native NSData decodeDataObject();

    @ObjCMethodSign(sign = "- (NSInteger)versionForClassName:(NSString *)className;", selector = "versionForClassName:")
    public native @NSInteger long versionForClassName$(NSString className);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeObject:(id)object;", selector = "encodeObject:")
    public native void encodeObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeRootObject:(id)rootObject;", selector = "encodeRootObject:")
    public native void encodeRootObject$(NSObject rootObject);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeBycopyObject:(id)anObject;", selector = "encodeBycopyObject:")
    public native void encodeBycopyObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeByrefObject:(id)anObject;", selector = "encodeByrefObject:")
    public native void encodeByrefObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeConditionalObject:(id)object;", selector = "encodeConditionalObject:")
    public native void encodeConditionalObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeValuesOfObjCTypes:(const char *)types, ...;", selector = "encodeValuesOfObjCTypes:")
    public native void encodeValuesOfObjCTypes$(byte[] types, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeArrayOfObjCType:(const char *)type count:(NSUInteger)count at:(const void *)array;", selector = "encodeArrayOfObjCType:count:at:")
    public native void encodeArrayOfObjCType$count$at$(byte[] type, @NSUInteger long count, @VoidPointer() Object array);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeBytes:(const void *)byteaddr length:(NSUInteger)length;", selector = "encodeBytes:length:")
    public native void encodeBytes$length$(@VoidPointer() Object byteaddr, @NSUInteger long length);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (id)decodeObject;", selector = "decodeObject")
    public native NSObject decodeObject();

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)decodeValuesOfObjCTypes:(const char *)types, ...;", selector = "decodeValuesOfObjCTypes:")
    public native void decodeValuesOfObjCTypes$(byte[] types, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)decodeArrayOfObjCType:(const char *)itemType count:(NSUInteger)count at:(void *)array;", selector = "decodeArrayOfObjCType:count:at:")
    public native void decodeArrayOfObjCType$count$at$(byte[] itemType, @NSUInteger long count, @VoidPointer() Object array);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void *)decodeBytesWithReturnedLength:(NSUInteger *)lengthp NS_RETURNS_INNER_POINTER;", selector = "decodeBytesWithReturnedLength:")
    public native @VoidPointer() Object decodeBytesWithReturnedLength$(@NSUInteger long[] lengthp);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)setObjectZone:(NSZone *)zone NS_AUTOMATED_REFCOUNT_UNAVAILABLE;", selector = "setObjectZone:")
    public native void setObjectZone(NSZone zone);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (NSZone *)objectZone NS_AUTOMATED_REFCOUNT_UNAVAILABLE;", selector = "objectZone")
    public native NSZone objectZone();

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (unsigned)systemVersion;", selector = "systemVersion")
    public native @Unsigned int systemVersion();

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (BOOL)allowsKeyedCoding;", selector = "allowsKeyedCoding")
    public native boolean allowsKeyedCoding();

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeObject:(id)objv forKey:(NSString *)key;", selector = "encodeObject:forKey:")
    public native void encodeObject$forKey$(NSObject objv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeConditionalObject:(id)objv forKey:(NSString *)key;", selector = "encodeConditionalObject:forKey:")
    public native void encodeConditionalObject$forKey$(NSObject objv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeBool:(BOOL)boolv forKey:(NSString *)key;", selector = "encodeBool:forKey:")
    public native void encodeBool$forKey$(boolean boolv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeInt:(int)intv forKey:(NSString *)key;", selector = "encodeInt:forKey:")
    public native void encodeInt$forKey$(int intv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeInt32:(int32_t)intv forKey:(NSString *)key;", selector = "encodeInt32:forKey:")
    public native void encodeInt32$forKey$(int intv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeInt64:(int64_t)intv forKey:(NSString *)key;", selector = "encodeInt64:forKey:")
    public native void encodeInt64$forKey$(@LongLong long intv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeFloat:(float)realv forKey:(NSString *)key;", selector = "encodeFloat:forKey:")
    public native void encodeFloat$forKey$(float realv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeDouble:(double)realv forKey:(NSString *)key;", selector = "encodeDouble:forKey:")
    public native void encodeDouble$forKey$(double realv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeBytes:(const uint8_t *)bytesp length:(NSUInteger)lenv forKey:(NSString *)key;", selector = "encodeBytes:length:forKey:")
    public native void encodeBytes$length$forKey$(@Uint8 byte[] bytesp, @NSUInteger long lenv, NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (BOOL)containsValueForKey:(NSString *)key;", selector = "containsValueForKey:")
    public native boolean containsValueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (id)decodeObjectForKey:(NSString *)key;", selector = "decodeObjectForKey:")
    public native NSObject decodeObjectForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (BOOL)decodeBoolForKey:(NSString *)key;", selector = "decodeBoolForKey:")
    public native boolean decodeBoolForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (int)decodeIntForKey:(NSString *)key;", selector = "decodeIntForKey:")
    public native int decodeIntForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (int32_t)decodeInt32ForKey:(NSString *)key;", selector = "decodeInt32ForKey:")
    public native int decodeInt32ForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (int64_t)decodeInt64ForKey:(NSString *)key;", selector = "decodeInt64ForKey:")
    public native @LongLong long decodeInt64ForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (float)decodeFloatForKey:(NSString *)key;", selector = "decodeFloatForKey:")
    public native float decodeFloatForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (double)decodeDoubleForKey:(NSString *)key;", selector = "decodeDoubleForKey:")
    public native double decodeDoubleForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (const uint8_t *)decodeBytesForKey:(NSString *)key returnedLength:(NSUInteger *)lengthp NS_RETURNS_INNER_POINTER;", selector = "decodeBytesForKey:returnedLength:")
    public native @Uint8 byte[] decodeBytesForKey$returnedLength$(NSString key, @NSUInteger long[] lengthp);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (void)encodeInteger:(NSInteger)intv forKey:(NSString *)key NS_AVAILABLE(10_5, 2_0);", selector = "encodeInteger:forKey:")
    public native void encodeInteger$forKey$(@NSInteger long intv, NSString key);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (NSInteger)decodeIntegerForKey:(NSString *)key NS_AVAILABLE(10_5, 2_0);", selector = "decodeIntegerForKey:")
    public native @NSInteger long decodeIntegerForKey$(NSString key);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (BOOL)requiresSecureCoding NS_AVAILABLE(10_8, 6_0);", selector = "requiresSecureCoding")
    public native boolean requiresSecureCoding();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (id)decodeObjectOfClass:(Class)aClass forKey:(NSString *)key NS_AVAILABLE(10_8, 6_0);", selector = "decodeObjectOfClass:forKey:")
    public native NSObject decodeObjectOfClass$forKey$(ObjCClass aClass, NSString key);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (id)decodeObjectOfClasses:(NSSet *)classes forKey:(NSString *)key NS_AVAILABLE(10_8, 6_0);", selector = "decodeObjectOfClasses:forKey:")
    public native NSObject decodeObjectOfClasses$forKey$(NSSet classes, NSString key);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (id)decodePropertyListForKey:(NSString *)key NS_AVAILABLE(10_8, 6_0);", selector = "decodePropertyListForKey:")
    public native NSObject decodePropertyListForKey$(NSString key);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedCoder", catownername = "NSCoder")
    @ObjCMethodSign(sign = "- (NSSet *)allowedClasses NS_AVAILABLE(10_8, 6_0);", selector = "allowedClasses")
    public native NSSet allowedClasses();
}
