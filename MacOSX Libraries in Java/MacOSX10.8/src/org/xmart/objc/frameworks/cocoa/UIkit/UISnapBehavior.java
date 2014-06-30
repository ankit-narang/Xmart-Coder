package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISnapBehavior extends UIDynamicBehavior  {
    
    public UISnapBehavior() {}
    @ObjCPropertyGetter(selector = "damping")
    public native float getDamping();
    @ObjCPropertySetter(selector = "setDamping:")
    public native void setDamping(float v);
    @ObjCProperty public float damping;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithItem:(id <UIDynamicItem>)item snapToPoint:(CGPoint)point;", selector = "initWithItem:snapToPoint:")
    public native UISnapBehavior initWithItem$snapToPoint$(UIDynamicItem item, @ObjCByValue CGPoint point);
}
