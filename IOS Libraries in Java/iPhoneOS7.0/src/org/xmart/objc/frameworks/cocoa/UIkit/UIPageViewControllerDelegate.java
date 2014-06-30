package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPageViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)pageViewController:(UIPageViewController *)pageViewController willTransitionToViewControllers:(NSArray *)pendingViewControllers NS_AVAILABLE_IOS(6_0);", selector = "pageViewController:willTransitionToViewControllers:")
    void pageViewController$willTransitionToViewControllers$(UIPageViewController pageViewController, NSArray pendingViewControllers);

    @ObjCMethodSign(sign = "- (void)pageViewController:(UIPageViewController *)pageViewController didFinishAnimating:(BOOL)finished previousViewControllers:(NSArray *)previousViewControllers transitionCompleted:(BOOL)completed;", selector = "pageViewController:didFinishAnimating:previousViewControllers:transitionCompleted:")
    void pageViewController$didFinishAnimating$previousViewControllers$transitionCompleted$(UIPageViewController pageViewController, boolean finished, NSArray previousViewControllers, boolean completed);

    @ObjCMethodSign(sign = "- (UIPageViewControllerSpineLocation)pageViewController:(UIPageViewController *)pageViewController spineLocationForInterfaceOrientation:(UIInterfaceOrientation)orientation;", selector = "pageViewController:spineLocationForInterfaceOrientation:")
    UIPageViewControllerSpineLocation pageViewController$spineLocationForInterfaceOrientation$(UIPageViewController pageViewController, UIInterfaceOrientation orientation);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)pageViewControllerSupportedInterfaceOrientations:(UIPageViewController *)pageViewController NS_AVAILABLE_IOS(7_0);", selector = "pageViewControllerSupportedInterfaceOrientations:")
    @NSUInteger long pageViewControllerSupportedInterfaceOrientations$(UIPageViewController pageViewController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIInterfaceOrientation)pageViewControllerPreferredInterfaceOrientationForPresentation:(UIPageViewController *)pageViewController NS_AVAILABLE_IOS(7_0);", selector = "pageViewControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation pageViewControllerPreferredInterfaceOrientationForPresentation$(UIPageViewController pageViewController);
}
