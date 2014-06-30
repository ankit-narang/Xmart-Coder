package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSOrderedSet extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration {
    
    public NSOrderedSet() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (id)objectAtIndex:(NSUInteger)idx;", selector = "objectAtIndex:")
    public native NSObject objectAtIndex$(@NSUInteger long idx);

    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObject:(id)object;", selector = "indexOfObject:")
    public native @NSUInteger long indexOfObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)getObjects:(id __unsafe_unretained [])objects range:(NSRange)range;", selector = "getObjects:range:")
    public native void getObjects$range$(NSObject[] objects, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSArray *)objectsAtIndexes:(NSIndexSet *)indexes;", selector = "objectsAtIndexes:")
    public native NSArray objectsAtIndexes$(NSIndexSet indexes);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (id)firstObject;", selector = "firstObject")
    public native NSObject firstObject();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (id)lastObject;", selector = "lastObject")
    public native NSObject lastObject();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToOrderedSet:(NSOrderedSet *)other;", selector = "isEqualToOrderedSet:")
    public native boolean isEqualToOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)containsObject:(id)object;", selector = "containsObject:")
    public native boolean containsObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)intersectsOrderedSet:(NSOrderedSet *)other;", selector = "intersectsOrderedSet:")
    public native boolean intersectsOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)intersectsSet:(NSSet *)set;", selector = "intersectsSet:")
    public native boolean intersectsSet$(NSSet set);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)isSubsetOfOrderedSet:(NSOrderedSet *)other;", selector = "isSubsetOfOrderedSet:")
    public native boolean isSubsetOfOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (BOOL)isSubsetOfSet:(NSSet *)set;", selector = "isSubsetOfSet:")
    public native boolean isSubsetOfSet$(NSSet set);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (id)objectAtIndexedSubscript:(NSUInteger)idx NS_AVAILABLE(10_8, 6_0);", selector = "objectAtIndexedSubscript:")
    public native NSObject objectAtIndexedSubscript$(@NSUInteger long idx);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSEnumerator *)reverseObjectEnumerator;", selector = "reverseObjectEnumerator")
    public native NSEnumerator reverseObjectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSOrderedSet *)reversedOrderedSet;", selector = "reversedOrderedSet")
    public native NSOrderedSet reversedOrderedSet();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSArray *)array;", selector = "array")
    public native NSArray array();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSSet *)set;", selector = "set")
    public native NSSet set();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsUsingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block;", selector = "enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock$(ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block;", selector = "enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts usingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block;", selector = "enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexes$options$usingBlock$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock block);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectPassingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexOfObjectPassingTest:")
    public native @NSUInteger long indexOfObjectPassingTest$(ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexOfObjectWithOptions:passingTest:")
    public native @NSUInteger long indexOfObjectWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexOfObjectAtIndexes:options:passingTest:")
    public native @NSUInteger long indexOfObjectAtIndexes$options$passingTest$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsPassingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest$(ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate;", selector = "indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexes$options$passingTest$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObject:(id)object inSortedRange:(NSRange)range options:(NSBinarySearchingOptions)opts usingComparator:(NSComparator)cmp;", selector = "indexOfObject:inSortedRange:options:usingComparator:")
    public native @NSUInteger long indexOfObject$inSortedRange$options$usingComparator$(NSObject object, @ObjCByValue NSRange range, NSBinarySearchingOptions opts, ObjCFunctionPtr cmp);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingComparator:(NSComparator)cmptr;", selector = "sortedArrayUsingComparator:")
    public native NSArray sortedArrayUsingComparator$(ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayWithOptions:(NSSortOptions)opts usingComparator:(NSComparator)cmptr;", selector = "sortedArrayWithOptions:usingComparator:")
    public native NSArray sortedArrayWithOptions$usingComparator$(NSSortOptions opts, ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedOrderedSet", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale indent:(NSUInteger)level;", selector = "descriptionWithLocale:indent:")
    public native NSString descriptionWithLocale$indent$(NSObject locale, @NSUInteger long level);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSOrderedSet init();

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "initWithObjects:count:")
    public native NSOrderedSet initWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithObject:(id)object;", selector = "initWithObject:")
    public native NSOrderedSet initWithObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithObjects:")
    public native NSOrderedSet initWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithOrderedSet:(NSOrderedSet *)set;", selector = "initWithOrderedSet:")
    public native NSOrderedSet initWithOrderedSet$(NSOrderedSet set);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithOrderedSet:(NSOrderedSet *)set copyItems:(BOOL)flag;", selector = "initWithOrderedSet:copyItems:")
    public native NSOrderedSet initWithOrderedSet$copyItems$(NSOrderedSet set, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithOrderedSet:(NSOrderedSet *)set range:(NSRange)range copyItems:(BOOL)flag;", selector = "initWithOrderedSet:range:copyItems:")
    public native NSOrderedSet initWithOrderedSet$range$copyItems$(NSOrderedSet set, @ObjCByValue NSRange range, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)array;", selector = "initWithArray:")
    public native NSOrderedSet initWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)set copyItems:(BOOL)flag;", selector = "initWithArray:copyItems:")
    public native NSOrderedSet initWithArray$copyItems$(NSArray set, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)set range:(NSRange)range copyItems:(BOOL)flag;", selector = "initWithArray:range:copyItems:")
    public native NSOrderedSet initWithArray$range$copyItems$(NSArray set, @ObjCByValue NSRange range, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithSet:(NSSet *)set;", selector = "initWithSet:")
    public native NSOrderedSet initWithSet$(NSSet set);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithSet:(NSSet *)set copyItems:(BOOL)flag;", selector = "initWithSet:copyItems:")
    public native NSOrderedSet initWithSet$copyItems$(NSSet set, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSet;", selector = "orderedSet")
    public static native NSOrderedSet orderedSet();

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithObject:(id)object;", selector = "orderedSetWithObject:")
    public static native NSOrderedSet orderedSetWithObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "orderedSetWithObjects:count:")
    public static native NSOrderedSet orderedSetWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "orderedSetWithObjects:")
    public static native NSOrderedSet orderedSetWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithOrderedSet:(NSOrderedSet *)set;", selector = "orderedSetWithOrderedSet:")
    public static native NSOrderedSet orderedSetWithOrderedSet$(NSOrderedSet set);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithOrderedSet:(NSOrderedSet *)set range:(NSRange)range copyItems:(BOOL)flag;", selector = "orderedSetWithOrderedSet:range:copyItems:")
    public static native NSOrderedSet orderedSetWithOrderedSet$range$copyItems$(NSOrderedSet set, @ObjCByValue NSRange range, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithArray:(NSArray *)array;", selector = "orderedSetWithArray:")
    public static native NSOrderedSet orderedSetWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithArray:(NSArray *)array range:(NSRange)range copyItems:(BOOL)flag;", selector = "orderedSetWithArray:range:copyItems:")
    public static native NSOrderedSet orderedSetWithArray$range$copyItems$(NSArray array, @ObjCByValue NSRange range, boolean flag);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithSet:(NSSet *)set;", selector = "orderedSetWithSet:")
    public static native NSOrderedSet orderedSetWithSet$(NSSet set);

    @ObjCCategoryMethod(catname = "NSOrderedSetCreation", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithSet:(NSSet *)set copyItems:(BOOL)flag;", selector = "orderedSetWithSet:copyItems:")
    public static native NSOrderedSet orderedSetWithSet$copyItems$(NSSet set, boolean flag);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (id)valueForKey:(NSString *)key NS_AVAILABLE(10_7, 5_0);", selector = "valueForKey:")
    public native NSObject valueForKey$(NSString key);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKey:(NSString *)key NS_AVAILABLE(10_7, 5_0);", selector = "setValue:forKey:")
    public native void setValue$forKey$(NSObject value, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)addObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath options:(NSKeyValueObservingOptions)options context:(void *)context;", selector = "addObserver:forKeyPath:options:context:")
    public native void addObserver$forKeyPath$options$context$(NSObject observer, NSString keyPath, NSKeyValueObservingOptions options, @VoidPointer() Object context);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath context:(void *)context NS_AVAILABLE(10_7, 5_0);", selector = "removeObserver:forKeyPath:context:")
    public native void removeObserver$forKeyPath$context$(NSObject observer, NSString keyPath, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath;", selector = "removeObserver:forKeyPath:")
    public native void removeObserver$forKeyPath$(NSObject observer, NSString keyPath);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueSorting", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingDescriptors:(NSArray *)sortDescriptors NS_AVAILABLE(10_7, 5_0);", selector = "sortedArrayUsingDescriptors:")
    public native NSArray sortedArrayUsingDescriptors$(NSArray sortDescriptors);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSOrderedSet")
    @ObjCMethodSign(sign = "- (NSOrderedSet *)filteredOrderedSetUsingPredicate:(NSPredicate *)p NS_AVAILABLE(10_7, 5_0);", selector = "filteredOrderedSetUsingPredicate:")
    public native NSOrderedSet filteredOrderedSetUsingPredicate$(NSPredicate p);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSOrderedSet initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
