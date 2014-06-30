package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMetadataQueryAttributeValueTuple extends NSObject  {
    
    public NSMetadataQueryAttributeValueTuple() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)attribute;", selector = "attribute")
    public native NSString attribute();

    @ObjCMethodSign(sign = "- (id)value;", selector = "value")
    public native NSObject value();

    @ObjCMethodSign(sign = "- (NSUInteger)count;", selector = "count")
    public native @NSUInteger long count();
}
