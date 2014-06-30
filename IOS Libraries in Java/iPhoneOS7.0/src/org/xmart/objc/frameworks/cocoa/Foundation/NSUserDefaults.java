package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSUserDefaults extends NSObject  {
    
    public NSUserDefaults() {}
    
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSUserDefaults init();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithSuiteName:(NSString *)suitename NS_AVAILABLE(10_9, 7_0);", selector = "initWithSuiteName:")
    public native NSUserDefaults initWithSuiteName$(NSString suitename);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (id)initWithUser:(NSString *)username NS_DEPRECATED(10_0, 10_9, 2_0, 7_0);", selector = "initWithUser:")
    public native NSUserDefaults initWithUser$(NSString username);

    @ObjCMethodSign(sign = "- (id)objectForKey:(NSString *)defaultName;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (void)setObject:(id)value forKey:(NSString *)defaultName;", selector = "setObject:forKey:")
    public native void setObject$forKey$(NSObject value, NSString defaultName);

    @ObjCMethodSign(sign = "- (void)removeObjectForKey:(NSString *)defaultName;", selector = "removeObjectForKey:")
    public native void removeObjectForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSString *)stringForKey:(NSString *)defaultName;", selector = "stringForKey:")
    public native NSString stringForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSArray *)arrayForKey:(NSString *)defaultName;", selector = "arrayForKey:")
    public native NSArray arrayForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryForKey:(NSString *)defaultName;", selector = "dictionaryForKey:")
    public native NSDictionary dictionaryForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSData *)dataForKey:(NSString *)defaultName;", selector = "dataForKey:")
    public native NSData dataForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSArray *)stringArrayForKey:(NSString *)defaultName;", selector = "stringArrayForKey:")
    public native NSArray stringArrayForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (NSInteger)integerForKey:(NSString *)defaultName;", selector = "integerForKey:")
    public native @NSInteger long integerForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (float)floatForKey:(NSString *)defaultName;", selector = "floatForKey:")
    public native float floatForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (double)doubleForKey:(NSString *)defaultName;", selector = "doubleForKey:")
    public native double doubleForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (BOOL)boolForKey:(NSString *)defaultName;", selector = "boolForKey:")
    public native boolean boolForKey$(NSString defaultName);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForKey:(NSString *)defaultName NS_AVAILABLE(10_6, 4_0);", selector = "URLForKey:")
    public native NSURL URLForKey$(NSString defaultName);

    @ObjCMethodSign(sign = "- (void)setInteger:(NSInteger)value forKey:(NSString *)defaultName;", selector = "setInteger:forKey:")
    public native void setInteger$forKey$(@NSInteger long value, NSString defaultName);

    @ObjCMethodSign(sign = "- (void)setFloat:(float)value forKey:(NSString *)defaultName;", selector = "setFloat:forKey:")
    public native void setFloat$forKey$(float value, NSString defaultName);

    @ObjCMethodSign(sign = "- (void)setDouble:(double)value forKey:(NSString *)defaultName;", selector = "setDouble:forKey:")
    public native void setDouble$forKey$(double value, NSString defaultName);

    @ObjCMethodSign(sign = "- (void)setBool:(BOOL)value forKey:(NSString *)defaultName;", selector = "setBool:forKey:")
    public native void setBool$forKey$(boolean value, NSString defaultName);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setURL:(NSURL *)url forKey:(NSString *)defaultName NS_AVAILABLE(10_6, 4_0);", selector = "setURL:forKey:")
    public native void setURL$forKey$(NSURL url, NSString defaultName);

    @ObjCMethodSign(sign = "- (void)registerDefaults:(NSDictionary *)registrationDictionary;", selector = "registerDefaults:")
    public native void registerDefaults$(NSDictionary registrationDictionary);

    @ObjCMethodSign(sign = "- (void)addSuiteNamed:(NSString *)suiteName;", selector = "addSuiteNamed:")
    public native void addSuiteNamed$(NSString suiteName);

    @ObjCMethodSign(sign = "- (void)removeSuiteNamed:(NSString *)suiteName;", selector = "removeSuiteNamed:")
    public native void removeSuiteNamed$(NSString suiteName);

    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryRepresentation;", selector = "dictionaryRepresentation")
    public native NSDictionary dictionaryRepresentation();

    @ObjCMethodSign(sign = "- (NSArray *)volatileDomainNames;", selector = "volatileDomainNames")
    public native NSArray volatileDomainNames();

    @ObjCMethodSign(sign = "- (NSDictionary *)volatileDomainForName:(NSString *)domainName;", selector = "volatileDomainForName:")
    public native NSDictionary volatileDomainForName$(NSString domainName);

    @ObjCMethodSign(sign = "- (void)setVolatileDomain:(NSDictionary *)domain forName:(NSString *)domainName;", selector = "setVolatileDomain:forName:")
    public native void setVolatileDomain$forName$(NSDictionary domain, NSString domainName);

    @ObjCMethodSign(sign = "- (void)removeVolatileDomainForName:(NSString *)domainName;", selector = "removeVolatileDomainForName:")
    public native void removeVolatileDomainForName$(NSString domainName);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (NSArray *)persistentDomainNames NS_DEPRECATED(10_0, 10_9, 2_0, 7_0);", selector = "persistentDomainNames")
    public native NSArray persistentDomainNames();

    @ObjCMethodSign(sign = "- (NSDictionary *)persistentDomainForName:(NSString *)domainName;", selector = "persistentDomainForName:")
    public native NSDictionary persistentDomainForName$(NSString domainName);

    @ObjCMethodSign(sign = "- (void)setPersistentDomain:(NSDictionary *)domain forName:(NSString *)domainName;", selector = "setPersistentDomain:forName:")
    public native void setPersistentDomain$forName$(NSDictionary domain, NSString domainName);

    @ObjCMethodSign(sign = "- (void)removePersistentDomainForName:(NSString *)domainName;", selector = "removePersistentDomainForName:")
    public native void removePersistentDomainForName$(NSString domainName);

    @ObjCMethodSign(sign = "- (BOOL)synchronize;", selector = "synchronize")
    public native boolean synchronize();

    @ObjCMethodSign(sign = "- (BOOL)objectIsForcedForKey:(NSString *)key;", selector = "objectIsForcedForKey:")
    public native boolean objectIsForcedForKey$(NSString key);

    @ObjCMethodSign(sign = "- (BOOL)objectIsForcedForKey:(NSString *)key inDomain:(NSString *)domain;", selector = "objectIsForcedForKey:inDomain:")
    public native boolean objectIsForcedForKey$inDomain$(NSString key, NSString domain);

    @ObjCMethodSign(sign = "+ (NSUserDefaults *)standardUserDefaults;", selector = "standardUserDefaults")
    public static native NSUserDefaults standardUserDefaults();

    @ObjCMethodSign(sign = "+ (void)resetStandardUserDefaults;", selector = "resetStandardUserDefaults")
    public static native void resetStandardUserDefaults();
}
