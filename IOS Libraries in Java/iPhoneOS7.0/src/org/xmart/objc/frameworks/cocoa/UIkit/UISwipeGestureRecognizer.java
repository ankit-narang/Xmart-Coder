package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISwipeGestureRecognizer extends UIGestureRecognizer  {
    
    public UISwipeGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "numberOfTouchesRequired")
    public native @NSUInteger long getNumberOfTouchesRequired();
    @ObjCPropertySetter(selector = "setNumberOfTouchesRequired:")
    public native void setNumberOfTouchesRequired(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long numberOfTouchesRequired;

    @ObjCPropertyGetter(selector = "direction")
    public native UISwipeGestureRecognizerDirection getDirection();
    @ObjCPropertySetter(selector = "setDirection:")
    public native void setDirection(UISwipeGestureRecognizerDirection v);
    @ObjCProperty public UISwipeGestureRecognizerDirection direction;
    
    
}
