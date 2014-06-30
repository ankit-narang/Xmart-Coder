package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableDictionary extends NSDictionary  {
    
    public NSMutableDictionary() {}
    
    
    @ObjCMethodSign(sign = "- (void)removeObjectForKey:(id)aKey;", selector = "removeObjectForKey:")
    public native void removeObjectForKey$(NSObject aKey);

    @ObjCMethodSign(sign = "- (void)setObject:(id)anObject forKey:(id <NSCopying>)aKey;", selector = "setObject:forKey:")
    public native void setObject$forKey$(NSObject anObject, NSCopying aKey);

    @ObjCCategoryMethod(catname = "NSExtendedMutableDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)addEntriesFromDictionary:(NSDictionary *)otherDictionary;", selector = "addEntriesFromDictionary:")
    public native void addEntriesFromDictionary$(NSDictionary otherDictionary);

    @ObjCCategoryMethod(catname = "NSExtendedMutableDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)removeAllObjects;", selector = "removeAllObjects")
    public native void removeAllObjects();

    @ObjCCategoryMethod(catname = "NSExtendedMutableDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)removeObjectsForKeys:(NSArray *)keyArray;", selector = "removeObjectsForKeys:")
    public native void removeObjectsForKeys$(NSArray keyArray);

    @ObjCCategoryMethod(catname = "NSExtendedMutableDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)setDictionary:(NSDictionary *)otherDictionary;", selector = "setDictionary:")
    public native void setDictionary(NSDictionary otherDictionary);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedMutableDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)setObject:(id)obj forKeyedSubscript:(id <NSCopying>)key NS_AVAILABLE(10_8, 6_0);", selector = "setObject:forKeyedSubscript:")
    public native void setObject$forKeyedSubscript$(NSObject obj, NSCopying key);

    @ObjCCategoryMethod(catname = "NSMutableDictionaryCreation", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSMutableDictionary init();

    @ObjCCategoryMethod(catname = "NSMutableDictionaryCreation", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithCapacity:(NSUInteger)numItems;", selector = "initWithCapacity:")
    public native NSMutableDictionary initWithCapacity$(@NSUInteger long numItems);

    @ObjCCategoryMethod(catname = "NSMutableDictionaryCreation", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithCapacity:(NSUInteger)numItems;", selector = "dictionaryWithCapacity:")
    public static native NSMutableDictionary dictionaryWithCapacity$(@NSUInteger long numItems);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSSharedKeySetDictionary", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "+ (id /* NSMutableDictionary * */)dictionaryWithSharedKeySet:(id)keyset NS_AVAILABLE(10_8, 6_0);", selector = "dictionaryWithSharedKeySet:")
    public static native NSObject dictionaryWithSharedKeySet$(NSObject keyset);

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSMutableDictionary")
    @ObjCMethodSign(sign = "- (void)setValue:(id)value forKey:(NSString *)key;", selector = "setValue:forKey:")
    public native void setValue$forKey$(NSObject value, NSString key);
}
