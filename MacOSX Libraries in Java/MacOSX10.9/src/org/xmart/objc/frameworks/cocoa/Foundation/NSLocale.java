package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSLocale extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSLocale() {}
    
    
    @ObjCMethodSign(sign = "- (id)objectForKey:(id)key;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSObject key);

    @ObjCMethodSign(sign = "- (NSString *)displayNameForKey:(id)key value:(id)value;", selector = "displayNameForKey:value:")
    public native NSString displayNameForKey$value$(NSObject key, NSObject value);

    @ObjCCategoryMethod(catname = "NSExtendedLocale", catownername = "NSLocale")
    @ObjCMethodSign(sign = "- (NSString *)localeIdentifier;", selector = "localeIdentifier")
    public native NSString localeIdentifier();

    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "- (instancetype)initWithLocaleIdentifier:(NSString *)string;", selector = "initWithLocaleIdentifier:")
    public native NSLocale initWithLocaleIdentifier$(NSString string);

    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSLocale init();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (id /* NSLocale * */)autoupdatingCurrentLocale NS_AVAILABLE(10_5, 2_0);", selector = "autoupdatingCurrentLocale")
    public static native NSObject autoupdatingCurrentLocale();

    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (id /* NSLocale * */)currentLocale;", selector = "currentLocale")
    public static native NSObject currentLocale();

    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (id /* NSLocale * */)systemLocale;", selector = "systemLocale")
    public static native NSObject systemLocale();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleCreation", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (instancetype)localeWithLocaleIdentifier:(NSString *)ident NS_AVAILABLE(10_6, 4_0);", selector = "localeWithLocaleIdentifier:")
    public static native NSLocale localeWithLocaleIdentifier$(NSString ident);

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)availableLocaleIdentifiers;", selector = "availableLocaleIdentifiers")
    public static native NSArray availableLocaleIdentifiers();

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)ISOLanguageCodes;", selector = "ISOLanguageCodes")
    public static native NSArray ISOLanguageCodes();

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)ISOCountryCodes;", selector = "ISOCountryCodes")
    public static native NSArray ISOCountryCodes();

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)ISOCurrencyCodes;", selector = "ISOCurrencyCodes")
    public static native NSArray ISOCurrencyCodes();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)commonISOCurrencyCodes NS_AVAILABLE(10_5, 2_0);", selector = "commonISOCurrencyCodes")
    public static native NSArray commonISOCurrencyCodes();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSArray *)preferredLanguages NS_AVAILABLE(10_5, 2_0);", selector = "preferredLanguages")
    public static native NSArray preferredLanguages();

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSDictionary *)componentsFromLocaleIdentifier:(NSString *)string;", selector = "componentsFromLocaleIdentifier:")
    public static native NSDictionary componentsFromLocaleIdentifier$(NSString string);

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSString *)localeIdentifierFromComponents:(NSDictionary *)dict;", selector = "localeIdentifierFromComponents:")
    public static native NSString localeIdentifierFromComponents$(NSDictionary dict);

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSString *)canonicalLocaleIdentifierFromString:(NSString *)string;", selector = "canonicalLocaleIdentifierFromString:")
    public static native NSString canonicalLocaleIdentifierFromString$(NSString string);

    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSString *)canonicalLanguageIdentifierFromString:(NSString *)string;", selector = "canonicalLanguageIdentifierFromString:")
    public static native NSString canonicalLanguageIdentifierFromString$(NSString string);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSString *)localeIdentifierFromWindowsLocaleCode:(uint32_t)lcid NS_AVAILABLE(10_6, 4_0);", selector = "localeIdentifierFromWindowsLocaleCode:")
    public static native NSString localeIdentifierFromWindowsLocaleCode$(@Unsigned int lcid);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (uint32_t)windowsLocaleCodeFromLocaleIdentifier:(NSString *)localeIdentifier NS_AVAILABLE(10_6, 4_0);", selector = "windowsLocaleCodeFromLocaleIdentifier:")
    public static native @Unsigned int windowsLocaleCodeFromLocaleIdentifier$(NSString localeIdentifier);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSLocaleLanguageDirection)characterDirectionForLanguage:(NSString *)isoLangCode NS_AVAILABLE(10_6, 4_0);", selector = "characterDirectionForLanguage:")
    public static native NSLocaleLanguageDirection characterDirectionForLanguage$(NSString isoLangCode);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSLocaleGeneralInfo", catownername = "NSLocale")
    @ObjCMethodSign(sign = "+ (NSLocaleLanguageDirection)lineDirectionForLanguage:(NSString *)isoLangCode NS_AVAILABLE(10_6, 4_0);", selector = "lineDirectionForLanguage:")
    public static native NSLocaleLanguageDirection lineDirectionForLanguage$(NSString isoLangCode);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSLocale initWithCoder$(NSCoder aDecoder);
}
