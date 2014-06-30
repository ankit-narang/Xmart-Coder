package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSBundle extends NSObject  {
    
    public NSBundle() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithPath:(NSString *)path;", selector = "initWithPath:")
    public native NSBundle initWithPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "initWithURL:")
    public native NSBundle initWithURL$(NSURL url);

    @ObjCMethodSign(sign = "- (BOOL)load;", selector = "load")
    public native boolean load();

    @ObjCMethodSign(sign = "- (BOOL)isLoaded;", selector = "isLoaded")
    public native boolean isLoaded();

    @ObjCMethodSign(sign = "- (BOOL)unload;", selector = "unload")
    public native boolean unload();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)preflightAndReturnError:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "preflightAndReturnError:")
    public native boolean preflightAndReturnError$(NSError[] error);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)loadAndReturnError:(NSError **)error NS_AVAILABLE(10_5, 2_0);", selector = "loadAndReturnError:")
    public native boolean loadAndReturnError$(NSError[] error);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)bundleURL NS_AVAILABLE(10_6, 4_0);", selector = "bundleURL")
    public native NSURL bundleURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)resourceURL NS_AVAILABLE(10_6, 4_0);", selector = "resourceURL")
    public native NSURL resourceURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)executableURL NS_AVAILABLE(10_6, 4_0);", selector = "executableURL")
    public native NSURL executableURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForAuxiliaryExecutable:(NSString *)executableName NS_AVAILABLE(10_6, 4_0);", selector = "URLForAuxiliaryExecutable:")
    public native NSURL URLForAuxiliaryExecutable$(NSString executableName);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)privateFrameworksURL NS_AVAILABLE(10_6, 4_0);", selector = "privateFrameworksURL")
    public native NSURL privateFrameworksURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)sharedFrameworksURL NS_AVAILABLE(10_6, 4_0);", selector = "sharedFrameworksURL")
    public native NSURL sharedFrameworksURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)sharedSupportURL NS_AVAILABLE(10_6, 4_0);", selector = "sharedSupportURL")
    public native NSURL sharedSupportURL();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)builtInPlugInsURL NS_AVAILABLE(10_6, 4_0);", selector = "builtInPlugInsURL")
    public native NSURL builtInPlugInsURL();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)appStoreReceiptURL NS_AVAILABLE(10_7, 7_0);", selector = "appStoreReceiptURL")
    public native NSURL appStoreReceiptURL();

    @ObjCMethodSign(sign = "- (NSString *)bundlePath;", selector = "bundlePath")
    public native NSString bundlePath();

    @ObjCMethodSign(sign = "- (NSString *)resourcePath;", selector = "resourcePath")
    public native NSString resourcePath();

    @ObjCMethodSign(sign = "- (NSString *)executablePath;", selector = "executablePath")
    public native NSString executablePath();

    @ObjCMethodSign(sign = "- (NSString *)pathForAuxiliaryExecutable:(NSString *)executableName;", selector = "pathForAuxiliaryExecutable:")
    public native NSString pathForAuxiliaryExecutable$(NSString executableName);

    @ObjCMethodSign(sign = "- (NSString *)privateFrameworksPath;", selector = "privateFrameworksPath")
    public native NSString privateFrameworksPath();

    @ObjCMethodSign(sign = "- (NSString *)sharedFrameworksPath;", selector = "sharedFrameworksPath")
    public native NSString sharedFrameworksPath();

    @ObjCMethodSign(sign = "- (NSString *)sharedSupportPath;", selector = "sharedSupportPath")
    public native NSString sharedSupportPath();

    @ObjCMethodSign(sign = "- (NSString *)builtInPlugInsPath;", selector = "builtInPlugInsPath")
    public native NSString builtInPlugInsPath();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForResource:(NSString *)name withExtension:(NSString *)ext NS_AVAILABLE(10_6, 4_0);", selector = "URLForResource:withExtension:")
    public native NSURL URLForResource$withExtension$(NSString name, NSString ext);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForResource:(NSString *)name withExtension:(NSString *)ext subdirectory:(NSString *)subpath NS_AVAILABLE(10_6, 4_0);", selector = "URLForResource:withExtension:subdirectory:")
    public native NSURL URLForResource$withExtension$subdirectory$(NSString name, NSString ext, NSString subpath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURL *)URLForResource:(NSString *)name withExtension:(NSString *)ext subdirectory:(NSString *)subpath localization:(NSString *)localizationName NS_AVAILABLE(10_6, 4_0);", selector = "URLForResource:withExtension:subdirectory:localization:")
    public native NSURL URLForResource$withExtension$subdirectory$localization$(NSString name, NSString ext, NSString subpath, NSString localizationName);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)URLsForResourcesWithExtension:(NSString *)ext subdirectory:(NSString *)subpath NS_AVAILABLE(10_6, 4_0);", selector = "URLsForResourcesWithExtension:subdirectory:")
    public native NSArray URLsForResourcesWithExtension$subdirectory$(NSString ext, NSString subpath);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)URLsForResourcesWithExtension:(NSString *)ext subdirectory:(NSString *)subpath localization:(NSString *)localizationName NS_AVAILABLE(10_6, 4_0);", selector = "URLsForResourcesWithExtension:subdirectory:localization:")
    public native NSArray URLsForResourcesWithExtension$subdirectory$localization$(NSString ext, NSString subpath, NSString localizationName);

    @ObjCMethodSign(sign = "- (NSString *)pathForResource:(NSString *)name ofType:(NSString *)ext;", selector = "pathForResource:ofType:")
    public native NSString pathForResource$ofType$(NSString name, NSString ext);

    @ObjCMethodSign(sign = "- (NSString *)pathForResource:(NSString *)name ofType:(NSString *)ext inDirectory:(NSString *)subpath;", selector = "pathForResource:ofType:inDirectory:")
    public native NSString pathForResource$ofType$inDirectory$(NSString name, NSString ext, NSString subpath);

    @ObjCMethodSign(sign = "- (NSString *)pathForResource:(NSString *)name ofType:(NSString *)ext inDirectory:(NSString *)subpath forLocalization:(NSString *)localizationName;", selector = "pathForResource:ofType:inDirectory:forLocalization:")
    public native NSString pathForResource$ofType$inDirectory$forLocalization$(NSString name, NSString ext, NSString subpath, NSString localizationName);

    @ObjCMethodSign(sign = "- (NSArray *)pathsForResourcesOfType:(NSString *)ext inDirectory:(NSString *)subpath;", selector = "pathsForResourcesOfType:inDirectory:")
    public native NSArray pathsForResourcesOfType$inDirectory$(NSString ext, NSString subpath);

    @ObjCMethodSign(sign = "- (NSArray *)pathsForResourcesOfType:(NSString *)ext inDirectory:(NSString *)subpath forLocalization:(NSString *)localizationName;", selector = "pathsForResourcesOfType:inDirectory:forLocalization:")
    public native NSArray pathsForResourcesOfType$inDirectory$forLocalization$(NSString ext, NSString subpath, NSString localizationName);

    @ObjCMethodSign(sign = "- (NSString *)localizedStringForKey:(NSString *)key value:(NSString *)value table:(NSString *)tableName NS_FORMAT_ARGUMENT(1);", selector = "localizedStringForKey:value:table:")
    public native NSString localizedStringForKey$value$table$(NSString key, NSString value, NSString tableName);

    @ObjCMethodSign(sign = "- (NSString *)bundleIdentifier;", selector = "bundleIdentifier")
    public native NSString bundleIdentifier();

    @ObjCMethodSign(sign = "- (NSDictionary *)infoDictionary;", selector = "infoDictionary")
    public native NSDictionary infoDictionary();

    @ObjCMethodSign(sign = "- (NSDictionary *)localizedInfoDictionary;", selector = "localizedInfoDictionary")
    public native NSDictionary localizedInfoDictionary();

    @ObjCMethodSign(sign = "- (id)objectForInfoDictionaryKey:(NSString *)key;", selector = "objectForInfoDictionaryKey:")
    public native NSObject objectForInfoDictionaryKey$(NSString key);

    @ObjCMethodSign(sign = "- (Class)classNamed:(NSString *)className;", selector = "classNamed:")
    public native ObjCClass classNamed$(NSString className);

    @ObjCMethodSign(sign = "- (Class)principalClass;", selector = "principalClass")
    public native ObjCClass principalClass();

    @ObjCMethodSign(sign = "- (NSArray *)preferredLocalizations;", selector = "preferredLocalizations")
    public native NSArray preferredLocalizations();

    @ObjCMethodSign(sign = "- (NSArray *)localizations;", selector = "localizations")
    public native NSArray localizations();

    @ObjCMethodSign(sign = "- (NSString *)developmentLocalization;", selector = "developmentLocalization")
    public native NSString developmentLocalization();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)executableArchitectures NS_AVAILABLE(10_5, 2_0);", selector = "executableArchitectures")
    public native NSArray executableArchitectures();

    @ObjCMethodSign(sign = "+ (NSBundle *)mainBundle;", selector = "mainBundle")
    public static native NSBundle mainBundle();

    @ObjCMethodSign(sign = "+ (NSBundle *)bundleWithPath:(NSString *)path;", selector = "bundleWithPath:")
    public static native NSBundle bundleWithPath$(NSString path);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSBundle *)bundleWithURL:(NSURL *)url NS_AVAILABLE(10_6, 4_0);", selector = "bundleWithURL:")
    public static native NSBundle bundleWithURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (NSBundle *)bundleForClass:(Class)aClass;", selector = "bundleForClass:")
    public static native NSBundle bundleForClass$(ObjCClass aClass);

    @ObjCMethodSign(sign = "+ (NSBundle *)bundleWithIdentifier:(NSString *)identifier;", selector = "bundleWithIdentifier:")
    public static native NSBundle bundleWithIdentifier$(NSString identifier);

    @ObjCMethodSign(sign = "+ (NSArray *)allBundles;", selector = "allBundles")
    public static native NSArray allBundles();

    @ObjCMethodSign(sign = "+ (NSArray *)allFrameworks;", selector = "allFrameworks")
    public static native NSArray allFrameworks();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSURL *)URLForResource:(NSString *)name withExtension:(NSString *)ext subdirectory:(NSString *)subpath inBundleWithURL:(NSURL *)bundleURL NS_AVAILABLE(10_6, 4_0);", selector = "URLForResource:withExtension:subdirectory:inBundleWithURL:")
    public static native NSURL URLForResource$withExtension$subdirectory$inBundleWithURL$(NSString name, NSString ext, NSString subpath, NSURL bundleURL);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)URLsForResourcesWithExtension:(NSString *)ext subdirectory:(NSString *)subpath inBundleWithURL:(NSURL *)bundleURL NS_AVAILABLE(10_6, 4_0);", selector = "URLsForResourcesWithExtension:subdirectory:inBundleWithURL:")
    public static native NSArray URLsForResourcesWithExtension$subdirectory$inBundleWithURL$(NSString ext, NSString subpath, NSURL bundleURL);

    @ObjCMethodSign(sign = "+ (NSString *)pathForResource:(NSString *)name ofType:(NSString *)ext inDirectory:(NSString *)bundlePath;", selector = "pathForResource:ofType:inDirectory:")
    public static native NSString pathForResource$ofType$inDirectory$__STATIC(NSString name, NSString ext, NSString bundlePath);

    @ObjCMethodSign(sign = "+ (NSArray *)pathsForResourcesOfType:(NSString *)ext inDirectory:(NSString *)bundlePath;", selector = "pathsForResourcesOfType:inDirectory:")
    public static native NSArray pathsForResourcesOfType$inDirectory$__STATIC(NSString ext, NSString bundlePath);

    @ObjCMethodSign(sign = "+ (NSArray *)preferredLocalizationsFromArray:(NSArray *)localizationsArray;", selector = "preferredLocalizationsFromArray:")
    public static native NSArray preferredLocalizationsFromArray$(NSArray localizationsArray);

    @ObjCMethodSign(sign = "+ (NSArray *)preferredLocalizationsFromArray:(NSArray *)localizationsArray forPreferences:(NSArray *)preferencesArray;", selector = "preferredLocalizationsFromArray:forPreferences:")
    public static native NSArray preferredLocalizationsFromArray$forPreferences$(NSArray localizationsArray, NSArray preferencesArray);
}
