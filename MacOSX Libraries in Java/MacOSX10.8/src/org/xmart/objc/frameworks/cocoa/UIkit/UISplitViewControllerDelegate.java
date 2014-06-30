package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UISplitViewControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)splitViewController:(UISplitViewController *)svc willHideViewController:(UIViewController *)aViewController withBarButtonItem:(UIBarButtonItem *)barButtonItem forPopoverController:(UIPopoverController *)pc;", selector = "splitViewController:willHideViewController:withBarButtonItem:forPopoverController:")
    void splitViewController$willHideViewController$withBarButtonItem$forPopoverController$(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem, UIPopoverController pc);

    @ObjCMethodSign(sign = "- (void)splitViewController:(UISplitViewController *)svc willShowViewController:(UIViewController *)aViewController invalidatingBarButtonItem:(UIBarButtonItem *)barButtonItem;", selector = "splitViewController:willShowViewController:invalidatingBarButtonItem:")
    void splitViewController$willShowViewController$invalidatingBarButtonItem$(UISplitViewController svc, UIViewController aViewController, UIBarButtonItem barButtonItem);

    @ObjCMethodSign(sign = "- (void)splitViewController:(UISplitViewController *)svc popoverController:(UIPopoverController *)pc willPresentViewController:(UIViewController *)aViewController;", selector = "splitViewController:popoverController:willPresentViewController:")
    void splitViewController$popoverController$willPresentViewController$(UISplitViewController svc, UIPopoverController pc, UIViewController aViewController);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)splitViewController:(UISplitViewController *)svc shouldHideViewController:(UIViewController *)vc inOrientation:(UIInterfaceOrientation)orientation NS_AVAILABLE_IOS(5_0);", selector = "splitViewController:shouldHideViewController:inOrientation:")
    boolean splitViewController$shouldHideViewController$inOrientation$(UISplitViewController svc, UIViewController vc, UIInterfaceOrientation orientation);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)splitViewControllerSupportedInterfaceOrientations:(UISplitViewController *)splitViewController NS_AVAILABLE_IOS(7_0);", selector = "splitViewControllerSupportedInterfaceOrientations:")
    @NSUInteger long splitViewControllerSupportedInterfaceOrientations$(UISplitViewController splitViewController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIInterfaceOrientation)splitViewControllerPreferredInterfaceOrientationForPresentation:(UISplitViewController *)splitViewController NS_AVAILABLE_IOS(7_0);", selector = "splitViewControllerPreferredInterfaceOrientationForPresentation:")
    UIInterfaceOrientation splitViewControllerPreferredInterfaceOrientationForPresentation$(UISplitViewController splitViewController);
}
