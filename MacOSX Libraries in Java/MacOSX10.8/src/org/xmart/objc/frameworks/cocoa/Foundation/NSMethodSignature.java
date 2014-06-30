package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMethodSignature extends NSObject  {
    
    public NSMethodSignature() {}
    
    
    @ObjCMethodSign(sign = "- (NSUInteger)numberOfArguments;", selector = "numberOfArguments")
    public native @NSUInteger long numberOfArguments();

    @ObjCMethodSign(sign = "- (const char *)getArgumentTypeAtIndex:(NSUInteger)idx NS_RETURNS_INNER_POINTER;", selector = "getArgumentTypeAtIndex:")
    public native byte[] getArgumentTypeAtIndex$(@NSUInteger long idx);

    @ObjCMethodSign(sign = "- (NSUInteger)frameLength;", selector = "frameLength")
    public native @NSUInteger long frameLength();

    @ObjCMethodSign(sign = "- (BOOL)isOneway;", selector = "isOneway")
    public native boolean isOneway();

    @ObjCMethodSign(sign = "- (const char *)methodReturnType NS_RETURNS_INNER_POINTER;", selector = "methodReturnType")
    public native byte[] methodReturnType();

    @ObjCMethodSign(sign = "- (NSUInteger)methodReturnLength;", selector = "methodReturnLength")
    public native @NSUInteger long methodReturnLength();

    @ObjCMethodSign(sign = "+ (NSMethodSignature *)signatureWithObjCTypes:(const char *)types;", selector = "signatureWithObjCTypes:")
    public static native NSMethodSignature signatureWithObjCTypes$(byte[] types);
}
