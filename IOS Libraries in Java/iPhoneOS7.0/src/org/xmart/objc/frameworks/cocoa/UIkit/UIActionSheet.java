package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIActionSheet extends UIView  {
    
    public UIActionSheet() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIActionSheetDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIActionSheetDelegate v);
    @ObjCProperty public UIActionSheetDelegate delegate;

    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "actionSheetStyle")
    public native UIActionSheetStyle getActionSheetStyle();
    @ObjCPropertySetter(selector = "setActionSheetStyle:")
    public native void setActionSheetStyle(UIActionSheetStyle v);
    @ObjCProperty public UIActionSheetStyle actionSheetStyle;

    @ObjCPropertyGetter(selector = "numberOfButtons")
    public native @NSInteger long getNumberOfButtons();
    @ObjCProperty public @NSInteger long numberOfButtons;

    @ObjCPropertyGetter(selector = "cancelButtonIndex")
    public native @NSInteger long getCancelButtonIndex();
    @ObjCPropertySetter(selector = "setCancelButtonIndex:")
    public native void setCancelButtonIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long cancelButtonIndex;

    @ObjCPropertyGetter(selector = "destructiveButtonIndex")
    public native @NSInteger long getDestructiveButtonIndex();
    @ObjCPropertySetter(selector = "setDestructiveButtonIndex:")
    public native void setDestructiveButtonIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long destructiveButtonIndex;

    @ObjCPropertyGetter(selector = "firstOtherButtonIndex")
    public native @NSInteger long getFirstOtherButtonIndex();
    @ObjCProperty public @NSInteger long firstOtherButtonIndex;

    @ObjCPropertyGetter(selector = "isVisible")
    public native boolean isVisible();
    @ObjCProperty public boolean visible;
    
    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title delegate:(id<UIActionSheetDelegate>)delegate cancelButtonTitle:(NSString *)cancelButtonTitle destructiveButtonTitle:(NSString *)destructiveButtonTitle otherButtonTitles:(NSString *)otherButtonTitles, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithTitle:delegate:cancelButtonTitle:destructiveButtonTitle:otherButtonTitles:")
    public native UIActionSheet initWithTitle$delegate$cancelButtonTitle$destructiveButtonTitle$otherButtonTitles$(NSString title, UIActionSheetDelegate delegate, NSString cancelButtonTitle, NSString destructiveButtonTitle, NSString otherButtonTitles, NSObject... varArgs);

    @ObjCMethodSign(sign = "- (NSInteger)addButtonWithTitle:(NSString *)title;", selector = "addButtonWithTitle:")
    public native @NSInteger long addButtonWithTitle$(NSString title);

    @ObjCMethodSign(sign = "- (NSString *)buttonTitleAtIndex:(NSInteger)buttonIndex;", selector = "buttonTitleAtIndex:")
    public native NSString buttonTitleAtIndex$(@NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)showFromToolbar:(UIToolbar *)view;", selector = "showFromToolbar:")
    public native void showFromToolbar$(UIToolbar view);

    @ObjCMethodSign(sign = "- (void)showFromTabBar:(UITabBar *)view;", selector = "showFromTabBar:")
    public native void showFromTabBar$(UITabBar view);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)showFromBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated NS_AVAILABLE_IOS(3_2);", selector = "showFromBarButtonItem:animated:")
    public native void showFromBarButtonItem$animated$(UIBarButtonItem item, boolean animated);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)showFromRect:(CGRect)rect inView:(UIView *)view animated:(BOOL)animated NS_AVAILABLE_IOS(3_2);", selector = "showFromRect:inView:animated:")
    public native void showFromRect$inView$animated$(@ObjCByValue CGRect rect, UIView view, boolean animated);

    @ObjCMethodSign(sign = "- (void)showInView:(UIView *)view;", selector = "showInView:")
    public native void showInView$(UIView view);

    @ObjCMethodSign(sign = "- (void)dismissWithClickedButtonIndex:(NSInteger)buttonIndex animated:(BOOL)animated;", selector = "dismissWithClickedButtonIndex:animated:")
    public native void dismissWithClickedButtonIndex$animated$(@NSInteger long buttonIndex, boolean animated);
}
