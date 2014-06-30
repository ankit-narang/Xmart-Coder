package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionView extends UIScrollView  {
    
    public UICollectionView() {}
    @ObjCPropertyGetter(selector = "collectionViewLayout")
    public native UICollectionViewLayout getCollectionViewLayout();
    @ObjCPropertySetter(selector = "setCollectionViewLayout:")
    public native void setCollectionViewLayout(UICollectionViewLayout v);
    @ObjCProperty public UICollectionViewLayout collectionViewLayout;

    @ObjCPropertyGetter(selector = "delegate")
    public native UICollectionViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UICollectionViewDelegate v);
    @ObjCProperty public UICollectionViewDelegate delegate;

    @ObjCPropertyGetter(selector = "dataSource")
    public native UICollectionViewDataSource getDataSource();
    @ObjCPropertySetter(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UICollectionViewDataSource v);
    @ObjCProperty public UICollectionViewDataSource dataSource;

    @ObjCPropertyGetter(selector = "backgroundView")
    public native UIView getBackgroundView();
    @ObjCPropertySetter(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @ObjCProperty public UIView backgroundView;

    @ObjCPropertyGetter(selector = "allowsSelection")
    public native boolean isAllowsSelection();
    @ObjCPropertySetter(selector = "setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @ObjCProperty public boolean allowsSelection;

    @ObjCPropertyGetter(selector = "allowsMultipleSelection")
    public native boolean isAllowsMultipleSelection();
    @ObjCPropertySetter(selector = "setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    @ObjCProperty public boolean allowsMultipleSelection;
    
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame collectionViewLayout:(UICollectionViewLayout *)layout;", selector = "initWithFrame:collectionViewLayout:")
    public native UICollectionView initWithFrame$collectionViewLayout$(@ObjCByValue CGRect frame, UICollectionViewLayout layout);

    @ObjCMethodSign(sign = "- (void)registerClass:(Class)cellClass forCellWithReuseIdentifier:(NSString *)identifier;", selector = "registerClass:forCellWithReuseIdentifier:")
    public native void registerClass$forCellWithReuseIdentifier$(ObjCClass cellClass, NSString identifier);

    @ObjCMethodSign(sign = "- (void)registerNib:(UINib *)nib forCellWithReuseIdentifier:(NSString *)identifier;", selector = "registerNib:forCellWithReuseIdentifier:")
    public native void registerNib$forCellWithReuseIdentifier$(UINib nib, NSString identifier);

    @ObjCMethodSign(sign = "- (void)registerClass:(Class)viewClass forSupplementaryViewOfKind:(NSString *)elementKind withReuseIdentifier:(NSString *)identifier;", selector = "registerClass:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerClass$forSupplementaryViewOfKind$withReuseIdentifier$(ObjCClass viewClass, NSString elementKind, NSString identifier);

    @ObjCMethodSign(sign = "- (void)registerNib:(UINib *)nib forSupplementaryViewOfKind:(NSString *)kind withReuseIdentifier:(NSString *)identifier;", selector = "registerNib:forSupplementaryViewOfKind:withReuseIdentifier:")
    public native void registerNib$forSupplementaryViewOfKind$withReuseIdentifier$(UINib nib, NSString kind, NSString identifier);

    @ObjCMethodSign(sign = "- (id)dequeueReusableCellWithReuseIdentifier:(NSString *)identifier forIndexPath:(NSIndexPath*)indexPath;", selector = "dequeueReusableCellWithReuseIdentifier:forIndexPath:")
    public native NSObject dequeueReusableCellWithReuseIdentifier$forIndexPath$(NSString identifier, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (id)dequeueReusableSupplementaryViewOfKind:(NSString*)elementKind withReuseIdentifier:(NSString *)identifier forIndexPath:(NSIndexPath*)indexPath;", selector = "dequeueReusableSupplementaryViewOfKind:withReuseIdentifier:forIndexPath:")
    public native NSObject dequeueReusableSupplementaryViewOfKind$withReuseIdentifier$forIndexPath$(NSString elementKind, NSString identifier, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)indexPathsForSelectedItems;", selector = "indexPathsForSelectedItems")
    public native NSArray indexPathsForSelectedItems();

    @ObjCMethodSign(sign = "- (void)selectItemAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated scrollPosition:(UICollectionViewScrollPosition)scrollPosition;", selector = "selectItemAtIndexPath:animated:scrollPosition:")
    public native void selectItemAtIndexPath$animated$scrollPosition$(NSIndexPath indexPath, boolean animated, UICollectionViewScrollPosition scrollPosition);

    @ObjCMethodSign(sign = "- (void)deselectItemAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated;", selector = "deselectItemAtIndexPath:animated:")
    public native void deselectItemAtIndexPath$animated$(NSIndexPath indexPath, boolean animated);

    @ObjCMethodSign(sign = "- (void)reloadData;", selector = "reloadData")
    public native void reloadData();

    @ObjCMethodSign(sign = "- (void)setCollectionViewLayout:(UICollectionViewLayout *)layout animated:(BOOL)animated;", selector = "setCollectionViewLayout:animated:")
    public native void setCollectionViewLayout$animated$(UICollectionViewLayout layout, boolean animated);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setCollectionViewLayout:(UICollectionViewLayout *)layout animated:(BOOL)animated completion:(void (^)(BOOL finished))completion NS_AVAILABLE_IOS(7_0);", selector = "setCollectionViewLayout:animated:completion:")
    public native void setCollectionViewLayout$animated$completion$(UICollectionViewLayout layout, boolean animated, ObjCBlock completion);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UICollectionViewTransitionLayout *)startInteractiveTransitionToCollectionViewLayout:(UICollectionViewLayout *)layout completion:(UICollectionViewLayoutInteractiveTransitionCompletion) completion NS_AVAILABLE_IOS(7_0);", selector = "startInteractiveTransitionToCollectionViewLayout:completion:")
    public native UICollectionViewTransitionLayout startInteractiveTransitionToCollectionViewLayout$completion$(UICollectionViewLayout layout, ObjCFunctionPtr completion);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)finishInteractiveTransition NS_AVAILABLE_IOS(7_0);", selector = "finishInteractiveTransition")
    public native void finishInteractiveTransition();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)cancelInteractiveTransition NS_AVAILABLE_IOS(7_0);", selector = "cancelInteractiveTransition")
    public native void cancelInteractiveTransition();

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSections;", selector = "numberOfSections")
    public native @NSInteger long numberOfSections();

    @ObjCMethodSign(sign = "- (NSInteger)numberOfItemsInSection:(NSInteger)section;", selector = "numberOfItemsInSection:")
    public native @NSInteger long numberOfItemsInSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)layoutAttributesForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath$(NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)layoutAttributesForSupplementaryElementOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryElementOfKind$atIndexPath$(NSString kind, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathForItemAtPoint:(CGPoint)point;", selector = "indexPathForItemAtPoint:")
    public native NSIndexPath indexPathForItemAtPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathForCell:(UICollectionViewCell *)cell;", selector = "indexPathForCell:")
    public native NSIndexPath indexPathForCell$(UICollectionViewCell cell);

    @ObjCMethodSign(sign = "- (UICollectionViewCell *)cellForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "cellForItemAtIndexPath:")
    public native UICollectionViewCell cellForItemAtIndexPath$(NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)visibleCells;", selector = "visibleCells")
    public native NSArray visibleCells();

    @ObjCMethodSign(sign = "- (NSArray *)indexPathsForVisibleItems;", selector = "indexPathsForVisibleItems")
    public native NSArray indexPathsForVisibleItems();

    @ObjCMethodSign(sign = "- (void)scrollToItemAtIndexPath:(NSIndexPath *)indexPath atScrollPosition:(UICollectionViewScrollPosition)scrollPosition animated:(BOOL)animated;", selector = "scrollToItemAtIndexPath:atScrollPosition:animated:")
    public native void scrollToItemAtIndexPath$atScrollPosition$animated$(NSIndexPath indexPath, UICollectionViewScrollPosition scrollPosition, boolean animated);

    @ObjCMethodSign(sign = "- (void)insertSections:(NSIndexSet *)sections;", selector = "insertSections:")
    public native void insertSections$(NSIndexSet sections);

    @ObjCMethodSign(sign = "- (void)deleteSections:(NSIndexSet *)sections;", selector = "deleteSections:")
    public native void deleteSections$(NSIndexSet sections);

    @ObjCMethodSign(sign = "- (void)reloadSections:(NSIndexSet *)sections;", selector = "reloadSections:")
    public native void reloadSections$(NSIndexSet sections);

    @ObjCMethodSign(sign = "- (void)moveSection:(NSInteger)section toSection:(NSInteger)newSection;", selector = "moveSection:toSection:")
    public native void moveSection$toSection$(@NSInteger long section, @NSInteger long newSection);

    @ObjCMethodSign(sign = "- (void)insertItemsAtIndexPaths:(NSArray *)indexPaths;", selector = "insertItemsAtIndexPaths:")
    public native void insertItemsAtIndexPaths$(NSArray indexPaths);

    @ObjCMethodSign(sign = "- (void)deleteItemsAtIndexPaths:(NSArray *)indexPaths;", selector = "deleteItemsAtIndexPaths:")
    public native void deleteItemsAtIndexPaths$(NSArray indexPaths);

    @ObjCMethodSign(sign = "- (void)reloadItemsAtIndexPaths:(NSArray *)indexPaths;", selector = "reloadItemsAtIndexPaths:")
    public native void reloadItemsAtIndexPaths$(NSArray indexPaths);

    @ObjCMethodSign(sign = "- (void)moveItemAtIndexPath:(NSIndexPath *)indexPath toIndexPath:(NSIndexPath *)newIndexPath;", selector = "moveItemAtIndexPath:toIndexPath:")
    public native void moveItemAtIndexPath$toIndexPath$(NSIndexPath indexPath, NSIndexPath newIndexPath);

    @ObjCMethodSign(sign = "- (void)performBatchUpdates:(void (^)(void))updates completion:(void (^)(BOOL finished))completion;", selector = "performBatchUpdates:completion:")
    public native void performBatchUpdates$completion$(ObjCBlock updates, ObjCBlock completion);
}
