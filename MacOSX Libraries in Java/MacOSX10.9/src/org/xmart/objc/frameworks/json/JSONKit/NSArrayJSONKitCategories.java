package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSArray")
@ObjCFramework("JSONKit")
public final class NSArrayJSONKitCategories extends NSArray  {
    
    private NSArrayJSONKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSData *)JSONData;", selector = "JSONData")
    public static native NSData JSONData();

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSData *)JSONDataWithOptions:(JKSerializeOptionFlags)serializeOptions error:(NSError **)error;", selector = "JSONDataWithOptions:error:")
    public static native NSData JSONDataWithOptions$error$(JKSerializeOptionFlags serializeOptions, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSData *)JSONDataWithOptions:(JKSerializeOptionFlags)serializeOptions serializeUnsupportedClassesUsingDelegate:(id)delegate selector:(SEL)selector error:(NSError **)error;", selector = "JSONDataWithOptions:serializeUnsupportedClassesUsingDelegate:selector:error:")
    public static native NSData JSONDataWithOptions$serializeUnsupportedClassesUsingDelegate$selector$error$(JKSerializeOptionFlags serializeOptions, NSObject delegate, ObjCSelector selector, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)JSONString;", selector = "JSONString")
    public static native NSString JSONString();

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)JSONStringWithOptions:(JKSerializeOptionFlags)serializeOptions error:(NSError **)error;", selector = "JSONStringWithOptions:error:")
    public static native NSString JSONStringWithOptions$error$(JKSerializeOptionFlags serializeOptions, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializing", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)JSONStringWithOptions:(JKSerializeOptionFlags)serializeOptions serializeUnsupportedClassesUsingDelegate:(id)delegate selector:(SEL)selector error:(NSError **)error;", selector = "JSONStringWithOptions:serializeUnsupportedClassesUsingDelegate:selector:error:")
    public static native NSString JSONStringWithOptions$serializeUnsupportedClassesUsingDelegate$selector$error$(JKSerializeOptionFlags serializeOptions, NSObject delegate, ObjCSelector selector, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializingBlockAdditions", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSData *)JSONDataWithOptions:(JKSerializeOptionFlags)serializeOptions serializeUnsupportedClassesUsingBlock:(id(^)(id object))block error:(NSError **)error;", selector = "JSONDataWithOptions:serializeUnsupportedClassesUsingBlock:error:")
    public static native NSData JSONDataWithOptions$serializeUnsupportedClassesUsingBlock$error$(JKSerializeOptionFlags serializeOptions, ObjCBlock block, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitSerializingBlockAdditions", catownername = "NSArray")
    @ObjCMethodSign(sign = "- (NSString *)JSONStringWithOptions:(JKSerializeOptionFlags)serializeOptions serializeUnsupportedClassesUsingBlock:(id(^)(id object))block error:(NSError **)error;", selector = "JSONStringWithOptions:serializeUnsupportedClassesUsingBlock:error:")
    public static native NSString JSONStringWithOptions$serializeUnsupportedClassesUsingBlock$error$(JKSerializeOptionFlags serializeOptions, ObjCBlock block, NSError[] error);
}
