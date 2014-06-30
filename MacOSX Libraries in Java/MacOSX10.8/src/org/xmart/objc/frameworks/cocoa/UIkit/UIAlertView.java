package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIAlertView extends UIView  {
    
    public UIAlertView() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native NSObject getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSObject v);
    @ObjCProperty public NSObject delegate;

    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "message")
    public native NSString getMessage();
    @ObjCPropertySetter(selector = "setMessage:")
    public native void setMessage(NSString v);
    @ObjCProperty public NSString message;

    @ObjCPropertyGetter(selector = "numberOfButtons")
    public native @NSInteger long getNumberOfButtons();
    @ObjCProperty public @NSInteger long numberOfButtons;

    @ObjCPropertyGetter(selector = "cancelButtonIndex")
    public native @NSInteger long getCancelButtonIndex();
    @ObjCPropertySetter(selector = "setCancelButtonIndex:")
    public native void setCancelButtonIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long cancelButtonIndex;

    @ObjCPropertyGetter(selector = "firstOtherButtonIndex")
    public native @NSInteger long getFirstOtherButtonIndex();
    @ObjCProperty public @NSInteger long firstOtherButtonIndex;

    @ObjCPropertyGetter(selector = "isVisible")
    public native boolean isVisible();
    @ObjCProperty public boolean visible;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "alertViewStyle")
    public native UIAlertViewStyle getAlertViewStyle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAlertViewStyle:")
    public native void setAlertViewStyle(UIAlertViewStyle v);
    @ObjCProperty public UIAlertViewStyle alertViewStyle;
    
    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title message:(NSString *)message delegate:(id /*<UIAlertViewDelegate>*/)delegate cancelButtonTitle:(NSString *)cancelButtonTitle otherButtonTitles:(NSString *)otherButtonTitles, ... NS_REQUIRES_NIL_TERMINATION;", selector = "initWithTitle:message:delegate:cancelButtonTitle:otherButtonTitles:")
    public native UIAlertView initWithTitle$message$delegate$cancelButtonTitle$otherButtonTitles$(NSString title, NSString message, NSObject delegate, NSString cancelButtonTitle, NSString otherButtonTitles, NSObject... varArgs);

    @ObjCMethodSign(sign = "- (NSInteger)addButtonWithTitle:(NSString *)title;", selector = "addButtonWithTitle:")
    public native @NSInteger long addButtonWithTitle$(NSString title);

    @ObjCMethodSign(sign = "- (NSString *)buttonTitleAtIndex:(NSInteger)buttonIndex;", selector = "buttonTitleAtIndex:")
    public native NSString buttonTitleAtIndex$(@NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)show;", selector = "show")
    public native void show();

    @ObjCMethodSign(sign = "- (void)dismissWithClickedButtonIndex:(NSInteger)buttonIndex animated:(BOOL)animated;", selector = "dismissWithClickedButtonIndex:animated:")
    public native void dismissWithClickedButtonIndex$animated$(@NSInteger long buttonIndex, boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UITextField *)textFieldAtIndex:(NSInteger)textFieldIndex NS_AVAILABLE_IOS(5_0);", selector = "textFieldAtIndex:")
    public native UITextField textFieldAtIndex$(@NSInteger long textFieldIndex);
}
