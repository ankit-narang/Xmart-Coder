package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UINavigationBar extends UIView implements NSCoding, UIBarPositioning {
    
    public UINavigationBar() {}
    @ObjCPropertyGetter(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @ObjCPropertySetter(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @ObjCProperty public UIBarStyle barStyle;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSObject getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSObject v);
    @ObjCProperty public NSObject delegate;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @ObjCProperty public boolean translucent;

    @ObjCPropertyGetter(selector = "topItem")
    public native UINavigationItem getTopItem();
    @ObjCProperty public UINavigationItem topItem;

    @ObjCPropertyGetter(selector = "backItem")
    public native UINavigationItem getBackItem();
    @ObjCProperty public UINavigationItem backItem;

    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCPropertySetter(selector = "setItems:")
    public native void setItems(NSArray v);
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "barTintColor")
    public native UIColor getBarTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    @ObjCProperty public UIColor barTintColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "shadowImage")
    public native UIImage getShadowImage();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setShadowImage:")
    public native void setShadowImage(UIImage v);
    @ObjCProperty public UIImage shadowImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "titleTextAttributes")
    public native NSDictionary getTitleTextAttributes();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setTitleTextAttributes:")
    public native void setTitleTextAttributes(NSDictionary v);
    @ObjCProperty public NSDictionary titleTextAttributes;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "backIndicatorImage")
    public native UIImage getBackIndicatorImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBackIndicatorImage:")
    public native void setBackIndicatorImage(UIImage v);
    @ObjCProperty public UIImage backIndicatorImage;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "backIndicatorTransitionMaskImage")
    public native UIImage getBackIndicatorTransitionMaskImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBackIndicatorTransitionMaskImage:")
    public native void setBackIndicatorTransitionMaskImage(UIImage v);
    @ObjCProperty public UIImage backIndicatorTransitionMaskImage;

    @ObjCPropertyGetter(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    @ObjCProperty public UIBarPosition barPosition;
    
    @ObjCMethodSign(sign = "- (void)pushNavigationItem:(UINavigationItem *)item animated:(BOOL)animated;", selector = "pushNavigationItem:animated:")
    public native void pushNavigationItem$animated$(UINavigationItem item, boolean animated);

    @ObjCMethodSign(sign = "- (UINavigationItem *)popNavigationItemAnimated:(BOOL)animated;", selector = "popNavigationItemAnimated:")
    public native UINavigationItem popNavigationItemAnimated$(boolean animated);

    @ObjCMethodSign(sign = "- (void)setItems:(NSArray *)items animated:(BOOL)animated;", selector = "setItems:animated:")
    public native void setItems$animated$(NSArray items, boolean animated);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forBarPosition:(UIBarPosition)barPosition barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(7_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage$forBarPosition$barMetrics$(UIImage backgroundImage, UIBarPosition barPosition, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForBarPosition:(UIBarPosition)barPosition barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(7_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForBarPosition:barMetrics:")
    public native UIImage backgroundImageForBarPosition$barMetrics$(UIBarPosition barPosition, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forBarMetrics:")
    public native void setBackgroundImage$forBarMetrics$(UIImage backgroundImage, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForBarMetrics:")
    public native UIImage backgroundImageForBarMetrics$(UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTitleVerticalPositionAdjustment:(CGFloat)adjustment forBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setTitleVerticalPositionAdjustment:forBarMetrics:")
    public native void setTitleVerticalPositionAdjustment$forBarMetrics$(float adjustment, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)titleVerticalPositionAdjustmentForBarMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "titleVerticalPositionAdjustmentForBarMetrics:")
    public native float titleVerticalPositionAdjustmentForBarMetrics$(UIBarMetrics barMetrics);
}
