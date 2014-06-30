package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSShadow extends NSObject implements NSCopying, NSCoding {
    
    public NSShadow() {}
    @ObjCPropertyGetter(selector = "shadowOffset")
    public native @ObjCByValue CGSize getShadowOffset();
    @ObjCPropertySetter(selector = "setShadowOffset:")
    public native void setShadowOffset(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize shadowOffset;

    @ObjCPropertyGetter(selector = "shadowBlurRadius")
    public native float getShadowBlurRadius();
    @ObjCPropertySetter(selector = "setShadowBlurRadius:")
    public native void setShadowBlurRadius(float v);
    @ObjCProperty public float shadowBlurRadius;

    @ObjCPropertyGetter(selector = "shadowColor")
    public native NSObject getShadowColor();
    @ObjCPropertySetter(selector = "setShadowColor:")
    public native void setShadowColor(NSObject v);
    @ObjCProperty public NSObject shadowColor;
    
    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSShadow initWithCoder$(NSCoder aDecoder);
}
