package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIResponder extends NSObject  {
    
    public UIResponder() {}
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "undoManager")
    public native NSUndoManager getUndoManager();
    @ObjCProperty public NSUndoManager undoManager;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "keyCommands")
    public native NSArray getKeyCommands();
    @ObjCProperty public NSArray keyCommands;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "inputView")
    public native UIView getInputView();
    @ObjCProperty public UIView inputView;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    @ObjCProperty public UIView inputAccessoryView;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "textInputMode")
    public native UITextInputMode getTextInputMode();
    @ObjCProperty public UITextInputMode textInputMode;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "textInputContextIdentifier")
    public native NSString getTextInputContextIdentifier();
    @ObjCProperty public NSString textInputContextIdentifier;
    
    @ObjCMethodSign(sign = "- (UIResponder*)nextResponder;", selector = "nextResponder")
    public native UIResponder nextResponder();

    @ObjCMethodSign(sign = "- (BOOL)canBecomeFirstResponder;", selector = "canBecomeFirstResponder")
    public native boolean canBecomeFirstResponder();

    @ObjCMethodSign(sign = "- (BOOL)becomeFirstResponder;", selector = "becomeFirstResponder")
    public native boolean becomeFirstResponder();

    @ObjCMethodSign(sign = "- (BOOL)canResignFirstResponder;", selector = "canResignFirstResponder")
    public native boolean canResignFirstResponder();

    @ObjCMethodSign(sign = "- (BOOL)resignFirstResponder;", selector = "resignFirstResponder")
    public native boolean resignFirstResponder();

    @ObjCMethodSign(sign = "- (BOOL)isFirstResponder;", selector = "isFirstResponder")
    public native boolean isFirstResponder();

    @ObjCMethodSign(sign = "- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event;", selector = "touchesBegan:withEvent:")
    public native void touchesBegan$withEvent$(NSSet touches, UIEvent event);

    @ObjCMethodSign(sign = "- (void)touchesMoved:(NSSet *)touches withEvent:(UIEvent *)event;", selector = "touchesMoved:withEvent:")
    public native void touchesMoved$withEvent$(NSSet touches, UIEvent event);

    @ObjCMethodSign(sign = "- (void)touchesEnded:(NSSet *)touches withEvent:(UIEvent *)event;", selector = "touchesEnded:withEvent:")
    public native void touchesEnded$withEvent$(NSSet touches, UIEvent event);

    @ObjCMethodSign(sign = "- (void)touchesCancelled:(NSSet *)touches withEvent:(UIEvent *)event;", selector = "touchesCancelled:withEvent:")
    public native void touchesCancelled$withEvent$(NSSet touches, UIEvent event);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)motionBegan:(UIEventSubtype)motion withEvent:(UIEvent *)event NS_AVAILABLE_IOS(3_0);", selector = "motionBegan:withEvent:")
    public native void motionBegan$withEvent$(UIEventSubtype motion, UIEvent event);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)motionEnded:(UIEventSubtype)motion withEvent:(UIEvent *)event NS_AVAILABLE_IOS(3_0);", selector = "motionEnded:withEvent:")
    public native void motionEnded$withEvent$(UIEventSubtype motion, UIEvent event);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)motionCancelled:(UIEventSubtype)motion withEvent:(UIEvent *)event NS_AVAILABLE_IOS(3_0);", selector = "motionCancelled:withEvent:")
    public native void motionCancelled$withEvent$(UIEventSubtype motion, UIEvent event);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)remoteControlReceivedWithEvent:(UIEvent *)event NS_AVAILABLE_IOS(4_0);", selector = "remoteControlReceivedWithEvent:")
    public native void remoteControlReceivedWithEvent$(UIEvent event);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)canPerformAction:(SEL)action withSender:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "canPerformAction:withSender:")
    public native boolean canPerformAction$withSender$(ObjCSelector action, NSObject sender);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)targetForAction:(SEL)action withSender:(id)sender NS_AVAILABLE_IOS(7_0);", selector = "targetForAction:withSender:")
    public native NSObject targetForAction$withSender$(ObjCSelector action, NSObject sender);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCCategoryMethod(catname = "UIResponderInputViewAdditions", catownername = "UIResponder")
    @ObjCMethodSign(sign = "- (void)reloadInputViews NS_AVAILABLE_IOS(3_2);", selector = "reloadInputViews")
    public native void reloadInputViews();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIResponderInputViewAdditions", catownername = "UIResponder")
    @ObjCMethodSign(sign = "+ (void)clearTextInputContextIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(7_0);", selector = "clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier$(NSString identifier);
}
