package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSString")
@ObjCFramework("JSONKit")
public final class NSStringJSONKitCategories extends NSString  {
    
    private NSStringJSONKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)objectFromJSONString;", selector = "objectFromJSONString")
    public static native NSObject objectFromJSONString();

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)objectFromJSONStringWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "objectFromJSONStringWithParseOptions:")
    public static native NSObject objectFromJSONStringWithParseOptions$(JKParseOptionFlags parseOptionFlags);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)objectFromJSONStringWithParseOptions:(JKParseOptionFlags)parseOptionFlags error:(NSError **)error;", selector = "objectFromJSONStringWithParseOptions:error:")
    public static native NSObject objectFromJSONStringWithParseOptions$error$(JKParseOptionFlags parseOptionFlags, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONString;", selector = "mutableObjectFromJSONString")
    public static native NSObject mutableObjectFromJSONString();

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONStringWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "mutableObjectFromJSONStringWithParseOptions:")
    public static native NSObject mutableObjectFromJSONStringWithParseOptions$(JKParseOptionFlags parseOptionFlags);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONStringWithParseOptions:(JKParseOptionFlags)parseOptionFlags error:(NSError **)error;", selector = "mutableObjectFromJSONStringWithParseOptions:error:")
    public static native NSObject mutableObjectFromJSONStringWithParseOptions$error$(JKParseOptionFlags parseOptionFlags, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSData *)JSONData;", selector = "JSONData")
    public static native NSData JSONData();

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSData *)JSONDataWithOptions:(JKSerializeOptionFlags)serializeOptions includeQuotes:(BOOL)includeQuotes error:(NSError **)error;", selector = "JSONDataWithOptions:includeQuotes:error:")
    public static native NSData JSONDataWithOptions$includeQuotes$error$(JKSerializeOptionFlags serializeOptions, boolean includeQuotes, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)JSONString;", selector = "JSONString")
    public static native NSString JSONString();

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSString")
    @ObjCMethodSign(sign = "- (NSString *)JSONStringWithOptions:(JKSerializeOptionFlags)serializeOptions includeQuotes:(BOOL)includeQuotes error:(NSError **)error;", selector = "JSONStringWithOptions:includeQuotes:error:")
    public static native NSString JSONStringWithOptions$includeQuotes$error$(JKSerializeOptionFlags serializeOptions, boolean includeQuotes, NSError[] error);
}
