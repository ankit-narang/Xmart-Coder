package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerTransitionCoordinatorContext 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)isAnimated;", selector = "isAnimated")
    boolean isAnimated();

    @ObjCMethodSign(sign = "- (UIModalPresentationStyle)presentationStyle;", selector = "presentationStyle")
    UIModalPresentationStyle presentationStyle();

    @ObjCMethodSign(sign = "- (BOOL)initiallyInteractive;", selector = "initiallyInteractive")
    boolean initiallyInteractive();

    @ObjCMethodSign(sign = "- (BOOL)isInteractive;", selector = "isInteractive")
    boolean isInteractive();

    @ObjCMethodSign(sign = "- (BOOL)isCancelled;", selector = "isCancelled")
    boolean isCancelled();

    @ObjCMethodSign(sign = "- (NSTimeInterval)transitionDuration;", selector = "transitionDuration")
    double transitionDuration();

    @ObjCMethodSign(sign = "- (CGFloat)percentComplete;", selector = "percentComplete")
    float percentComplete();

    @ObjCMethodSign(sign = "- (CGFloat)completionVelocity;", selector = "completionVelocity")
    float completionVelocity();

    @ObjCMethodSign(sign = "- (UIViewAnimationCurve)completionCurve;", selector = "completionCurve")
    UIViewAnimationCurve completionCurve();

    @ObjCMethodSign(sign = "- (UIViewController *)viewControllerForKey:(NSString *)key;", selector = "viewControllerForKey:")
    UIViewController viewControllerForKey$(NSString key);

    @ObjCMethodSign(sign = "- (UIView *)containerView;", selector = "containerView")
    UIView containerView();
}
