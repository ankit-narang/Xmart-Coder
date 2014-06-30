package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSInvocation extends NSObject  {
    
    public NSInvocation() {}
    
    
    @ObjCMethodSign(sign = "- (NSMethodSignature *)methodSignature;", selector = "methodSignature")
    public native NSMethodSignature methodSignature();

    @ObjCMethodSign(sign = "- (void)retainArguments;", selector = "retainArguments")
    public native void retainArguments();

    @ObjCMethodSign(sign = "- (BOOL)argumentsRetained;", selector = "argumentsRetained")
    public native boolean argumentsRetained();

    @ObjCMethodSign(sign = "- (id)target;", selector = "target")
    public native NSObject target();

    @ObjCMethodSign(sign = "- (void)setTarget:(id)target;", selector = "setTarget:")
    public native void setTarget(NSObject target);

    @ObjCMethodSign(sign = "- (SEL)selector;", selector = "selector")
    public native ObjCSelector selector();

    @ObjCMethodSign(sign = "- (void)setSelector:(SEL)selector;", selector = "setSelector:")
    public native void setSelector(ObjCSelector selector);

    @ObjCMethodSign(sign = "- (void)getReturnValue:(void *)retLoc;", selector = "getReturnValue:")
    public native void getReturnValue$(@VoidPointer() Object retLoc);

    @ObjCMethodSign(sign = "- (void)setReturnValue:(void *)retLoc;", selector = "setReturnValue:")
    public native void setReturnValue(@VoidPointer() Object retLoc);

    @ObjCMethodSign(sign = "- (void)getArgument:(void *)argumentLocation atIndex:(NSInteger)idx;", selector = "getArgument:atIndex:")
    public native void getArgument$atIndex$(@VoidPointer() Object argumentLocation, @NSInteger long idx);

    @ObjCMethodSign(sign = "- (void)setArgument:(void *)argumentLocation atIndex:(NSInteger)idx;", selector = "setArgument:atIndex:")
    public native void setArgument$atIndex$(@VoidPointer() Object argumentLocation, @NSInteger long idx);

    @ObjCMethodSign(sign = "- (void)invoke;", selector = "invoke")
    public native void invoke();

    @ObjCMethodSign(sign = "- (void)invokeWithTarget:(id)target;", selector = "invokeWithTarget:")
    public native void invokeWithTarget$(NSObject target);

    @ObjCMethodSign(sign = "+ (NSInvocation *)invocationWithMethodSignature:(NSMethodSignature *)sig;", selector = "invocationWithMethodSignature:")
    public static native NSInvocation invocationWithMethodSignature$(NSMethodSignature sig);
}
