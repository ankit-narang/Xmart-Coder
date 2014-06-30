package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPageViewControllerDataSource 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (UIViewController *)pageViewController:(UIPageViewController *)pageViewController viewControllerBeforeViewController:(UIViewController *)viewController;", selector = "pageViewController:viewControllerBeforeViewController:")
    UIViewController pageViewController$viewControllerBeforeViewController$(UIPageViewController pageViewController, UIViewController viewController);

    @ObjCMethodSign(sign = "- (UIViewController *)pageViewController:(UIPageViewController *)pageViewController viewControllerAfterViewController:(UIViewController *)viewController;", selector = "pageViewController:viewControllerAfterViewController:")
    UIViewController pageViewController$viewControllerAfterViewController$(UIPageViewController pageViewController, UIViewController viewController);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)presentationCountForPageViewController:(UIPageViewController *)pageViewController NS_AVAILABLE_IOS(6_0);", selector = "presentationCountForPageViewController:")
    @NSInteger long presentationCountForPageViewController$(UIPageViewController pageViewController);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSInteger)presentationIndexForPageViewController:(UIPageViewController *)pageViewController NS_AVAILABLE_IOS(6_0);", selector = "presentationIndexForPageViewController:")
    @NSInteger long presentationIndexForPageViewController$(UIPageViewController pageViewController);
}
