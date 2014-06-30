package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSIndexSet extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    
    public NSIndexSet() {}
    
    
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSIndexSet init();

    @ObjCMethodSign(sign = "- (instancetype)initWithIndexesInRange:(NSRange)range;", selector = "initWithIndexesInRange:")
    public native NSIndexSet initWithIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (instancetype)initWithIndexSet:(NSIndexSet *)indexSet;", selector = "initWithIndexSet:")
    public native NSIndexSet initWithIndexSet$(NSIndexSet indexSet);

    @ObjCMethodSign(sign = "- (instancetype)initWithIndex:(NSUInteger)value;", selector = "initWithIndex:")
    public native NSIndexSet initWithIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (BOOL)isEqualToIndexSet:(NSIndexSet *)indexSet;", selector = "isEqualToIndexSet:")
    public native boolean isEqualToIndexSet$(NSIndexSet indexSet);

    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (NSUInteger)firstIndex;", selector = "firstIndex")
    public native @NSUInteger long firstIndex();

    @ObjCMethodSign(sign = "- (NSUInteger)lastIndex;", selector = "lastIndex")
    public native @NSUInteger long lastIndex();

    @ObjCMethodSign(sign = "- (NSUInteger)indexGreaterThanIndex:(NSUInteger)value;", selector = "indexGreaterThanIndex:")
    public native @NSUInteger long indexGreaterThanIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (NSUInteger)indexLessThanIndex:(NSUInteger)value;", selector = "indexLessThanIndex:")
    public native @NSUInteger long indexLessThanIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (NSUInteger)indexGreaterThanOrEqualToIndex:(NSUInteger)value;", selector = "indexGreaterThanOrEqualToIndex:")
    public native @NSUInteger long indexGreaterThanOrEqualToIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (NSUInteger)indexLessThanOrEqualToIndex:(NSUInteger)value;", selector = "indexLessThanOrEqualToIndex:")
    public native @NSUInteger long indexLessThanOrEqualToIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (NSUInteger)getIndexes:(NSUInteger *)indexBuffer maxCount:(NSUInteger)bufferSize inIndexRange:(NSRangePointer)range;", selector = "getIndexes:maxCount:inIndexRange:")
    public native @NSUInteger long getIndexes$maxCount$inIndexRange$(@NSUInteger long[] indexBuffer, @NSUInteger long bufferSize, NSRange range);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)countOfIndexesInRange:(NSRange)range NS_AVAILABLE(10_5, 2_0);", selector = "countOfIndexesInRange:")
    public native @NSUInteger long countOfIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (BOOL)containsIndex:(NSUInteger)value;", selector = "containsIndex:")
    public native boolean containsIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (BOOL)containsIndexesInRange:(NSRange)range;", selector = "containsIndexesInRange:")
    public native boolean containsIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (BOOL)containsIndexes:(NSIndexSet *)indexSet;", selector = "containsIndexes:")
    public native boolean containsIndexes$(NSIndexSet indexSet);

    @ObjCMethodSign(sign = "- (BOOL)intersectsIndexesInRange:(NSRange)range;", selector = "intersectsIndexesInRange:")
    public native boolean intersectsIndexesInRange$(@ObjCByValue NSRange range);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateIndexesUsingBlock:(void (^)(NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateIndexesUsingBlock:")
    public native void enumerateIndexesUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateIndexesWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateIndexesWithOptions:usingBlock:")
    public native void enumerateIndexesWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateIndexesInRange:(NSRange)range options:(NSEnumerationOptions)opts usingBlock:(void (^)(NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateIndexesInRange:options:usingBlock:")
    public native void enumerateIndexesInRange$options$usingBlock$(@ObjCByValue NSRange range, NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)indexPassingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexPassingTest:")
    public native @NSUInteger long indexPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)indexWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexWithOptions:passingTest:")
    public native @NSUInteger long indexWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)indexInRange:(NSRange)range options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexInRange:options:passingTest:")
    public native @NSUInteger long indexInRange$options$passingTest$(@ObjCByValue NSRange range, NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesPassingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesPassingTest:")
    public native NSIndexSet indexesPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesWithOptions:passingTest:")
    public native NSIndexSet indexesWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSIndexSet *)indexesInRange:(NSRange)range options:(NSEnumerationOptions)opts passingTest:(BOOL (^)(NSUInteger idx, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "indexesInRange:options:passingTest:")
    public native NSIndexSet indexesInRange$options$passingTest$(@ObjCByValue NSRange range, NSEnumerationOptions opts, ObjCBlock predicate);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateRangesUsingBlock:(void (^)(NSRange range, BOOL *stop))block NS_AVAILABLE(10_7, 5_0);", selector = "enumerateRangesUsingBlock:")
    public native void enumerateRangesUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateRangesWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(NSRange range, BOOL *stop))block NS_AVAILABLE(10_7, 5_0);", selector = "enumerateRangesWithOptions:usingBlock:")
    public native void enumerateRangesWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateRangesInRange:(NSRange)range options:(NSEnumerationOptions)opts usingBlock:(void (^)(NSRange range, BOOL *stop))block NS_AVAILABLE(10_7, 5_0);", selector = "enumerateRangesInRange:options:usingBlock:")
    public native void enumerateRangesInRange$options$usingBlock$(@ObjCByValue NSRange range, NSEnumerationOptions opts, ObjCBlock block);

    @ObjCMethodSign(sign = "+ (instancetype)indexSet;", selector = "indexSet")
    public static native NSIndexSet indexSet();

    @ObjCMethodSign(sign = "+ (instancetype)indexSetWithIndex:(NSUInteger)value;", selector = "indexSetWithIndex:")
    public static native NSIndexSet indexSetWithIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "+ (instancetype)indexSetWithIndexesInRange:(NSRange)range;", selector = "indexSetWithIndexesInRange:")
    public static native NSIndexSet indexSetWithIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSIndexSet initWithCoder$(NSCoder aDecoder);
}
