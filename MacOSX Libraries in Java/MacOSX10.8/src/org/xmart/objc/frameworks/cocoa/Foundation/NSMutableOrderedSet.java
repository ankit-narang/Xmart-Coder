package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableOrderedSet extends NSOrderedSet  {
    
    public NSMutableOrderedSet() {}
    
    
    @ObjCMethodSign(sign = "- (void)insertObject:(id)object atIndex:(NSUInteger)idx;", selector = "insertObject:atIndex:")
    public native void insertObject$atIndex$(NSObject object, @NSUInteger long idx);

    @ObjCMethodSign(sign = "- (void)removeObjectAtIndex:(NSUInteger)idx;", selector = "removeObjectAtIndex:")
    public native void removeObjectAtIndex$(@NSUInteger long idx);

    @ObjCMethodSign(sign = "- (void)replaceObjectAtIndex:(NSUInteger)idx withObject:(id)object;", selector = "replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndex$withObject$(@NSUInteger long idx, NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)addObject:(id)object;", selector = "addObject:")
    public native void addObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)addObjects:(const id [])objects count:(NSUInteger)count;", selector = "addObjects:count:")
    public native void addObjects$count$(NSObject[] objects, @NSUInteger long count);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)addObjectsFromArray:(NSArray *)array;", selector = "addObjectsFromArray:")
    public native void addObjectsFromArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)exchangeObjectAtIndex:(NSUInteger)idx1 withObjectAtIndex:(NSUInteger)idx2;", selector = "exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndex$withObjectAtIndex$(@NSUInteger long idx1, @NSUInteger long idx2);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)moveObjectsAtIndexes:(NSIndexSet *)indexes toIndex:(NSUInteger)idx;", selector = "moveObjectsAtIndexes:toIndex:")
    public native void moveObjectsAtIndexes$toIndex$(NSIndexSet indexes, @NSUInteger long idx);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)insertObjects:(NSArray *)objects atIndexes:(NSIndexSet *)indexes;", selector = "insertObjects:atIndexes:")
    public native void insertObjects$atIndexes$(NSArray objects, NSIndexSet indexes);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)setObject:(id)obj atIndex:(NSUInteger)idx;", selector = "setObject:atIndex:")
    public native void setObject$atIndex$(NSObject obj, @NSUInteger long idx);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)setObject:(id)obj atIndexedSubscript:(NSUInteger)idx NS_AVAILABLE(10_8, 6_0);", selector = "setObject:atIndexedSubscript:")
    public native void setObject$atIndexedSubscript$(NSObject obj, @NSUInteger long idx);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)replaceObjectsInRange:(NSRange)range withObjects:(const id [])objects count:(NSUInteger)count;", selector = "replaceObjectsInRange:withObjects:count:")
    public native void replaceObjectsInRange$withObjects$count$(@ObjCByValue NSRange range, NSObject[] objects, @NSUInteger long count);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)replaceObjectsAtIndexes:(NSIndexSet *)indexes withObjects:(NSArray *)objects;", selector = "replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexes$withObjects$(NSIndexSet indexes, NSArray objects);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObjectsInRange:(NSRange)range;", selector = "removeObjectsInRange:")
    public native void removeObjectsInRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObjectsAtIndexes:(NSIndexSet *)indexes;", selector = "removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes$(NSIndexSet indexes);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObject:(id)object;", selector = "removeObject:")
    public native void removeObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)removeObjectsInArray:(NSArray *)array;", selector = "removeObjectsInArray:")
    public native void removeObjectsInArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)intersectOrderedSet:(NSOrderedSet *)other;", selector = "intersectOrderedSet:")
    public native void intersectOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)minusOrderedSet:(NSOrderedSet *)other;", selector = "minusOrderedSet:")
    public native void minusOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)unionOrderedSet:(NSOrderedSet *)other;", selector = "unionOrderedSet:")
    public native void unionOrderedSet$(NSOrderedSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)intersectSet:(NSSet *)other;", selector = "intersectSet:")
    public native void intersectSet$(NSSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)minusSet:(NSSet *)other;", selector = "minusSet:")
    public native void minusSet$(NSSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)unionSet:(NSSet *)other;", selector = "unionSet:")
    public native void unionSet$(NSSet other);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)sortUsingComparator:(NSComparator)cmptr;", selector = "sortUsingComparator:")
    public native void sortUsingComparator$(ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)sortWithOptions:(NSSortOptions)opts usingComparator:(NSComparator)cmptr;", selector = "sortWithOptions:usingComparator:")
    public native void sortWithOptions$usingComparator$(NSSortOptions opts, ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSExtendedMutableOrderedSet", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)sortRange:(NSRange)range options:(NSSortOptions)opts usingComparator:(NSComparator)cmptr;", selector = "sortRange:options:usingComparator:")
    public native void sortRange$options$usingComparator$(@ObjCByValue NSRange range, NSSortOptions opts, ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSMutableOrderedSetCreation", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSMutableOrderedSet init();

    @ObjCCategoryMethod(catname = "NSMutableOrderedSetCreation", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithCapacity:(NSUInteger)numItems;", selector = "initWithCapacity:")
    public native NSMutableOrderedSet initWithCapacity$(@NSUInteger long numItems);

    @ObjCCategoryMethod(catname = "NSMutableOrderedSetCreation", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "+ (instancetype)orderedSetWithCapacity:(NSUInteger)numItems;", selector = "orderedSetWithCapacity:")
    public static native NSMutableOrderedSet orderedSetWithCapacity$(@NSUInteger long numItems);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSKeyValueSorting", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)sortUsingDescriptors:(NSArray *)sortDescriptors NS_AVAILABLE(10_7, 5_0);", selector = "sortUsingDescriptors:")
    public native void sortUsingDescriptors$(NSArray sortDescriptors);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSMutableOrderedSet")
    @ObjCMethodSign(sign = "- (void)filterUsingPredicate:(NSPredicate *)p NS_AVAILABLE(10_7, 5_0);", selector = "filterUsingPredicate:")
    public native void filterUsingPredicate$(NSPredicate p);
}
