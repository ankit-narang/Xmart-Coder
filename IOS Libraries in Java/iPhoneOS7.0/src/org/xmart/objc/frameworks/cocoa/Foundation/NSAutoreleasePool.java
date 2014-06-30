package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSAutoreleasePool extends NSObject  {
    
    public NSAutoreleasePool() {}
    
    
    @ObjCMethodSign(sign = "- (void)addObject:(id)anObject;", selector = "addObject:")
    public native void addObject$(NSObject anObject);

    @ObjCMethodSign(sign = "- (void)drain;", selector = "drain")
    public native void drain();

    @ObjCMethodSign(sign = "+ (void)addObject:(id)anObject;", selector = "addObject:")
    public static native void addObject$__STATIC(NSObject anObject);
}
