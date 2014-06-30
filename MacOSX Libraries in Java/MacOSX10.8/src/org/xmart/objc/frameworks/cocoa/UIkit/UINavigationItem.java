package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UINavigationItem extends NSObject implements NSCoding {
    
    public UINavigationItem() {}
    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "backBarButtonItem")
    public native UIBarButtonItem getBackBarButtonItem();
    @ObjCPropertySetter(selector = "setBackBarButtonItem:")
    public native void setBackBarButtonItem(UIBarButtonItem v);
    @ObjCProperty public UIBarButtonItem backBarButtonItem;

    @ObjCPropertyGetter(selector = "titleView")
    public native UIView getTitleView();
    @ObjCPropertySetter(selector = "setTitleView:")
    public native void setTitleView(UIView v);
    @ObjCProperty public UIView titleView;

    @ObjCPropertyGetter(selector = "prompt")
    public native NSString getPrompt();
    @ObjCPropertySetter(selector = "setPrompt:")
    public native void setPrompt(NSString v);
    @ObjCProperty public NSString prompt;

    @ObjCPropertyGetter(selector = "hidesBackButton")
    public native boolean isHidesBackButton();
    @ObjCPropertySetter(selector = "setHidesBackButton:")
    public native void setHidesBackButton(boolean v);
    @ObjCProperty public boolean hidesBackButton;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "leftBarButtonItems")
    public native NSArray getLeftBarButtonItems();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setLeftBarButtonItems:")
    public native void setLeftBarButtonItems(NSArray v);
    @ObjCProperty public NSArray leftBarButtonItems;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "rightBarButtonItems")
    public native NSArray getRightBarButtonItems();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setRightBarButtonItems:")
    public native void setRightBarButtonItems(NSArray v);
    @ObjCProperty public NSArray rightBarButtonItems;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "leftItemsSupplementBackButton")
    public native boolean isLeftItemsSupplementBackButton();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setLeftItemsSupplementBackButton:")
    public native void setLeftItemsSupplementBackButton(boolean v);
    @ObjCProperty public boolean leftItemsSupplementBackButton;

    @ObjCPropertyGetter(selector = "leftBarButtonItem")
    public native UIBarButtonItem getLeftBarButtonItem();
    @ObjCPropertySetter(selector = "setLeftBarButtonItem:")
    public native void setLeftBarButtonItem(UIBarButtonItem v);
    @ObjCProperty public UIBarButtonItem leftBarButtonItem;

    @ObjCPropertyGetter(selector = "rightBarButtonItem")
    public native UIBarButtonItem getRightBarButtonItem();
    @ObjCPropertySetter(selector = "setRightBarButtonItem:")
    public native void setRightBarButtonItem(UIBarButtonItem v);
    @ObjCProperty public UIBarButtonItem rightBarButtonItem;
    
    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title;", selector = "initWithTitle:")
    public native UINavigationItem initWithTitle$(NSString title);

    @ObjCMethodSign(sign = "- (void)setHidesBackButton:(BOOL)hidesBackButton animated:(BOOL)animated;", selector = "setHidesBackButton:animated:")
    public native void setHidesBackButton$animated$(boolean hidesBackButton, boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setLeftBarButtonItems:(NSArray *)items animated:(BOOL)animated NS_AVAILABLE_IOS(5_0);", selector = "setLeftBarButtonItems:animated:")
    public native void setLeftBarButtonItems$animated$(NSArray items, boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setRightBarButtonItems:(NSArray *)items animated:(BOOL)animated NS_AVAILABLE_IOS(5_0);", selector = "setRightBarButtonItems:animated:")
    public native void setRightBarButtonItems$animated$(NSArray items, boolean animated);

    @ObjCMethodSign(sign = "- (void)setLeftBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated;", selector = "setLeftBarButtonItem:animated:")
    public native void setLeftBarButtonItem$animated$(UIBarButtonItem item, boolean animated);

    @ObjCMethodSign(sign = "- (void)setRightBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated;", selector = "setRightBarButtonItem:animated:")
    public native void setRightBarButtonItem$animated$(UIBarButtonItem item, boolean animated);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UINavigationItem initWithCoder$(NSCoder aDecoder);
}
