package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIButton extends UIControl implements NSCoding {
    
    public UIButton() {}
    @ObjCPropertyGetter(selector = "contentEdgeInsets")
    public native @ObjCByValue UIEdgeInsets getContentEdgeInsets();
    @ObjCPropertySetter(selector = "setContentEdgeInsets:")
    public native void setContentEdgeInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets contentEdgeInsets;

    @ObjCPropertyGetter(selector = "titleEdgeInsets")
    public native @ObjCByValue UIEdgeInsets getTitleEdgeInsets();
    @ObjCPropertySetter(selector = "setTitleEdgeInsets:")
    public native void setTitleEdgeInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets titleEdgeInsets;

    @ObjCPropertyGetter(selector = "reversesTitleShadowWhenHighlighted")
    public native boolean isReversesTitleShadowWhenHighlighted();
    @ObjCPropertySetter(selector = "setReversesTitleShadowWhenHighlighted:")
    public native void setReversesTitleShadowWhenHighlighted(boolean v);
    @ObjCProperty public boolean reversesTitleShadowWhenHighlighted;

    @ObjCPropertyGetter(selector = "imageEdgeInsets")
    public native @ObjCByValue UIEdgeInsets getImageEdgeInsets();
    @ObjCPropertySetter(selector = "setImageEdgeInsets:")
    public native void setImageEdgeInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets imageEdgeInsets;

    @ObjCPropertyGetter(selector = "adjustsImageWhenHighlighted")
    public native boolean isAdjustsImageWhenHighlighted();
    @ObjCPropertySetter(selector = "setAdjustsImageWhenHighlighted:")
    public native void setAdjustsImageWhenHighlighted(boolean v);
    @ObjCProperty public boolean adjustsImageWhenHighlighted;

    @ObjCPropertyGetter(selector = "adjustsImageWhenDisabled")
    public native boolean isAdjustsImageWhenDisabled();
    @ObjCPropertySetter(selector = "setAdjustsImageWhenDisabled:")
    public native void setAdjustsImageWhenDisabled(boolean v);
    @ObjCProperty public boolean adjustsImageWhenDisabled;

    @ObjCPropertyGetter(selector = "showsTouchWhenHighlighted")
    public native boolean isShowsTouchWhenHighlighted();
    @ObjCPropertySetter(selector = "setShowsTouchWhenHighlighted:")
    public native void setShowsTouchWhenHighlighted(boolean v);
    @ObjCProperty public boolean showsTouchWhenHighlighted;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    @ObjCPropertyGetter(selector = "buttonType")
    public native UIButtonType getButtonType();
    @ObjCProperty public UIButtonType buttonType;

    @ObjCPropertyGetter(selector = "currentTitle")
    public native NSString getCurrentTitle();
    @ObjCProperty public NSString currentTitle;

    @ObjCPropertyGetter(selector = "currentTitleColor")
    public native UIColor getCurrentTitleColor();
    @ObjCProperty public UIColor currentTitleColor;

    @ObjCPropertyGetter(selector = "currentTitleShadowColor")
    public native UIColor getCurrentTitleShadowColor();
    @ObjCProperty public UIColor currentTitleShadowColor;

    @ObjCPropertyGetter(selector = "currentImage")
    public native UIImage getCurrentImage();
    @ObjCProperty public UIImage currentImage;

    @ObjCPropertyGetter(selector = "currentBackgroundImage")
    public native UIImage getCurrentBackgroundImage();
    @ObjCProperty public UIImage currentBackgroundImage;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "currentAttributedTitle")
    public native NSAttributedString getCurrentAttributedTitle();
    @ObjCProperty public NSAttributedString currentAttributedTitle;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "titleLabel")
    public native UILabel getTitleLabel();
    @ObjCProperty public UILabel titleLabel;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "imageView")
    public native UIImageView getImageView();
    @ObjCProperty public UIImageView imageView;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "titleShadowOffset")
    public native @ObjCByValue CGSize getTitleShadowOffset();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setTitleShadowOffset:")
    public native void setTitleShadowOffset(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize titleShadowOffset;
    
    @ObjCMethodSign(sign = "- (void)setTitle:(NSString *)title forState:(UIControlState)state;", selector = "setTitle:forState:")
    public native void setTitle$forState$(NSString title, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setTitleColor:(UIColor *)color forState:(UIControlState)state UI_APPEARANCE_SELECTOR;", selector = "setTitleColor:forState:")
    public native void setTitleColor$forState$(UIColor color, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setTitleShadowColor:(UIColor *)color forState:(UIControlState)state UI_APPEARANCE_SELECTOR;", selector = "setTitleShadowColor:forState:")
    public native void setTitleShadowColor$forState$(UIColor color, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setImage:(UIImage *)image forState:(UIControlState)state;", selector = "setImage:forState:")
    public native void setImage$forState$(UIImage image, UIControlState state);

    @ObjCMethodSign(sign = "- (void)setBackgroundImage:(UIImage *)image forState:(UIControlState)state UI_APPEARANCE_SELECTOR;", selector = "setBackgroundImage:forState:")
    public native void setBackgroundImage$forState$(UIImage image, UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setAttributedTitle:(NSAttributedString *)title forState:(UIControlState)state NS_AVAILABLE_IOS(6_0);", selector = "setAttributedTitle:forState:")
    public native void setAttributedTitle$forState$(NSAttributedString title, UIControlState state);

    @ObjCMethodSign(sign = "- (NSString *)titleForState:(UIControlState)state;", selector = "titleForState:")
    public native NSString titleForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIColor *)titleColorForState:(UIControlState)state;", selector = "titleColorForState:")
    public native UIColor titleColorForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIColor *)titleShadowColorForState:(UIControlState)state;", selector = "titleShadowColorForState:")
    public native UIColor titleShadowColorForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIImage *)imageForState:(UIControlState)state;", selector = "imageForState:")
    public native UIImage imageForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (UIImage *)backgroundImageForState:(UIControlState)state;", selector = "backgroundImageForState:")
    public native UIImage backgroundImageForState$(UIControlState state);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSAttributedString *)attributedTitleForState:(UIControlState)state NS_AVAILABLE_IOS(6_0);", selector = "attributedTitleForState:")
    public native NSAttributedString attributedTitleForState$(UIControlState state);

    @ObjCMethodSign(sign = "- (CGRect)backgroundRectForBounds:(CGRect)bounds;", selector = "backgroundRectForBounds:")
    public native @ObjCByValue CGRect backgroundRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)contentRectForBounds:(CGRect)bounds;", selector = "contentRectForBounds:")
    public native @ObjCByValue CGRect contentRectForBounds$(@ObjCByValue CGRect bounds);

    @ObjCMethodSign(sign = "- (CGRect)titleRectForContentRect:(CGRect)contentRect;", selector = "titleRectForContentRect:")
    public native @ObjCByValue CGRect titleRectForContentRect$(@ObjCByValue CGRect contentRect);

    @ObjCMethodSign(sign = "- (CGRect)imageRectForContentRect:(CGRect)contentRect;", selector = "imageRectForContentRect:")
    public native @ObjCByValue CGRect imageRectForContentRect$(@ObjCByValue CGRect contentRect);

    @ObjCMethodSign(sign = "+ (id)buttonWithType:(UIButtonType)buttonType;", selector = "buttonWithType:")
    public static native NSObject buttonWithType$(UIButtonType buttonType);
}
