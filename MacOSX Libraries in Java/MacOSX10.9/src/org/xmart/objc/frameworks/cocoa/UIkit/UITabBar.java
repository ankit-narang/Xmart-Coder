package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITabBar extends UIView  {
    
    public UITabBar() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UITabBarDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITabBarDelegate v);
    @ObjCProperty public UITabBarDelegate delegate;

    @ObjCPropertyGetter(selector = "items")
    public native NSArray getItems();
    @ObjCPropertySetter(selector = "setItems:")
    public native void setItems(NSArray v);
    @ObjCProperty public NSArray items;

    @ObjCPropertyGetter(selector = "selectedItem")
    public native UITabBarItem getSelectedItem();
    @ObjCPropertySetter(selector = "setSelectedItem:", strongRef = true)
    public native void setSelectedItem(UITabBarItem v);
    @ObjCProperty public UITabBarItem selectedItem;

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
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "selectedImageTintColor")
    public native UIColor getSelectedImageTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSelectedImageTintColor:")
    public native void setSelectedImageTintColor(UIColor v);
    @ObjCProperty public UIColor selectedImageTintColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    @ObjCProperty public UIImage backgroundImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "selectionIndicatorImage")
    public native UIImage getSelectionIndicatorImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSelectionIndicatorImage:")
    public native void setSelectionIndicatorImage(UIImage v);
    @ObjCProperty public UIImage selectionIndicatorImage;

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
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "itemPositioning")
    public native UITabBarItemPositioning getItemPositioning();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setItemPositioning:")
    public native void setItemPositioning(UITabBarItemPositioning v);
    @ObjCProperty public UITabBarItemPositioning itemPositioning;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "itemWidth")
    public native float getItemWidth();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setItemWidth:")
    public native void setItemWidth(float v);
    @ObjCProperty public float itemWidth;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "itemSpacing")
    public native float getItemSpacing();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setItemSpacing:")
    public native void setItemSpacing(float v);
    @ObjCProperty public float itemSpacing;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @ObjCProperty public UIBarStyle barStyle;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @ObjCProperty public boolean translucent;
    
    @ObjCMethodSign(sign = "- (void)setItems:(NSArray *)items animated:(BOOL)animated;", selector = "setItems:animated:")
    public native void setItems$animated$(NSArray items, boolean animated);

    @ObjCMethodSign(sign = "- (void)beginCustomizingItems:(NSArray *)items;", selector = "beginCustomizingItems:")
    public native void beginCustomizingItems$(NSArray items);

    @ObjCMethodSign(sign = "- (BOOL)endCustomizingAnimated:(BOOL)animated;", selector = "endCustomizingAnimated:")
    public native boolean endCustomizingAnimated$(boolean animated);

    @ObjCMethodSign(sign = "- (BOOL)isCustomizing;", selector = "isCustomizing")
    public native boolean isCustomizing();
}
