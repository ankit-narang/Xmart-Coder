package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIMotionEffectGroup extends UIMotionEffect  {
    
    public UIMotionEffectGroup() {}
    @ObjCPropertyGetter(selector = "motionEffects")
    public native NSArray getMotionEffects();
    @ObjCPropertySetter(selector = "setMotionEffects:")
    public native void setMotionEffects(NSArray v);
    @ObjCProperty public NSArray motionEffects;
    
    
}
