package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableArray extends NSArray  {
    
    public NSMutableArray() {}
    
    
    @ObjCMethodSign(sign = "- (void)addObject:(id)anObject;", selector = "addObject:")
    public native void addObject$(NSObject anObject);

    @ObjCMethodSign(sign = "- (void)insertObject:(id)anObject atIndex:(NSUInteger)index;", selector = "insertObject:atIndex:")
    public native void insertObject$atIndex$(NSObject anObject, @NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)removeLastObject;", selector = "removeLastObject")
    public native void removeLastObject();

    @ObjCMethodSign(sign = "- (void)removeObjectAtIndex:(NSUInteger)index;", selector = "removeObjectAtIndex:")
    public native void removeObjectAtIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (void)replaceObjectAtIndex:(NSUInteger)index withObject:(id)anObject;", selector = "replaceObjectAtIndex:withObject:")
    public native void replaceObjectAtIndex$withObject$(@NSUInteger long index, NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)addObjectsFromArray:(NSArray *)otherArray;", selector = "addObjectsFromArray:")
    public native void addObjectsFromArray$(NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)exchangeObjectAtIndex:(NSUInteger)idx1 withObjectAtIndex:(NSUInteger)idx2;", selector = "exchangeObjectAtIndex:withObjectAtIndex:")
    public native void exchangeObjectAtIndex$withObjectAtIndex$(@NSUInteger long idx1, @NSUInteger long idx2);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObject:(id)anObject inRange:(NSRange)range;", selector = "removeObject:inRange:")
    public native void removeObject$inRange$(NSObject anObject, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObject:(id)anObject;", selector = "removeObject:")
    public native void removeObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectIdenticalTo:(id)anObject inRange:(NSRange)range;", selector = "removeObjectIdenticalTo:inRange:")
    public native void removeObjectIdenticalTo$inRange$(NSObject anObject, @ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectIdenticalTo:(id)anObject;", selector = "removeObjectIdenticalTo:")
    public native void removeObjectIdenticalTo$(NSObject anObject);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 4.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectsFromIndices:(NSUInteger *)indices numIndices:(NSUInteger)cnt NS_DEPRECATED(10_0, 10_6, 2_0, 4_0);", selector = "removeObjectsFromIndices:numIndices:")
    public native void removeObjectsFromIndices$numIndices$(@NSUInteger long[] indices, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectsInArray:(NSArray *)otherArray;", selector = "removeObjectsInArray:")
    public native void removeObjectsInArray$(NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectsInRange:(NSRange)range;", selector = "removeObjectsInRange:")
    public native void removeObjectsInRange$(@ObjCByValue NSRange range);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)replaceObjectsInRange:(NSRange)range withObjectsFromArray:(NSArray *)otherArray range:(NSRange)otherRange;", selector = "replaceObjectsInRange:withObjectsFromArray:range:")
    public native void replaceObjectsInRange$withObjectsFromArray$range$(@ObjCByValue NSRange range, NSArray otherArray, @ObjCByValue NSRange otherRange);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)replaceObjectsInRange:(NSRange)range withObjectsFromArray:(NSArray *)otherArray;", selector = "replaceObjectsInRange:withObjectsFromArray:")
    public native void replaceObjectsInRange$withObjectsFromArray$(@ObjCByValue NSRange range, NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)setArray:(NSArray *)otherArray;", selector = "setArray:")
    public native void setArray(NSArray otherArray);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)sortUsingFunction:(NSInteger (*)(id, id, void *))compare context:(void *)context;", selector = "sortUsingFunction:context:")
    public native void sortUsingFunction$context$(ObjCFunctionPtr compare, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)sortUsingSelector:(SEL)comparator;", selector = "sortUsingSelector:")
    public native void sortUsingSelector$(ObjCSelector comparator);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)insertObjects:(NSArray *)objects atIndexes:(NSIndexSet *)indexes;", selector = "insertObjects:atIndexes:")
    public native void insertObjects$atIndexes$(NSArray objects, NSIndexSet indexes);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)removeObjectsAtIndexes:(NSIndexSet *)indexes;", selector = "removeObjectsAtIndexes:")
    public native void removeObjectsAtIndexes$(NSIndexSet indexes);

    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)replaceObjectsAtIndexes:(NSIndexSet *)indexes withObjects:(NSArray *)objects;", selector = "replaceObjectsAtIndexes:withObjects:")
    public native void replaceObjectsAtIndexes$withObjects$(NSIndexSet indexes, NSArray objects);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)setObject:(id)obj atIndexedSubscript:(NSUInteger)idx NS_AVAILABLE(10_8, 6_0);", selector = "setObject:atIndexedSubscript:")
    public native void setObject$atIndexedSubscript$(NSObject obj, @NSUInteger long idx);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)sortUsingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "sortUsingComparator:")
    public native void sortUsingComparator$(ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedMutableArray", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)sortWithOptions:(NSSortOptions)opts usingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "sortWithOptions:usingComparator:")
    public native void sortWithOptions$usingComparator$(NSSortOptions opts, ObjCFunctionPtr cmptr);

    @ObjCCategoryMethod(catname = "NSMutableArrayCreation", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSMutableArray init();

    @ObjCCategoryMethod(catname = "NSMutableArrayCreation", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (instancetype)initWithCapacity:(NSUInteger)numItems;", selector = "initWithCapacity:")
    public native NSMutableArray initWithCapacity$(@NSUInteger long numItems);

    @ObjCCategoryMethod(catname = "NSMutableArrayCreation", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "+ (instancetype)arrayWithCapacity:(NSUInteger)numItems;", selector = "arrayWithCapacity:")
    public static native NSMutableArray arrayWithCapacity$(@NSUInteger long numItems);

    @ObjCCategoryMethod(catname = "NSSortDescriptorSorting", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)sortUsingDescriptors:(NSArray *)sortDescriptors;", selector = "sortUsingDescriptors:")
    public native void sortUsingDescriptors$(NSArray sortDescriptors);

    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSMutableArray")
    @ObjCMethodSign(sign = "- (void)filterUsingPredicate:(NSPredicate *)predicate;", selector = "filterUsingPredicate:")
    public native void filterUsingPredicate$(NSPredicate predicate);
}
