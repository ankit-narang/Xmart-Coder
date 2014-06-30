package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIImageView extends UIView  {
    
    public UIImageView() {}
    @ObjCPropertyGetter(selector = "image")
    public native UIImage getImage();
    @ObjCPropertySetter(selector = "setImage:")
    public native void setImage(UIImage v);
    @ObjCProperty public UIImage image;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "highlightedImage")
    public native UIImage getHighlightedImage();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setHighlightedImage:")
    public native void setHighlightedImage(UIImage v);
    @ObjCProperty public UIImage highlightedImage;

    @ObjCPropertyGetter(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @ObjCPropertySetter(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @ObjCProperty public boolean userInteractionEnabled;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isHighlighted")
    public native boolean isHighlighted();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @ObjCProperty public boolean highlighted;

    @ObjCPropertyGetter(selector = "animationImages")
    public native NSArray getAnimationImages();
    @ObjCPropertySetter(selector = "setAnimationImages:")
    public native void setAnimationImages(NSArray v);
    @ObjCProperty public NSArray animationImages;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "highlightedAnimationImages")
    public native NSArray getHighlightedAnimationImages();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setHighlightedAnimationImages:")
    public native void setHighlightedAnimationImages(NSArray v);
    @ObjCProperty public NSArray highlightedAnimationImages;

    @ObjCPropertyGetter(selector = "animationDuration")
    public native double getAnimationDuration();
    @ObjCPropertySetter(selector = "setAnimationDuration:")
    public native void setAnimationDuration(double v);
    @ObjCProperty public double animationDuration;

    @ObjCPropertyGetter(selector = "animationRepeatCount")
    public native @NSInteger long getAnimationRepeatCount();
    @ObjCPropertySetter(selector = "setAnimationRepeatCount:")
    public native void setAnimationRepeatCount(@NSInteger long v);
    @ObjCProperty public @NSInteger long animationRepeatCount;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;
    
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image;", selector = "initWithImage:")
    public native UIImageView initWithImage$(UIImage image);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image highlightedImage:(UIImage *)highlightedImage NS_AVAILABLE_IOS(3_0);", selector = "initWithImage:highlightedImage:")
    public native UIImageView initWithImage$highlightedImage$(UIImage image, UIImage highlightedImage);

    @ObjCMethodSign(sign = "- (void)startAnimating;", selector = "startAnimating")
    public native void startAnimating();

    @ObjCMethodSign(sign = "- (void)stopAnimating;", selector = "stopAnimating")
    public native void stopAnimating();

    @ObjCMethodSign(sign = "- (BOOL)isAnimating;", selector = "isAnimating")
    public native boolean isAnimating();
}
