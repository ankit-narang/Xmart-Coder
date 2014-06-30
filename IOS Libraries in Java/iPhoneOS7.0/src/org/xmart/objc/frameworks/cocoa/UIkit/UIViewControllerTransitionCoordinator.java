package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerTransitionCoordinator 
    extends UIViewControllerTransitionCoordinatorContext {

    
    
    @ObjCMethodSign(sign = "- (BOOL)animateAlongsideTransition:(void (^)(id <UIViewControllerTransitionCoordinatorContext>context))animation                         completion:(void (^)(id <UIViewControllerTransitionCoordinatorContext>context))completion;", selector = "animateAlongsideTransition:completion:")
    boolean animateAlongsideTransition$completion$(ObjCBlock animation, ObjCBlock completion);

    @ObjCMethodSign(sign = "- (BOOL)animateAlongsideTransitionInView:(UIView *)view                                animation:(void (^)(id <UIViewControllerTransitionCoordinatorContext>context))animation                               completion:(void (^)(id <UIViewControllerTransitionCoordinatorContext>context))completion;", selector = "animateAlongsideTransitionInView:animation:completion:")
    boolean animateAlongsideTransitionInView$animation$completion$(UIView view, ObjCBlock animation, ObjCBlock completion);

    @ObjCMethodSign(sign = "- (void)notifyWhenInteractionEndsUsingBlock: (void (^)(id <UIViewControllerTransitionCoordinatorContext>context))handler;", selector = "notifyWhenInteractionEndsUsingBlock:")
    void notifyWhenInteractionEndsUsingBlock$(ObjCBlock handler);
}
