package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;

import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSArray<T extends NSObject> extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration, Iterable<T> {
    
    public NSArray() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (id)objectAtIndex:(NSUInteger)index;", selector = "objectAtIndex:")
    public native NSObject objectAtIndex$(@NSUInteger long index);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)arrayByAddingObject:(id)anObject;", selector = "arrayByAddingObject:")
    public native NSArray arrayByAddingObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)arrayByAddingObjectsFromArray:(NSArray *)otherArray;", selector = "arrayByAddingObjectsFromArray:")
    public native NSArray arrayByAddingObjectsFromArray$(NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)componentsJoinedByString:(NSString *)separator;", selector = "componentsJoinedByString:")
    public native NSString componentsJoinedByString$(NSString separator);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (BOOL)containsObject:(id)anObject;", selector = "containsObject:")
    public native boolean containsObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale indent:(NSUInteger)level;", selector = "descriptionWithLocale:indent:")
    public native NSString descriptionWithLocale$indent$(NSObject locale, @NSUInteger long level);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id)firstObjectCommonWithArray:(NSArray *)otherArray;", selector = "firstObjectCommonWithArray:")
    public native NSObject firstObjectCommonWithArray$(NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)getObjects:(id __unsafe_unretained [])objects range:(NSRange)range;", selector = "getObjects:range:")
    public native void getObjects$range$(NSObject[] objects, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObject:(id)anObject;", selector = "indexOfObject:")
    public native @NSUInteger long indexOfObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObject:(id)anObject inRange:(NSRange)range;", selector = "indexOfObject:inRange:")
    public native @NSUInteger long indexOfObject$inRange$(NSObject anObject, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectIdenticalTo:(id)anObject;", selector = "indexOfObjectIdenticalTo:")
    public native @NSUInteger long indexOfObjectIdenticalTo$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectIdenticalTo:(id)anObject inRange:(NSRange)range;", selector = "indexOfObjectIdenticalTo:inRange:")
    public native @NSUInteger long indexOfObjectIdenticalTo$inRange$(NSObject anObject, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToArray:(NSArray *)otherArray;", selector = "isEqualToArray:")
    public native boolean isEqualToArray$(NSArray otherArray);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id)firstObject NS_AVAILABLE(10_6, 4_0);", selector = "firstObject")
    public native NSObject firstObject();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id)lastObject;", selector = "lastObject")
    public native NSObject lastObject();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSEnumerator *)reverseObjectEnumerator;", selector = "reverseObjectEnumerator")
    public native NSEnumerator reverseObjectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSData *)sortedArrayHint;", selector = "sortedArrayHint")
    public native NSData sortedArrayHint();

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingFunction:(NSInteger (*)(id, id, void *))comparator context:(void *)context;", selector = "sortedArrayUsingFunction:context:")
    public native NSArray sortedArrayUsingFunction$context$(ObjCFunctionPtr comparator, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingFunction:(NSInteger (*)(id, id, void *))comparator context:(void *)context hint:(NSData *)hint;", selector = "sortedArrayUsingFunction:context:hint:")
    public native NSArray sortedArrayUsingFunction$context$hint$(ObjCFunctionPtr comparator, @VoidPointer() Object context, NSData hint);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingSelector:(SEL)comparator;", selector = "sortedArrayUsingSelector:")
    public native NSArray sortedArrayUsingSelector$(ObjCSelector comparator);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)subarrayWithRange:(NSRange)range;", selector = "subarrayWithRange:")
    public native NSArray subarrayWithRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path atomically:(BOOL)useAuxiliaryFile;", selector = "writeToFile:atomically:")
    public native boolean writeToFile$atomically$(NSString path, boolean useAuxiliaryFile);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url atomically:(BOOL)atomically;", selector = "writeToURL:atomically:")
    public native boolean writeToURL$atomically$(NSURL url, boolean atomically);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)makeObjectsPerformSelector:(SEL)aSelector;", selector = "makeObjectsPerformSelector:")
    public native void makeObjectsPerformSelector$(ObjCSelector aSelector);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)makeObjectsPerformSelector:(SEL)aSelector withObject:(id)argument;", selector = "makeObjectsPerformSelector:withObject:")
    public native void makeObjectsPerformSelector$withObject$(ObjCSelector aSelector, NSObject argument);

    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)objectsAtIndexes:(NSIndexSet *)indexes;", selector = "objectsAtIndexes:")
    public native NSArray objectsAtIndexes$(NSIndexSet indexes);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id)objectAtIndexedSubscript:(NSUInteger)idx NS_AVAILABLE(10_8, 6_0);", selector = "objectAtIndexedSubscript:")
    public native NSObject objectAtIndexedSubscript$(@NSUInteger long idx);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsUsingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateObjectsUsingBlock:")
    public native void enumerateObjectsUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateObjectsWithOptions:usingBlock:")
    public native void enumerateObjectsWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)enumerateObjectsAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts usingBlock:(void (^)(id obj, NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateObjectsAtIndexes:options:usingBlock:")
    public native void enumerateObjectsAtIndexes$options$usingBlock$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectPassingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexOfObjectPassingTest:")
    public native @NSUInteger long indexOfObjectPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexOfObjectWithOptions:passingTest:")
    public native @NSUInteger long indexOfObjectWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObjectAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexOfObjectAtIndexes:options:passingTest:")
    public native @NSUInteger long indexOfObjectAtIndexes$options$passingTest$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsPassingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesOfObjectsPassingTest:")
    public native NSIndexSet indexesOfObjectsPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesOfObjectsWithOptions:passingTest:")
    public native NSIndexSet indexesOfObjectsWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesOfObjectsAtIndexes:(NSIndexSet *)s options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id obj, NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesOfObjectsAtIndexes:options:passingTest:")
    public native NSIndexSet indexesOfObjectsAtIndexes$options$passingTest$(NSIndexSet s, NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "sortedArrayUsingComparator:")
    public native NSArray sortedArrayUsingComparator$(ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayWithOptions:(NSSortOptions)opts usingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "sortedArrayWithOptions:usingComparator:")
    public native NSArray sortedArrayWithOptions$usingComparator$(NSSortOptions opts, ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedArray", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSUInteger)indexOfObject:(id)obj inSortedRange:(NSRange)r options:(NSBinarySearchingOptions)opts usingComparator:(NSComparator)cmp NS_AVAILABLE(10_6, 4_0);", selector = "indexOfObject:inSortedRange:options:usingComparator:")
    public native @NSUInteger long indexOfObject$inSortedRange$options$usingComparator$(NSObject obj, @ObjCByValue NSRange r, NSBinarySearchingOptions opts, ObjCFunctionPtr cmp);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSArray init();

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "initWithObjects:count:")
    public native NSArray initWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithObjects:")
    public native NSArray initWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)array;", selector = "initWithArray:")
    public native NSArray initWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (instancetype)initWithArray:(NSArray *)array copyItems:(BOOL)flag;", selector = "initWithArray:copyItems:")
    public native NSArray initWithArray$copyItems$(NSArray array, boolean flag);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id /* NSArray * */)initWithContentsOfFile:(NSString *)path;", selector = "initWithContentsOfFile:")
    public native NSArray initWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id /* NSArray * */)initWithContentsOfURL:(NSURL *)url;", selector = "initWithContentsOfURL:")
    public native NSArray initWithContentsOfURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (instancetype)array;", selector = "array")
    public static native NSArray array();

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (instancetype)arrayWithObject:(id)anObject;", selector = "arrayWithObject:")
    public static native NSArray arrayWithObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (instancetype)arrayWithObjects:(const id [])objects count:(NSUInteger)cnt;", selector = "arrayWithObjects:count:")
    public static native NSArray arrayWithObjects$count$(NSObject[] objects, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (instancetype)arrayWithObjects:(id)firstObj, ... NS_REQUIRES_NIL_TERMINATION;", selector = "arrayWithObjects:")
    public static native NSArray arrayWithObjects$(NSObject firstObj, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (instancetype)arrayWithArray:(NSArray *)array;", selector = "arrayWithArray:")
    public static native NSArray arrayWithArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (id /* NSArray * */)arrayWithContentsOfFile:(NSString *)path;", selector = "arrayWithContentsOfFile:")
    public static native NSObject arrayWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSArrayCreation", catownername = "NSArray")
    @ObjCMethodSign(sign = "+ (id /* NSArray * */)arrayWithContentsOfURL:(NSURL *)url;", selector = "arrayWithContentsOfURL:")
    public static native NSObject arrayWithContentsOfURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSDeprecated", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)getObjects:(id __unsafe_unretained [])objects;", selector = "getObjects:")
    public native void getObjects$(NSObject[] objects);

    @ObjCCategoryMethod(catname = "NSArrayPathExtensions", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)pathsMatchingExtensions:(NSArray *)filterTypes;", selector = "pathsMatchingExtensions:")
    public native NSArray pathsMatchingExtensions$(NSArray filterTypes);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (id)valueForKey:(NSString *)key;", selector = "valueForKey:")
    public native NSObject valueForKey$(NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKey:(NSString *)key;", selector = "setValue:forKey:")
    public native void setValue$forKey$(NSObject value, NSString key);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)addObserver:(NSObject *)observer toObjectsAtIndexes:(NSIndexSet *)indexes forKeyPath:(NSString *)keyPath options:(NSKeyValueObservingOptions)options context:(void *)context;", selector = "addObserver:toObjectsAtIndexes:forKeyPath:options:context:")
    public native void addObserver$toObjectsAtIndexes$forKeyPath$options$context$(NSObject observer, NSIndexSet indexes, NSString keyPath, NSKeyValueObservingOptions options, @VoidPointer() Object context);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer fromObjectsAtIndexes:(NSIndexSet *)indexes forKeyPath:(NSString *)keyPath context:(void *)context NS_AVAILABLE(10_7, 5_0);", selector = "removeObserver:fromObjectsAtIndexes:forKeyPath:context:")
    public native void removeObserver$fromObjectsAtIndexes$forKeyPath$context$(NSObject observer, NSIndexSet indexes, NSString keyPath, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer fromObjectsAtIndexes:(NSIndexSet *)indexes forKeyPath:(NSString *)keyPath;", selector = "removeObserver:fromObjectsAtIndexes:forKeyPath:")
    public native void removeObserver$fromObjectsAtIndexes$forKeyPath$(NSObject observer, NSIndexSet indexes, NSString keyPath);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)addObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath options:(NSKeyValueObservingOptions)options context:(void *)context;", selector = "addObserver:forKeyPath:options:context:")
    public native void addObserver$forKeyPath$options$context$(NSObject observer, NSString keyPath, NSKeyValueObservingOptions options, @VoidPointer() Object context);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath context:(void *)context NS_AVAILABLE(10_7, 5_0);", selector = "removeObserver:forKeyPath:context:")
    public native void removeObserver$forKeyPath$context$(NSObject observer, NSString keyPath, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSKeyValueObserverRegistration", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (void)removeObserver:(NSObject *)observer forKeyPath:(NSString *)keyPath;", selector = "removeObserver:forKeyPath:")
    public native void removeObserver$forKeyPath$(NSObject observer, NSString keyPath);

    @ObjCCategoryMethod(catname = "NSSortDescriptorSorting", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)sortedArrayUsingDescriptors:(NSArray *)sortDescriptors;", selector = "sortedArrayUsingDescriptors:")
    public native NSArray sortedArrayUsingDescriptors$(NSArray sortDescriptors);

    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSArray *)filteredArrayUsingPredicate:(NSPredicate *)predicate;", selector = "filteredArrayUsingPredicate:")
    public native NSArray filteredArrayUsingPredicate$(NSPredicate predicate);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSArray initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);


	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}


	public T get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
