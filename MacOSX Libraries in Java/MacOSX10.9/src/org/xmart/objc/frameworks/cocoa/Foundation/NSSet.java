package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSSet extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration {
    
    public NSSet() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (id)member:(id)object;", selector = "member:")
    public native NSObject member$(NSObject object);

    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSArray *)allObjects;", selector = "allObjects")
    public native NSArray allObjects();

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (id)anyObject;", selector = "anyObject")
    public native NSObject anyObject();

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (BOOL)containsObject:(id)anObject;", selector = "containsObject:")
    public native boolean containsObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (BOOL)intersectsSet:(NSSet *)otherSet;", selector = "intersectsSet:")
    public native boolean intersectsSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToSet:(NSSet *)otherSet;", selector = "isEqualToSet:")
    public native boolean isEqualToSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (BOOL)isSubsetOfSet:(NSSet *)otherSet;", selector = "isSubsetOfSet:")
    public native boolean isSubsetOfSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)makeObjectsPerformSelector:(SEL)aSelector;", selector = "makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector$(ObjCSelector aSelector);

    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)makeObjectsPerformSelector:(SEL)aSelector withObject:(id)argument;", selector = "makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelector$withObject$(ObjCSelector aSelector, NSObject argument);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)setByAddingObject:(id)anObject NS_AVAILABLE(10_5, 2_0);", selector = "setByAddingObject:")
    public native NSSet setByAddingObject$(NSObject anObject);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)setByAddingObjectsFromSet:(NSSet *)other NS_AVAILABLE(10_5, 2_0);", selector = "setByAddingObjectsFromSet:")
    public native NSSet setByAddingObjectsFromSet$(NSSet other);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)setByAddingObjectsFromArray:(NSArray *)other NS_AVAILABLE(10_5, 2_0);", selector = "setByAddingObjectsFromArray:")
    public native NSSet setByAddingObjectsFromArray$(NSArray other);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsUsingBlock:(void (^)(id obj, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(id obj, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)objectsPassingTest:(BOOL (^)(id obj, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "objectsPassingTest:")
    public native NSSet objectsPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedSet", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)objectsWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "objectsWithOptions:passingTest:")
    public native NSSet objectsWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSSet init();

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "initWithObjects:count:")
    public native NSSet initWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithObjects:")
    public native NSSet initWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithSet:(NSSet *)set;", selector = "initWithSet:")
    public native NSSet initWithSet$(NSSet set);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithSet:(NSSet *)set copyItems:(BOOL)flag;", selector = "initWithSet:copyItems:")
    public native NSSet initWithSet$copyItems$(NSSet set, boolean flag);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)array;", selector = "initWithArray:")
    public native NSSet initWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)set;", selector = "set")
    public static native NSSet set();

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithObject:(id)object;", selector = "setWithObject:")
    public static native NSSet setWithObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "setWithObjects:count:")
    public static native NSSet setWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "setWithObjects:")
    public static native NSSet setWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithSet:(NSSet *)set;", selector = "setWithSet:")
    public static native NSSet setWithSet$(NSSet set);

    @ObjCCategoryMethod(catname = "NSSetCreation", catownername = "NSSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithArray:(NSArray *)array;", selector = "setWithArray:")
    public static native NSSet setWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (id)valueForKey:(NSString *)key;", selector = "valueForKey:")
    public native NSObject valueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKey:(NSString *)key;", selector = "setValue:forKey:")
    public native void setValue$forKey$(NSObject value, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)addObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath options:(NSKeyValueObservingOptions)options context:(void *)context;", selector = "addObserver:forKeyPath:options:context:")
    public native void addObserver$forKeyPath$options$context$(NSObject observer, NSString keyPath, NSKeyValueObservingOptions options, @VoidPointer() Object context);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath context:(void *)context NS_AVAILABLE(10_7, 5_0);", selector = "removeObserver:forKeyPath:context:")
    public native void removeObserver$forKeyPath$context$(NSObject observer, NSString keyPath, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath;", selector = "removeObserver:forKeyPath:")
    public native void removeObserver$forKeyPath$(NSObject observer, NSString keyPath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSSortDescriptorSorting", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingDescriptors:(NSArray *)sortDescriptors NS_AVAILABLE(10_6, 4_0);", selector = "sortedArrayUsingDescriptors:")
    public native NSArray sortedArrayUsingDescriptors$(NSArray sortDescriptors);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSSet")
    @ObjCMethodSign(sign = "- (NSSet *)filteredSetUsingPredicate:(NSPredicate *)predicate NS_AVAILABLE(10_5, 3_0);", selector = "filteredSetUsingPredicate:")
    public native NSSet filteredSetUsingPredicate$(NSPredicate predicate);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSSet initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
