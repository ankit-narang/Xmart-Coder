package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMetadataItem extends NSObject  {
    
    public NSMetadataItem() {}
    
    
    @ObjCMethodSign(sign = "- (id)valueForAttribute:(NSString *)key;", selector = "valueForAttribute:")
    public native NSObject valueForAttribute$(NSString key);

    @ObjCMethodSign(sign = "- (NSDictionary *)valuesForAttributes:(NSArray *)keys;", selector = "valuesForAttributes:")
    public native NSDictionary valuesForAttributes$(NSArray keys);

    @ObjCMethodSign(sign = "- (NSArray *)attributes;", selector = "attributes")
    public native NSArray attributes();
}
