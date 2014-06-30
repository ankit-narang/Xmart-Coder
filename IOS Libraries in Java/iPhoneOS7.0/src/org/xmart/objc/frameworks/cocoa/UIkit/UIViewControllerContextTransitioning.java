package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerContextTransitioning 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (UIView *)containerView;", selector = "containerView")
    UIView containerView();

    @ObjCMethodSign(sign = "- (BOOL)isAnimated;", selector = "isAnimated")
    boolean isAnimated();

    @ObjCMethodSign(sign = "- (BOOL)isInteractive;", selector = "isInteractive")
    boolean isInteractive();

    @ObjCMethodSign(sign = "- (BOOL)transitionWasCancelled;", selector = "transitionWasCancelled")
    boolean transitionWasCancelled();

    @ObjCMethodSign(sign = "- (UIModalPresentationStyle)presentationStyle;", selector = "presentationStyle")
    UIModalPresentationStyle presentationStyle();

    @ObjCMethodSign(sign = "- (void)updateInteractiveTransition:(CGFloat)percentComplete;", selector = "updateInteractiveTransition:")
    void updateInteractiveTransition$(float percentComplete);

    @ObjCMethodSign(sign = "- (void)finishInteractiveTransition;", selector = "finishInteractiveTransition")
    void finishInteractiveTransition();

    @ObjCMethodSign(sign = "- (void)cancelInteractiveTransition;", selector = "cancelInteractiveTransition")
    void cancelInteractiveTransition();

    @ObjCMethodSign(sign = "- (void)completeTransition:(BOOL)didComplete;", selector = "completeTransition:")
    void completeTransition$(boolean didComplete);

    @ObjCMethodSign(sign = "- (UIViewController *)viewControllerForKey:(NSString *)key;", selector = "viewControllerForKey:")
    UIViewController viewControllerForKey$(NSString key);

    @ObjCMethodSign(sign = "- (CGRect)initialFrameForViewController:(UIViewController *)vc;", selector = "initialFrameForViewController:")
    @ObjCByValue CGRect initialFrameForViewController$(UIViewController vc);

    @ObjCMethodSign(sign = "- (CGRect)finalFrameForViewController:(UIViewController *)vc;", selector = "finalFrameForViewController:")
    @ObjCByValue CGRect finalFrameForViewController$(UIViewController vc);
}
