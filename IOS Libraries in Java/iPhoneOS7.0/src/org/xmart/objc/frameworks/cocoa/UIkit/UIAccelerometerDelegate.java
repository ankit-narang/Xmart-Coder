package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccelerometerDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)accelerometer:(UIAccelerometer *)accelerometer didAccelerate:(UIAcceleration *)acceleration NS_DEPRECATED_IOS(2_0, 5_0);", selector = "accelerometer:didAccelerate:")
    void accelerometer$didAccelerate$(UIAccelerometer accelerometer, UIAcceleration acceleration);
}
