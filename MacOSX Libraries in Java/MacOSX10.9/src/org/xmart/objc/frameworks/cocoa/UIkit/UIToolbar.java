package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIToolbar extends UIView implements UIBarPositioning {
    
    public UIToolbar() {}
    @ObjCPropertyGetter(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @ObjCPropertySetter(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @ObjCProperty public UIBarStyle barStyle;

    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCPropertySetter(selector = "setItems:")
    public native void setItems(NSArray v);
    @ObjCProperty public NSArray items;

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
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "delegate")
    public native UIToolbarDelegate getDelegate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIToolbarDelegate v);
    @ObjCProperty public UIToolbarDelegate delegate;

    @ObjCPropertyGetter(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    @ObjCProperty public UIBarPosition barPosition;
    
    @ObjCMethodSign(sign = "- (void)setItems:(NSArray *)items animated:(BOOL)animated;", selector = "setItems:animated:")
    public native void setItems$animated$(NSArray items, boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forToolbarPosition:(UIBarPosition)topOrBottom barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forToolbarPosition:barMetrics:")
    public native void setBackgroundImage$forToolbarPosition$barMetrics$(UIImage backgroundImage, UIBarPosition topOrBottom, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForToolbarPosition:(UIBarPosition)topOrBottom barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForToolbarPosition:barMetrics:")
    public native UIImage backgroundImageForToolbarPosition$barMetrics$(UIBarPosition topOrBottom, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShadowImage:(UIImage *)shadowImage forToolbarPosition:(UIBarPosition)topOrBottom NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "setShadowImage:forToolbarPosition:")
    public native void setShadowImage$forToolbarPosition$(UIImage shadowImage, UIBarPosition topOrBottom);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)shadowImageForToolbarPosition:(UIBarPosition)topOrBottom NS_AVAILABLE_IOS(6_0) UI_APPEARANCE_SELECTOR;", selector = "shadowImageForToolbarPosition:")
    public native UIImage shadowImageForToolbarPosition$(UIBarPosition topOrBottom);
}
