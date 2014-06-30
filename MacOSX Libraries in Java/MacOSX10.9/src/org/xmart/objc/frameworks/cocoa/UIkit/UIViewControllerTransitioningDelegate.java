package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerTransitioningDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (id <UIViewControllerAnimatedTransitioning>)animationControllerForPresentedController:(UIViewController *)presented presentingController:(UIViewController *)presenting sourceController:(UIViewController *)source;", selector = "animationControllerForPresentedController:presentingController:sourceController:")
    UIViewControllerAnimatedTransitioning animationControllerForPresentedController$presentingController$sourceController$(UIViewController presented, UIViewController presenting, UIViewController source);

    @ObjCMethodSign(sign = "- (id <UIViewControllerAnimatedTransitioning>)animationControllerForDismissedController:(UIViewController *)dismissed;", selector = "animationControllerForDismissedController:")
    UIViewControllerAnimatedTransitioning animationControllerForDismissedController$(UIViewController dismissed);

    @ObjCMethodSign(sign = "- (id <UIViewControllerInteractiveTransitioning>)interactionControllerForPresentation:(id <UIViewControllerAnimatedTransitioning>)animator;", selector = "interactionControllerForPresentation:")
    UIViewControllerInteractiveTransitioning interactionControllerForPresentation$(UIViewControllerAnimatedTransitioning animator);

    @ObjCMethodSign(sign = "- (id <UIViewControllerInteractiveTransitioning>)interactionControllerForDismissal:(id <UIViewControllerAnimatedTransitioning>)animator;", selector = "interactionControllerForDismissal:")
    UIViewControllerInteractiveTransitioning interactionControllerForDismissal$(UIViewControllerAnimatedTransitioning animator);
}
