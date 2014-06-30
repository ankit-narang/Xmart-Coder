package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIViewController extends UIResponder implements NSCoding, UIAppearanceContainer, UIStateRestoring {
    
    public UIViewController() {}
    @ObjCPropertyGetter(selector = "view")
    public native UIView getView();
    @ObjCPropertySetter(selector = "setView:")
    public native void setView(UIView v);
    @ObjCProperty public UIView view;

    @ObjCPropertyGetter(selector = "nibName")
    public native NSString getNibName();
    @ObjCProperty public NSString nibName;

    @ObjCPropertyGetter(selector = "nibBundle")
    public native NSBundle getNibBundle();
    @ObjCProperty public NSBundle nibBundle;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "storyboard")
    public native UIStoryboard getStoryboard();
    @ObjCProperty public UIStoryboard storyboard;

    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "parentViewController")
    public native UIViewController getParentViewController();
    @ObjCProperty public UIViewController parentViewController;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "modalViewController")
    public native UIViewController getModalViewController();
    @ObjCProperty public UIViewController modalViewController;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "presentedViewController")
    public native UIViewController getPresentedViewController();
    @ObjCProperty public UIViewController presentedViewController;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "presentingViewController")
    public native UIViewController getPresentingViewController();
    @ObjCProperty public UIViewController presentingViewController;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "definesPresentationContext")
    public native boolean isDefinesPresentationContext();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setDefinesPresentationContext:")
    public native void setDefinesPresentationContext(boolean v);
    @ObjCProperty public boolean definesPresentationContext;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "providesPresentationContextTransitionStyle")
    public native boolean isProvidesPresentationContextTransitionStyle();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setProvidesPresentationContextTransitionStyle:")
    public native void setProvidesPresentationContextTransitionStyle(boolean v);
    @ObjCProperty public boolean providesPresentationContextTransitionStyle;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "modalTransitionStyle")
    public native UIModalTransitionStyle getModalTransitionStyle();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setModalTransitionStyle:")
    public native void setModalTransitionStyle(UIModalTransitionStyle v);
    @ObjCProperty public UIModalTransitionStyle modalTransitionStyle;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "modalPresentationStyle")
    public native UIModalPresentationStyle getModalPresentationStyle();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setModalPresentationStyle:")
    public native void setModalPresentationStyle(UIModalPresentationStyle v);
    @ObjCProperty public UIModalPresentationStyle modalPresentationStyle;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "modalPresentationCapturesStatusBarAppearance")
    public native boolean isModalPresentationCapturesStatusBarAppearance();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setModalPresentationCapturesStatusBarAppearance:")
    public native void setModalPresentationCapturesStatusBarAppearance(boolean v);
    @ObjCProperty public boolean modalPresentationCapturesStatusBarAppearance;

    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "wantsFullScreenLayout")
    public native boolean isWantsFullScreenLayout();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setWantsFullScreenLayout:")
    public native void setWantsFullScreenLayout(boolean v);
    @ObjCProperty public boolean wantsFullScreenLayout;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "edgesForExtendedLayout")
    public native UIRectEdge getEdgesForExtendedLayout();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setEdgesForExtendedLayout:")
    public native void setEdgesForExtendedLayout(UIRectEdge v);
    @ObjCProperty public UIRectEdge edgesForExtendedLayout;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "extendedLayoutIncludesOpaqueBars")
    public native boolean isExtendedLayoutIncludesOpaqueBars();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setExtendedLayoutIncludesOpaqueBars:")
    public native void setExtendedLayoutIncludesOpaqueBars(boolean v);
    @ObjCProperty public boolean extendedLayoutIncludesOpaqueBars;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "automaticallyAdjustsScrollViewInsets")
    public native boolean isAutomaticallyAdjustsScrollViewInsets();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setAutomaticallyAdjustsScrollViewInsets:")
    public native void setAutomaticallyAdjustsScrollViewInsets(boolean v);
    @ObjCProperty public boolean automaticallyAdjustsScrollViewInsets;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "preferredContentSize")
    public native @ObjCByValue CGSize getPreferredContentSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setPreferredContentSize:")
    public native void setPreferredContentSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize preferredContentSize;

    @ObjCPropertyGetter(selector = "interfaceOrientation")
    public native UIInterfaceOrientation getInterfaceOrientation();
    @ObjCProperty public UIInterfaceOrientation interfaceOrientation;

    @ObjCPropertyGetter(selector = "isEditing")
    public native boolean isEditing();
    @ObjCPropertySetter(selector = "setEditing:")
    public native void setEditing(boolean v);
    @ObjCProperty public boolean editing;

    @ObjCPropertyGetter(selector = "searchDisplayController")
    public native UISearchDisplayController getSearchDisplayController();
    @ObjCProperty public UISearchDisplayController searchDisplayController;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "childViewControllers")
    public native NSArray getChildViewControllers();
    @ObjCProperty public NSArray childViewControllers;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "restorationIdentifier")
    public native NSString getRestorationIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setRestorationIdentifier:")
    public native void setRestorationIdentifier(NSString v);
    @ObjCProperty public NSString restorationIdentifier;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "restorationClass")
    public native ObjCClass getRestorationClass();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setRestorationClass:", strongRef = true)
    public native void setRestorationClass(ObjCClass v);
    @ObjCProperty public ObjCClass restorationClass;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "transitioningDelegate")
    public native UIViewControllerTransitioningDelegate getTransitioningDelegate();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTransitioningDelegate:", strongRef = true)
    public native void setTransitioningDelegate(UIViewControllerTransitioningDelegate v);
    @ObjCProperty public UIViewControllerTransitioningDelegate transitioningDelegate;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "topLayoutGuide")
    public native UILayoutSupport getTopLayoutGuide();
    @ObjCProperty public UILayoutSupport topLayoutGuide;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "bottomLayoutGuide")
    public native UILayoutSupport getBottomLayoutGuide();
    @ObjCProperty public UILayoutSupport bottomLayoutGuide;

    @ObjCPropertyGetter(selector = "navigationItem")
    public native UINavigationItem getNavigationItem();
    @ObjCProperty public UINavigationItem navigationItem;

    @ObjCPropertyGetter(selector = "hidesBottomBarWhenPushed")
    public native boolean isHidesBottomBarWhenPushed();
    @ObjCPropertySetter(selector = "setHidesBottomBarWhenPushed:")
    public native void setHidesBottomBarWhenPushed(boolean v);
    @ObjCProperty public boolean hidesBottomBarWhenPushed;

    @ObjCPropertyGetter(selector = "navigationController")
    public native UINavigationController getNavigationController();
    @ObjCProperty public UINavigationController navigationController;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "toolbarItems")
    public native NSArray getToolbarItems();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setToolbarItems:")
    public native void setToolbarItems(NSArray v);
    @ObjCProperty public NSArray toolbarItems;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "isModalInPopover")
    public native boolean isModalInPopover();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setModalInPopover:")
    public native void setModalInPopover(boolean v);
    @ObjCProperty public boolean modalInPopover;

    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "contentSizeForViewInPopover")
    public native @ObjCByValue CGSize getContentSizeForViewInPopover();
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setContentSizeForViewInPopover:")
    public native void setContentSizeForViewInPopover(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize contentSizeForViewInPopover;

    @ObjCPropertyGetter(selector = "splitViewController")
    public native UISplitViewController getSplitViewController();
    @ObjCProperty public UISplitViewController splitViewController;

    @ObjCPropertyGetter(selector = "tabBarItem")
    public native UITabBarItem getTabBarItem();
    @ObjCPropertySetter(selector = "setTabBarItem:")
    public native void setTabBarItem(UITabBarItem v);
    @ObjCProperty public UITabBarItem tabBarItem;

    @ObjCPropertyGetter(selector = "tabBarController")
    public native UITabBarController getTabBarController();
    @ObjCProperty public UITabBarController tabBarController;

    @ObjCPropertyGetter(selector = "restorationParent")
    public native UIStateRestoring getRestorationParent();
    @ObjCProperty public UIStateRestoring restorationParent;

    @ObjCPropertyGetter(selector = "objectRestorationClass")
    public native ObjCClass getObjectRestorationClass();
    @ObjCProperty public ObjCClass objectRestorationClass;
    
    @ObjCMethodSign(sign = "- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil;", selector = "initWithNibName:bundle:")
    public native UIViewController initWithNibName$bundle$(NSString nibNameOrNil, NSBundle nibBundleOrNil);

    @ObjCMethodSign(sign = "- (void)loadView;", selector = "loadView")
    public native void loadView();

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)viewWillUnload NS_DEPRECATED_IOS(5_0,6_0);", selector = "viewWillUnload")
    public native void viewWillUnload();

    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)viewDidUnload NS_DEPRECATED_IOS(3_0,6_0);", selector = "viewDidUnload")
    public native void viewDidUnload();

    @ObjCMethodSign(sign = "- (void)viewDidLoad;", selector = "viewDidLoad")
    public native void viewDidLoad();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isViewLoaded NS_AVAILABLE_IOS(3_0);", selector = "isViewLoaded")
    public native boolean isViewLoaded();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)performSegueWithIdentifier:(NSString *)identifier sender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "performSegueWithIdentifier:sender:")
    public native void performSegueWithIdentifier$sender$(NSString identifier, NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)shouldPerformSegueWithIdentifier:(NSString *)identifier sender:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "shouldPerformSegueWithIdentifier:sender:")
    public native boolean shouldPerformSegueWithIdentifier$sender$(NSString identifier, NSObject sender);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "prepareForSegue:sender:")
    public native void prepareForSegue$sender$(UIStoryboardSegue segue, NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)canPerformUnwindSegueAction:(SEL)action fromViewController:(UIViewController *)fromViewController withSender:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "canPerformUnwindSegueAction:fromViewController:withSender:")
    public native boolean canPerformUnwindSegueAction$fromViewController$withSender$(ObjCSelector action, UIViewController fromViewController, NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIViewController *)viewControllerForUnwindSegueAction:(SEL)action fromViewController:(UIViewController *)fromViewController withSender:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "viewControllerForUnwindSegueAction:fromViewController:withSender:")
    public native UIViewController viewControllerForUnwindSegueAction$fromViewController$withSender$(ObjCSelector action, UIViewController fromViewController, NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIStoryboardSegue *)segueForUnwindingToViewController:(UIViewController *)toViewController fromViewController:(UIViewController *)fromViewController identifier:(NSString *)identifier NS_AVAILABLE_IOS(6_0);", selector = "segueForUnwindingToViewController:fromViewController:identifier:")
    public native UIStoryboardSegue segueForUnwindingToViewController$fromViewController$identifier$(UIViewController toViewController, UIViewController fromViewController, NSString identifier);

    @ObjCMethodSign(sign = "- (void)viewWillAppear:(BOOL)animated;", selector = "viewWillAppear:")
    public native void viewWillAppear$(boolean animated);

    @ObjCMethodSign(sign = "- (void)viewDidAppear:(BOOL)animated;", selector = "viewDidAppear:")
    public native void viewDidAppear$(boolean animated);

    @ObjCMethodSign(sign = "- (void)viewWillDisappear:(BOOL)animated;", selector = "viewWillDisappear:")
    public native void viewWillDisappear$(boolean animated);

    @ObjCMethodSign(sign = "- (void)viewDidDisappear:(BOOL)animated;", selector = "viewDidDisappear:")
    public native void viewDidDisappear$(boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)viewWillLayoutSubviews NS_AVAILABLE_IOS(5_0);", selector = "viewWillLayoutSubviews")
    public native void viewWillLayoutSubviews();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)viewDidLayoutSubviews NS_AVAILABLE_IOS(5_0);", selector = "viewDidLayoutSubviews")
    public native void viewDidLayoutSubviews();

    @ObjCMethodSign(sign = "- (void)didReceiveMemoryWarning;", selector = "didReceiveMemoryWarning")
    public native void didReceiveMemoryWarning();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isBeingPresented NS_AVAILABLE_IOS(5_0);", selector = "isBeingPresented")
    public native boolean isBeingPresented();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isBeingDismissed NS_AVAILABLE_IOS(5_0);", selector = "isBeingDismissed")
    public native boolean isBeingDismissed();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isMovingToParentViewController NS_AVAILABLE_IOS(5_0);", selector = "isMovingToParentViewController")
    public native boolean isMovingToParentViewController();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)isMovingFromParentViewController NS_AVAILABLE_IOS(5_0);", selector = "isMovingFromParentViewController")
    public native boolean isMovingFromParentViewController();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)presentViewController:(UIViewController *)viewControllerToPresent animated: (BOOL)flag completion:(void (^)(void))completion NS_AVAILABLE_IOS(5_0);", selector = "presentViewController:animated:completion:")
    public native void presentViewController$animated$completion$(UIViewController viewControllerToPresent, boolean flag, ObjCBlock completion);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)dismissViewControllerAnimated: (BOOL)flag completion: (void (^)(void))completion NS_AVAILABLE_IOS(5_0);", selector = "dismissViewControllerAnimated:completion:")
    public native void dismissViewControllerAnimated$completion$(boolean flag, ObjCBlock completion);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)presentModalViewController:(UIViewController *)modalViewController animated:(BOOL)animated NS_DEPRECATED_IOS(2_0, 6_0);", selector = "presentModalViewController:animated:")
    public native void presentModalViewController$animated$(UIViewController modalViewController, boolean animated);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)dismissModalViewControllerAnimated:(BOOL)animated NS_DEPRECATED_IOS(2_0, 6_0);", selector = "dismissModalViewControllerAnimated:")
    public native void dismissModalViewControllerAnimated$(boolean animated);

    /**
     * @since Available in iOS 4.3 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)disablesAutomaticKeyboardDismissal NS_AVAILABLE_IOS(4_3);", selector = "disablesAutomaticKeyboardDismissal")
    public native boolean disablesAutomaticKeyboardDismissal();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIStatusBarStyle)preferredStatusBarStyle NS_AVAILABLE_IOS(7_0);", selector = "preferredStatusBarStyle")
    public native UIStatusBarStyle preferredStatusBarStyle();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)prefersStatusBarHidden NS_AVAILABLE_IOS(7_0);", selector = "prefersStatusBarHidden")
    public native boolean prefersStatusBarHidden();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIStatusBarAnimation)preferredStatusBarUpdateAnimation NS_AVAILABLE_IOS(7_0);", selector = "preferredStatusBarUpdateAnimation")
    public native UIStatusBarAnimation preferredStatusBarUpdateAnimation();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setNeedsStatusBarAppearanceUpdate NS_AVAILABLE_IOS(7_0);", selector = "setNeedsStatusBarAppearanceUpdate")
    public native void setNeedsStatusBarAppearanceUpdate();

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (BOOL)shouldAutorotateToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation NS_DEPRECATED_IOS(2_0, 6_0);", selector = "shouldAutorotateToInterfaceOrientation:")
    public native boolean shouldAutorotateToInterfaceOrientation$(UIInterfaceOrientation toInterfaceOrientation);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (BOOL)shouldAutorotate NS_AVAILABLE_IOS(6_0);", selector = "shouldAutorotate")
    public native boolean shouldAutorotate();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (NSUInteger)supportedInterfaceOrientations NS_AVAILABLE_IOS(6_0);", selector = "supportedInterfaceOrientations")
    public native @NSUInteger long supportedInterfaceOrientations();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIInterfaceOrientation)preferredInterfaceOrientationForPresentation NS_AVAILABLE_IOS(6_0);", selector = "preferredInterfaceOrientationForPresentation")
    public native UIInterfaceOrientation preferredInterfaceOrientationForPresentation();

    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIView *)rotatingHeaderView;", selector = "rotatingHeaderView")
    public native UIView rotatingHeaderView();

    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIView *)rotatingFooterView;", selector = "rotatingFooterView")
    public native UIView rotatingFooterView();

    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)willRotateToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation duration:(NSTimeInterval)duration;", selector = "willRotateToInterfaceOrientation:duration:")
    public native void willRotateToInterfaceOrientation$duration$(UIInterfaceOrientation toInterfaceOrientation, double duration);

    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)didRotateFromInterfaceOrientation:(UIInterfaceOrientation)fromInterfaceOrientation;", selector = "didRotateFromInterfaceOrientation:")
    public native void didRotateFromInterfaceOrientation$(UIInterfaceOrientation fromInterfaceOrientation);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)willAnimateRotationToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation duration:(NSTimeInterval)duration NS_AVAILABLE_IOS(3_0);", selector = "willAnimateRotationToInterfaceOrientation:duration:")
    public native void willAnimateRotationToInterfaceOrientation$duration$(UIInterfaceOrientation toInterfaceOrientation, double duration);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)willAnimateFirstHalfOfRotationToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation duration:(NSTimeInterval)duration NS_DEPRECATED_IOS(2_0, 5_0);", selector = "willAnimateFirstHalfOfRotationToInterfaceOrientation:duration:")
    public native void willAnimateFirstHalfOfRotationToInterfaceOrientation$duration$(UIInterfaceOrientation toInterfaceOrientation, double duration);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)didAnimateFirstHalfOfRotationToInterfaceOrientation:(UIInterfaceOrientation)toInterfaceOrientation NS_DEPRECATED_IOS(2_0, 5_0);", selector = "didAnimateFirstHalfOfRotationToInterfaceOrientation:")
    public native void didAnimateFirstHalfOfRotationToInterfaceOrientation$(UIInterfaceOrientation toInterfaceOrientation);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 5.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)willAnimateSecondHalfOfRotationFromInterfaceOrientation:(UIInterfaceOrientation)fromInterfaceOrientation duration:(NSTimeInterval)duration NS_DEPRECATED_IOS(2_0, 5_0);", selector = "willAnimateSecondHalfOfRotationFromInterfaceOrientation:duration:")
    public native void willAnimateSecondHalfOfRotationFromInterfaceOrientation$duration$(UIInterfaceOrientation fromInterfaceOrientation, double duration);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewControllerRotation", catownername = "UIViewController")
    @ObjCMethodSign(sign = "+ (void)attemptRotationToDeviceOrientation NS_AVAILABLE_IOS(5_0);", selector = "attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

    @ObjCCategoryMethod(catname = "UIViewControllerEditing", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)setEditing:(BOOL)editing animated:(BOOL)animated;", selector = "setEditing:animated:")
    public native void setEditing$animated$(boolean editing, boolean animated);

    @ObjCCategoryMethod(catname = "UIViewControllerEditing", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIBarButtonItem *)editButtonItem;", selector = "editButtonItem")
    public native UIBarButtonItem editButtonItem();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)addChildViewController:(UIViewController *)childController NS_AVAILABLE_IOS(5_0);", selector = "addChildViewController:")
    public native void addChildViewController$(UIViewController childController);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void) removeFromParentViewController NS_AVAILABLE_IOS(5_0);", selector = "removeFromParentViewController")
    public native void removeFromParentViewController();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)transitionFromViewController:(UIViewController *)fromViewController toViewController:(UIViewController *)toViewController duration:(NSTimeInterval)duration options:(UIViewAnimationOptions)options animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(5_0);", selector = "transitionFromViewController:toViewController:duration:options:animations:completion:")
    public native void transitionFromViewController$toViewController$duration$options$animations$completion$(UIViewController fromViewController, UIViewController toViewController, double duration, UIViewAnimationOptions options, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)beginAppearanceTransition:(BOOL)isAppearing animated:(BOOL)animated __OSX_AVAILABLE_STARTING(__MAC_NA,__IPHONE_5_0);", selector = "beginAppearanceTransition:animated:")
    public native void beginAppearanceTransition$animated$(boolean isAppearing, boolean animated);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)endAppearanceTransition __OSX_AVAILABLE_STARTING(__MAC_NA,__IPHONE_5_0);", selector = "endAppearanceTransition")
    public native void endAppearanceTransition();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIViewController *)childViewControllerForStatusBarStyle NS_AVAILABLE_IOS(7_0);", selector = "childViewControllerForStatusBarStyle")
    public native UIViewController childViewControllerForStatusBarStyle();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerProtectedMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (UIViewController *)childViewControllerForStatusBarHidden NS_AVAILABLE_IOS(7_0);", selector = "childViewControllerForStatusBarHidden")
    public native UIViewController childViewControllerForStatusBarHidden();

    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIContainerViewControllerCallbacks", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (BOOL)automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers NS_DEPRECATED_IOS(5_0,6_0);", selector = "automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers")
    public native boolean automaticallyForwardAppearanceAndRotationMethodsToChildViewControllers();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerCallbacks", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (BOOL)shouldAutomaticallyForwardRotationMethods NS_AVAILABLE_IOS(6_0);", selector = "shouldAutomaticallyForwardRotationMethods")
    public native boolean shouldAutomaticallyForwardRotationMethods();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerCallbacks", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (BOOL)shouldAutomaticallyForwardAppearanceMethods NS_AVAILABLE_IOS(6_0);", selector = "shouldAutomaticallyForwardAppearanceMethods")
    public native boolean shouldAutomaticallyForwardAppearanceMethods();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerCallbacks", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)willMoveToParentViewController:(UIViewController *)parent NS_AVAILABLE_IOS(5_0);", selector = "willMoveToParentViewController:")
    public native void willMoveToParentViewController$(UIViewController parent);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIContainerViewControllerCallbacks", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)didMoveToParentViewController:(UIViewController *)parent NS_AVAILABLE_IOS(5_0);", selector = "didMoveToParentViewController:")
    public native void didMoveToParentViewController$(UIViewController parent);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void) encodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder$(NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void) decodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder$(NSCoder coder);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void) applicationFinishedRestoringState NS_AVAILABLE_IOS(7_0);", selector = "applicationFinishedRestoringState")
    public native void applicationFinishedRestoringState();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutCoreMethods", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)updateViewConstraints NS_AVAILABLE_IOS(6_0);", selector = "updateViewConstraints")
    public native void updateViewConstraints();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "UINavigationControllerContextualToolbarItems", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (void)setToolbarItems:(NSArray *)toolbarItems animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "setToolbarItems:animated:")
    public native void setToolbarItems$animated$(NSArray toolbarItems, boolean animated);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "TransitionCoordinator", catownername = "UIViewController")
    @ObjCMethodSign(sign = "- (id <UIViewControllerTransitionCoordinator>)transitionCoordinator NS_AVAILABLE_IOS(7_0);", selector = "transitionCoordinator")
    public native UIViewControllerTransitionCoordinator transitionCoordinator();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIViewController initWithCoder$(NSCoder aDecoder);
}
