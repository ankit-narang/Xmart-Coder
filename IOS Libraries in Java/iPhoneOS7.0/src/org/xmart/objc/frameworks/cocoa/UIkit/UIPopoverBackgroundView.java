package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPopoverBackgroundView extends UIView  {
    
    public UIPopoverBackgroundView() {}
    @ObjCPropertyGetter(selector = "arrowOffset")
    public native float getArrowOffset();
    @ObjCPropertySetter(selector = "setArrowOffset:")
    public native void setArrowOffset(float v);
    @ObjCProperty public float arrowOffset;

    @ObjCPropertyGetter(selector = "arrowDirection")
    public native UIPopoverArrowDirection getArrowDirection();
    @ObjCPropertySetter(selector = "setArrowDirection:")
    public native void setArrowDirection(UIPopoverArrowDirection v);
    @ObjCProperty public UIPopoverArrowDirection arrowDirection;
    
    @ObjCMethodSign(sign = "+ (CGFloat)arrowHeight;", selector = "arrowHeight")
    public static native float arrowHeight();

    @ObjCMethodSign(sign = "+ (CGFloat)arrowBase;", selector = "arrowBase")
    public static native float arrowBase();

    @ObjCMethodSign(sign = "+ (UIEdgeInsets)contentViewInsets;", selector = "contentViewInsets")
    public static native @ObjCByValue UIEdgeInsets contentViewInsets();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)wantsDefaultContentAppearance NS_AVAILABLE_IOS(6_0);", selector = "wantsDefaultContentAppearance")
    public static native boolean wantsDefaultContentAppearance();
}
