package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSUbiquitousKeyValueStore extends NSObject  {
    
    public NSUbiquitousKeyValueStore() {}
    
    
    @ObjCMethodSign(sign = "- (id)objectForKey:(NSString *)aKey;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (void)setObject:(id)anObject forKey:(NSString *)aKey;", selector = "setObject:forKey:")
    public native void setObject$forKey$(NSObject anObject, NSString aKey);

    @ObjCMethodSign(sign = "- (void)removeObjectForKey:(NSString *)aKey;", selector = "removeObjectForKey:")
    public native void removeObjectForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (NSString *)stringForKey:(NSString *)aKey;", selector = "stringForKey:")
    public native NSString stringForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (NSArray *)arrayForKey:(NSString *)aKey;", selector = "arrayForKey:")
    public native NSArray arrayForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryForKey:(NSString *)aKey;", selector = "dictionaryForKey:")
    public native NSDictionary dictionaryForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (NSData *)dataForKey:(NSString *)aKey;", selector = "dataForKey:")
    public native NSData dataForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (long long)longLongForKey:(NSString *)aKey;", selector = "longLongForKey:")
    public native @LongLong long longLongForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (double)doubleForKey:(NSString *)aKey;", selector = "doubleForKey:")
    public native double doubleForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (BOOL)boolForKey:(NSString *)aKey;", selector = "boolForKey:")
    public native boolean boolForKey$(NSString aKey);

    @ObjCMethodSign(sign = "- (void)setString:(NSString *)aString forKey:(NSString *)aKey;", selector = "setString:forKey:")
    public native void setString$forKey$(NSString aString, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setData:(NSData *)aData forKey:(NSString *)aKey;", selector = "setData:forKey:")
    public native void setData$forKey$(NSData aData, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setArray:(NSArray *)anArray forKey:(NSString *)aKey;", selector = "setArray:forKey:")
    public native void setArray$forKey$(NSArray anArray, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setDictionary:(NSDictionary *)aDictionary forKey:(NSString *)aKey;", selector = "setDictionary:forKey:")
    public native void setDictionary$forKey$(NSDictionary aDictionary, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setLongLong:(long long)value forKey:(NSString *)aKey;", selector = "setLongLong:forKey:")
    public native void setLongLong$forKey$(@LongLong long value, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setDouble:(double)value forKey:(NSString *)aKey;", selector = "setDouble:forKey:")
    public native void setDouble$forKey$(double value, NSString aKey);

    @ObjCMethodSign(sign = "- (void)setBool:(BOOL)value forKey:(NSString *)aKey;", selector = "setBool:forKey:")
    public native void setBool$forKey$(boolean value, NSString aKey);

    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryRepresentation;", selector = "dictionaryRepresentation")
    public native NSDictionary dictionaryRepresentation();

    @ObjCMethodSign(sign = "- (BOOL)synchronize;", selector = "synchronize")
    public native boolean synchronize();

    @ObjCMethodSign(sign = "+ (NSUbiquitousKeyValueStore *)defaultStore;", selector = "defaultStore")
    public static native NSUbiquitousKeyValueStore defaultStore();
}
