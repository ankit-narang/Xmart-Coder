package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPointerArray extends NSObject implements NSFastEnumeration, NSCopying, NSCoding {
    
    public NSPointerArray() {}
    
    
    @ObjCMethodSign(sign = "- initWithOptions:(NSPointerFunctionsOptions)options;", selector = "initWithOptions:")
    public native NSPointerArray initWithOptions$(NSPointerFunctionsOptions options);

    @ObjCMethodSign(sign = "- initWithPointerFunctions:(NSPointerFunctions *)functions;", selector = "initWithPointerFunctions:")
    public native NSPointerArray initWithPointerFunctions$(NSPointerFunctions functions);

    @ObjCMethodSign(sign = "- (NSPointerFunctions *)pointerFunctions;", selector = "pointerFunctions")
    public native NSPointerFunctions pointerFunctions();

    @ObjCMethodSign(sign = "- (void *)pointerAtIndex:(NSUInteger)index;", selector = "pointerAtIndex:")
    public native @VoidPointer() Object pointerAtIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)addPointer:(void *)pointer;", selector = "addPointer:")
    public native void addPointer$(@VoidPointer() Object pointer);

    @ObjCMethodSign(sign = "- (void)removePointerAtIndex:(NSUInteger)index;", selector = "removePointerAtIndex:")
    public native void removePointerAtIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)insertPointer:(void *)item atIndex:(NSUInteger)index;", selector = "insertPointer:atIndex:")
    public native void insertPointer$atIndex$(@VoidPointer() Object item, @NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)replacePointerAtIndex:(NSUInteger)index withPointer:(void *)item;", selector = "replacePointerAtIndex:withPointer:")
    public native void replacePointerAtIndex$withPointer$(@NSUInteger long index, @VoidPointer() Object item);

    @ObjCMethodSign(sign = "- (void)compact;", selector = "compact")
    public native void compact();

    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (void)setCount:(NSUInteger)count;", selector = "setCount:")
    public native void setCount(@NSUInteger long count);

    @ObjCMethodSign(sign = "+ pointerArrayWithOptions:(NSPointerFunctionsOptions)options;", selector = "pointerArrayWithOptions:")
    public static native NSObject pointerArrayWithOptions$(NSPointerFunctionsOptions options);

    @ObjCMethodSign(sign = "+ pointerArrayWithPointerFunctions:(NSPointerFunctions *)functions;", selector = "pointerArrayWithPointerFunctions:")
    public static native NSObject pointerArrayWithPointerFunctions$(NSPointerFunctions functions);

    @ObjCCategoryMethod(catname = "NSPointerArrayConveniences", catownername = "NSPointerArray")
    @ObjCMethodSign(sign = "- (NSArray *)allObjects;", selector = "allObjects")
    public native NSArray allObjects();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPointerArrayConveniences", catownername = "NSPointerArray")
    @ObjCMethodSign(sign = "+ (id)strongObjectsPointerArray NS_AVAILABLE(10_8, 6_0);", selector = "strongObjectsPointerArray")
    public static native NSObject strongObjectsPointerArray();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPointerArrayConveniences", catownername = "NSPointerArray")
    @ObjCMethodSign(sign = "+ (id)weakObjectsPointerArray NS_AVAILABLE(10_8, 6_0);", selector = "weakObjectsPointerArray")
    public static native NSObject weakObjectsPointerArray();

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSPointerArray initWithCoder$(NSCoder aDecoder);
}
