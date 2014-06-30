package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCache extends NSObject  {
    
    public NSCache() {}
    
    
    @ObjCMethodSign(sign = "- (void)setName:(NSString *)n;", selector = "setName:")
    public native void setName(NSString n);

    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSCacheDelegate>)d;", selector = "setDelegate:")
    public native void setDelegate(NSCacheDelegate d);

    @ObjCMethodSign(sign = "- (id <NSCacheDelegate>)delegate;", selector = "delegate")
    public native NSCacheDelegate delegate();

    @ObjCMethodSign(sign = "- (id)objectForKey:(id)key;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSObject key);

    @ObjCMethodSign(sign = "- (void)setObject:(id)obj forKey:(id)key;", selector = "setObject:forKey:")
    public native void setObject$forKey$(NSObject obj, NSObject key);

    @ObjCMethodSign(sign = "- (void)setObject:(id)obj forKey:(id)key cost:(NSUInteger)g;", selector = "setObject:forKey:cost:")
    public native void setObject$forKey$cost$(NSObject obj, NSObject key, @NSUInteger long g);

    @ObjCMethodSign(sign = "- (void)removeObjectForKey:(id)key;", selector = "removeObjectForKey:")
    public native void removeObjectForKey$(NSObject key);

    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCMethodSign(sign = "- (void)setTotalCostLimit:(NSUInteger)lim;", selector = "setTotalCostLimit:")
    public native void setTotalCostLimit(@NSUInteger long lim);

    @ObjCMethodSign(sign = "- (NSUInteger)totalCostLimit;", selector = "totalCostLimit")
    public native @NSUInteger long totalCostLimit();

    @ObjCMethodSign(sign = "- (void)setCountLimit:(NSUInteger)lim;", selector = "setCountLimit:")
    public native void setCountLimit(@NSUInteger long lim);

    @ObjCMethodSign(sign = "- (NSUInteger)countLimit;", selector = "countLimit")
    public native @NSUInteger long countLimit();

    @ObjCMethodSign(sign = "- (BOOL)evictsObjectsWithDiscardedContent;", selector = "evictsObjectsWithDiscardedContent")
    public native boolean evictsObjectsWithDiscardedContent();

    @ObjCMethodSign(sign = "- (void)setEvictsObjectsWithDiscardedContent:(BOOL)b;", selector = "setEvictsObjectsWithDiscardedContent:")
    public native void setEvictsObjectsWithDiscardedContent(boolean b);
}
