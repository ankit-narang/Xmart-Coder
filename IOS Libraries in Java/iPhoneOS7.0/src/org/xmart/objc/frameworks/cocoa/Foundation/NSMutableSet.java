package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableSet extends NSSet  {
    
    public NSMutableSet() {}
    
    
    @ObjCMethodSign(sign = "- (void)addObject:(id)object;", selector = "addObject:")
    public native void addObject$(NSObject object);

    @ObjCMethodSign(sign = "- (void)removeObject:(id)object;", selector = "removeObject:")
    public native void removeObject$(NSObject object);

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)addObjectsFromArray:(NSArray *)array;", selector = "addObjectsFromArray:")
    public native void addObjectsFromArray$(NSArray array);

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)intersectSet:(NSSet *)otherSet;", selector = "intersectSet:")
    public native void intersectSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)minusSet:(NSSet *)otherSet;", selector = "minusSet:")
    public native void minusSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)unionSet:(NSSet *)otherSet;", selector = "unionSet:")
    public native void unionSet$(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSExtendedMutableSet", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)setSet:(NSSet *)otherSet;", selector = "setSet:")
    public native void setSet(NSSet otherSet);

    @ObjCCategoryMethod(catname = "NSMutableSetCreation", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSMutableSet init();

    @ObjCCategoryMethod(catname = "NSMutableSetCreation", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (instancetype)initWithCapacity:(NSUInteger)numItems;", selector = "initWithCapacity:")
    public native NSMutableSet initWithCapacity$(@NSUInteger long numItems);

    @ObjCCategoryMethod(catname = "NSMutableSetCreation", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "+ (instancetype)setWithCapacity:(NSUInteger)numItems;", selector = "setWithCapacity:")
    public static native NSMutableSet setWithCapacity$(@NSUInteger long numItems);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSPredicateSupport", catownername = "NSMutableSet")
    @ObjCMethodSign(sign = "- (void)filterUsingPredicate:(NSPredicate *)predicate NS_AVAILABLE(10_5, 3_0);", selector = "filterUsingPredicate:")
    public native void filterUsingPredicate$(NSPredicate predicate);
}
