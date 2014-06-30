package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UILongPressGestureRecognizer extends UIGestureRecognizer  {
    
    public UILongPressGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "numberOfTapsRequired")
    public native @NSUInteger long getNumberOfTapsRequired();
    @ObjCPropertySetter(selector = "setNumberOfTapsRequired:")
    public native void setNumberOfTapsRequired(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long numberOfTapsRequired;

    @ObjCPropertyGetter(selector = "numberOfTouchesRequired")
    public native @NSUInteger long getNumberOfTouchesRequired();
    @ObjCPropertySetter(selector = "setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long numberOfTouchesRequired;

    @ObjCPropertyGetter(selector = "minimumPressDuration")
    public native double getMinimumPressDuration();
    @ObjCPropertySetter(selector = "setMinimumPressDuration:")
    public native void setMinimumPressDuration(double v);
    @ObjCProperty public double minimumPressDuration;

    @ObjCPropertyGetter(selector = "allowableMovement")
    public native float getAllowableMovement();
    @ObjCPropertySetter(selector = "setAllowableMovement:")
    public native void setAllowableMovement(float v);
    @ObjCProperty public float allowableMovement;
    
    
}
