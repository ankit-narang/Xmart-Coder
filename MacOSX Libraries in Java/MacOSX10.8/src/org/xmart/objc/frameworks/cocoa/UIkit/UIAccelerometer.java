package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIAccelerometer extends NSObject  {
    
    public UIAccelerometer() {}
    @ObjCPropertyGetter(selector = "updateInterval")
    public native double getUpdateInterval();
    @ObjCPropertySetter(selector = "setUpdateInterval:")
    public native void setUpdateInterval(double v);
    @ObjCProperty public double updateInterval;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIAccelerometerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIAccelerometerDelegate v);
    @ObjCProperty public UIAccelerometerDelegate delegate;
    
    @ObjCMethodSign(sign = "+ (UIAccelerometer *)sharedAccelerometer;", selector = "sharedAccelerometer")
    public static native UIAccelerometer sharedAccelerometer();
}
