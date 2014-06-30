package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIBarItem extends NSObject implements UIAppearance {
    
    public UIBarItem() {}
    @ObjCPropertyGetter(selector = "isEnabled")
    public native boolean isEnabled();
    @ObjCPropertySetter(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @ObjCProperty public boolean enabled;

    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "image")
    public native UIImage getImage();
    @ObjCPropertySetter(selector = "setImage:")
    public native void setImage(UIImage v);
    @ObjCProperty public UIImage image;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "landscapeImagePhone")
    public native UIImage getLandscapeImagePhone();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setLandscapeImagePhone:")
    public native void setLandscapeImagePhone(UIImage v);
    @ObjCProperty public UIImage landscapeImagePhone;

    @ObjCPropertyGetter(selector = "imageInsets")
    public native @ObjCByValue UIEdgeInsets getImageInsets();
    @ObjCPropertySetter(selector = "setImageInsets:")
    public native void setImageInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets imageInsets;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "landscapeImagePhoneInsets")
    public native @ObjCByValue UIEdgeInsets getLandscapeImagePhoneInsets();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setLandscapeImagePhoneInsets:")
    public native void setLandscapeImagePhoneInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets landscapeImagePhoneInsets;

    @ObjCPropertyGetter(selector = "tag")
    public native @NSInteger long getTag();
    @ObjCPropertySetter(selector = "setTag:")
    public native void setTag(@NSInteger long v);
    @ObjCProperty public @NSInteger long tag;
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTitleTextAttributes:(NSDictionary *)attributes forState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setTitleTextAttributes:forState:")
    public native void setTitleTextAttributes$forState$(NSDictionary attributes, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)titleTextAttributesForState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "titleTextAttributesForState:")
    public native NSDictionary titleTextAttributesForState$(UIControlState state);
}
