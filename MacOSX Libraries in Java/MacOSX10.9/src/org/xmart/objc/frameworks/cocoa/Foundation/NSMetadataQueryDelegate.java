package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSMetadataQueryDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (id)metadataQuery:(NSMetadataQuery *)query replacementObjectForResultObject:(NSMetadataItem *)result;", selector = "metadataQuery:replacementObjectForResultObject:")
    NSObject metadataQuery$replacementObjectForResultObject$(NSMetadataQuery query, NSMetadataItem result);

    @ObjCMethodSign(sign = "- (id)metadataQuery:(NSMetadataQuery *)query replacementValueForAttribute:(NSString *)attrName value:(id)attrValue;", selector = "metadataQuery:replacementValueForAttribute:value:")
    NSObject metadataQuery$replacementValueForAttribute$value$(NSMetadataQuery query, NSString attrName, NSObject attrValue);
}
