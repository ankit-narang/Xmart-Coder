package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIRotationGestureRecognizer extends UIGestureRecognizer  {
    
    public UIRotationGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "rotation")
    public native float getRotation();
    @ObjCPropertySetter(selector = "setRotation:")
    public native void setRotation(float v);
    @ObjCProperty public float rotation;

    @ObjCPropertyGetter(selector = "velocity")
    public native float getVelocity();
    @ObjCProperty public float velocity;
    
    
}
