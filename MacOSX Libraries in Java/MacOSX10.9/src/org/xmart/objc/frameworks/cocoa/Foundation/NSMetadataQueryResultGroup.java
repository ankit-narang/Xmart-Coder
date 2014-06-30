package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMetadataQueryResultGroup extends NSObject  {
    
    public NSMetadataQueryResultGroup() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)attribute;", selector = "attribute")
    public native NSString attribute();

    @ObjCMethodSign(sign = "- (id)value;", selector = "value")
    public native NSObject value();

    @ObjCMethodSign(sign = "- (NSArray *)subgroups;", selector = "subgroups")
    public native NSArray subgroups();

    @ObjCMethodSign(sign = "- (NSUInteger)resultCount;", selector = "resultCount")
    public native @NSUInteger long resultCount();

    @ObjCMethodSign(sign = "- (id)resultAtIndex:(NSUInteger)idx;", selector = "resultAtIndex:")
    public native NSObject resultAtIndex$(@NSUInteger long idx);

    @ObjCMethodSign(sign = "- (NSArray *)results;", selector = "results")
    public native NSArray results();
}
