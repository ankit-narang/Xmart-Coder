package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSOrthography extends NSObject implements NSCopying, NSCoding {
    
    public NSOrthography() {}
    @ObjCPropertyGetter(selector = "dominantScript")
    public native NSString getDominantScript();
    @ObjCProperty public NSString dominantScript;

    @ObjCPropertyGetter(selector = "languageMap")
    public native NSDictionary getLanguageMap();
    @ObjCProperty public NSDictionary languageMap;

    @ObjCPropertyGetter(selector = "dominantLanguage")
    public native NSString getDominantLanguage();
    @ObjCProperty public NSString dominantLanguage;

    @ObjCPropertyGetter(selector = "allScripts")
    public native NSArray getAllScripts();
    @ObjCProperty public NSArray allScripts;

    @ObjCPropertyGetter(selector = "allLanguages")
    public native NSArray getAllLanguages();
    @ObjCProperty public NSArray allLanguages;
    
    @ObjCCategoryMethod(catname = "NSOrthographyExtended", catownername = "NSOrthography")
    @ObjCMethodSign(sign = "- (NSArray *)languagesForScript:(NSString *)script;", selector = "languagesForScript:")
    public native NSArray languagesForScript$(NSString script);

    @ObjCCategoryMethod(catname = "NSOrthographyExtended", catownername = "NSOrthography")
    @ObjCMethodSign(sign = "- (NSString *)dominantLanguageForScript:(NSString *)script;", selector = "dominantLanguageForScript:")
    public native NSString dominantLanguageForScript$(NSString script);

    @ObjCCategoryMethod(catname = "NSOrthographyCreation", catownername = "NSOrthography")
    @ObjCMethodSign(sign = "- (id)initWithDominantScript:(NSString *)script languageMap:(NSDictionary *)map;", selector = "initWithDominantScript:languageMap:")
    public native NSOrthography initWithDominantScript$languageMap$(NSString script, NSDictionary map);

    @ObjCCategoryMethod(catname = "NSOrthographyCreation", catownername = "NSOrthography")
    @ObjCMethodSign(sign = "+ (id)orthographyWithDominantScript:(NSString *)script languageMap:(NSDictionary *)map;", selector = "orthographyWithDominantScript:languageMap:")
    public static native NSObject orthographyWithDominantScript$languageMap$(NSString script, NSDictionary map);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSOrthography initWithCoder$(NSCoder aDecoder);
}
