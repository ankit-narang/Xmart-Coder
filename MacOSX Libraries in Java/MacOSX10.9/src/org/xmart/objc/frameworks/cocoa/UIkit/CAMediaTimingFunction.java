package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CAMediaTimingFunction extends NSObject implements NSCoding {
    
    public CAMediaTimingFunction() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithControlPoints:(float)c1x :(float)c1y :(float)c2x :(float)c2y;", selector = "initWithControlPoints::::")
    public native CAMediaTimingFunction initWithControlPoints$$$$(float c1x, float c1y, float c2x, float c2y);

    @ObjCMethodSign(sign = "- (void)getControlPointAtIndex:(size_t)idx values:(float[2])ptr;", selector = "getControlPointAtIndex:values:")
    public native void getControlPointAtIndex$values$(@Unsigned long idx, float[] ptr);

    @ObjCMethodSign(sign = "+ (id)functionWithName:(NSString *)name;", selector = "functionWithName:")
    public static native NSObject functionWithName$(NSString name);

    @ObjCMethodSign(sign = "+ (id)functionWithControlPoints:(float)c1x :(float)c1y :(float)c2x :(float)c2y;", selector = "functionWithControlPoints::::")
    public static native NSObject functionWithControlPoints$$$$(float c1x, float c1y, float c2x, float c2y);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native CAMediaTimingFunction initWithCoder$(NSCoder aDecoder);
}
