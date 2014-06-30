package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerInteractiveTransitioning 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)startInteractiveTransition:(id <UIViewControllerContextTransitioning>)transitionContext;", selector = "startInteractiveTransition:")
    void startInteractiveTransition$(UIViewControllerContextTransitioning transitionContext);

    @ObjCMethodSign(sign = "- (CGFloat)completionSpeed;", selector = "completionSpeed")
    float completionSpeed();

    @ObjCMethodSign(sign = "- (UIViewAnimationCurve)completionCurve;", selector = "completionCurve")
    UIViewAnimationCurve completionCurve();
}
