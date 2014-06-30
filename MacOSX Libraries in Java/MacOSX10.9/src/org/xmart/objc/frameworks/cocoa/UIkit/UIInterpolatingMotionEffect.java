package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIInterpolatingMotionEffect extends UIMotionEffect  {
    
    public UIInterpolatingMotionEffect() {}
    @ObjCPropertyGetter(selector = "keyPath")
    public native NSString getKeyPath();
    @ObjCProperty public NSString keyPath;

    @ObjCPropertyGetter(selector = "type")
    public native UIInterpolatingMotionEffectType getType();
    @ObjCProperty public UIInterpolatingMotionEffectType type;

    @ObjCPropertyGetter(selector = "minimumRelativeValue")
    public native NSObject getMinimumRelativeValue();
    @ObjCPropertySetter(selector = "setMinimumRelativeValue:")
    public native void setMinimumRelativeValue(NSObject v);
    @ObjCProperty public NSObject minimumRelativeValue;

    @ObjCPropertyGetter(selector = "maximumRelativeValue")
    public native NSObject getMaximumRelativeValue();
    @ObjCPropertySetter(selector = "setMaximumRelativeValue:")
    public native void setMaximumRelativeValue(NSObject v);
    @ObjCProperty public NSObject maximumRelativeValue;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithKeyPath:(NSString *)keyPath type:(UIInterpolatingMotionEffectType)type;", selector = "initWithKeyPath:type:")
    public native UIInterpolatingMotionEffect initWithKeyPath$type$(NSString keyPath, UIInterpolatingMotionEffectType type);
}
