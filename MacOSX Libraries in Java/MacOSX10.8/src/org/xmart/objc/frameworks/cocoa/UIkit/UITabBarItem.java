package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITabBarItem extends UIBarItem  {
    
    public UITabBarItem() {}
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "selectedImage")
    public native UIImage getSelectedImage();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSelectedImage:")
    public native void setSelectedImage(UIImage v);
    @ObjCProperty public UIImage selectedImage;

    @ObjCPropertyGetter(selector = "badgeValue")
    public native NSString getBadgeValue();
    @ObjCPropertySetter(selector = "setBadgeValue:")
    public native void setBadgeValue(NSString v);
    @ObjCProperty public NSString badgeValue;
    
    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title image:(UIImage *)image tag:(NSInteger)tag;", selector = "initWithTitle:image:tag:")
    public native UITabBarItem initWithTitle$image$tag$(NSString title, UIImage image, @NSInteger long tag);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (instancetype)initWithTitle:(NSString *)title image:(UIImage *)image selectedImage:(UIImage *)selectedImage NS_AVAILABLE_IOS(7_0);", selector = "initWithTitle:image:selectedImage:")
    public native UITabBarItem initWithTitle$image$selectedImage$(NSString title, UIImage image, UIImage selectedImage);

    @ObjCMethodSign(sign = "- (id)initWithTabBarSystemItem:(UITabBarSystemItem)systemItem tag:(NSInteger)tag;", selector = "initWithTabBarSystemItem:tag:")
    public native UITabBarItem initWithTabBarSystemItem$tag$(UITabBarSystemItem systemItem, @NSInteger long tag);

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)setFinishedSelectedImage:(UIImage *)selectedImage withFinishedUnselectedImage:(UIImage *)unselectedImage NS_DEPRECATED_IOS(5_0,7_0,\"Use initWithTitle:image:selectedImage: or the image and selectedImage properties along with UIImageRenderingModeAlwaysOriginal\");", selector = "setFinishedSelectedImage:withFinishedUnselectedImage:")
    public native void setFinishedSelectedImage$withFinishedUnselectedImage$(UIImage selectedImage, UIImage unselectedImage);

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (UIImage *)finishedSelectedImage NS_DEPRECATED_IOS(5_0,7_0);", selector = "finishedSelectedImage")
    public native UIImage finishedSelectedImage();

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (UIImage *)finishedUnselectedImage NS_DEPRECATED_IOS(5_0,7_0);", selector = "finishedUnselectedImage")
    public native UIImage finishedUnselectedImage();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTitlePositionAdjustment:(UIOffset)adjustment NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ObjCByValue UIOffset adjustment);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIOffset)titlePositionAdjustment NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "titlePositionAdjustment")
    public native @ObjCByValue UIOffset titlePositionAdjustment();
}
