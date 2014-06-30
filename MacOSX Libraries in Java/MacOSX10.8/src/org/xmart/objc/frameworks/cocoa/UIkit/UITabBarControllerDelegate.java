package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITabBarControllerDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)tabBarController:(UITabBarController *)tabBarController shouldSelectViewController:(UIViewController *)viewController NS_AVAILABLE_IOS(3_0);", selector = "tabBarController:shouldSelectViewController:")
    boolean tabBarController$shouldSelectViewController$(UITabBarController tabBarController, UIViewController viewController);

    @ObjCMethodSign(sign = "- (void)tabBarController:(UITabBarController *)tabBarController didSelectViewController:(UIViewController *)viewController;", selector = "tabBarController:didSelectViewController:")
    void tabBarController$didSelectViewController$(UITabBarController tabBarController, UIViewController viewController);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tabBarController:(UITabBarController *)tabBarController willBeginCustomizingViewControllers:(NSArray *)viewControllers NS_AVAILABLE_IOS(3_0);", selector = "tabBarController:willBeginCustomizingViewControllers:")
    void tabBarController$willBeginCustomizingViewControllers$(UITabBarController tabBarController, NSArray viewControllers);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)tabBarController:(UITabBarController *)tabBarController willEndCustomizingViewControllers:(NSArray *)viewControllers changed:(BOOL)changed NS_AVAILABLE_IOS(3_0);", selector = "tabBarController:willEndCustomizingViewControllers:changed:")
    void tabBarController$willEndCustomizingViewControllers$changed$(UITabBarController tabBarController, NSArray viewControllers, boolean changed);

    @ObjCMethodSign(sign = "- (void)tabBarController:(UITabBarController *)tabBarController didEndCustomizingViewControllers:(NSArray *)viewControllers changed:(BOOL)changed;", selector = "tabBarController:didEndCustomizingViewControllers:changed:")
    void tabBarController$didEndCustomizingViewControllers$changed$(UITabBarController tabBarController, NSArray viewControllers, boolean changed);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)tabBarControllerSupportedInterfaceOrientations:(UITabBarController *)tabBarController NS_AVAILABLE_IOS(7_0);", selector = "tabBarControllerSupportedInterfaceOrientations:")
    @NSUInteger long tabBarControllerSupportedInterfaceOrientations$(UITabBarController tabBarController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIInterfaceOrientation)tabBarControllerPreferredInterfaceOrientationForPresentation:(UITabBarController *)tabBarController NS_AVAILABLE_IOS(7_0);", selector = "tabBarControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation tabBarControllerPreferredInterfaceOrientationForPresentation$(UITabBarController tabBarController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id <UIViewControllerInteractiveTransitioning>)tabBarController:(UITabBarController *)tabBarController                       interactionControllerForAnimationController: (id <UIViewControllerAnimatedTransitioning>)animationController NS_AVAILABLE_IOS(7_0);", selector = "tabBarController:interactionControllerForAnimationController:")
    UIViewControllerInteractiveTransitioning tabBarController$interactionControllerForAnimationController$(UITabBarController tabBarController, UIViewControllerAnimatedTransitioning animationController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id <UIViewControllerAnimatedTransitioning>)tabBarController:(UITabBarController *)tabBarController             animationControllerForTransitionFromViewController:(UIViewController *)fromVC                                               toViewController:(UIViewController *)toVC  NS_AVAILABLE_IOS(7_0);", selector = "tabBarController:animationControllerForTransitionFromViewController:toViewController:")
    UIViewControllerAnimatedTransitioning tabBarController$animationControllerForTransitionFromViewController$toViewController$(UITabBarController tabBarController, UIViewController fromVC, UIViewController toVC);
}
