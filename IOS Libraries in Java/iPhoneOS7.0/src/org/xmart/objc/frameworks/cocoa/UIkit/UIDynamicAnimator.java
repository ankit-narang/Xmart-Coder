package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDynamicAnimator extends NSObject  {
    
    public UIDynamicAnimator() {}
    @ObjCPropertyGetter(selector = "referenceView")
    public native UIView getReferenceView();
    @ObjCProperty public UIView referenceView;

    @ObjCPropertyGetter(selector = "behaviors")
    public native NSArray getBehaviors();
    @ObjCProperty public NSArray behaviors;

    @ObjCPropertyGetter(selector = "isRunning")
    public native boolean isRunning();
    @ObjCProperty public boolean running;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIDynamicAnimatorDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIDynamicAnimatorDelegate v);
    @ObjCProperty public UIDynamicAnimatorDelegate delegate;
    
    @ObjCMethodSign(sign = "- (instancetype)initWithReferenceView:(UIView*)view;", selector = "initWithReferenceView:")
    public native UIDynamicAnimator initWithReferenceView$(UIView view);

    @ObjCMethodSign(sign = "- (void)addBehavior:(UIDynamicBehavior *)behavior;", selector = "addBehavior:")
    public native void addBehavior$(UIDynamicBehavior behavior);

    @ObjCMethodSign(sign = "- (void)removeBehavior:(UIDynamicBehavior *)behavior;", selector = "removeBehavior:")
    public native void removeBehavior$(UIDynamicBehavior behavior);

    @ObjCMethodSign(sign = "- (void)removeAllBehaviors;", selector = "removeAllBehaviors")
    public native void removeAllBehaviors();

    @ObjCMethodSign(sign = "- (NSArray*)itemsInRect:(CGRect)rect;", selector = "itemsInRect:")
    public native NSArray itemsInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "- (void)updateItemUsingCurrentState:(id <UIDynamicItem>)item;", selector = "updateItemUsingCurrentState:")
    public native void updateItemUsingCurrentState$(UIDynamicItem item);

    @ObjCMethodSign(sign = "- (NSTimeInterval)elapsedTime;", selector = "elapsedTime")
    public native double elapsedTime();

    @ObjCCategoryMethod(catname = "UICollectionViewAdditions", catownername = "UIDynamicAnimator")
    @ObjCMethodSign(sign = "- (instancetype)initWithCollectionViewLayout:(UICollectionViewLayout*)layout;", selector = "initWithCollectionViewLayout:")
    public native UIDynamicAnimator initWithCollectionViewLayout$(UICollectionViewLayout layout);

    @ObjCCategoryMethod(catname = "UICollectionViewAdditions", catownername = "UIDynamicAnimator")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes*)layoutAttributesForCellAtIndexPath:(NSIndexPath*)indexPath;", selector = "layoutAttributesForCellAtIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForCellAtIndexPath$(NSIndexPath indexPath);

    @ObjCCategoryMethod(catname = "UICollectionViewAdditions", catownername = "UIDynamicAnimator")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes*)layoutAttributesForSupplementaryViewOfKind:(NSString *)kind atIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForSupplementaryViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKind$atIndexPath$(NSString kind, NSIndexPath indexPath);

    @ObjCCategoryMethod(catname = "UICollectionViewAdditions", catownername = "UIDynamicAnimator")
    @ObjCMethodSign(sign = "- (UICollectionViewLayoutAttributes*)layoutAttributesForDecorationViewOfKind:(NSString*)decorationViewKind atIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForDecorationViewOfKind:atIndexPath:")
    public native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKind$atIndexPath$(NSString decorationViewKind, NSIndexPath indexPath);
}
