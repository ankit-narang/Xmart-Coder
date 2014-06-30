package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSInvocationOperation extends NSOperation  {
    
    public NSInvocationOperation() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithTarget:(id)target selector:(SEL)sel object:(id)arg;", selector = "initWithTarget:selector:object:")
    public native NSInvocationOperation initWithTarget$selector$object$(NSObject target, ObjCSelector sel, NSObject arg);

    @ObjCMethodSign(sign = "- (id)initWithInvocation:(NSInvocation *)inv;", selector = "initWithInvocation:")
    public native NSInvocationOperation initWithInvocation$(NSInvocation inv);

    @ObjCMethodSign(sign = "- (NSInvocation *)invocation;", selector = "invocation")
    public native NSInvocation invocation();

    @ObjCMethodSign(sign = "- (id)result;", selector = "result")
    public native NSObject result();
}
