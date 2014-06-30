package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISegmentedControl extends UIControl implements NSCoding {
    
    public UISegmentedControl() {}
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "segmentedControlStyle")
    public native UISegmentedControlStyle getSegmentedControlStyle();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setSegmentedControlStyle:")
    public native void setSegmentedControlStyle(UISegmentedControlStyle v);
    @ObjCProperty public UISegmentedControlStyle segmentedControlStyle;

    @ObjCPropertyGetter(selector = "isMomentary")
    public native boolean isMomentary();
    @ObjCPropertySetter(selector = "setMomentary:")
    public native void setMomentary(boolean v);
    @ObjCProperty public boolean momentary;

    @ObjCPropertyGetter(selector = "numberOfSegments")
    public native @NSUInteger long getNumberOfSegments();
    @ObjCProperty public @NSUInteger long numberOfSegments;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "apportionsSegmentWidthsByContent")
    public native boolean isApportionsSegmentWidthsByContent();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setApportionsSegmentWidthsByContent:")
    public native void setApportionsSegmentWidthsByContent(boolean v);
    @ObjCProperty public boolean apportionsSegmentWidthsByContent;

    @ObjCPropertyGetter(selector = "selectedSegmentIndex")
    public native @NSInteger long getSelectedSegmentIndex();
    @ObjCPropertySetter(selector = "setSelectedSegmentIndex:")
    public native void setSelectedSegmentIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long selectedSegmentIndex;

    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;
    
    @ObjCMethodSign(sign = "- (id)initWithItems:(NSArray *)items;", selector = "initWithItems:")
    public native UISegmentedControl initWithItems$(NSArray items);

    @ObjCMethodSign(sign = "- (void)insertSegmentWithTitle:(NSString *)title atIndex:(NSUInteger)segment animated:(BOOL)animated;", selector = "insertSegmentWithTitle:atIndex:animated:")
    public native void insertSegmentWithTitle$atIndex$animated$(NSString title, @NSUInteger long segment, boolean animated);

    @ObjCMethodSign(sign = "- (void)insertSegmentWithImage:(UIImage *)image  atIndex:(NSUInteger)segment animated:(BOOL)animated;", selector = "insertSegmentWithImage:atIndex:animated:")
    public native void insertSegmentWithImage$atIndex$animated$(UIImage image, @NSUInteger long segment, boolean animated);

    @ObjCMethodSign(sign = "- (void)removeSegmentAtIndex:(NSUInteger)segment animated:(BOOL)animated;", selector = "removeSegmentAtIndex:animated:")
    public native void removeSegmentAtIndex$animated$(@NSUInteger long segment, boolean animated);

    @ObjCMethodSign(sign = "- (void)removeAllSegments;", selector = "removeAllSegments")
    public native void removeAllSegments();

    @ObjCMethodSign(sign = "- (void)setTitle:(NSString *)title forSegmentAtIndex:(NSUInteger)segment;", selector = "setTitle:forSegmentAtIndex:")
    public native void setTitle$forSegmentAtIndex$(NSString title, @NSUInteger long segment);

    @ObjCMethodSign(sign = "- (NSString *)titleForSegmentAtIndex:(NSUInteger)segment;", selector = "titleForSegmentAtIndex:")
    public native NSString titleForSegmentAtIndex$(@NSUInteger long segment);

    @ObjCMethodSign(sign = "- (void)setImage:(UIImage *)image forSegmentAtIndex:(NSUInteger)segment;", selector = "setImage:forSegmentAtIndex:")
    public native void setImage$forSegmentAtIndex$(UIImage image, @NSUInteger long segment);

    @ObjCMethodSign(sign = "- (UIImage *)imageForSegmentAtIndex:(NSUInteger)segment;", selector = "imageForSegmentAtIndex:")
    public native UIImage imageForSegmentAtIndex$(@NSUInteger long segment);

    @ObjCMethodSign(sign = "- (void)setWidth:(CGFloat)width forSegmentAtIndex:(NSUInteger)segment;", selector = "setWidth:forSegmentAtIndex:")
    public native void setWidth$forSegmentAtIndex$(float width, @NSUInteger long segment);

    @ObjCMethodSign(sign = "- (CGFloat)widthForSegmentAtIndex:(NSUInteger)segment;", selector = "widthForSegmentAtIndex:")
    public native float widthForSegmentAtIndex$(@NSUInteger long segment);

    @ObjCMethodSign(sign = "- (void)setContentOffset:(CGSize)offset forSegmentAtIndex:(NSUInteger)segment;", selector = "setContentOffset:forSegmentAtIndex:")
    public native void setContentOffset$forSegmentAtIndex$(@ObjCByValue CGSize offset, @NSUInteger long segment);

    @ObjCMethodSign(sign = "- (CGSize)contentOffsetForSegmentAtIndex:(NSUInteger)segment;", selector = "contentOffsetForSegmentAtIndex:")
    public native @ObjCByValue CGSize contentOffsetForSegmentAtIndex$(@NSUInteger long segment);

    @ObjCMethodSign(sign = "- (void)setEnabled:(BOOL)enabled forSegmentAtIndex:(NSUInteger)segment;", selector = "setEnabled:forSegmentAtIndex:")
    public native void setEnabled$forSegmentAtIndex$(boolean enabled, @NSUInteger long segment);

    @ObjCMethodSign(sign = "- (BOOL)isEnabledForSegmentAtIndex:(NSUInteger)segment;", selector = "isEnabledForSegmentAtIndex:")
    public native boolean isEnabledForSegmentAtIndex$(@NSUInteger long segment);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forState:barMetrics:")
    public native void setBackgroundImage$forState$barMetrics$(UIImage backgroundImage, UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForState:(UIControlState)state barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForState:barMetrics:")
    public native UIImage backgroundImageForState$barMetrics$(UIControlState state, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDividerImage:(UIImage *)dividerImage forLeftSegmentState:(UIControlState)leftState rightSegmentState:(UIControlState)rightState barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setDividerImage:forLeftSegmentState:rightSegmentState:barMetrics:")
    public native void setDividerImage$forLeftSegmentState$rightSegmentState$barMetrics$(UIImage dividerImage, UIControlState leftState, UIControlState rightState, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)dividerImageForLeftSegmentState:(UIControlState)leftState rightSegmentState:(UIControlState)rightState barMetrics:(UIBarMetrics)barMetrics  NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "dividerImageForLeftSegmentState:rightSegmentState:barMetrics:")
    public native UIImage dividerImageForLeftSegmentState$rightSegmentState$barMetrics$(UIControlState leftState, UIControlState rightState, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setTitleTextAttributes:(NSDictionary *)attributes forState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setTitleTextAttributes:forState:")
    public native void setTitleTextAttributes$forState$(NSDictionary attributes, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)titleTextAttributesForState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "titleTextAttributesForState:")
    public native NSDictionary titleTextAttributesForState$(UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setContentPositionAdjustment:(UIOffset)adjustment forSegmentType:(UISegmentedControlSegment)leftCenterRightOrAlone barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setContentPositionAdjustment:forSegmentType:barMetrics:")
    public native void setContentPositionAdjustment$forSegmentType$barMetrics$(@ObjCByValue UIOffset adjustment, UISegmentedControlSegment leftCenterRightOrAlone, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIOffset)contentPositionAdjustmentForSegmentType:(UISegmentedControlSegment)leftCenterRightOrAlone barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "contentPositionAdjustmentForSegmentType:barMetrics:")
    public native @ObjCByValue UIOffset contentPositionAdjustmentForSegmentType$barMetrics$(UISegmentedControlSegment leftCenterRightOrAlone, UIBarMetrics barMetrics);
}
