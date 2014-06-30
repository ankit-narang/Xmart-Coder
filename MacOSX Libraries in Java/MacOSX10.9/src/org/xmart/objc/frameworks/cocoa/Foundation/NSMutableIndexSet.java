package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableIndexSet extends NSIndexSet  {
    
    public NSMutableIndexSet() {}
    
    
    @ObjCMethodSign(sign = "- (void)addIndexes:(NSIndexSet *)indexSet;", selector = "addIndexes:")
    public native void addIndexes$(NSIndexSet indexSet);

    @ObjCMethodSign(sign = "- (void)removeIndexes:(NSIndexSet *)indexSet;", selector = "removeIndexes:")
    public native void removeIndexes$(NSIndexSet indexSet);

    @ObjCMethodSign(sign = "- (void)removeAllIndexes;", selector = "removeAllIndexes")
    public native void removeAllIndexes();

    @ObjCMethodSign(sign = "- (void)addIndex:(NSUInteger)value;", selector = "addIndex:")
    public native void addIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (void)removeIndex:(NSUInteger)value;", selector = "removeIndex:")
    public native void removeIndex$(@NSUInteger long value);

    @ObjCMethodSign(sign = "- (void)addIndexesInRange:(NSRange)range;", selector = "addIndexesInRange:")
    public native void addIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (void)removeIndexesInRange:(NSRange)range;", selector = "removeIndexesInRange:")
    public native void removeIndexesInRange$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (void)shiftIndexesStartingAtIndex:(NSUInteger)index by:(NSInteger)delta;", selector = "shiftIndexesStartingAtIndex:by:")
    public native void shiftIndexesStartingAtIndex$by$(@NSUInteger long index, @NSInteger long delta);
}
