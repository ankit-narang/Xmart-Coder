package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISplitViewController extends UIViewController  {
    
    public UISplitViewController() {}
    @ObjCPropertyGetter(selector = "viewControllers")
    public native NSArray getViewControllers();
    @ObjCPropertySetter(selector = "setViewControllers:")
    public native void setViewControllers(NSArray v);
    @ObjCProperty public NSArray viewControllers;

    @ObjCPropertyGetter(selector = "delegate")
    public native UISplitViewControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISplitViewControllerDelegate v);
    @ObjCProperty public UISplitViewControllerDelegate delegate;

    /**
     * @since Available in iOS 5.1 and later.
     */
    @ObjCPropertyGetter(selector = "presentsWithGesture")
    public native boolean isPresentsWithGesture();
    /**
     * @since Available in iOS 5.1 and later.
     */
    @ObjCPropertySetter(selector = "setPresentsWithGesture:")
    public native void setPresentsWithGesture(boolean v);
    @ObjCProperty public boolean presentsWithGesture;
    
    
}
