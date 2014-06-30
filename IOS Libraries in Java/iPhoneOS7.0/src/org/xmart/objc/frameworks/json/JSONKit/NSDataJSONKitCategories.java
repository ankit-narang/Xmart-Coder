package org.xmart.objc.frameworks.json.JSONKit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSData")
@ObjCFramework("JSONKit")
public final class NSDataJSONKitCategories extends NSData  {
    
    private NSDataJSONKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)objectFromJSONData;", selector = "objectFromJSONData")
    public static native NSObject objectFromJSONData();

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)objectFromJSONDataWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "objectFromJSONDataWithParseOptions:")
    public static native NSObject objectFromJSONDataWithParseOptions$(JKParseOptionFlags parseOptionFlags);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)objectFromJSONDataWithParseOptions:(JKParseOptionFlags)parseOptionFlags error:(NSError **)error;", selector = "objectFromJSONDataWithParseOptions:error:")
    public static native NSObject objectFromJSONDataWithParseOptions$error$(JKParseOptionFlags parseOptionFlags, NSError[] error);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONData;", selector = "mutableObjectFromJSONData")
    public static native NSObject mutableObjectFromJSONData();

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONDataWithParseOptions:(JKParseOptionFlags)parseOptionFlags;", selector = "mutableObjectFromJSONDataWithParseOptions:")
    public static native NSObject mutableObjectFromJSONDataWithParseOptions$(JKParseOptionFlags parseOptionFlags);

    @ObjCCategoryMethod(catname = "JSONKitDeserializing", catownername = "NSData")
    @ObjCMethodSign(sign = "- (id)mutableObjectFromJSONDataWithParseOptions:(JKParseOptionFlags)parseOptionFlags error:(NSError **)error;", selector = "mutableObjectFromJSONDataWithParseOptions:error:")
    public static native NSObject mutableObjectFromJSONDataWithParseOptions$error$(JKParseOptionFlags parseOptionFlags, NSError[] error);
}
