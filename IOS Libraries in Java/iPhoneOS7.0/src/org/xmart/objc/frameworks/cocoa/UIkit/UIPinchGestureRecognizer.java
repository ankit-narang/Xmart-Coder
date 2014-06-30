package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPinchGestureRecognizer extends UIGestureRecognizer  {
    
    public UIPinchGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "scale")
    public native float getScale();
    @ObjCPropertySetter(selector = "setScale:")
    public native void setScale(float v);
    @ObjCProperty public float scale;

    @ObjCPropertyGetter(selector = "velocity")
    public native float getVelocity();
    @ObjCProperty public float velocity;
    
    
}
