package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UINavigationControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)navigationController:(UINavigationController *)navigationController willShowViewController:(UIViewController *)viewController animated:(BOOL)animated;", selector = "navigationController:willShowViewController:animated:")
    void navigationController$willShowViewController$animated$(UINavigationController navigationController, UIViewController viewController, boolean animated);

    @ObjCMethodSign(sign = "- (void)navigationController:(UINavigationController *)navigationController didShowViewController:(UIViewController *)viewController animated:(BOOL)animated;", selector = "navigationController:didShowViewController:animated:")
    void navigationController$didShowViewController$animated$(UINavigationController navigationController, UIViewController viewController, boolean animated);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)navigationControllerSupportedInterfaceOrientations:(UINavigationController *)navigationController NS_AVAILABLE_IOS(7_0);", selector = "navigationControllerSupportedInterfaceOrientations:")
    @NSUInteger long navigationControllerSupportedInterfaceOrientations$(UINavigationController navigationController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIInterfaceOrientation)navigationControllerPreferredInterfaceOrientationForPresentation:(UINavigationController *)navigationController NS_AVAILABLE_IOS(7_0);", selector = "navigationControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation navigationControllerPreferredInterfaceOrientationForPresentation$(UINavigationController navigationController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id <UIViewControllerInteractiveTransitioning>)navigationController:(UINavigationController *)navigationController                           interactionControllerForAnimationController:(id <UIViewControllerAnimatedTransitioning>) animationController NS_AVAILABLE_IOS(7_0);", selector = "navigationController:interactionControllerForAnimationController:")
    UIViewControllerInteractiveTransitioning navigationController$interactionControllerForAnimationController$(UINavigationController navigationController, UIViewControllerAnimatedTransitioning animationController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (id <UIViewControllerAnimatedTransitioning>)navigationController:(UINavigationController *)navigationController                                    animationControllerForOperation:(UINavigationControllerOperation)operation                                                 fromViewController:(UIViewController *)fromVC                                                   toViewController:(UIViewController *)toVC  NS_AVAILABLE_IOS(7_0);", selector = "navigationController:animationControllerForOperation:fromViewController:toViewController:")
    UIViewControllerAnimatedTransitioning navigationController$animationControllerForOperation$fromViewController$toViewController$(UINavigationController navigationController, UINavigationControllerOperation operation, UIViewController fromVC, UIViewController toVC);
}
