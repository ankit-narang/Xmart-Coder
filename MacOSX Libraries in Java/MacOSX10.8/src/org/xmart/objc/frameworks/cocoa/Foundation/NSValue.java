package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSValue extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSValue() {}
    
    
    @ObjCMethodSign(sign = "- (void)getValue:(void *)value;", selector = "getValue:")
    public native void getValue$(@VoidPointer() Object value);

    @ObjCMethodSign(sign = "- (const char *)objCType NS_RETURNS_INNER_POINTER;", selector = "objCType")
    public native byte[] objCType();

    @ObjCCategoryMethod(catname = "NSValueCreation", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (id)initWithBytes:(const void *)value objCType:(const char *)type;", selector = "initWithBytes:objCType:")
    public native NSValue initWithBytes$objCType$(@VoidPointer() Object value, byte[] type);

    @ObjCCategoryMethod(catname = "NSValueCreation", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithBytes:(const void *)value objCType:(const char *)type;", selector = "valueWithBytes:objCType:")
    public static native NSValue valueWithBytes$objCType$(@VoidPointer() Object value, byte[] type);

    @ObjCCategoryMethod(catname = "NSValueCreation", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)value:(const void *)value withObjCType:(const char *)type;", selector = "value:withObjCType:")
    public static native NSValue value$withObjCType$(@VoidPointer() Object value, byte[] type);

    @ObjCCategoryMethod(catname = "NSValueExtensionMethods", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (id)nonretainedObjectValue;", selector = "nonretainedObjectValue")
    public native NSObject nonretainedObjectValue();

    @ObjCCategoryMethod(catname = "NSValueExtensionMethods", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (void *)pointerValue;", selector = "pointerValue")
    public native @VoidPointer() Object pointerValue();

    @ObjCCategoryMethod(catname = "NSValueExtensionMethods", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToValue:(NSValue *)value;", selector = "isEqualToValue:")
    public native boolean isEqualToValue$(NSValue value);

    @ObjCCategoryMethod(catname = "NSValueExtensionMethods", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithNonretainedObject:(id)anObject;", selector = "valueWithNonretainedObject:")
    public static native NSValue valueWithNonretainedObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSValueExtensionMethods", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithPointer:(const void *)pointer;", selector = "valueWithPointer:")
    public static native NSValue valueWithPointer$(@VoidPointer() Object pointer);

    @ObjCCategoryMethod(catname = "NSValueRangeExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "- (NSRange)rangeValue;", selector = "rangeValue")
    public native @ObjCByValue NSRange rangeValue();

    @ObjCCategoryMethod(catname = "NSValueRangeExtensions", catownername = "NSValue")
    @ObjCMethodSign(sign = "+ (NSValue *)valueWithRange:(NSRange)range;", selector = "valueWithRange:")
    public static native NSValue valueWithRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSValue initWithCoder$(NSCoder aDecoder);
}
