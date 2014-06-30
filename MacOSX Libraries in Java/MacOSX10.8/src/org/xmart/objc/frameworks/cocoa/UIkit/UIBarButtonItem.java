package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIBarButtonItem extends UIBarItem implements NSCoding {
    
    public UIBarButtonItem() {}
    @ObjCPropertyGetter(selector = "style")
    public native UIBarButtonItemStyle getStyle();
    @ObjCPropertySetter(selector = "setStyle:")
    public native void setStyle(UIBarButtonItemStyle v);
    @ObjCProperty public UIBarButtonItemStyle style;

    @ObjCPropertyGetter(selector = "width")
    public native float getWidth();
    @ObjCPropertySetter(selector = "setWidth:")
    public native void setWidth(float v);
    @ObjCProperty public float width;

    @ObjCPropertyGetter(selector = "possibleTitles")
    public native NSSet getPossibleTitles();
    @ObjCPropertySetter(selector = "setPossibleTitles:")
    public native void setPossibleTitles(NSSet v);
    @ObjCProperty public NSSet possibleTitles;

    @ObjCPropertyGetter(selector = "customView")
    public native UIView getCustomView();
    @ObjCPropertySetter(selector = "setCustomView:")
    public native void setCustomView(UIView v);
    @ObjCProperty public UIView customView;

    @ObjCPropertyGetter(selector = "action")
    public native ObjCSelector getAction();
    @ObjCPropertySetter(selector = "setAction:")
    public native void setAction(ObjCSelector v);
    @ObjCProperty public ObjCSelector action;

    @ObjCPropertyGetter(selector = "target")
    public native NSObject getTarget();
    @ObjCPropertySetter(selector = "setTarget:", strongRef = true)
    public native void setTarget(NSObject v);
    @ObjCProperty public NSObject target;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;
    
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image style:(UIBarButtonItemStyle)style target:(id)target action:(SEL)action;", selector = "initWithImage:style:target:action:")
    public native UIBarButtonItem initWithImage$style$target$action$(UIImage image, UIBarButtonItemStyle style, NSObject target, ObjCSelector action);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithImage:(UIImage *)image landscapeImagePhone:(UIImage *)landscapeImagePhone style:(UIBarButtonItemStyle)style target:(id)target action:(SEL)action NS_AVAILABLE_IOS(5_0);", selector = "initWithImage:landscapeImagePhone:style:target:action:")
    public native UIBarButtonItem initWithImage$landscapeImagePhone$style$target$action$(UIImage image, UIImage landscapeImagePhone, UIBarButtonItemStyle style, NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title style:(UIBarButtonItemStyle)style target:(id)target action:(SEL)action;", selector = "initWithTitle:style:target:action:")
    public native UIBarButtonItem initWithTitle$style$target$action$(NSString title, UIBarButtonItemStyle style, NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (id)initWithBarButtonSystemItem:(UIBarButtonSystemItem)systemItem target:(id)target action:(SEL)action;", selector = "initWithBarButtonSystemItem:target:action:")
    public native UIBarButtonItem initWithBarButtonSystemItem$target$action$(UIBarButtonSystemItem systemItem, NSObject target, ObjCSelector action);

    @ObjCMethodSign(sign = "- (id)initWithCustomView:(UIView *)customView;", selector = "initWithCustomView:")
    public native UIBarButtonItem initWithCustomView$(UIView customView);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage$forState$barMetrics$(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForState:barMetrics:")
    public native UIImage backgroundImageForState$barMetrics$(UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state style:(UIBarButtonItemStyle)style barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forState:style:barMetrics:")
    public native void setBackgroundImage$forState$style$barMetrics$(UIImage backgroundImage, UIControlState state, UIBarButtonItemStyle style, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForState:(UIControlState)state style:(UIBarButtonItemStyle)style barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForState:style:barMetrics:")
    public native UIImage backgroundImageForState$style$barMetrics$(UIControlState state, UIBarButtonItemStyle style, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundVerticalPositionAdjustment:(CGFloat)adjustment forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackgroundVerticalPositionAdjustment$forBarMetrics$(float adjustment, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)backgroundVerticalPositionAdjustmentForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundVerticalPositionAdjustmentForBarMetrics:")
    public native float backgroundVerticalPositionAdjustmentForBarMetrics$(UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTitlePositionAdjustment:(UIOffset)adjustment forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setTitlePositionAdjustment:forBarMetrics:")
    public native void setTitlePositionAdjustment$forBarMetrics$(@ObjCByValue UIOffset adjustment, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIOffset)titlePositionAdjustmentForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "titlePositionAdjustmentForBarMetrics:")
    public native @ObjCByValue UIOffset titlePositionAdjustmentForBarMetrics$(UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackButtonBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackButtonBackgroundImage:forState:barMetrics:")
    public native void setBackButtonBackgroundImage$forState$barMetrics$(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backButtonBackgroundImageForState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backButtonBackgroundImageForState:barMetrics:")
    public native UIImage backButtonBackgroundImageForState$barMetrics$(UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackButtonTitlePositionAdjustment:(UIOffset)adjustment forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackButtonTitlePositionAdjustment:forBarMetrics:")
    public native void setBackButtonTitlePositionAdjustment$forBarMetrics$(@ObjCByValue UIOffset adjustment, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIOffset)backButtonTitlePositionAdjustmentForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backButtonTitlePositionAdjustmentForBarMetrics:")
    public native @ObjCByValue UIOffset backButtonTitlePositionAdjustmentForBarMetrics$(UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackButtonBackgroundVerticalPositionAdjustment:(CGFloat)adjustment forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackButtonBackgroundVerticalPositionAdjustment:forBarMetrics:")
    public native void setBackButtonBackgroundVerticalPositionAdjustment$forBarMetrics$(float adjustment, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backButtonBackgroundVerticalPositionAdjustmentForBarMetrics:")
    public native float backButtonBackgroundVerticalPositionAdjustmentForBarMetrics$(UIBarMetrics barMetrics);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIBarButtonItem initWithCoder$(NSCoder aDecoder);
}
