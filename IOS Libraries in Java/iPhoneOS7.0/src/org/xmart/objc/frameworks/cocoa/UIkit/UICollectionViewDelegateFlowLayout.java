package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UICollectionViewDelegateFlowLayout 
    extends UICollectionViewDelegate {

    
    
    @ObjCMethodSign(sign = "- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout sizeForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:layout:sizeForItemAtIndexPath:")
    @ObjCByValue CGSize collectionView$layout$sizeForItemAtIndexPath$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (UIEdgeInsets)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout insetForSectionAtIndex:(NSInteger)section;", selector = "collectionView:layout:insetForSectionAtIndex:")
    @ObjCByValue UIEdgeInsets collectionView$layout$insetForSectionAtIndex$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout minimumLineSpacingForSectionAtIndex:(NSInteger)section;", selector = "collectionView:layout:minimumLineSpacingForSectionAtIndex:")
    float collectionView$layout$minimumLineSpacingForSectionAtIndex$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGFloat)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout minimumInteritemSpacingForSectionAtIndex:(NSInteger)section;", selector = "collectionView:layout:minimumInteritemSpacingForSectionAtIndex:")
    float collectionView$layout$minimumInteritemSpacingForSectionAtIndex$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout referenceSizeForHeaderInSection:(NSInteger)section;", selector = "collectionView:layout:referenceSizeForHeaderInSection:")
    @ObjCByValue CGSize collectionView$layout$referenceSizeForHeaderInSection$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @NSInteger long section);

    @ObjCMethodSign(sign = "- (CGSize)collectionView:(UICollectionView *)collectionView layout:(UICollectionViewLayout*)collectionViewLayout referenceSizeForFooterInSection:(NSInteger)section;", selector = "collectionView:layout:referenceSizeForFooterInSection:")
    @ObjCByValue CGSize collectionView$layout$referenceSizeForFooterInSection$(UICollectionView collectionView, UICollectionViewLayout collectionViewLayout, @NSInteger long section);
}
