package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewController extends UIViewController implements UICollectionViewDelegate, UICollectionViewDataSource {
    
    public UICollectionViewController() {}
    @ObjCPropertyGetter(selector = "collectionView")
    public native UICollectionView getCollectionView();
    @ObjCPropertySetter(selector = "setCollectionView:")
    public native void setCollectionView(UICollectionView v);
    @ObjCProperty public UICollectionView collectionView;

    @ObjCPropertyGetter(selector = "clearsSelectionOnViewWillAppear")
    public native boolean isClearsSelectionOnViewWillAppear();
    @ObjCPropertySetter(selector = "setClearsSelectionOnViewWillAppear:")
    public native void setClearsSelectionOnViewWillAppear(boolean v);
    @ObjCProperty public boolean clearsSelectionOnViewWillAppear;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "useLayoutToLayoutNavigationTransitions")
    public native boolean isUseLayoutToLayoutNavigationTransitions();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setUseLayoutToLayoutNavigationTransitions:")
    public native void setUseLayoutToLayoutNavigationTransitions(boolean v);
    @ObjCProperty public boolean useLayoutToLayoutNavigationTransitions;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    @ObjCProperty public UICollectionViewLayout collectionViewLayout;
    
    @ObjCMethodSign(sign = "- (id)initWithCollectionViewLayout:(UICollectionViewLayout *)layout;", selector = "initWithCollectionViewLayout:")
    public native UICollectionViewController initWithCollectionViewLayout$(UICollectionViewLayout layout);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldHighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldHighlightItemAtIndexPath:")
    public native boolean collectionView$shouldHighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didHighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didHighlightItemAtIndexPath:")
    public native void collectionView$didHighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didUnhighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didUnhighlightItemAtIndexPath:")
    public native void collectionView$didUnhighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldSelectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldSelectItemAtIndexPath:")
    public native boolean collectionView$shouldSelectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldDeselectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldDeselectItemAtIndexPath:")
    public native boolean collectionView$shouldDeselectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didSelectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didSelectItemAtIndexPath:")
    public native void collectionView$didSelectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didDeselectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didDeselectItemAtIndexPath:")
    public native void collectionView$didDeselectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingCell:(UICollectionViewCell *)cell forItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    public native void collectionView$didEndDisplayingCell$forItemAtIndexPath$(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingSupplementaryView:(UICollectionReusableView *)view forElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    public native void collectionView$didEndDisplayingSupplementaryView$forElementOfKind$atIndexPath$(UICollectionView collectionView, UICollectionReusableView view, NSString elementKind, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldShowMenuForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldShowMenuForItemAtIndexPath:")
    public native boolean collectionView$shouldShowMenuForItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView canPerformAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender;", selector = "collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    public native boolean collectionView$canPerformAction$forItemAtIndexPath$withSender$(UICollectionView collectionView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView performAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender;", selector = "collectionView:performAction:forItemAtIndexPath:withSender:")
    public native void collectionView$performAction$forItemAtIndexPath$withSender$(UICollectionView collectionView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    @ObjCMethodSign(sign = "- (UICollectionViewTransitionLayout *)collectionView:(UICollectionView *)collectionView transitionLayoutForOldLayout:(UICollectionViewLayout *)fromLayout newLayout:(UICollectionViewLayout *)toLayout;", selector = "collectionView:transitionLayoutForOldLayout:newLayout:")
    public native UICollectionViewTransitionLayout collectionView$transitionLayoutForOldLayout$newLayout$(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScroll:(UIScrollView *)scrollView;", selector = "scrollViewDidScroll:")
    public native void scrollViewDidScroll$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewDidZoom:(UIScrollView *)scrollView NS_AVAILABLE_IOS(3_2);", selector = "scrollViewDidZoom:")
    public native void scrollViewDidZoom$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDragging:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDragging:")
    public native void scrollViewWillBeginDragging$(UIScrollView scrollView);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillEndDragging:(UIScrollView *)scrollView withVelocity:(CGPoint)velocity targetContentOffset:(inout CGPoint *)targetContentOffset NS_AVAILABLE_IOS(5_0);", selector = "scrollViewWillEndDragging:withVelocity:targetContentOffset:")
    public native void scrollViewWillEndDragging$withVelocity$targetContentOffset$(UIScrollView scrollView, @ObjCByValue CGPoint velocity, CGPoint targetContentOffset);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDragging:(UIScrollView *)scrollView willDecelerate:(BOOL)decelerate;", selector = "scrollViewDidEndDragging:willDecelerate:")
    public native void scrollViewDidEndDragging$willDecelerate$(UIScrollView scrollView, boolean decelerate);

    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewWillBeginDecelerating:")
    public native void scrollViewWillBeginDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndDecelerating:(UIScrollView *)scrollView;", selector = "scrollViewDidEndDecelerating:")
    public native void scrollViewDidEndDecelerating$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndScrollingAnimation:(UIScrollView *)scrollView;", selector = "scrollViewDidEndScrollingAnimation:")
    public native void scrollViewDidEndScrollingAnimation$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (UIView *)viewForZoomingInScrollView:(UIScrollView *)scrollView;", selector = "viewForZoomingInScrollView:")
    public native UIView viewForZoomingInScrollView$(UIScrollView scrollView);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)scrollViewWillBeginZooming:(UIScrollView *)scrollView withView:(UIView *)view NS_AVAILABLE_IOS(3_2);", selector = "scrollViewWillBeginZooming:withView:")
    public native void scrollViewWillBeginZooming$withView$(UIScrollView scrollView, UIView view);

    @ObjCMethodSign(sign = "- (void)scrollViewDidEndZooming:(UIScrollView *)scrollView withView:(UIView *)view atScale:(CGFloat)scale;", selector = "scrollViewDidEndZooming:withView:atScale:")
    public native void scrollViewDidEndZooming$withView$atScale$(UIScrollView scrollView, UIView view, float scale);

    @ObjCMethodSign(sign = "- (BOOL)scrollViewShouldScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewShouldScrollToTop:")
    public native boolean scrollViewShouldScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (void)scrollViewDidScrollToTop:(UIScrollView *)scrollView;", selector = "scrollViewDidScrollToTop:")
    public native void scrollViewDidScrollToTop$(UIScrollView scrollView);

    @ObjCMethodSign(sign = "- (NSInteger)collectionView:(UICollectionView *)collectionView numberOfItemsInSection:(NSInteger)section;", selector = "collectionView:numberOfItemsInSection:")
    public native @NSInteger long collectionView$numberOfItemsInSection$(UICollectionView collectionView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UICollectionViewCell *)collectionView:(UICollectionView *)collectionView cellForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:cellForItemAtIndexPath:")
    public native UICollectionViewCell collectionView$cellForItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSectionsInCollectionView:(UICollectionView *)collectionView;", selector = "numberOfSectionsInCollectionView:")
    public native @NSInteger long numberOfSectionsInCollectionView$(UICollectionView collectionView);

    @ObjCMethodSign(sign = "- (UICollectionReusableView *)collectionView:(UICollectionView *)collectionView viewForSupplementaryElementOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionReusableView collectionView$viewForSupplementaryElementOfKind$atIndexPath$(UICollectionView collectionView, NSString kind, NSIndexPath indexPath);
}
