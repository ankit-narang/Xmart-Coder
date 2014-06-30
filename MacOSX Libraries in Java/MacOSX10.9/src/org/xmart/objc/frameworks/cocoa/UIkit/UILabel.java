package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UILabel extends UIView implements NSCoding {
    
    public UILabel() {}
    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    @ObjCPropertyGetter(selector = "textColor")
    public native UIColor getTextColor();
    @ObjCPropertySetter(selector = "setTextColor:")
    public native void setTextColor(UIColor v);
    @ObjCProperty public UIColor textColor;

    @ObjCPropertyGetter(selector = "shadowColor")
    public native UIColor getShadowColor();
    @ObjCPropertySetter(selector = "setShadowColor:")
    public native void setShadowColor(UIColor v);
    @ObjCProperty public UIColor shadowColor;

    @ObjCPropertyGetter(selector = "shadowOffset")
    public native @ObjCByValue CGSize getShadowOffset();
    @ObjCPropertySetter(selector = "setShadowOffset:")
    public native void setShadowOffset(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize shadowOffset;

    @ObjCPropertyGetter(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @ObjCPropertySetter(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment textAlignment;

    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @ObjCPropertySetter(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedText;

    @ObjCPropertyGetter(selector = "highlightedTextColor")
    public native UIColor getHighlightedTextColor();
    @ObjCPropertySetter(selector = "setHighlightedTextColor:")
    public native void setHighlightedTextColor(UIColor v);
    @ObjCProperty public UIColor highlightedTextColor;

    @ObjCPropertyGetter(selector = "isHighlighted")
    public native boolean isHighlighted();
    @ObjCPropertySetter(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @ObjCProperty public boolean highlighted;

    @ObjCPropertyGetter(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @ObjCPropertySetter(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @ObjCProperty public boolean userInteractionEnabled;

    @ObjCPropertyGetter(selector = "isEnabled")
    public native boolean isEnabled();
    @ObjCPropertySetter(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @ObjCProperty public boolean enabled;

    @ObjCPropertyGetter(selector = "numberOfLines")
    public native @NSInteger long getNumberOfLines();
    @ObjCPropertySetter(selector = "setNumberOfLines:")
    public native void setNumberOfLines(@NSInteger long v);
    @ObjCProperty public @NSInteger long numberOfLines;

    @ObjCPropertyGetter(selector = "adjustsFontSizeToFitWidth")
    public native boolean isAdjustsFontSizeToFitWidth();
    @ObjCPropertySetter(selector = "setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean v);
    @ObjCProperty public boolean adjustsFontSizeToFitWidth;

    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "adjustsLetterSpacingToFitWidth")
    public native boolean isAdjustsLetterSpacingToFitWidth();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setAdjustsLetterSpacingToFitWidth:")
    public native void setAdjustsLetterSpacingToFitWidth(boolean v);
    @ObjCProperty public boolean adjustsLetterSpacingToFitWidth;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "minimumFontSize")
    public native float getMinimumFontSize();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setMinimumFontSize:")
    public native void setMinimumFontSize(float v);
    @ObjCProperty public float minimumFontSize;

    @ObjCPropertyGetter(selector = "baselineAdjustment")
    public native UIBaselineAdjustment getBaselineAdjustment();
    @ObjCPropertySetter(selector = "setBaselineAdjustment:")
    public native void setBaselineAdjustment(UIBaselineAdjustment v);
    @ObjCProperty public UIBaselineAdjustment baselineAdjustment;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "minimumScaleFactor")
    public native float getMinimumScaleFactor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(float v);
    @ObjCProperty public float minimumScaleFactor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "preferredMaxLayoutWidth")
    public native float getPreferredMaxLayoutWidth();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setPreferredMaxLayoutWidth:")
    public native void setPreferredMaxLayoutWidth(float v);
    @ObjCProperty public float preferredMaxLayoutWidth;
    
    @ObjCMethodSign(sign = "- (CGRect)textRectForBounds:(CGRect)bounds limitedToNumberOfLines:(NSInteger)numberOfLines;", selector = "textRectForBounds:limitedToNumberOfLines:")
    public native @ObjCByValue CGRect textRectForBounds$limitedToNumberOfLines$(@ObjCByValue CGRect bounds, @NSInteger long numberOfLines);

    @ObjCMethodSign(sign = "- (void)drawTextInRect:(CGRect)rect;", selector = "drawTextInRect:")
    public native void drawTextInRect$(@ObjCByValue CGRect rect);
}
