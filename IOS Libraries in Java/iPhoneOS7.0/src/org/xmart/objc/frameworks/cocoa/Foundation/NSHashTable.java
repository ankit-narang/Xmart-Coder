package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSHashTable extends NSObject implements NSCopying, NSCoding, NSFastEnumeration {
    
    public NSHashTable() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithOptions:(NSPointerFunctionsOptions)options capacity:(NSUInteger)initialCapacity;", selector = "initWithOptions:capacity:")
    public native NSHashTable initWithOptions$capacity$(NSPointerFunctionsOptions options, @NSUInteger long initialCapacity);

    @ObjCMethodSign(sign = "- (id)initWithPointerFunctions:(NSPointerFunctions *)functions capacity:(NSUInteger)initialCapacity;", selector = "initWithPointerFunctions:capacity:")
    public native NSHashTable initWithPointerFunctions$capacity$(NSPointerFunctions functions, @NSUInteger long initialCapacity);

    @ObjCMethodSign(sign = "- (NSPointerFunctions *)pointerFunctions;", selector = "pointerFunctions")
    public native NSPointerFunctions pointerFunctions();

    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (id)member:(id)object;", selector = "member:")
    public native NSObject member$(NSObject object);

    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCMethodSign(sign = "- (void)addObject:(id)object;", selector = "addObject:")
    public native void addObject$(NSObject object);

    @ObjCMethodSign(sign = "- (void)removeObject:(id)object;", selector = "removeObject:")
    public native void removeObject$(NSObject object);

    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCMethodSign(sign = "- (NSArray *)allObjects;", selector = "allObjects")
    public native NSArray allObjects();

    @ObjCMethodSign(sign = "- (id)anyObject;", selector = "anyObject")
    public native NSObject anyObject();

    @ObjCMethodSign(sign = "- (BOOL)containsObject:(id)anObject;", selector = "containsObject:")
    public native boolean containsObject$(NSObject anObject);

    @ObjCMethodSign(sign = "- (BOOL)intersectsHashTable:(NSHashTable *)other;", selector = "intersectsHashTable:")
    public native boolean intersectsHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (BOOL)isEqualToHashTable:(NSHashTable *)other;", selector = "isEqualToHashTable:")
    public native boolean isEqualToHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (BOOL)isSubsetOfHashTable:(NSHashTable *)other;", selector = "isSubsetOfHashTable:")
    public native boolean isSubsetOfHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (void)intersectHashTable:(NSHashTable *)other;", selector = "intersectHashTable:")
    public native void intersectHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (void)unionHashTable:(NSHashTable *)other;", selector = "unionHashTable:")
    public native void unionHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (void)minusHashTable:(NSHashTable *)other;", selector = "minusHashTable:")
    public native void minusHashTable$(NSHashTable other);

    @ObjCMethodSign(sign = "- (NSSet *)setRepresentation;", selector = "setRepresentation")
    public native NSSet setRepresentation();

    @ObjCMethodSign(sign = "+ (id)hashTableWithOptions:(NSPointerFunctionsOptions)options;", selector = "hashTableWithOptions:")
    public static native NSObject hashTableWithOptions$(NSPointerFunctionsOptions options);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)weakObjectsHashTable NS_AVAILABLE(10_8, 6_0);", selector = "weakObjectsHashTable")
    public static native NSObject weakObjectsHashTable();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSHashTable initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
