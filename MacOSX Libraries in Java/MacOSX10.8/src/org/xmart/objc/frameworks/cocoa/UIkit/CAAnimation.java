package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CAAnimation extends NSObject implements NSCoding, NSCopying {
    
    public CAAnimation() {}
    @ObjCPropertyGetter(selector = "timingFunction")
    public native CAMediaTimingFunction getTimingFunction();
    @ObjCPropertySetter(selector = "setTimingFunction:")
    public native void setTimingFunction(CAMediaTimingFunction v);
    @ObjCProperty public CAMediaTimingFunction timingFunction;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSObject getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:")
    public native void setDelegate(NSObject v);
    @ObjCProperty public NSObject delegate;

    @ObjCPropertyGetter(selector = "isRemovedOnCompletion")
    public native boolean isRemovedOnCompletion();
    @ObjCPropertySetter(selector = "setRemovedOnCompletion:")
    public native void setRemovedOnCompletion(boolean v);
    @ObjCProperty public boolean removedOnCompletion;
    
    @ObjCMethodSign(sign = "- (BOOL)shouldArchiveValueForKey:(NSString *)key;", selector = "shouldArchiveValueForKey:")
    public native boolean shouldArchiveValueForKey$(NSString key);

    @ObjCMethodSign(sign = "+ (id)animation;", selector = "animation")
    public static native NSObject animation();

    @ObjCMethodSign(sign = "+ (id)defaultValueForKey:(NSString *)key;", selector = "defaultValueForKey:")
    public static native NSObject defaultValueForKey$(NSString key);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native CAAnimation initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
