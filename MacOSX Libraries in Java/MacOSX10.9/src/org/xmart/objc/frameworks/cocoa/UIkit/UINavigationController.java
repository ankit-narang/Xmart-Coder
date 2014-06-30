package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UINavigationController extends UIViewController  {
    
    public UINavigationController() {}
    @ObjCPropertyGetter(selector = "topViewController")
    public native UIViewController getTopViewController();
    @ObjCProperty public UIViewController topViewController;

    @ObjCPropertyGetter(selector = "visibleViewController")
    public native UIViewController getVisibleViewController();
    @ObjCProperty public UIViewController visibleViewController;

    @ObjCPropertyGetter(selector = "viewControllers")
    public native NSArray getViewControllers();
    @ObjCPropertySetter(selector = "setViewControllers:")
    public native void setViewControllers(NSArray v);
    @ObjCProperty public NSArray viewControllers;

    @ObjCPropertyGetter(selector = "isNavigationBarHidden")
    public native boolean isNavigationBarHidden();
    @ObjCPropertySetter(selector = "setNavigationBarHidden:")
    public native void setNavigationBarHidden(boolean v);
    @ObjCProperty public boolean navigationBarHidden;

    @ObjCPropertyGetter(selector = "navigationBar")
    public native UINavigationBar getNavigationBar();
    @ObjCProperty public UINavigationBar navigationBar;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isToolbarHidden")
    public native boolean isToolbarHidden();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setToolbarHidden:")
    public native void setToolbarHidden(boolean v);
    @ObjCProperty public boolean toolbarHidden;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "toolbar")
    public native UIToolbar getToolbar();
    @ObjCProperty public UIToolbar toolbar;

    @ObjCPropertyGetter(selector = "delegate")
    public native UINavigationControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UINavigationControllerDelegate v);
    @ObjCProperty public UINavigationControllerDelegate delegate;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "interactivePopGestureRecognizer")
    public native UIGestureRecognizer getInteractivePopGestureRecognizer();
    @ObjCProperty public UIGestureRecognizer interactivePopGestureRecognizer;
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (instancetype)initWithNavigationBarClass:(Class)navigationBarClass toolbarClass:(Class)toolbarClass NS_AVAILABLE_IOS(5_0);", selector = "initWithNavigationBarClass:toolbarClass:")
    public native UINavigationController initWithNavigationBarClass$toolbarClass$(ObjCClass navigationBarClass, ObjCClass toolbarClass);

    @ObjCMethodSign(sign = "- (id)initWithRootViewController:(UIViewController *)rootViewController;", selector = "initWithRootViewController:")
    public native UINavigationController initWithRootViewController$(UIViewController rootViewController);

    @ObjCMethodSign(sign = "- (void)pushViewController:(UIViewController *)viewController animated:(BOOL)animated;", selector = "pushViewController:animated:")
    public native void pushViewController$animated$(UIViewController viewController, boolean animated);

    @ObjCMethodSign(sign = "- (UIViewController *)popViewControllerAnimated:(BOOL)animated;", selector = "popViewControllerAnimated:")
    public native UIViewController popViewControllerAnimated$(boolean animated);

    @ObjCMethodSign(sign = "- (NSArray *)popToViewController:(UIViewController *)viewController animated:(BOOL)animated;", selector = "popToViewController:animated:")
    public native NSArray popToViewController$animated$(UIViewController viewController, boolean animated);

    @ObjCMethodSign(sign = "- (NSArray *)popToRootViewControllerAnimated:(BOOL)animated;", selector = "popToRootViewControllerAnimated:")
    public native NSArray popToRootViewControllerAnimated$(boolean animated);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setViewControllers:(NSArray *)viewControllers animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "setViewControllers:animated:")
    public native void setViewControllers$animated$(NSArray viewControllers, boolean animated);

    @ObjCMethodSign(sign = "- (void)setNavigationBarHidden:(BOOL)hidden animated:(BOOL)animated;", selector = "setNavigationBarHidden:animated:")
    public native void setNavigationBarHidden$animated$(boolean hidden, boolean animated);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setToolbarHidden:(BOOL)hidden animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "setToolbarHidden:animated:")
    public native void setToolbarHidden$animated$(boolean hidden, boolean animated);
}
