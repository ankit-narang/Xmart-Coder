package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPopoverController extends NSObject implements UIAppearanceContainer {
    
    public UIPopoverController() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIPopoverControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPopoverControllerDelegate v);
    @ObjCProperty public UIPopoverControllerDelegate delegate;

    @ObjCPropertyGetter(selector = "contentViewController")
    public native UIViewController getContentViewController();
    @ObjCPropertySetter(selector = "setContentViewController:")
    public native void setContentViewController(UIViewController v);
    @ObjCProperty public UIViewController contentViewController;

    @ObjCPropertyGetter(selector = "popoverContentSize")
    public native @ObjCByValue CGSize getPopoverContentSize();
    @ObjCPropertySetter(selector = "setPopoverContentSize:")
    public native void setPopoverContentSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize popoverContentSize;

    @ObjCPropertyGetter(selector = "isPopoverVisible")
    public native boolean isPopoverVisible();
    @ObjCProperty public boolean popoverVisible;

    @ObjCPropertyGetter(selector = "popoverArrowDirection")
    public native UIPopoverArrowDirection getPopoverArrowDirection();
    @ObjCProperty public UIPopoverArrowDirection popoverArrowDirection;

    @ObjCPropertyGetter(selector = "passthroughViews")
    public native NSArray getPassthroughViews();
    @ObjCPropertySetter(selector = "setPassthroughViews:")
    public native void setPassthroughViews(NSArray v);
    @ObjCProperty public NSArray passthroughViews;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @ObjCProperty public UIColor backgroundColor;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "popoverLayoutMargins")
    public native @ObjCByValue UIEdgeInsets getPopoverLayoutMargins();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setPopoverLayoutMargins:")
    public native void setPopoverLayoutMargins(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets popoverLayoutMargins;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "popoverBackgroundViewClass")
    public native ObjCClass getPopoverBackgroundViewClass();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setPopoverBackgroundViewClass:")
    public native void setPopoverBackgroundViewClass(ObjCClass v);
    @ObjCProperty public ObjCClass popoverBackgroundViewClass;
    
    @ObjCMethodSign(sign = "- (id)initWithContentViewController:(UIViewController *)viewController;", selector = "initWithContentViewController:")
    public native UIPopoverController initWithContentViewController$(UIViewController viewController);

    @ObjCMethodSign(sign = "- (void)setContentViewController:(UIViewController *)viewController animated:(BOOL)animated;", selector = "setContentViewController:animated:")
    public native void setContentViewController$animated$(UIViewController viewController, boolean animated);

    @ObjCMethodSign(sign = "- (void)setPopoverContentSize:(CGSize)size animated:(BOOL)animated;", selector = "setPopoverContentSize:animated:")
    public native void setPopoverContentSize$animated$(@ObjCByValue CGSize size, boolean animated);

    @ObjCMethodSign(sign = "- (void)presentPopoverFromRect:(CGRect)rect inView:(UIView *)view permittedArrowDirections:(UIPopoverArrowDirection)arrowDirections animated:(BOOL)animated;", selector = "presentPopoverFromRect:inView:permittedArrowDirections:animated:")
    public native void presentPopoverFromRect$inView$permittedArrowDirections$animated$(@ObjCByValue CGRect rect, UIView view, UIPopoverArrowDirection arrowDirections, boolean animated);

    @ObjCMethodSign(sign = "- (void)presentPopoverFromBarButtonItem:(UIBarButtonItem *)item permittedArrowDirections:(UIPopoverArrowDirection)arrowDirections animated:(BOOL)animated;", selector = "presentPopoverFromBarButtonItem:permittedArrowDirections:animated:")
    public native void presentPopoverFromBarButtonItem$permittedArrowDirections$animated$(UIBarButtonItem item, UIPopoverArrowDirection arrowDirections, boolean animated);

    @ObjCMethodSign(sign = "- (void)dismissPopoverAnimated:(BOOL)animated;", selector = "dismissPopoverAnimated:")
    public native void dismissPopoverAnimated$(boolean animated);
}
