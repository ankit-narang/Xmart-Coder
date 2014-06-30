package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCompoundPredicate extends NSPredicate  {
    
    public NSCompoundPredicate() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithType:(NSCompoundPredicateType)type subpredicates:(NSArray *)subpredicates;", selector = "initWithType:subpredicates:")
    public native NSCompoundPredicate initWithType$subpredicates$(NSCompoundPredicateType type, NSArray subpredicates);

    @ObjCMethodSign(sign = "- (NSCompoundPredicateType)compoundPredicateType;", selector = "compoundPredicateType")
    public native NSCompoundPredicateType compoundPredicateType();

    @ObjCMethodSign(sign = "- (NSArray *)subpredicates;", selector = "subpredicates")
    public native NSArray subpredicates();

    @ObjCMethodSign(sign = "+ (NSPredicate *)andPredicateWithSubpredicates:(NSArray *)subpredicates;", selector = "andPredicateWithSubpredicates:")
    public static native NSPredicate andPredicateWithSubpredicates$(NSArray subpredicates);

    @ObjCMethodSign(sign = "+ (NSPredicate *)orPredicateWithSubpredicates:(NSArray *)subpredicates;", selector = "orPredicateWithSubpredicates:")
    public static native NSPredicate orPredicateWithSubpredicates$(NSArray subpredicates);

    @ObjCMethodSign(sign = "+ (NSPredicate *)notPredicateWithSubpredicate:(NSPredicate *)predicate;", selector = "notPredicateWithSubpredicate:")
    public static native NSPredicate notPredicateWithSubpredicate$(NSPredicate predicate);
}
