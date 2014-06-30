package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDocumentInteractionController extends NSObject implements UIActionSheetDelegate {
    
    public UIDocumentInteractionController() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIDocumentInteractionControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIDocumentInteractionControllerDelegate v);
    @ObjCProperty public UIDocumentInteractionControllerDelegate delegate;

    @ObjCPropertyGetter(selector = "URL")
    public native NSURL getURL();
    @ObjCPropertySetter(selector = "setURL:")
    public native void setURL(NSURL v);
    @ObjCProperty public NSURL URL;

    @ObjCPropertyGetter(selector = "UTI")
    public native NSString getUTI();
    @ObjCPropertySetter(selector = "setUTI:")
    public native void setUTI(NSString v);
    @ObjCProperty public NSString UTI;

    @ObjCPropertyGetter(selector = "name")
    public native NSString getName();
    @ObjCPropertySetter(selector = "setName:")
    public native void setName(NSString v);
    @ObjCProperty public NSString name;

    @ObjCPropertyGetter(selector = "icons")
    public native NSArray getIcons();
    @ObjCProperty public NSArray icons;

    @ObjCPropertyGetter(selector = "annotation")
    public native NSObject getAnnotation();
    @ObjCPropertySetter(selector = "setAnnotation:")
    public native void setAnnotation(NSObject v);
    @ObjCProperty public NSObject annotation;

    @ObjCPropertyGetter(selector = "gestureRecognizers")
    public native NSArray getGestureRecognizers();
    @ObjCProperty public NSArray gestureRecognizers;
    
    @ObjCMethodSign(sign = "- (BOOL)presentOptionsMenuFromRect:(CGRect)rect inView:(UIView *)view animated:(BOOL)animated;", selector = "presentOptionsMenuFromRect:inView:animated:")
    public native boolean presentOptionsMenuFromRect$inView$animated$(@ObjCByValue CGRect rect, UIView view, boolean animated);

    @ObjCMethodSign(sign = "- (BOOL)presentOptionsMenuFromBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated;", selector = "presentOptionsMenuFromBarButtonItem:animated:")
    public native boolean presentOptionsMenuFromBarButtonItem$animated$(UIBarButtonItem item, boolean animated);

    @ObjCMethodSign(sign = "- (BOOL)presentPreviewAnimated:(BOOL)animated;", selector = "presentPreviewAnimated:")
    public native boolean presentPreviewAnimated$(boolean animated);

    @ObjCMethodSign(sign = "- (BOOL)presentOpenInMenuFromRect:(CGRect)rect inView:(UIView *)view animated:(BOOL)animated;", selector = "presentOpenInMenuFromRect:inView:animated:")
    public native boolean presentOpenInMenuFromRect$inView$animated$(@ObjCByValue CGRect rect, UIView view, boolean animated);

    @ObjCMethodSign(sign = "- (BOOL)presentOpenInMenuFromBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated;", selector = "presentOpenInMenuFromBarButtonItem:animated:")
    public native boolean presentOpenInMenuFromBarButtonItem$animated$(UIBarButtonItem item, boolean animated);

    @ObjCMethodSign(sign = "- (void)dismissPreviewAnimated:(BOOL)animated;", selector = "dismissPreviewAnimated:")
    public native void dismissPreviewAnimated$(boolean animated);

    @ObjCMethodSign(sign = "- (void)dismissMenuAnimated:(BOOL)animated;", selector = "dismissMenuAnimated:")
    public native void dismissMenuAnimated$(boolean animated);

    @ObjCMethodSign(sign = "+ (UIDocumentInteractionController *)interactionControllerWithURL:(NSURL *)url;", selector = "interactionControllerWithURL:")
    public static native UIDocumentInteractionController interactionControllerWithURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet clickedButtonAtIndex:(NSInteger)buttonIndex;", selector = "actionSheet:clickedButtonAtIndex:")
    public native void actionSheet$clickedButtonAtIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheetCancel:(UIActionSheet *)actionSheet;", selector = "actionSheetCancel:")
    public native void actionSheetCancel$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)willPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "willPresentActionSheet:")
    public native void willPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)didPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "didPresentActionSheet:")
    public native void didPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet willDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:willDismissWithButtonIndex:")
    public native void actionSheet$willDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet didDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:didDismissWithButtonIndex:")
    public native void actionSheet$didDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);
}
