package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIActivityIndicatorView extends UIView implements NSCoding {
    
    public UIActivityIndicatorView() {}
    @ObjCPropertyGetter(selector = "activityIndicatorViewStyle")
    public native UIActivityIndicatorViewStyle getActivityIndicatorViewStyle();
    @ObjCPropertySetter(selector = "setActivityIndicatorViewStyle:")
    public native void setActivityIndicatorViewStyle(UIActivityIndicatorViewStyle v);
    @ObjCProperty public UIActivityIndicatorViewStyle activityIndicatorViewStyle;

    @ObjCPropertyGetter(selector = "hidesWhenStopped")
    public native boolean isHidesWhenStopped();
    @ObjCPropertySetter(selector = "setHidesWhenStopped:")
    public native void setHidesWhenStopped(boolean v);
    @ObjCProperty public boolean hidesWhenStopped;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "color")
    public native UIColor getColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setColor:")
    public native void setColor(UIColor v);
    @ObjCProperty public UIColor color;
    
    @ObjCMethodSign(sign = "- (id)initWithActivityIndicatorStyle:(UIActivityIndicatorViewStyle)style;", selector = "initWithActivityIndicatorStyle:")
    public native UIActivityIndicatorView initWithActivityIndicatorStyle$(UIActivityIndicatorViewStyle style);

    @ObjCMethodSign(sign = "- (void)startAnimating;", selector = "startAnimating")
    public native void startAnimating();

    @ObjCMethodSign(sign = "- (void)stopAnimating;", selector = "stopAnimating")
    public native void stopAnimating();

    @ObjCMethodSign(sign = "- (BOOL)isAnimating;", selector = "isAnimating")
    public native boolean isAnimating();
}
