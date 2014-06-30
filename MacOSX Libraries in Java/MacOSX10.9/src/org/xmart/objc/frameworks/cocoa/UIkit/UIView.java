package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIView extends UIResponder implements NSCoding, UIAppearance, UIAppearanceContainer, UIDynamicItem, UIAccessibilityIdentification {
    
    public UIView() {}
    @ObjCPropertyGetter(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @ObjCPropertySetter(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @ObjCProperty public boolean userInteractionEnabled;

    @ObjCPropertyGetter(selector = "tag")
    public native @NSInteger long getTag();
    @ObjCPropertySetter(selector = "setTag:")
    public native void setTag(@NSInteger long v);
    @ObjCProperty public @NSInteger long tag;

    @ObjCPropertyGetter(selector = "layer")
    public native CALayer getLayer();
    @ObjCProperty public CALayer layer;

    @ObjCPropertyGetter(selector = "frame")
    public native @ObjCByValue CGRect getFrame();
    @ObjCPropertySetter(selector = "setFrame:")
    public native void setFrame(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect frame;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "contentScaleFactor")
    public native float getContentScaleFactor();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setContentScaleFactor:")
    public native void setContentScaleFactor(float v);
    @ObjCProperty public float contentScaleFactor;

    @ObjCPropertyGetter(selector = "isMultipleTouchEnabled")
    public native boolean isMultipleTouchEnabled();
    @ObjCPropertySetter(selector = "setMultipleTouchEnabled:")
    public native void setMultipleTouchEnabled(boolean v);
    @ObjCProperty public boolean multipleTouchEnabled;

    @ObjCPropertyGetter(selector = "isExclusiveTouch")
    public native boolean isExclusiveTouch();
    @ObjCPropertySetter(selector = "setExclusiveTouch:")
    public native void setExclusiveTouch(boolean v);
    @ObjCProperty public boolean exclusiveTouch;

    @ObjCPropertyGetter(selector = "autoresizesSubviews")
    public native boolean isAutoresizesSubviews();
    @ObjCPropertySetter(selector = "setAutoresizesSubviews:")
    public native void setAutoresizesSubviews(boolean v);
    @ObjCProperty public boolean autoresizesSubviews;

    @ObjCPropertyGetter(selector = "autoresizingMask")
    public native UIViewAutoresizing getAutoresizingMask();
    @ObjCPropertySetter(selector = "setAutoresizingMask:")
    public native void setAutoresizingMask(UIViewAutoresizing v);
    @ObjCProperty public UIViewAutoresizing autoresizingMask;

    @ObjCPropertyGetter(selector = "superview")
    public native UIView getSuperview();
    @ObjCProperty public UIView superview;

    @ObjCPropertyGetter(selector = "subviews")
    public native NSArray getSubviews();
    @ObjCProperty public NSArray subviews;

    @ObjCPropertyGetter(selector = "window")
    public native UIWindow getWindow();
    @ObjCProperty public UIWindow window;

    @ObjCPropertyGetter(selector = "clipsToBounds")
    public native boolean isClipsToBounds();
    @ObjCPropertySetter(selector = "setClipsToBounds:")
    public native void setClipsToBounds(boolean v);
    @ObjCProperty public boolean clipsToBounds;

    @ObjCPropertyGetter(selector = "backgroundColor")
    public native UIColor getBackgroundColor();
    @ObjCPropertySetter(selector = "setBackgroundColor:")
    public native void setBackgroundColor(UIColor v);
    @ObjCProperty public UIColor backgroundColor;

    @ObjCPropertyGetter(selector = "alpha")
    public native float getAlpha();
    @ObjCPropertySetter(selector = "setAlpha:")
    public native void setAlpha(float v);
    @ObjCProperty public float alpha;

    @ObjCPropertyGetter(selector = "isOpaque")
    public native boolean isOpaque();
    @ObjCPropertySetter(selector = "setOpaque:")
    public native void setOpaque(boolean v);
    @ObjCProperty public boolean opaque;

    @ObjCPropertyGetter(selector = "clearsContextBeforeDrawing")
    public native boolean isClearsContextBeforeDrawing();
    @ObjCPropertySetter(selector = "setClearsContextBeforeDrawing:")
    public native void setClearsContextBeforeDrawing(boolean v);
    @ObjCProperty public boolean clearsContextBeforeDrawing;

    @ObjCPropertyGetter(selector = "isHidden")
    public native boolean isHidden();
    @ObjCPropertySetter(selector = "setHidden:")
    public native void setHidden(boolean v);
    @ObjCProperty public boolean hidden;

    @ObjCPropertyGetter(selector = "contentMode")
    public native UIViewContentMode getContentMode();
    @ObjCPropertySetter(selector = "setContentMode:")
    public native void setContentMode(UIViewContentMode v);
    @ObjCProperty public UIViewContentMode contentMode;

    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "contentStretch")
    public native @ObjCByValue CGRect getContentStretch();
    /**
     * @since Available in iOS 3.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setContentStretch:")
    public native void setContentStretch(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect contentStretch;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintAdjustmentMode")
    public native UIViewTintAdjustmentMode getTintAdjustmentMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintAdjustmentMode:")
    public native void setTintAdjustmentMode(UIViewTintAdjustmentMode v);
    @ObjCProperty public UIViewTintAdjustmentMode tintAdjustmentMode;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "gestureRecognizers")
    public native NSArray getGestureRecognizers();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setGestureRecognizers:")
    public native void setGestureRecognizers(NSArray v);
    @ObjCProperty public NSArray gestureRecognizers;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "motionEffects")
    public native NSArray getMotionEffects();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setMotionEffects:")
    public native void setMotionEffects(NSArray v);
    @ObjCProperty public NSArray motionEffects;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "restorationIdentifier")
    public native NSString getRestorationIdentifier();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setRestorationIdentifier:")
    public native void setRestorationIdentifier(NSString v);
    @ObjCProperty public NSString restorationIdentifier;

    @ObjCPropertyGetter(selector = "center")
    public native @ObjCByValue CGPoint getCenter();
    @ObjCPropertySetter(selector = "setCenter:")
    public native void setCenter(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint center;

    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCProperty public @ObjCByValue CGRect bounds;

    @ObjCPropertyGetter(selector = "transform")
    public native @ObjCByValue CGAffineTransform getTransform();
    @ObjCPropertySetter(selector = "setTransform:")
    public native void setTransform(@ObjCByValue CGAffineTransform v);
    @ObjCProperty public @ObjCByValue CGAffineTransform transform;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityIdentifier")
    public native NSString getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(NSString v);
    @ObjCProperty public NSString accessibilityIdentifier;
    
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame;", selector = "initWithFrame:")
    public native UIView initWithFrame$(@ObjCByValue CGRect frame);

    @ObjCMethodSign(sign = "+ (Class)layerClass;", selector = "layerClass")
    public static native ObjCClass layerClass();

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIView *)hitTest:(CGPoint)point withEvent:(UIEvent *)event;", selector = "hitTest:withEvent:")
    public native UIView hitTest$withEvent$(@ObjCByValue CGPoint point, UIEvent event);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)pointInside:(CGPoint)point withEvent:(UIEvent *)event;", selector = "pointInside:withEvent:")
    public native boolean pointInside$withEvent$(@ObjCByValue CGPoint point, UIEvent event);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)point toView:(UIView *)view;", selector = "convertPoint:toView:")
    public native @ObjCByValue CGPoint convertPoint$toView$(@ObjCByValue CGPoint point, UIView view);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)point fromView:(UIView *)view;", selector = "convertPoint:fromView:")
    public native @ObjCByValue CGPoint convertPoint$fromView$(@ObjCByValue CGPoint point, UIView view);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)rect toView:(UIView *)view;", selector = "convertRect:toView:")
    public native @ObjCByValue CGRect convertRect$toView$(@ObjCByValue CGRect rect, UIView view);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)rect fromView:(UIView *)view;", selector = "convertRect:fromView:")
    public native @ObjCByValue CGRect convertRect$fromView$(@ObjCByValue CGRect rect, UIView view);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGSize)sizeThatFits:(CGSize)size;", selector = "sizeThatFits:")
    public native @ObjCByValue CGSize sizeThatFits$(@ObjCByValue CGSize size);

    @ObjCCategoryMethod(catname = "UIViewGeometry", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)sizeToFit;", selector = "sizeToFit")
    public native void sizeToFit();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)removeFromSuperview;", selector = "removeFromSuperview")
    public native void removeFromSuperview();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)insertSubview:(UIView *)view atIndex:(NSInteger)index;", selector = "insertSubview:atIndex:")
    public native void insertSubview$atIndex$(UIView view, @NSInteger long index);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)exchangeSubviewAtIndex:(NSInteger)index1 withSubviewAtIndex:(NSInteger)index2;", selector = "exchangeSubviewAtIndex:withSubviewAtIndex:")
    public native void exchangeSubviewAtIndex$withSubviewAtIndex$(@NSInteger long index1, @NSInteger long index2);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)addSubview:(UIView *)view;", selector = "addSubview:")
    public native void addSubview$(UIView view);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)insertSubview:(UIView *)view belowSubview:(UIView *)siblingSubview;", selector = "insertSubview:belowSubview:")
    public native void insertSubview$belowSubview$(UIView view, UIView siblingSubview);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)insertSubview:(UIView *)view aboveSubview:(UIView *)siblingSubview;", selector = "insertSubview:aboveSubview:")
    public native void insertSubview$aboveSubview$(UIView view, UIView siblingSubview);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)bringSubviewToFront:(UIView *)view;", selector = "bringSubviewToFront:")
    public native void bringSubviewToFront$(UIView view);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)sendSubviewToBack:(UIView *)view;", selector = "sendSubviewToBack:")
    public native void sendSubviewToBack$(UIView view);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)didAddSubview:(UIView *)subview;", selector = "didAddSubview:")
    public native void didAddSubview$(UIView subview);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)willRemoveSubview:(UIView *)subview;", selector = "willRemoveSubview:")
    public native void willRemoveSubview$(UIView subview);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)willMoveToSuperview:(UIView *)newSuperview;", selector = "willMoveToSuperview:")
    public native void willMoveToSuperview$(UIView newSuperview);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)didMoveToSuperview;", selector = "didMoveToSuperview")
    public native void didMoveToSuperview();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)willMoveToWindow:(UIWindow *)newWindow;", selector = "willMoveToWindow:")
    public native void willMoveToWindow$(UIWindow newWindow);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)didMoveToWindow;", selector = "didMoveToWindow")
    public native void didMoveToWindow();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)isDescendantOfView:(UIView *)view;", selector = "isDescendantOfView:")
    public native boolean isDescendantOfView$(UIView view);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIView *)viewWithTag:(NSInteger)tag;", selector = "viewWithTag:")
    public native UIView viewWithTag$(@NSInteger long tag);

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setNeedsLayout;", selector = "setNeedsLayout")
    public native void setNeedsLayout();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)layoutIfNeeded;", selector = "layoutIfNeeded")
    public native void layoutIfNeeded();

    @ObjCCategoryMethod(catname = "UIViewHierarchy", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)layoutSubviews;", selector = "layoutSubviews")
    public native void layoutSubviews();

    @ObjCCategoryMethod(catname = "UIViewRendering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)drawRect:(CGRect)rect;", selector = "drawRect:")
    public native void drawRect$(@ObjCByValue CGRect rect);

    @ObjCCategoryMethod(catname = "UIViewRendering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setNeedsDisplay;", selector = "setNeedsDisplay")
    public native void setNeedsDisplay();

    @ObjCCategoryMethod(catname = "UIViewRendering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setNeedsDisplayInRect:(CGRect)rect;", selector = "setNeedsDisplayInRect:")
    public native void setNeedsDisplayInRect(@ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewRendering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)tintColorDidChange NS_AVAILABLE_IOS(7_0);", selector = "tintColorDidChange")
    public native void tintColorDidChange();

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)beginAnimations:(NSString *)animationID context:(void *)context;", selector = "beginAnimations:context:")
    public static native void beginAnimations$context$(NSString animationID, @VoidPointer() Object context);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)commitAnimations;", selector = "commitAnimations")
    public static native void commitAnimations();

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationDelegate:(id)delegate;", selector = "setAnimationDelegate:")
    public static native void setAnimationDelegate(NSObject delegate);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationWillStartSelector:(SEL)selector;", selector = "setAnimationWillStartSelector:")
    public static native void setAnimationWillStartSelector(ObjCSelector selector);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationDidStopSelector:(SEL)selector;", selector = "setAnimationDidStopSelector:")
    public static native void setAnimationDidStopSelector(ObjCSelector selector);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationDuration:(NSTimeInterval)duration;", selector = "setAnimationDuration:")
    public static native void setAnimationDuration_STATIC(double duration);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationDelay:(NSTimeInterval)delay;", selector = "setAnimationDelay:")
    public static native void setAnimationDelay(double delay);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationStartDate:(NSDate *)startDate;", selector = "setAnimationStartDate:")
    public static native void setAnimationStartDate(NSDate startDate);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationCurve:(UIViewAnimationCurve)curve;", selector = "setAnimationCurve:")
    public static native void setAnimationCurve(UIViewAnimationCurve curve);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationRepeatCount:(float)repeatCount;", selector = "setAnimationRepeatCount:")
    public static native void setAnimationRepeatCount(float repeatCount);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationRepeatAutoreverses:(BOOL)repeatAutoreverses;", selector = "setAnimationRepeatAutoreverses:")
    public static native void setAnimationRepeatAutoreverses(boolean repeatAutoreverses);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationBeginsFromCurrentState:(BOOL)fromCurrentState;", selector = "setAnimationBeginsFromCurrentState:")
    public static native void setAnimationBeginsFromCurrentState(boolean fromCurrentState);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationTransition:(UIViewAnimationTransition)transition forView:(UIView *)view cache:(BOOL)cache;", selector = "setAnimationTransition:forView:cache:")
    public static native void setAnimationTransition$forView$cache$(UIViewAnimationTransition transition, UIView view, boolean cache);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)setAnimationsEnabled:(BOOL)enabled;", selector = "setAnimationsEnabled:")
    public static native void setAnimationsEnabled(boolean enabled);

    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (BOOL)areAnimationsEnabled;", selector = "areAnimationsEnabled")
    public static native boolean areAnimationsEnabled();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimation", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)performWithoutAnimation:(void (^)(void))actionsWithoutAnimation NS_AVAILABLE_IOS(7_0);", selector = "performWithoutAnimation:")
    public static native void performWithoutAnimation$(ObjCBlock actionsWithoutAnimation);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)animateWithDuration:(NSTimeInterval)duration delay:(NSTimeInterval)delay options:(UIViewAnimationOptions)options animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(4_0);", selector = "animateWithDuration:delay:options:animations:completion:")
    public static native void animateWithDuration$delay$options$animations$completion$(double duration, double delay, UIViewAnimationOptions options, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)animateWithDuration:(NSTimeInterval)duration animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(4_0);", selector = "animateWithDuration:animations:completion:")
    public static native void animateWithDuration$animations$completion$(double duration, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)animateWithDuration:(NSTimeInterval)duration animations:(void (^)(void))animations NS_AVAILABLE_IOS(4_0);", selector = "animateWithDuration:animations:")
    public static native void animateWithDuration$animations$(double duration, ObjCBlock animations);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)animateWithDuration:(NSTimeInterval)duration delay:(NSTimeInterval)delay usingSpringWithDamping:(CGFloat)dampingRatio initialSpringVelocity:(CGFloat)velocity options:(UIViewAnimationOptions)options animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(7_0);", selector = "animateWithDuration:delay:usingSpringWithDamping:initialSpringVelocity:options:animations:completion:")
    public static native void animateWithDuration$delay$usingSpringWithDamping$initialSpringVelocity$options$animations$completion$(double duration, double delay, float dampingRatio, float velocity, UIViewAnimationOptions options, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)transitionWithView:(UIView *)view duration:(NSTimeInterval)duration options:(UIViewAnimationOptions)options animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(4_0);", selector = "transitionWithView:duration:options:animations:completion:")
    public static native void transitionWithView$duration$options$animations$completion$(UIView view, double duration, UIViewAnimationOptions options, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)transitionFromView:(UIView *)fromView toView:(UIView *)toView duration:(NSTimeInterval)duration options:(UIViewAnimationOptions)options completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(4_0);", selector = "transitionFromView:toView:duration:options:completion:")
    public static native void transitionFromView$toView$duration$options$completion$(UIView fromView, UIView toView, double duration, UIViewAnimationOptions options, ObjCBlock completion);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewAnimationWithBlocks", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)performSystemAnimation:(UISystemAnimation)animation onViews:(NSArray *)views options:(UIViewAnimationOptions)options animations:(void (^)(void))parallelAnimations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(7_0);", selector = "performSystemAnimation:onViews:options:animations:completion:")
    public static native void performSystemAnimation$onViews$options$animations$completion$(UISystemAnimation animation, NSArray views, UIViewAnimationOptions options, ObjCBlock parallelAnimations, ObjCBlock completion);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewKeyframeAnimations", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)animateKeyframesWithDuration:(NSTimeInterval)duration delay:(NSTimeInterval)delay options:(UIViewKeyframeAnimationOptions)options animations:(void (^)(void))animations completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(7_0);", selector = "animateKeyframesWithDuration:delay:options:animations:completion:")
    public static native void animateKeyframesWithDuration$delay$options$animations$completion$(double duration, double delay, UIViewKeyframeAnimationOptions options, ObjCBlock animations, ObjCBlock completion);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewKeyframeAnimations", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (void)addKeyframeWithRelativeStartTime:(double)frameStartTime relativeDuration:(double)frameDuration animations:(void (^)(void))animations NS_AVAILABLE_IOS(7_0);", selector = "addKeyframeWithRelativeStartTime:relativeDuration:animations:")
    public static native void addKeyframeWithRelativeStartTime$relativeDuration$animations$(double frameStartTime, double frameDuration, ObjCBlock animations);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewGestureRecognizers", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)addGestureRecognizer:(UIGestureRecognizer*)gestureRecognizer NS_AVAILABLE_IOS(3_2);", selector = "addGestureRecognizer:")
    public native void addGestureRecognizer$(UIGestureRecognizer gestureRecognizer);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewGestureRecognizers", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)removeGestureRecognizer:(UIGestureRecognizer*)gestureRecognizer NS_AVAILABLE_IOS(3_2);", selector = "removeGestureRecognizer:")
    public native void removeGestureRecognizer$(UIGestureRecognizer gestureRecognizer);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewGestureRecognizers", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)gestureRecognizerShouldBegin:(UIGestureRecognizer *)gestureRecognizer NS_AVAILABLE_IOS(6_0);", selector = "gestureRecognizerShouldBegin:")
    public native boolean gestureRecognizerShouldBegin$(UIGestureRecognizer gestureRecognizer);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewMotionEffects", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)addMotionEffect:(UIMotionEffect *)effect NS_AVAILABLE_IOS(7_0);", selector = "addMotionEffect:")
    public native void addMotionEffect$(UIMotionEffect effect);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIViewMotionEffects", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)removeMotionEffect:(UIMotionEffect *)effect NS_AVAILABLE_IOS(7_0);", selector = "removeMotionEffect:")
    public native void removeMotionEffect$(UIMotionEffect effect);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutInstallingConstraints", catownername = "UIView")
    @ObjCMethodSign(sign = "- (NSArray *)constraints NS_AVAILABLE_IOS(6_0);", selector = "constraints")
    public native NSArray constraints();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutInstallingConstraints", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)addConstraint:(NSLayoutConstraint *)constraint NS_AVAILABLE_IOS(6_0);", selector = "addConstraint:")
    public native void addConstraint$(NSLayoutConstraint constraint);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutInstallingConstraints", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)addConstraints:(NSArray *)constraints NS_AVAILABLE_IOS(6_0);", selector = "addConstraints:")
    public native void addConstraints$(NSArray constraints);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutInstallingConstraints", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)removeConstraint:(NSLayoutConstraint *)constraint NS_AVAILABLE_IOS(6_0);", selector = "removeConstraint:")
    public native void removeConstraint$(NSLayoutConstraint constraint);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutInstallingConstraints", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)removeConstraints:(NSArray *)constraints NS_AVAILABLE_IOS(6_0);", selector = "removeConstraints:")
    public native void removeConstraints$(NSArray constraints);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutCoreMethods", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)updateConstraintsIfNeeded NS_AVAILABLE_IOS(6_0);", selector = "updateConstraintsIfNeeded")
    public native void updateConstraintsIfNeeded();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutCoreMethods", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)updateConstraints NS_AVAILABLE_IOS(6_0);", selector = "updateConstraints")
    public native void updateConstraints();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutCoreMethods", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)needsUpdateConstraints NS_AVAILABLE_IOS(6_0);", selector = "needsUpdateConstraints")
    public native boolean needsUpdateConstraints();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutCoreMethods", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setNeedsUpdateConstraints NS_AVAILABLE_IOS(6_0);", selector = "setNeedsUpdateConstraints")
    public native void setNeedsUpdateConstraints();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedCompatibility", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)translatesAutoresizingMaskIntoConstraints NS_AVAILABLE_IOS(6_0);", selector = "translatesAutoresizingMaskIntoConstraints")
    public native boolean translatesAutoresizingMaskIntoConstraints();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedCompatibility", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setTranslatesAutoresizingMaskIntoConstraints:(BOOL)flag NS_AVAILABLE_IOS(6_0);", selector = "setTranslatesAutoresizingMaskIntoConstraints:")
    public native void setTranslatesAutoresizingMaskIntoConstraints(boolean flag);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedCompatibility", catownername = "UIView")
    @ObjCMethodSign(sign = "+ (BOOL)requiresConstraintBasedLayout NS_AVAILABLE_IOS(6_0);", selector = "requiresConstraintBasedLayout")
    public static native boolean requiresConstraintBasedLayout();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGRect)alignmentRectForFrame:(CGRect)frame NS_AVAILABLE_IOS(6_0);", selector = "alignmentRectForFrame:")
    public native @ObjCByValue CGRect alignmentRectForFrame$(@ObjCByValue CGRect frame);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGRect)frameForAlignmentRect:(CGRect)alignmentRect NS_AVAILABLE_IOS(6_0);", selector = "frameForAlignmentRect:")
    public native @ObjCByValue CGRect frameForAlignmentRect$(@ObjCByValue CGRect alignmentRect);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIEdgeInsets)alignmentRectInsets NS_AVAILABLE_IOS(6_0);", selector = "alignmentRectInsets")
    public native @ObjCByValue UIEdgeInsets alignmentRectInsets();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIView *)viewForBaselineLayout NS_AVAILABLE_IOS(6_0);", selector = "viewForBaselineLayout")
    public native UIView viewForBaselineLayout();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGSize)intrinsicContentSize NS_AVAILABLE_IOS(6_0);", selector = "intrinsicContentSize")
    public native @ObjCByValue CGSize intrinsicContentSize();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)invalidateIntrinsicContentSize NS_AVAILABLE_IOS(6_0);", selector = "invalidateIntrinsicContentSize")
    public native void invalidateIntrinsicContentSize();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UILayoutPriority)contentHuggingPriorityForAxis:(UILayoutConstraintAxis)axis NS_AVAILABLE_IOS(6_0);", selector = "contentHuggingPriorityForAxis:")
    public native float contentHuggingPriorityForAxis$(UILayoutConstraintAxis axis);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setContentHuggingPriority:(UILayoutPriority)priority forAxis:(UILayoutConstraintAxis)axis NS_AVAILABLE_IOS(6_0);", selector = "setContentHuggingPriority:forAxis:")
    public native void setContentHuggingPriority$forAxis$(float priority, UILayoutConstraintAxis axis);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UILayoutPriority)contentCompressionResistancePriorityForAxis:(UILayoutConstraintAxis)axis NS_AVAILABLE_IOS(6_0);", selector = "contentCompressionResistancePriorityForAxis:")
    public native float contentCompressionResistancePriorityForAxis$(UILayoutConstraintAxis axis);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutLayering", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)setContentCompressionResistancePriority:(UILayoutPriority)priority forAxis:(UILayoutConstraintAxis)axis NS_AVAILABLE_IOS(6_0);", selector = "setContentCompressionResistancePriority:forAxis:")
    public native void setContentCompressionResistancePriority$forAxis$(float priority, UILayoutConstraintAxis axis);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutFittingSize", catownername = "UIView")
    @ObjCMethodSign(sign = "- (CGSize)systemLayoutSizeFittingSize:(CGSize)targetSize NS_AVAILABLE_IOS(6_0);", selector = "systemLayoutSizeFittingSize:")
    public native @ObjCByValue CGSize systemLayoutSizeFittingSize$(@ObjCByValue CGSize targetSize);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutDebugging", catownername = "UIView")
    @ObjCMethodSign(sign = "- (NSArray *)constraintsAffectingLayoutForAxis:(UILayoutConstraintAxis)axis NS_AVAILABLE_IOS(6_0);", selector = "constraintsAffectingLayoutForAxis:")
    public native NSArray constraintsAffectingLayoutForAxis$(UILayoutConstraintAxis axis);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutDebugging", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)hasAmbiguousLayout NS_AVAILABLE_IOS(6_0);", selector = "hasAmbiguousLayout")
    public native boolean hasAmbiguousLayout();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIConstraintBasedLayoutDebugging", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)exerciseAmbiguityInLayout NS_AVAILABLE_IOS(6_0);", selector = "exerciseAmbiguityInLayout")
    public native void exerciseAmbiguityInLayout();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void) encodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "encodeRestorableStateWithCoder:")
    public native void encodeRestorableStateWithCoder$(NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void) decodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "decodeRestorableStateWithCoder:")
    public native void decodeRestorableStateWithCoder$(NSCoder coder);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UISnapshotting", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIView *)snapshotViewAfterScreenUpdates:(BOOL)afterUpdates NS_AVAILABLE_IOS(7_0);", selector = "snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates$(boolean afterUpdates);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UISnapshotting", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIView *)resizableSnapshotViewFromRect:(CGRect)rect afterScreenUpdates:(BOOL)afterUpdates withCapInsets:(UIEdgeInsets)capInsets NS_AVAILABLE_IOS(7_0);", selector = "resizableSnapshotViewFromRect:afterScreenUpdates:withCapInsets:")
    public native UIView resizableSnapshotViewFromRect$afterScreenUpdates$withCapInsets$(@ObjCByValue CGRect rect, boolean afterUpdates, @ObjCByValue UIEdgeInsets capInsets);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UISnapshotting", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)drawViewHierarchyInRect:(CGRect)rect afterScreenUpdates:(BOOL)afterUpdates NS_AVAILABLE_IOS(7_0);", selector = "drawViewHierarchyInRect:afterScreenUpdates:")
    public native boolean drawViewHierarchyInRect$afterScreenUpdates$(@ObjCByValue CGRect rect, boolean afterUpdates);

    @ObjCCategoryMethod(catname = "UITextField", catownername = "UIView")
    @ObjCMethodSign(sign = "- (BOOL)endEditing:(BOOL)force;", selector = "endEditing:")
    public native boolean endEditing$(boolean force);

    @ObjCCategoryMethod(catname = "UIPrintFormatter", catownername = "UIView")
    @ObjCMethodSign(sign = "- (UIViewPrintFormatter *)viewPrintFormatter;", selector = "viewPrintFormatter")
    public native UIViewPrintFormatter viewPrintFormatter();

    @ObjCCategoryMethod(catname = "UIPrintFormatter", catownername = "UIView")
    @ObjCMethodSign(sign = "- (void)drawRect:(CGRect)rect forViewPrintFormatter:(UIViewPrintFormatter *)formatter;", selector = "drawRect:forViewPrintFormatter:")
    public native void drawRect$forViewPrintFormatter$(@ObjCByValue CGRect rect, UIViewPrintFormatter formatter);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIView initWithCoder$(NSCoder aDecoder);
}
