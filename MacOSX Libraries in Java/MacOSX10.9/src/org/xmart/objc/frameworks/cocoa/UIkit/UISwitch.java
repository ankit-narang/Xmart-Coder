package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISwitch extends UIControl implements NSCoding {
    
    public UISwitch() {}
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "onTintColor")
    public native UIColor getOnTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setOnTintColor:")
    public native void setOnTintColor(UIColor v);
    @ObjCProperty public UIColor onTintColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "thumbTintColor")
    public native UIColor getThumbTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    @ObjCProperty public UIColor thumbTintColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "onImage")
    public native UIImage getOnImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setOnImage:")
    public native void setOnImage(UIImage v);
    @ObjCProperty public UIImage onImage;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "offImage")
    public native UIImage getOffImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setOffImage:")
    public native void setOffImage(UIImage v);
    @ObjCProperty public UIImage offImage;

    @ObjCPropertyGetter(selector = "isOn")
    public native boolean isOn();
    @ObjCPropertySetter(selector = "setOn:")
    public native void setOn(boolean v);
    @ObjCProperty public boolean on;
    
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame;", selector = "initWithFrame:")
    public native UISwitch initWithFrame$(@ObjCByValue CGRect frame);

    @ObjCMethodSign(sign = "- (void)setOn:(BOOL)on animated:(BOOL)animated;", selector = "setOn:animated:")
    public native void setOn$animated$(boolean on, boolean animated);
}
