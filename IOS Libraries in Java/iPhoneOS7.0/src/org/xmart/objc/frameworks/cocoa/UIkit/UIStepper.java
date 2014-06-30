package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIStepper extends UIControl  {
    
    public UIStepper() {}
    @ObjCPropertyGetter(selector = "isContinuous")
    public native boolean isContinuous();
    @ObjCPropertySetter(selector = "setContinuous:")
    public native void setContinuous(boolean v);
    @ObjCProperty public boolean continuous;

    @ObjCPropertyGetter(selector = "autorepeat")
    public native boolean isAutorepeat();
    @ObjCPropertySetter(selector = "setAutorepeat:")
    public native void setAutorepeat(boolean v);
    @ObjCProperty public boolean autorepeat;

    @ObjCPropertyGetter(selector = "wraps")
    public native boolean isWraps();
    @ObjCPropertySetter(selector = "setWraps:")
    public native void setWraps(boolean v);
    @ObjCProperty public boolean wraps;

    @ObjCPropertyGetter(selector = "value")
    public native double getValue();
    @ObjCPropertySetter(selector = "setValue:")
    public native void setValue(double v);
    @ObjCProperty public double value;

    @ObjCPropertyGetter(selector = "minimumValue")
    public native double getMinimumValue();
    @ObjCPropertySetter(selector = "setMinimumValue:")
    public native void setMinimumValue(double v);
    @ObjCProperty public double minimumValue;

    @ObjCPropertyGetter(selector = "maximumValue")
    public native double getMaximumValue();
    @ObjCPropertySetter(selector = "setMaximumValue:")
    public native void setMaximumValue(double v);
    @ObjCProperty public double maximumValue;

    @ObjCPropertyGetter(selector = "stepValue")
    public native double getStepValue();
    @ObjCPropertySetter(selector = "setStepValue:")
    public native void setStepValue(double v);
    @ObjCProperty public double stepValue;

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
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage*)image forState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forState:")
    public native void setBackgroundImage$forState$(UIImage image, UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage*)backgroundImageForState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForState:")
    public native UIImage backgroundImageForState$(UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDividerImage:(UIImage*)image forLeftSegmentState:(UIControlState)leftState rightSegmentState:(UIControlState)rightState NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setDividerImage$forLeftSegmentState$rightSegmentState$(UIImage image, UIControlState leftState, UIControlState rightState);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setIncrementImage:(UIImage *)image forState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setIncrementImage:forState:")
    public native void setIncrementImage$forState$(UIImage image, UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)incrementImageForState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "incrementImageForState:")
    public native UIImage incrementImageForState$(UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDecrementImage:(UIImage *)image forState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setDecrementImage:forState:")
    public native void setDecrementImage$forState$(UIImage image, UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)decrementImageForState:(UIControlState)state NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "decrementImageForState:")
    public native UIImage decrementImageForState$(UIControlState state);
}
