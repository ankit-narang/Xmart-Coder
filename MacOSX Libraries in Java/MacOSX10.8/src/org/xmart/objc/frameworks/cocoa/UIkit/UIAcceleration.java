package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIAcceleration extends NSObject  {
    
    public UIAcceleration() {}
    @ObjCPropertyGetter(selector = "timestamp")
    public native double getTimestamp();
    @ObjCProperty public double timestamp;

    @ObjCPropertyGetter(selector = "x")
    public native double getX();
    @ObjCProperty public double x;

    @ObjCPropertyGetter(selector = "y")
    public native double getY();
    @ObjCProperty public double y;

    @ObjCPropertyGetter(selector = "z")
    public native double getZ();
    @ObjCProperty public double z;
    
    
}
