package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPointerFunctions extends NSObject implements NSCopying {
    
    public NSPointerFunctions() {}
    @ObjCPropertyGetter(selector = "hashFunction")
    public native ObjCFunctionPtr getHashFunction();
    @ObjCPropertySetter(selector = "setHashFunction:")
    public native void setHashFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr hashFunction;

    @ObjCPropertyGetter(selector = "isEqualFunction")
    public native ObjCFunctionPtr getIsEqualFunction();
    @ObjCPropertySetter(selector = "setIsEqualFunction:")
    public native void setIsEqualFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr isEqualFunction;

    @ObjCPropertyGetter(selector = "sizeFunction")
    public native ObjCFunctionPtr getSizeFunction();
    @ObjCPropertySetter(selector = "setSizeFunction:")
    public native void setSizeFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr sizeFunction;

    @ObjCPropertyGetter(selector = "descriptionFunction")
    public native ObjCFunctionPtr getDescriptionFunction();
    @ObjCPropertySetter(selector = "setDescriptionFunction:")
    public native void setDescriptionFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr descriptionFunction;

    @ObjCPropertyGetter(selector = "relinquishFunction")
    public native ObjCFunctionPtr getRelinquishFunction();
    @ObjCPropertySetter(selector = "setRelinquishFunction:")
    public native void setRelinquishFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr relinquishFunction;

    @ObjCPropertyGetter(selector = "acquireFunction")
    public native ObjCFunctionPtr getAcquireFunction();
    @ObjCPropertySetter(selector = "setAcquireFunction:")
    public native void setAcquireFunction(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr acquireFunction;

    @ObjCPropertyGetter(selector = "usesStrongWriteBarrier")
    public native boolean isUsesStrongWriteBarrier();
    @ObjCPropertySetter(selector = "setUsesStrongWriteBarrier:")
    public native void setUsesStrongWriteBarrier(boolean v);
    @ObjCProperty public boolean usesStrongWriteBarrier;

    @ObjCPropertyGetter(selector = "usesWeakReadAndWriteBarriers")
    public native boolean isUsesWeakReadAndWriteBarriers();
    @ObjCPropertySetter(selector = "setUsesWeakReadAndWriteBarriers:")
    public native void setUsesWeakReadAndWriteBarriers(boolean v);
    @ObjCProperty public boolean usesWeakReadAndWriteBarriers;
    
    @ObjCMethodSign(sign = "- (id)initWithOptions:(NSPointerFunctionsOptions)options;", selector = "initWithOptions:")
    public native NSPointerFunctions initWithOptions$(NSPointerFunctionsOptions options);

    @ObjCMethodSign(sign = "+ (id)pointerFunctionsWithOptions:(NSPointerFunctionsOptions)options;", selector = "pointerFunctionsWithOptions:")
    public static native NSObject pointerFunctionsWithOptions$(NSPointerFunctionsOptions options);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
