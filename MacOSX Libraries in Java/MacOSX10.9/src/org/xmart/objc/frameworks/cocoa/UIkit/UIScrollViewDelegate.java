package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIScrollViewDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)scrollViewDidScroll:(UIScrollView *)scrollView;", selector = "scrollViewDidScroll:")
    void scrollViewDidScroll$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewDidZoom:(UIScrollView *)scrollView NS_AVAILABLE_IOS(3_2);", selector = "scrollViewDidZoom:")
    void scrollViewDidZoom$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDragging:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDragging:")
    void scrollViewWillBeginDragging$(UIScrollView scrollView);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillEndDragging:(UIScrollView *)scrollView withVelocity:(CGPoint)velocity targetContentOffset:(inout CGPoint *)targetContentOffset NS_AVAILABLE_IOS(5_0);", selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    void scrollViewWillEndDragging$withVelocity$targetContentOffset$(UIScrollView scrollView, @ObjCByValue CGPoint velocity, CGPoint targetContentOffset);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDragging:(UIScrollView *)scrollView willDecelerate:(BOOL)decelerate;", selector = "scrollViewDidEndDragging:willDecelerate:")
    void scrollViewDidEndDragging$willDecelerate$(UIScrollView scrollView, boolean decelerate);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDecelerating:")
    void scrollViewWillBeginDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewDidEndDecelerating:")
    void scrollViewDidEndDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndScrollingAnimation:(UIScrollView *)scrollView;", selector = "scrollViewDidEndScrollingAnimation:")
    void scrollViewDidEndScrollingAnimation$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (UIView *)viewForZoomingInScrollView:(UIScrollView *)scrollView;", selector = "viewForZoomingInScrollView:")
    UIView viewForZoomingInScrollView$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginZooming:(UIScrollView *)scrollView withView:(UIView *)view NS_AVAILABLE_IOS(3_2);", selector = "scrollViewWillBeginZooming:withView:")
    void scrollViewWillBeginZooming$withView$(UIScrollView scrollView, UIView view);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndZooming:(UIScrollView *)scrollView withView:(UIView *)view atScale:(CGFloat)scale;", selector = "scrollViewDidEndZooming:withView:atScale:")
    void scrollViewDidEndZooming$withView$atScale$(UIScrollView scrollView, UIView view, float scale);

    @ObjCMethodSign(sign = "- (BOOL)scrollViewShouldScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewShouldScrollToTop:")
    boolean scrollViewShouldScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewDidScrollToTop:")
    void scrollViewDidScrollToTop$(UIScrollView scrollView);
}
