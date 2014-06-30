package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMapTable extends NSObject implements NSCopying, NSCoding, NSFastEnumeration {
    
    public NSMapTable() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithKeyOptions:(NSPointerFunctionsOptions)keyOptions valueOptions:(NSPointerFunctionsOptions)valueOptions capacity:(NSUInteger)initialCapacity;", selector = "initWithKeyOptions:valueOptions:capacity:")
    public native NSMapTable initWithKeyOptions$valueOptions$capacity$(NSPointerFunctionsOptions keyOptions, NSPointerFunctionsOptions valueOptions, @NSUInteger long initialCapacity);

    @ObjCMethodSign(sign = "- (id)initWithKeyPointerFunctions:(NSPointerFunctions *)keyFunctions valuePointerFunctions:(NSPointerFunctions *)valueFunctions capacity:(NSUInteger)initialCapacity;", selector = "initWithKeyPointerFunctions:valuePointerFunctions:capacity:")
    public native NSMapTable initWithKeyPointerFunctions$valuePointerFunctions$capacity$(NSPointerFunctions keyFunctions, NSPointerFunctions valueFunctions, @NSUInteger long initialCapacity);

    @ObjCMethodSign(sign = "- (NSPointerFunctions *)keyPointerFunctions;", selector = "keyPointerFunctions")
    public native NSPointerFunctions keyPointerFunctions();

    @ObjCMethodSign(sign = "- (NSPointerFunctions *)valuePointerFunctions;", selector = "valuePointerFunctions")
    public native NSPointerFunctions valuePointerFunctions();

    @ObjCMethodSign(sign = "- (id)objectForKey:(id)aKey;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSObject aKey);

    @ObjCMethodSign(sign = "- (void)removeObjectForKey:(id)aKey;", selector = "removeObjectForKey:")
    public native void removeObjectForKey$(NSObject aKey);

    @ObjCMethodSign(sign = "- (void)setObject:(id)anObject forKey:(id)aKey;", selector = "setObject:forKey:")
    public native void setObject$forKey$(NSObject anObject, NSObject aKey);

    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (NSEnumerator *)keyEnumerator;", selector = "keyEnumerator")
    public native NSEnumerator keyEnumerator();

    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryRepresentation;", selector = "dictionaryRepresentation")
    public native NSDictionary dictionaryRepresentation();

    @ObjCMethodSign(sign = "+ (id)mapTableWithKeyOptions:(NSPointerFunctionsOptions)keyOptions valueOptions:(NSPointerFunctionsOptions)valueOptions;", selector = "mapTableWithKeyOptions:valueOptions:")
    public static native NSObject mapTableWithKeyOptions$valueOptions$(NSPointerFunctionsOptions keyOptions, NSPointerFunctionsOptions valueOptions);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)strongToStrongObjectsMapTable NS_AVAILABLE(10_8, 6_0);", selector = "strongToStrongObjectsMapTable")
    public static native NSObject strongToStrongObjectsMapTable();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)weakToStrongObjectsMapTable NS_AVAILABLE(10_8, 6_0);", selector = "weakToStrongObjectsMapTable")
    public static native NSObject weakToStrongObjectsMapTable();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)strongToWeakObjectsMapTable NS_AVAILABLE(10_8, 6_0);", selector = "strongToWeakObjectsMapTable")
    public static native NSObject strongToWeakObjectsMapTable();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)weakToWeakObjectsMapTable NS_AVAILABLE(10_8, 6_0);", selector = "weakToWeakObjectsMapTable")
    public static native NSObject weakToWeakObjectsMapTable();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSMapTable initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
