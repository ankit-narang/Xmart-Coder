package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCountedSet extends NSMutableSet  {
    
    public NSCountedSet() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithCapacity:(NSUInteger)numItems;", selector = "initWithCapacity:")
    public native NSCountedSet initWithCapacity$(@NSUInteger long numItems);

    @ObjCMethodSign(sign = "- (id)initWithArray:(NSArray *)array;", selector = "initWithArray:")
    public native NSCountedSet initWithArray$(NSArray array);

    @ObjCMethodSign(sign = "- (id)initWithSet:(NSSet *)set;", selector = "initWithSet:")
    public native NSCountedSet initWithSet$(NSSet set);

    @ObjCMethodSign(sign = "- (NSUInteger)countForObject:(id)object;", selector = "countForObject:")
    public native @NSUInteger long countForObject$(NSObject object);

    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCMethodSign(sign = "- (void)addObject:(id)object;", selector = "addObject:")
    public native void addObject$(NSObject object);

    @ObjCMethodSign(sign = "- (void)removeObject:(id)object;", selector = "removeObject:")
    public native void removeObject$(NSObject object);
}
