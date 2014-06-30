package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSEnumerator extends NSObject implements NSFastEnumeration {
    
    public NSEnumerator() {}
    
    
    @ObjCMethodSign(sign = "- (id)nextObject;", selector = "nextObject")
    public native NSObject nextObject();

    @ObjCCategoryMethod(catname = "NSExtendedEnumerator", catownername = "NSEnumerator")
    @ObjCMethodSign(sign = "- (NSArray *)allObjects;", selector = "allObjects")
    public native NSArray allObjects();

    @ObjCMethodSign(sign = "- (NSUInteger)countByEnumeratingWithState:(NSFastEnumerationState *)state objects:(id __unsafe_unretained [])buffer count:(NSUInteger)len;", selector = "countByEnumeratingWithState:objects:count:")
    public native @NSUInteger long countByEnumeratingWithState$objects$count$(NSFastEnumerationState state, NSObject[] buffer, @NSUInteger long len);
}
