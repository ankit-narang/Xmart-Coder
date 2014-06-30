package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDictionary extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSFastEnumeration {
    
    public NSDictionary() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();

    @ObjCMethodSign(sign = "- (id)objectForKey:(id)aKey;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSObject aKey);

    @ObjCMethodSign(sign = "- (NSEnumerator *)keyEnumerator;", selector = "keyEnumerator")
    public native NSEnumerator keyEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)allKeys;", selector = "allKeys")
    public native NSArray allKeys();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)allKeysForObject:(id)anObject;", selector = "allKeysForObject:")
    public native NSArray allKeysForObject$(NSObject anObject);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)allValues;", selector = "allValues")
    public native NSArray allValues();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)description;", selector = "description")
    public native NSString description();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)descriptionInStringsFileFormat;", selector = "descriptionInStringsFileFormat")
    public native NSString descriptionInStringsFileFormat();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale;", selector = "descriptionWithLocale:")
    public native NSString descriptionWithLocale$(NSObject locale);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)descriptionWithLocale:(id)locale indent:(NSUInteger)level;", selector = "descriptionWithLocale:indent:")
    public native NSString descriptionWithLocale$indent$(NSObject locale, @NSUInteger long level);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)isEqualToDictionary:(NSDictionary *)otherDictionary;", selector = "isEqualToDictionary:")
    public native boolean isEqualToDictionary$(NSDictionary otherDictionary);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSEnumerator *)objectEnumerator;", selector = "objectEnumerator")
    public native NSEnumerator objectEnumerator();

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)objectsForKeys:(NSArray *)keys notFoundMarker:(id)marker;", selector = "objectsForKeys:notFoundMarker:")
    public native NSArray objectsForKeys$notFoundMarker$(NSArray keys, NSObject marker);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)writeToFile:(NSString *)path atomically:(BOOL)useAuxiliaryFile;", selector = "writeToFile:atomically:")
    public native boolean writeToFile$atomically$(NSString path, boolean useAuxiliaryFile);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)writeToURL:(NSURL *)url atomically:(BOOL)atomically;", selector = "writeToURL:atomically:")
    public native boolean writeToURL$atomically$(NSURL url, boolean atomically);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)keysSortedByValueUsingSelector:(SEL)comparator;", selector = "keysSortedByValueUsingSelector:")
    public native NSArray keysSortedByValueUsingSelector$(ObjCSelector comparator);

    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (void)getObjects:(id __unsafe_unretained [])objects andKeys:(id __unsafe_unretained [])keys;", selector = "getObjects:andKeys:")
    public native void getObjects$andKeys$(NSObject[] objects, NSObject[] keys);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (id)objectForKeyedSubscript:(id)key NS_AVAILABLE(10_8, 6_0);", selector = "objectForKeyedSubscript:")
    public native NSObject objectForKeyedSubscript$(NSObject key);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (void)enumerateKeysAndObjectsUsingBlock:(void (^)(id key, id obj, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateKeysAndObjectsUsingBlock:")
    public native void enumerateKeysAndObjectsUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (void)enumerateKeysAndObjectsWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(id key, id obj, BOOL *stop))block NS_AVAILABLE(10_6, 4_0);", selector = "enumerateKeysAndObjectsWithOptions:usingBlock:")
    public native void enumerateKeysAndObjectsWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)keysSortedByValueUsingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "keysSortedByValueUsingComparator:")
    public native NSArray keysSortedByValueUsingComparator$(ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSArray *)keysSortedByValueWithOptions:(NSSortOptions)opts usingComparator:(NSComparator)cmptr NS_AVAILABLE(10_6, 4_0);", selector = "keysSortedByValueWithOptions:usingComparator:")
    public native NSArray keysSortedByValueWithOptions$usingComparator$(NSSortOptions opts, ObjCFunctionPtr cmptr);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSSet *)keysOfEntriesPassingTest:(BOOL (^)(id key, id obj, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "keysOfEntriesPassingTest:")
    public native NSSet keysOfEntriesPassingTest$(ObjCBlock predicate);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSSet *)keysOfEntriesWithOptions:(NSEnumerationOptions)opts passingTest:(BOOL (^)(id key, id obj, BOOL *stop))predicate NS_AVAILABLE(10_6, 4_0);", selector = "keysOfEntriesWithOptions:passingTest:")
    public native NSSet keysOfEntriesWithOptions$passingTest$(NSEnumerationOptions opts, ObjCBlock predicate);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)init;", selector = "init")
    public native NSDictionary init();

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(const id [])objects forKeys:(const id <NSCopying> [])keys count:(NSUInteger)cnt;", selector = "initWithObjects:forKeys:count:")
    public native NSDictionary initWithObjects$forKeys$count$(NSObject[] objects, NSObject[] keys, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjectsAndKeys:(id)firstObject, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithObjectsAndKeys:")
    public native NSDictionary initWithObjectsAndKeys$(NSObject firstObject, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithDictionary:(NSDictionary *)otherDictionary;", selector = "initWithDictionary:")
    public native NSDictionary initWithDictionary$(NSDictionary otherDictionary);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithDictionary:(NSDictionary *)otherDictionary copyItems:(BOOL)flag;", selector = "initWithDictionary:copyItems:")
    public native NSDictionary initWithDictionary$copyItems$(NSDictionary otherDictionary, boolean flag);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (instancetype)initWithObjects:(NSArray *)objects forKeys:(NSArray *)keys;", selector = "initWithObjects:forKeys:")
    public native NSDictionary initWithObjects$forKeys$(NSArray objects, NSArray keys);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (id /* NSDictionary * */)initWithContentsOfFile:(NSString *)path;", selector = "initWithContentsOfFile:")
    public native NSDictionary initWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (id /* NSDictionary * */)initWithContentsOfURL:(NSURL *)url;", selector = "initWithContentsOfURL:")
    public native NSDictionary initWithContentsOfURL$(NSURL url);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionary;", selector = "dictionary")
    public static native NSDictionary dictionary();

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithObject:(id)object forKey:(id <NSCopying>)key;", selector = "dictionaryWithObject:forKey:")
    public static native NSDictionary dictionaryWithObject$forKey$(NSObject object, NSCopying key);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithObjects:(const id [])objects forKeys:(const id <NSCopying> [])keys count:(NSUInteger)cnt;", selector = "dictionaryWithObjects:forKeys:count:")
    public static native NSDictionary dictionaryWithObjects$forKeys$count$(NSObject[] objects, NSObject[] keys, @NSUInteger long cnt);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithObjectsAndKeys:(id)firstObject, ... NS_REQUIRES_NIL_TERMINATION;", selector = "dictionaryWithObjectsAndKeys:")
    public static native NSDictionary dictionaryWithObjectsAndKeys$(NSObject firstObject, NSObject... varArgs);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithDictionary:(NSDictionary *)dict;", selector = "dictionaryWithDictionary:")
    public static native NSDictionary dictionaryWithDictionary$(NSDictionary dict);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (instancetype)dictionaryWithObjects:(NSArray *)objects forKeys:(NSArray *)keys;", selector = "dictionaryWithObjects:forKeys:")
    public static native NSDictionary dictionaryWithObjects$forKeys$(NSArray objects, NSArray keys);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (id /* NSDictionary * */)dictionaryWithContentsOfFile:(NSString *)path;", selector = "dictionaryWithContentsOfFile:")
    public static native NSObject dictionaryWithContentsOfFile$(NSString path);

    @ObjCCategoryMethod(catname = "NSDictionaryCreation", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (id /* NSDictionary * */)dictionaryWithContentsOfURL:(NSURL *)url;", selector = "dictionaryWithContentsOfURL:")
    public static native NSObject dictionaryWithContentsOfURL$(NSURL url);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSSharedKeySetDictionary", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "+ (id)sharedKeySetForKeys:(NSArray *)keys NS_AVAILABLE(10_8, 6_0);", selector = "sharedKeySetForKeys:")
    public static native NSObject sharedKeySetForKeys$(NSArray keys);

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (unsigned long long)fileSize;", selector = "fileSize")
    public native @Unsigned @LongLong long fileSize();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSDate *)fileModificationDate;", selector = "fileModificationDate")
    public native NSDate fileModificationDate();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)fileType;", selector = "fileType")
    public native NSString fileType();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSUInteger)filePosixPermissions;", selector = "filePosixPermissions")
    public native @NSUInteger long filePosixPermissions();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)fileOwnerAccountName;", selector = "fileOwnerAccountName")
    public native NSString fileOwnerAccountName();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSString *)fileGroupOwnerAccountName;", selector = "fileGroupOwnerAccountName")
    public native NSString fileGroupOwnerAccountName();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSInteger)fileSystemNumber;", selector = "fileSystemNumber")
    public native @NSInteger long fileSystemNumber();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSUInteger)fileSystemFileNumber;", selector = "fileSystemFileNumber")
    public native @NSUInteger long fileSystemFileNumber();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)fileExtensionHidden;", selector = "fileExtensionHidden")
    public native boolean fileExtensionHidden();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (OSType)fileHFSCreatorCode;", selector = "fileHFSCreatorCode")
    public native @Unsigned long fileHFSCreatorCode();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (OSType)fileHFSTypeCode;", selector = "fileHFSTypeCode")
    public native @Unsigned long fileHFSTypeCode();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)fileIsImmutable;", selector = "fileIsImmutable")
    public native boolean fileIsImmutable();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (BOOL)fileIsAppendOnly;", selector = "fileIsAppendOnly")
    public native boolean fileIsAppendOnly();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSDate *)fileCreationDate;", selector = "fileCreationDate")
    public native NSDate fileCreationDate();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSNumber *)fileOwnerAccountID;", selector = "fileOwnerAccountID")
    public native NSNumber fileOwnerAccountID();

    @ObjCCategoryMethod(catname = "NSFileAttributes", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (NSNumber *)fileGroupOwnerAccountID;", selector = "fileGroupOwnerAccountID")
    public native NSNumber fileGroupOwnerAccountID();

    @ObjCCategoryMethod(catname = "NSKeyValueCoding", catownername = "NSDictionary")
    @ObjCMethodSign(sign = "- (id)valueForKey:(NSString *)key;", selector = "valueForKey:")
    public native NSObject valueForKey$(NSString key);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSDictionary initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
