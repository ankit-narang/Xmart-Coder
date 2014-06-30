package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerAnimatedTransitioning 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSTimeInterval)transitionDuration:(id <UIViewControllerContextTransitioning>)transitionContext;", selector = "transitionDuration:")
    double transitionDuration$(UIViewControllerContextTransitioning transitionContext);

    @ObjCMethodSign(sign = "- (void)animateTransition:(id <UIViewControllerContextTransitioning>)transitionContext;", selector = "animateTransition:")
    void animateTransition$(UIViewControllerContextTransitioning transitionContext);

    @ObjCMethodSign(sign = "- (void)animationEnded:(BOOL) transitionCompleted;", selector = "animationEnded:")
    void animationEnded$(boolean transitionCompleted);
}
