package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIProgressView extends UIView implements NSCoding {
    
    public UIProgressView() {}
    @ObjCPropertyGetter(selector = "progressViewStyle")
    public native UIProgressViewStyle getProgressViewStyle();
    @ObjCPropertySetter(selector = "setProgressViewStyle:")
    public native void setProgressViewStyle(UIProgressViewStyle v);
    @ObjCProperty public UIProgressViewStyle progressViewStyle;

    @ObjCPropertyGetter(selector = "progress")
    public native float getProgress();
    @ObjCPropertySetter(selector = "setProgress:")
    public native void setProgress(float v);
    @ObjCProperty public float progress;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "progressTintColor")
    public native UIColor getProgressTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setProgressTintColor:")
    public native void setProgressTintColor(UIColor v);
    @ObjCProperty public UIColor progressTintColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "trackTintColor")
    public native UIColor getTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setTrackTintColor:")
    public native void setTrackTintColor(UIColor v);
    @ObjCProperty public UIColor trackTintColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "progressImage")
    public native UIImage getProgressImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setProgressImage:")
    public native void setProgressImage(UIImage v);
    @ObjCProperty public UIImage progressImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "trackImage")
    public native UIImage getTrackImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setTrackImage:")
    public native void setTrackImage(UIImage v);
    @ObjCProperty public UIImage trackImage;
    
    @ObjCMethodSign(sign = "- (id)initWithProgressViewStyle:(UIProgressViewStyle)style;", selector = "initWithProgressViewStyle:")
    public native UIProgressView initWithProgressViewStyle$(UIProgressViewStyle style);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setProgress:(float)progress animated:(BOOL)animated NS_AVAILABLE_IOS(5_0);", selector = "setProgress:animated:")
    public native void setProgress$animated$(float progress, boolean animated);
}
