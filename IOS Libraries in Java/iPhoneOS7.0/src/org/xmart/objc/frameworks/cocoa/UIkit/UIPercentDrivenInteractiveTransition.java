package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPercentDrivenInteractiveTransition extends NSObject implements UIViewControllerInteractiveTransitioning {
    
    public UIPercentDrivenInteractiveTransition() {}
    @ObjCPropertyGetter(selector = "duration")
    public native float getDuration();
    @ObjCProperty public float duration;

    @ObjCPropertyGetter(selector = "percentComplete")
    public native float getPercentComplete();
    @ObjCProperty public float percentComplete;

    @ObjCPropertyGetter(selector = "completionSpeed")
    public native float getCompletionSpeed();
    @ObjCPropertySetter(selector = "setCompletionSpeed:")
    public native void setCompletionSpeed(float v);
    @ObjCProperty public float completionSpeed;

    @ObjCPropertyGetter(selector = "completionCurve")
    public native UIViewAnimationCurve getCompletionCurve();
    @ObjCPropertySetter(selector = "setCompletionCurve:")
    public native void setCompletionCurve(UIViewAnimationCurve v);
    @ObjCProperty public UIViewAnimationCurve completionCurve;
    
    @ObjCMethodSign(sign = "- (void)updateInteractiveTransition:(CGFloat)percentComplete;", selector = "updateInteractiveTransition:")
    public native void updateInteractiveTransition$(float percentComplete);

    @ObjCMethodSign(sign = "- (void)cancelInteractiveTransition;", selector = "cancelInteractiveTransition")
    public native void cancelInteractiveTransition();

    @ObjCMethodSign(sign = "- (void)finishInteractiveTransition;", selector = "finishInteractiveTransition")
    public native void finishInteractiveTransition();

    @ObjCMethodSign(sign = "- (void)startInteractiveTransition:(id <UIViewControllerContextTransitioning>)transitionContext;", selector = "startInteractiveTransition:")
    public native void startInteractiveTransition$(UIViewControllerContextTransitioning transitionContext);
	@Override
	public float completionSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public UIViewAnimationCurve completionCurve() {
		// TODO Auto-generated method stub
		return null;
	}
}
