package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIScrollView extends UIView implements NSCoding {
    
    public UIScrollView() {}
    @ObjCPropertyGetter(selector = "contentOffset")
    public native @ObjCByValue CGPoint getContentOffset();
    @ObjCPropertySetter(selector = "setContentOffset:")
    public native void setContentOffset(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint contentOffset;

    @ObjCPropertyGetter(selector = "contentSize")
    public native @ObjCByValue CGSize getContentSize();
    @ObjCPropertySetter(selector = "setContentSize:")
    public native void setContentSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize contentSize;

    @ObjCPropertyGetter(selector = "contentInset")
    public native @ObjCByValue UIEdgeInsets getContentInset();
    @ObjCPropertySetter(selector = "setContentInset:")
    public native void setContentInset(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets contentInset;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIScrollViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIScrollViewDelegate v);
    @ObjCProperty public UIScrollViewDelegate delegate;

    @ObjCPropertyGetter(selector = "isDirectionalLockEnabled")
    public native boolean isDirectionalLockEnabled();
    @ObjCPropertySetter(selector = "setDirectionalLockEnabled:")
    public native void setDirectionalLockEnabled(boolean v);
    @ObjCProperty public boolean directionalLockEnabled;

    @ObjCPropertyGetter(selector = "bounces")
    public native boolean isBounces();
    @ObjCPropertySetter(selector = "setBounces:")
    public native void setBounces(boolean v);
    @ObjCProperty public boolean bounces;

    @ObjCPropertyGetter(selector = "alwaysBounceVertical")
    public native boolean isAlwaysBounceVertical();
    @ObjCPropertySetter(selector = "setAlwaysBounceVertical:")
    public native void setAlwaysBounceVertical(boolean v);
    @ObjCProperty public boolean alwaysBounceVertical;

    @ObjCPropertyGetter(selector = "alwaysBounceHorizontal")
    public native boolean isAlwaysBounceHorizontal();
    @ObjCPropertySetter(selector = "setAlwaysBounceHorizontal:")
    public native void setAlwaysBounceHorizontal(boolean v);
    @ObjCProperty public boolean alwaysBounceHorizontal;

    @ObjCPropertyGetter(selector = "isPagingEnabled")
    public native boolean isPagingEnabled();
    @ObjCPropertySetter(selector = "setPagingEnabled:")
    public native void setPagingEnabled(boolean v);
    @ObjCProperty public boolean pagingEnabled;

    @ObjCPropertyGetter(selector = "isScrollEnabled")
    public native boolean isScrollEnabled();
    @ObjCPropertySetter(selector = "setScrollEnabled:")
    public native void setScrollEnabled(boolean v);
    @ObjCProperty public boolean scrollEnabled;

    @ObjCPropertyGetter(selector = "showsHorizontalScrollIndicator")
    public native boolean isShowsHorizontalScrollIndicator();
    @ObjCPropertySetter(selector = "setShowsHorizontalScrollIndicator:")
    public native void setShowsHorizontalScrollIndicator(boolean v);
    @ObjCProperty public boolean showsHorizontalScrollIndicator;

    @ObjCPropertyGetter(selector = "showsVerticalScrollIndicator")
    public native boolean isShowsVerticalScrollIndicator();
    @ObjCPropertySetter(selector = "setShowsVerticalScrollIndicator:")
    public native void setShowsVerticalScrollIndicator(boolean v);
    @ObjCProperty public boolean showsVerticalScrollIndicator;

    @ObjCPropertyGetter(selector = "scrollIndicatorInsets")
    public native @ObjCByValue UIEdgeInsets getScrollIndicatorInsets();
    @ObjCPropertySetter(selector = "setScrollIndicatorInsets:")
    public native void setScrollIndicatorInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets scrollIndicatorInsets;

    @ObjCPropertyGetter(selector = "indicatorStyle")
    public native UIScrollViewIndicatorStyle getIndicatorStyle();
    @ObjCPropertySetter(selector = "setIndicatorStyle:")
    public native void setIndicatorStyle(UIScrollViewIndicatorStyle v);
    @ObjCProperty public UIScrollViewIndicatorStyle indicatorStyle;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "decelerationRate")
    public native float getDecelerationRate();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setDecelerationRate:")
    public native void setDecelerationRate(float v);
    @ObjCProperty public float decelerationRate;

    @ObjCPropertyGetter(selector = "isTracking")
    public native boolean isTracking();
    @ObjCProperty public boolean tracking;

    @ObjCPropertyGetter(selector = "isDragging")
    public native boolean isDragging();
    @ObjCProperty public boolean dragging;

    @ObjCPropertyGetter(selector = "isDecelerating")
    public native boolean isDecelerating();
    @ObjCProperty public boolean decelerating;

    @ObjCPropertyGetter(selector = "delaysContentTouches")
    public native boolean isDelaysContentTouches();
    @ObjCPropertySetter(selector = "setDelaysContentTouches:")
    public native void setDelaysContentTouches(boolean v);
    @ObjCProperty public boolean delaysContentTouches;

    @ObjCPropertyGetter(selector = "canCancelContentTouches")
    public native boolean isCanCancelContentTouches();
    @ObjCPropertySetter(selector = "setCanCancelContentTouches:")
    public native void setCanCancelContentTouches(boolean v);
    @ObjCProperty public boolean canCancelContentTouches;

    @ObjCPropertyGetter(selector = "minimumZoomScale")
    public native float getMinimumZoomScale();
    @ObjCPropertySetter(selector = "setMinimumZoomScale:")
    public native void setMinimumZoomScale(float v);
    @ObjCProperty public float minimumZoomScale;

    @ObjCPropertyGetter(selector = "maximumZoomScale")
    public native float getMaximumZoomScale();
    @ObjCPropertySetter(selector = "setMaximumZoomScale:")
    public native void setMaximumZoomScale(float v);
    @ObjCProperty public float maximumZoomScale;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "zoomScale")
    public native float getZoomScale();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setZoomScale:")
    public native void setZoomScale(float v);
    @ObjCProperty public float zoomScale;

    @ObjCPropertyGetter(selector = "bouncesZoom")
    public native boolean isBouncesZoom();
    @ObjCPropertySetter(selector = "setBouncesZoom:")
    public native void setBouncesZoom(boolean v);
    @ObjCProperty public boolean bouncesZoom;

    @ObjCPropertyGetter(selector = "isZooming")
    public native boolean isZooming();
    @ObjCProperty public boolean zooming;

    @ObjCPropertyGetter(selector = "isZoomBouncing")
    public native boolean isZoomBouncing();
    @ObjCProperty public boolean zoomBouncing;

    @ObjCPropertyGetter(selector = "scrollsToTop")
    public native boolean isScrollsToTop();
    @ObjCPropertySetter(selector = "setScrollsToTop:")
    public native void setScrollsToTop(boolean v);
    @ObjCProperty public boolean scrollsToTop;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "panGestureRecognizer")
    public native UIPanGestureRecognizer getPanGestureRecognizer();
    @ObjCProperty public UIPanGestureRecognizer panGestureRecognizer;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "pinchGestureRecognizer")
    public native UIPinchGestureRecognizer getPinchGestureRecognizer();
    @ObjCProperty public UIPinchGestureRecognizer pinchGestureRecognizer;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "keyboardDismissMode")
    public native UIScrollViewKeyboardDismissMode getKeyboardDismissMode();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setKeyboardDismissMode:")
    public native void setKeyboardDismissMode(UIScrollViewKeyboardDismissMode v);
    @ObjCProperty public UIScrollViewKeyboardDismissMode keyboardDismissMode;
    
    @ObjCMethodSign(sign = "- (void)setContentOffset:(CGPoint)contentOffset animated:(BOOL)animated;", selector = "setContentOffset:animated:")
    public native void setContentOffset$animated$(@ObjCByValue CGPoint contentOffset, boolean animated);

    @ObjCMethodSign(sign = "- (void)scrollRectToVisible:(CGRect)rect animated:(BOOL)animated;", selector = "scrollRectToVisible:animated:")
    public native void scrollRectToVisible$animated$(@ObjCByValue CGRect rect, boolean animated);

    @ObjCMethodSign(sign = "- (void)flashScrollIndicators;", selector = "flashScrollIndicators")
    public native void flashScrollIndicators();

    @ObjCMethodSign(sign = "- (BOOL)touchesShouldBegin:(NSSet *)touches withEvent:(UIEvent *)event inContentView:(UIView *)view;", selector = "touchesShouldBegin:withEvent:inContentView:")
    public native boolean touchesShouldBegin$withEvent$inContentView$(NSSet touches, UIEvent event, UIView view);

    @ObjCMethodSign(sign = "- (BOOL)touchesShouldCancelInContentView:(UIView *)view;", selector = "touchesShouldCancelInContentView:")
    public native boolean touchesShouldCancelInContentView$(UIView view);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setZoomScale:(CGFloat)scale animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "setZoomScale:animated:")
    public native void setZoomScale$animated$(float scale, boolean animated);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)zoomToRect:(CGRect)rect animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "zoomToRect:animated:")
    public native void zoomToRect$animated$(@ObjCByValue CGRect rect, boolean animated);
}
