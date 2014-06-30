package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSIndexPath extends NSObject implements NSCopying, NSCoding {
    
    public NSIndexPath() {}
    
    
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSIndexPath init();

    @ObjCMethodSign(sign = "- (instancetype)initWithIndexes:(const NSUInteger [])indexes length:(NSUInteger)length;", selector = "initWithIndexes:length:")
    public native NSIndexPath initWithIndexes$length$(@NSUInteger long[] indexes, @NSUInteger long length);

    @ObjCMethodSign(sign = "- (instancetype)initWithIndex:(NSUInteger)index;", selector = "initWithIndex:")
    public native NSIndexPath initWithIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathByAddingIndex:(NSUInteger)index;", selector = "indexPathByAddingIndex:")
    public native NSIndexPath indexPathByAddingIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathByRemovingLastIndex;", selector = "indexPathByRemovingLastIndex")
    public native NSIndexPath indexPathByRemovingLastIndex();

    @ObjCMethodSign(sign = "- (NSUInteger)indexAtPosition:(NSUInteger)position;", selector = "indexAtPosition:")
    public native @NSUInteger long indexAtPosition$(@NSUInteger long position);

    @ObjCMethodSign(sign = "- (NSUInteger)length;", selector = "length")
    public native @NSUInteger long length();

    @ObjCMethodSign(sign = "- (void)getIndexes:(NSUInteger *)indexes;", selector = "getIndexes:")
    public native void getIndexes$(@NSUInteger long[] indexes);

    @ObjCMethodSign(sign = "- (NSComparisonResult)compare:(NSIndexPath *)otherObject;", selector = "compare:")
    public native NSComparisonResult compare$(NSIndexPath otherObject);

    @ObjCMethodSign(sign = "+ (instancetype)indexPathWithIndex:(NSUInteger)index;", selector = "indexPathWithIndex:")
    public static native NSIndexPath indexPathWithIndex$(@NSUInteger long index);

    @ObjCMethodSign(sign = "+ (instancetype)indexPathWithIndexes:(const NSUInteger [])indexes length:(NSUInteger)length;", selector = "indexPathWithIndexes:length:")
    public static native NSIndexPath indexPathWithIndexes$length$(@NSUInteger long[] indexes, @NSUInteger long length);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSIndexPath initWithCoder$(NSCoder aDecoder);
}
