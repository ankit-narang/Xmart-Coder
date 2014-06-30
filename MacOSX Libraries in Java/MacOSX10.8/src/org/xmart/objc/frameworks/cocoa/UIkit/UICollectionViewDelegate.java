package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UICollectionViewDelegate 
    extends UIScrollViewDelegate {

    
    
    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldHighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldHighlightItemAtIndexPath:")
    boolean collectionView$shouldHighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didHighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didHighlightItemAtIndexPath:")
    void collectionView$didHighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didUnhighlightItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didUnhighlightItemAtIndexPath:")
    void collectionView$didUnhighlightItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldSelectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldSelectItemAtIndexPath:")
    boolean collectionView$shouldSelectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldDeselectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldDeselectItemAtIndexPath:")
    boolean collectionView$shouldDeselectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didSelectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didSelectItemAtIndexPath:")
    void collectionView$didSelectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didDeselectItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didDeselectItemAtIndexPath:")
    void collectionView$didDeselectItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingCell:(UICollectionViewCell *)cell forItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didEndDisplayingCell:forItemAtIndexPath:")
    void collectionView$didEndDisplayingCell$forItemAtIndexPath$(UICollectionView collectionView, UICollectionViewCell cell, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView didEndDisplayingSupplementaryView:(UICollectionReusableView *)view forElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:didEndDisplayingSupplementaryView:forElementOfKind:atIndexPath:")
    void collectionView$didEndDisplayingSupplementaryView$forElementOfKind$atIndexPath$(UICollectionView collectionView, UICollectionReusableView view, NSString elementKind, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView shouldShowMenuForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:shouldShowMenuForItemAtIndexPath:")
    boolean collectionView$shouldShowMenuForItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)collectionView:(UICollectionView *)collectionView canPerformAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender;", selector = "collectionView:canPerformAction:forItemAtIndexPath:withSender:")
    boolean collectionView$canPerformAction$forItemAtIndexPath$withSender$(UICollectionView collectionView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    @ObjCMethodSign(sign = "- (void)collectionView:(UICollectionView *)collectionView performAction:(SEL)action forItemAtIndexPath:(NSIndexPath *)indexPath withSender:(id)sender;", selector = "collectionView:performAction:forItemAtIndexPath:withSender:")
    void collectionView$performAction$forItemAtIndexPath$withSender$(UICollectionView collectionView, ObjCSelector action, NSIndexPath indexPath, NSObject sender);

    @ObjCMethodSign(sign = "- (UICollectionViewTransitionLayout *)collectionView:(UICollectionView *)collectionView transitionLayoutForOldLayout:(UICollectionViewLayout *)fromLayout newLayout:(UICollectionViewLayout *)toLayout;", selector = "collectionView:transitionLayoutForOldLayout:newLayout:")
    UICollectionViewTransitionLayout collectionView$transitionLayoutForOldLayout$newLayout$(UICollectionView collectionView, UICollectionViewLayout fromLayout, UICollectionViewLayout toLayout);
}
