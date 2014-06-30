package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISearchBar extends UIView implements UIBarPositioning {
    
    public UISearchBar() {}
    @ObjCPropertyGetter(selector = "barStyle")
    public native UIBarStyle getBarStyle();
    @ObjCPropertySetter(selector = "setBarStyle:")
    public native void setBarStyle(UIBarStyle v);
    @ObjCProperty public UIBarStyle barStyle;

    @ObjCPropertyGetter(selector = "delegate")
    public native UISearchBarDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UISearchBarDelegate v);
    @ObjCProperty public UISearchBarDelegate delegate;

    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    @ObjCPropertyGetter(selector = "prompt")
    public native NSString getPrompt();
    @ObjCPropertySetter(selector = "setPrompt:")
    public native void setPrompt(NSString v);
    @ObjCProperty public NSString prompt;

    @ObjCPropertyGetter(selector = "placeholder")
    public native NSString getPlaceholder();
    @ObjCPropertySetter(selector = "setPlaceholder:")
    public native void setPlaceholder(NSString v);
    @ObjCProperty public NSString placeholder;

    @ObjCPropertyGetter(selector = "showsBookmarkButton")
    public native boolean isShowsBookmarkButton();
    @ObjCPropertySetter(selector = "setShowsBookmarkButton:")
    public native void setShowsBookmarkButton(boolean v);
    @ObjCProperty public boolean showsBookmarkButton;

    @ObjCPropertyGetter(selector = "showsCancelButton")
    public native boolean isShowsCancelButton();
    @ObjCPropertySetter(selector = "setShowsCancelButton:")
    public native void setShowsCancelButton(boolean v);
    @ObjCProperty public boolean showsCancelButton;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "showsSearchResultsButton")
    public native boolean isShowsSearchResultsButton();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setShowsSearchResultsButton:")
    public native void setShowsSearchResultsButton(boolean v);
    @ObjCProperty public boolean showsSearchResultsButton;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "isSearchResultsButtonSelected")
    public native boolean isSearchResultsButtonSelected();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setSearchResultsButtonSelected:")
    public native void setSearchResultsButtonSelected(boolean v);
    @ObjCProperty public boolean searchResultsButtonSelected;

    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "barTintColor")
    public native UIColor getBarTintColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setBarTintColor:")
    public native void setBarTintColor(UIColor v);
    @ObjCProperty public UIColor barTintColor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "searchBarStyle")
    public native UISearchBarStyle getSearchBarStyle();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSearchBarStyle:")
    public native void setSearchBarStyle(UISearchBarStyle v);
    @ObjCProperty public UISearchBarStyle searchBarStyle;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isTranslucent")
    public native boolean isTranslucent();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setTranslucent:")
    public native void setTranslucent(boolean v);
    @ObjCProperty public boolean translucent;

    @ObjCPropertyGetter(selector = "autocapitalizationType")
    public native UITextAutocapitalizationType getAutocapitalizationType();
    @ObjCPropertySetter(selector = "setAutocapitalizationType:")
    public native void setAutocapitalizationType(UITextAutocapitalizationType v);
    @ObjCProperty public UITextAutocapitalizationType autocapitalizationType;

    @ObjCPropertyGetter(selector = "autocorrectionType")
    public native UITextAutocorrectionType getAutocorrectionType();
    @ObjCPropertySetter(selector = "setAutocorrectionType:")
    public native void setAutocorrectionType(UITextAutocorrectionType v);
    @ObjCProperty public UITextAutocorrectionType autocorrectionType;

    @ObjCPropertyGetter(selector = "spellCheckingType")
    public native UITextSpellCheckingType getSpellCheckingType();
    @ObjCPropertySetter(selector = "setSpellCheckingType:")
    public native void setSpellCheckingType(UITextSpellCheckingType v);
    @ObjCProperty public UITextSpellCheckingType spellCheckingType;

    @ObjCPropertyGetter(selector = "keyboardType")
    public native UIKeyboardType getKeyboardType();
    @ObjCPropertySetter(selector = "setKeyboardType:")
    public native void setKeyboardType(UIKeyboardType v);
    @ObjCProperty public UIKeyboardType keyboardType;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "scopeButtonTitles")
    public native NSArray getScopeButtonTitles();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setScopeButtonTitles:")
    public native void setScopeButtonTitles(NSArray v);
    @ObjCProperty public NSArray scopeButtonTitles;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "selectedScopeButtonIndex")
    public native @NSInteger long getSelectedScopeButtonIndex();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setSelectedScopeButtonIndex:")
    public native void setSelectedScopeButtonIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long selectedScopeButtonIndex;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "showsScopeBar")
    public native boolean isShowsScopeBar();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setShowsScopeBar:")
    public native void setShowsScopeBar(boolean v);
    @ObjCProperty public boolean showsScopeBar;

    @ObjCPropertyGetter(selector = "inputAccessoryView")
    public native UIView getInputAccessoryView();
    @ObjCPropertySetter(selector = "setInputAccessoryView:")
    public native void setInputAccessoryView(UIView v);
    @ObjCProperty public UIView inputAccessoryView;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundImage")
    public native UIImage getBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setBackgroundImage:")
    public native void setBackgroundImage(UIImage v);
    @ObjCProperty public UIImage backgroundImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "scopeBarBackgroundImage")
    public native UIImage getScopeBarBackgroundImage();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setScopeBarBackgroundImage:")
    public native void setScopeBarBackgroundImage(UIImage v);
    @ObjCProperty public UIImage scopeBarBackgroundImage;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "searchFieldBackgroundPositionAdjustment")
    public native @ObjCByValue UIOffset getSearchFieldBackgroundPositionAdjustment();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSearchFieldBackgroundPositionAdjustment:")
    public native void setSearchFieldBackgroundPositionAdjustment(@ObjCByValue UIOffset v);
    @ObjCProperty public @ObjCByValue UIOffset searchFieldBackgroundPositionAdjustment;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "searchTextPositionAdjustment")
    public native @ObjCByValue UIOffset getSearchTextPositionAdjustment();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSearchTextPositionAdjustment:")
    public native void setSearchTextPositionAdjustment(@ObjCByValue UIOffset v);
    @ObjCProperty public @ObjCByValue UIOffset searchTextPositionAdjustment;

    @ObjCPropertyGetter(selector = "barPosition")
    public native UIBarPosition getBarPosition();
    @ObjCProperty public UIBarPosition barPosition;
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setShowsCancelButton:(BOOL)showsCancelButton animated:(BOOL)animated NS_AVAILABLE_IOS(3_0);", selector = "setShowsCancelButton:animated:")
    public native void setShowsCancelButton$animated$(boolean showsCancelButton, boolean animated);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)backgroundImage forBarPosition:(UIBarPosition)barPosition barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(7_0) UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forBarPosition:barMetrics:")
    public native void setBackgroundImage$forBarPosition$barMetrics$(UIImage backgroundImage, UIBarPosition barPosition, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForBarPosition:(UIBarPosition)barPosition barMetrics:(UIBarMetrics)barMetrics NS_AVAILABLE_IOS(7_0) UI_APPEARANCE_SELECTOR;", selector = "backgroundImageForBarPosition:barMetrics:")
    public native UIImage backgroundImageForBarPosition$barMetrics$(UIBarPosition barPosition, UIBarMetrics barMetrics);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setSearchFieldBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setSearchFieldBackgroundImage:forState:")
    public native void setSearchFieldBackgroundImage$forState$(UIImage backgroundImage, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)searchFieldBackgroundImageForState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "searchFieldBackgroundImageForState:")
    public native UIImage searchFieldBackgroundImageForState$(UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setImage:(UIImage *)iconImage forSearchBarIcon:(UISearchBarIcon)icon state:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setImage:forSearchBarIcon:state:")
    public native void setImage$forSearchBarIcon$state$(UIImage iconImage, UISearchBarIcon icon, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)imageForSearchBarIcon:(UISearchBarIcon)icon state:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "imageForSearchBarIcon:state:")
    public native UIImage imageForSearchBarIcon$state$(UISearchBarIcon icon, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setScopeBarButtonBackgroundImage:(UIImage *)backgroundImage forState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setScopeBarButtonBackgroundImage:forState:")
    public native void setScopeBarButtonBackgroundImage$forState$(UIImage backgroundImage, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)scopeBarButtonBackgroundImageForState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "scopeBarButtonBackgroundImageForState:")
    public native UIImage scopeBarButtonBackgroundImageForState$(UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setScopeBarButtonDividerImage:(UIImage *)dividerImage forLeftSegmentState:(UIControlState)leftState rightSegmentState:(UIControlState)rightState NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setScopeBarButtonDividerImage:forLeftSegmentState:rightSegmentState:")
    public native void setScopeBarButtonDividerImage$forLeftSegmentState$rightSegmentState$(UIImage dividerImage, UIControlState leftState, UIControlState rightState);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)scopeBarButtonDividerImageForLeftSegmentState:(UIControlState)leftState rightSegmentState:(UIControlState)rightState NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "scopeBarButtonDividerImageForLeftSegmentState:rightSegmentState:")
    public native UIImage scopeBarButtonDividerImageForLeftSegmentState$rightSegmentState$(UIControlState leftState, UIControlState rightState);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setScopeBarButtonTitleTextAttributes:(NSDictionary *)attributes forState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setScopeBarButtonTitleTextAttributes:forState:")
    public native void setScopeBarButtonTitleTextAttributes$forState$(NSDictionary attributes, UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSDictionary *)scopeBarButtonTitleTextAttributesForState:(UIControlState)state NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "scopeBarButtonTitleTextAttributesForState:")
    public native NSDictionary scopeBarButtonTitleTextAttributesForState$(UIControlState state);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setPositionAdjustment:(UIOffset)adjustment forSearchBarIcon:(UISearchBarIcon)icon NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "setPositionAdjustment:forSearchBarIcon:")
    public native void setPositionAdjustment$forSearchBarIcon$(@ObjCByValue UIOffset adjustment, UISearchBarIcon icon);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIOffset)positionAdjustmentForSearchBarIcon:(UISearchBarIcon)icon NS_AVAILABLE_IOS(5_0) UI_APPEARANCE_SELECTOR;", selector = "positionAdjustmentForSearchBarIcon:")
    public native @ObjCByValue UIOffset positionAdjustmentForSearchBarIcon$(UISearchBarIcon icon);
}
