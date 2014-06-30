package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewLayout extends NSObject implements NSCoding {
    
    public UICollectionViewLayout() {}
    @ObjCPropertyGetter(selector = "collectionView")
    public native UICollectionView getCollectionView();
    @ObjCProperty public UICollectionView collectionView;
    
    @ObjCMethodSign(sign = "- (void)invalidateLayout;", selector = "invalidateLayout")
    public native void invalidateLayout();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)invalidateLayoutWithContext:(UICollectionViewLayoutInvalidationContext *)context NS_AVAILABLE_IOS(7_0);", selector = "invalidateLayoutWithContext:")
    public native void invalidateLayoutWithContext$(UICollectionViewLayoutInvalidationContext context);

    @ObjCMethodSign(sign = "- (void)registerClass:(Class)viewClass forDecorationViewOfKind:(NSString *)decorationViewKind;", selector = "registerClass:forDecorationViewOfKind:")
    public native void registerClass$forDecorationViewOfKind$(ObjCClass viewClass, NSString decorationViewKind);

    @ObjCMethodSign(sign = "- (void)registerNib:(UINib *)nib forDecorationViewOfKind:(NSString *)decorationViewKind;", selector = "registerNib:forDecorationViewOfKind:")
    public native void registerNib$forDecorationViewOfKind$(UINib nib, NSString decorationViewKind);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)prepareLayout;", selector = "prepareLayout")
    public native void prepareLayout();

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (NSArray *)layoutAttributesForElementsInRect:(CGRect)rect;", selector = "layoutAttributesForElementsInRect:")
    public native NSArray layoutAttributesForElementsInRect$(@ObjCByValue CGRect rect);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)layoutAttributesForItemAtIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForItemAtIndexPath$(NSIndexPath indexPath);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)layoutAttributesForSupplementaryViewOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKind$atIndexPath$(NSString kind, NSIndexPath indexPath);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)layoutAttributesForDecorationViewOfKind:(NSString*)decorationViewKind atIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKind$atIndexPath$(NSString decorationViewKind, NSIndexPath indexPath);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (BOOL)shouldInvalidateLayoutForBoundsChange:(CGRect)newBounds;", selector = "shouldInvalidateLayoutForBoundsChange:")
    public native boolean shouldInvalidateLayoutForBoundsChange$(@ObjCByValue CGRect newBounds);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutInvalidationContext *)invalidationContextForBoundsChange:(CGRect)newBounds NS_AVAILABLE_IOS(7_0);", selector = "invalidationContextForBoundsChange:")
    public native UICollectionViewLayoutInvalidationContext invalidationContextForBoundsChange$(@ObjCByValue CGRect newBounds);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (CGPoint)targetContentOffsetForProposedContentOffset:(CGPoint)proposedContentOffset withScrollingVelocity:(CGPoint)velocity;", selector = "targetContentOffsetForProposedContentOffset:withScrollingVelocity:")
    public native @ObjCByValue CGPoint targetContentOffsetForProposedContentOffset$withScrollingVelocity$(@ObjCByValue CGPoint proposedContentOffset, @ObjCByValue CGPoint velocity);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (CGPoint)targetContentOffsetForProposedContentOffset:(CGPoint)proposedContentOffset NS_AVAILABLE_IOS(7_0);", selector = "targetContentOffsetForProposedContentOffset:")
    public native @ObjCByValue CGPoint targetContentOffsetForProposedContentOffset$(@ObjCByValue CGPoint proposedContentOffset);

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (CGSize)collectionViewContentSize;", selector = "collectionViewContentSize")
    public native @ObjCByValue CGSize collectionViewContentSize();

    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "+ (Class)layoutAttributesClass;", selector = "layoutAttributesClass")
    public static native ObjCClass layoutAttributesClass();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "SubclassingHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "+ (Class)invalidationContextClass NS_AVAILABLE_IOS(7_0);", selector = "invalidationContextClass")
    public static native ObjCClass invalidationContextClass();

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)prepareForCollectionViewUpdates:(NSArray *)updateItems;", selector = "prepareForCollectionViewUpdates:")
    public native void prepareForCollectionViewUpdates$(NSArray updateItems);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)finalizeCollectionViewUpdates;", selector = "finalizeCollectionViewUpdates")
    public native void finalizeCollectionViewUpdates();

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)prepareForAnimatedBoundsChange:(CGRect)oldBounds;", selector = "prepareForAnimatedBoundsChange:")
    public native void prepareForAnimatedBoundsChange$(@ObjCByValue CGRect oldBounds);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)finalizeAnimatedBoundsChange;", selector = "finalizeAnimatedBoundsChange")
    public native void finalizeAnimatedBoundsChange();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)prepareForTransitionToLayout:(UICollectionViewLayout*)newLayout NS_AVAILABLE_IOS(7_0);", selector = "prepareForTransitionToLayout:")
    public native void prepareForTransitionToLayout$(UICollectionViewLayout newLayout);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)prepareForTransitionFromLayout:(UICollectionViewLayout*)oldLayout NS_AVAILABLE_IOS(7_0);", selector = "prepareForTransitionFromLayout:")
    public native void prepareForTransitionFromLayout$(UICollectionViewLayout oldLayout);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (void)finalizeLayoutTransition NS_AVAILABLE_IOS(7_0);", selector = "finalizeLayoutTransition")
    public native void finalizeLayoutTransition();

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)initialLayoutAttributesForAppearingItemAtIndexPath:(NSIndexPath *)itemIndexPath;", selector = "initialLayoutAttributesForAppearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingItemAtIndexPath$(NSIndexPath itemIndexPath);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)finalLayoutAttributesForDisappearingItemAtIndexPath:(NSIndexPath *)itemIndexPath;", selector = "finalLayoutAttributesForDisappearingItemAtIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingItemAtIndexPath$(NSIndexPath itemIndexPath);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)initialLayoutAttributesForAppearingSupplementaryElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)elementIndexPath;", selector = "initialLayoutAttributesForAppearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingSupplementaryElementOfKind$atIndexPath$(NSString elementKind, NSIndexPath elementIndexPath);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)finalLayoutAttributesForDisappearingSupplementaryElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)elementIndexPath;", selector = "finalLayoutAttributesForDisappearingSupplementaryElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingSupplementaryElementOfKind$atIndexPath$(NSString elementKind, NSIndexPath elementIndexPath);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)initialLayoutAttributesForAppearingDecorationElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)decorationIndexPath;", selector = "initialLayoutAttributesForAppearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes initialLayoutAttributesForAppearingDecorationElementOfKind$atIndexPath$(NSString elementKind, NSIndexPath decorationIndexPath);

    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes *)finalLayoutAttributesForDisappearingDecorationElementOfKind:(NSString *)elementKind atIndexPath:(NSIndexPath *)decorationIndexPath;", selector = "finalLayoutAttributesForDisappearingDecorationElementOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes finalLayoutAttributesForDisappearingDecorationElementOfKind$atIndexPath$(NSString elementKind, NSIndexPath decorationIndexPath);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (NSArray *)indexPathsToDeleteForSupplementaryViewOfKind:(NSString *)kind NS_AVAILABLE_IOS(7_0);", selector = "indexPathsToDeleteForSupplementaryViewOfKind:")
    public native NSArray indexPathsToDeleteForSupplementaryViewOfKind$(NSString kind);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (NSArray *)indexPathsToDeleteForDecorationViewOfKind:(NSString *)kind NS_AVAILABLE_IOS(7_0);", selector = "indexPathsToDeleteForDecorationViewOfKind:")
    public native NSArray indexPathsToDeleteForDecorationViewOfKind$(NSString kind);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (NSArray *)indexPathsToInsertForSupplementaryViewOfKind:(NSString *)kind NS_AVAILABLE_IOS(7_0);", selector = "indexPathsToInsertForSupplementaryViewOfKind:")
    public native NSArray indexPathsToInsertForSupplementaryViewOfKind$(NSString kind);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UpdateSupportHooks", catownername = "UICollectionViewLayout")
    @ObjCMethodSign(sign = "- (NSArray *)indexPathsToInsertForDecorationViewOfKind:(NSString *)kind NS_AVAILABLE_IOS(7_0);", selector = "indexPathsToInsertForDecorationViewOfKind:")
    public native NSArray indexPathsToInsertForDecorationViewOfKind$(NSString kind);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UICollectionViewLayout initWithCoder$(NSCoder aDecoder);
}
