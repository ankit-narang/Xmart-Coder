package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISlider extends UIControl implements NSCoding {
    
    public UISlider() {}
    @ObjCPropertyGetter(selector = "value")
    public native float getValue();
    @ObjCPropertySetter(selector = "setValue:")
    public native void setValue(float v);
    @ObjCProperty public float value;

    @ObjCPropertyGetter(selector = "minimumValue")
    public native float getMinimumValue();
    @ObjCPropertySetter(selector = "setMinimumValue:")
    public native void setMinimumValue(float v);
    @ObjCProperty public float minimumValue;

    @ObjCPropertyGetter(selector = "maximumValue")
    public native float getMaximumValue();
    @ObjCPropertySetter(selector = "setMaximumValue:")
    public native void setMaximumValue(float v);
    @ObjCProperty public float maximumValue;

    @ObjCPropertyGetter(selector = "minimumValueImage")
    public native UIImage getMinimumValueImage();
    @ObjCPropertySetter(selector = "setMinimumValueImage:")
    public native void setMinimumValueImage(UIImage v);
    @ObjCProperty public UIImage minimumValueImage;

    @ObjCPropertyGetter(selector = "maximumValueImage")
    public native UIImage getMaximumValueImage();
    @ObjCPropertySetter(selector = "setMaximumValueImage:")
    public native void setMaximumValueImage(UIImage v);
    @ObjCProperty public UIImage maximumValueImage;

    @ObjCPropertyGetter(selector = "isContinuous")
    public native boolean isContinuous();
    @ObjCPropertySetter(selector = "setContinuous:")
    public native void setContinuous(boolean v);
    @ObjCProperty public boolean continuous;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "minimumTrackTintColor")
    public native UIColor getMinimumTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setMinimumTrackTintColor:")
    public native void setMinimumTrackTintColor(UIColor v);
    @ObjCProperty public UIColor minimumTrackTintColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "maximumTrackTintColor")
    public native UIColor getMaximumTrackTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setMaximumTrackTintColor:")
    public native void setMaximumTrackTintColor(UIColor v);
    @ObjCProperty public UIColor maximumTrackTintColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "thumbTintColor")
    public native UIColor getThumbTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setThumbTintColor:")
    public native void setThumbTintColor(UIColor v);
    @ObjCProperty public UIColor thumbTintColor;

    @ObjCPropertyGetter(selector = "currentThumbImage")
    public native UIImage getCurrentThumbImage();
    @ObjCProperty public UIImage currentThumbImage;

    @ObjCPropertyGetter(selector = "currentMinimumTrackImage")
    public native UIImage getCurrentMinimumTrackImage();
    @ObjCProperty public UIImage currentMinimumTrackImage;

    @ObjCPropertyGetter(selector = "currentMaximumTrackImage")
    public native UIImage getCurrentMaximumTrackImage();
    @ObjCProperty public UIImage currentMaximumTrackImage;
    
    @ObjCMethodSign(sign = "- (void)setValue:(float)value animated:(BOOL)animated;", selector = "setValue:animated:")
    public native void setValue$animated$(float value, boolean animated);

    @ObjCMethodSign(sign = "- (void)setThumbImage:(UIImage *)image forState:(UIControlState)state;", selector = "setThumbImage:forState:")
    public native void setThumbImage$forState$(UIImage image, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setMinimumTrackImage:(UIImage *)image forState:(UIControlState)state;", selector = "setMinimumTrackImage:forState:")
    public native void setMinimumTrackImage$forState$(UIImage image, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setMaximumTrackImage:(UIImage *)image forState:(UIControlState)state;", selector = "setMaximumTrackImage:forState:")
    public native void setMaximumTrackImage$forState$(UIImage image, UIControlState state);

    @ObjCMethodSign(sign = "- (UIImage *)thumbImageForState:(UIControlState)state;", selector = "thumbImageForState:")
    public native UIImage thumbImageForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIImage *)minimumTrackImageForState:(UIControlState)state;", selector = "minimumTrackImageForState:")
    public native UIImage minimumTrackImageForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIImage *)maximumTrackImageForState:(UIControlState)state;", selector = "maximumTrackImageForState:")
    public native UIImage maximumTrackImageForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (CGRect)minimumValueImageRectForBounds:(CGRect)bounds;", selector = "minimumValueImageRectForBounds:")
    public native @ObjCByValue CGRect minimumValueImageRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)maximumValueImageRectForBounds:(CGRect)bounds;", selector = "maximumValueImageRectForBounds:")
    public native @ObjCByValue CGRect maximumValueImageRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)trackRectForBounds:(CGRect)bounds;", selector = "trackRectForBounds:")
    public native @ObjCByValue CGRect trackRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)thumbRectForBounds:(CGRect)bounds trackRect:(CGRect)rect value:(float)value;", selector = "thumbRectForBounds:trackRect:value:")
    public native @ObjCByValue CGRect thumbRectForBounds$trackRect$value$(@ObjCByValue CGRect bounds, @ObjCByValue CGRect rect, float value);
}
