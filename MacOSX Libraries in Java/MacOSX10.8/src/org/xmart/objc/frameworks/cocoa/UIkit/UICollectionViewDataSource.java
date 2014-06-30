package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UICollectionViewDataSource 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSInteger)collectionView:(UICollectionView *)collectionView numberOfItemsInSection:(NSInteger)section;", selector = "collectionView:numberOfItemsInSection:")
    @NSInteger long collectionView$numberOfItemsInSection$(UICollectionView collectionView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UICollectionViewCell *)collectionView:(UICollectionView *)collectionView cellForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:cellForItemAtIndexPath:")
    UICollectionViewCell collectionView$cellForItemAtIndexPath$(UICollectionView collectionView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSectionsInCollectionView:(UICollectionView *)collectionView;", selector = "numberOfSectionsInCollectionView:")
    @NSInteger long numberOfSectionsInCollectionView$(UICollectionView collectionView);

    @ObjCMethodSign(sign = "- (UICollectionReusableView *)collectionView:(UICollectionView *)collectionView viewForSupplementaryElementOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath;", selector = "collectionView:viewForSupplementaryElementOfKind:atIndexPath:")
    UICollectionReusableView collectionView$viewForSupplementaryElementOfKind$atIndexPath$(UICollectionView collectionView, NSString kind, NSIndexPath indexPath);
}
