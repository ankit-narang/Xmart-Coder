package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIGestureRecognizerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizerShouldBegin:(UIGestureRecognizer *)gestureRecognizer;", selector = "gestureRecognizerShouldBegin:")
    boolean gestureRecognizerShouldBegin$(UIGestureRecognizer gestureRecognizer);

    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldRecognizeSimultaneouslyWithGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer;", selector = "gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    boolean gestureRecognizer$shouldRecognizeSimultaneouslyWithGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldRequireFailureOfGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer NS_AVAILABLE_IOS(7_0);", selector = "gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    boolean gestureRecognizer$shouldRequireFailureOfGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldBeRequiredToFailByGestureRecognizer:(UIGestureRecognizer *)otherGestureRecognizer NS_AVAILABLE_IOS(7_0);", selector = "gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    boolean gestureRecognizer$shouldBeRequiredToFailByGestureRecognizer$(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);

    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizer:(UIGestureRecognizer *)gestureRecognizer shouldReceiveTouch:(UITouch *)touch;", selector = "gestureRecognizer:shouldReceiveTouch:")
    boolean gestureRecognizer$shouldReceiveTouch$(UIGestureRecognizer gestureRecognizer, UITouch touch);
}
