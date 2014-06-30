package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSMutableParagraphStyle extends NSParagraphStyle  {
    
    public NSMutableParagraphStyle() {}
    @ObjCPropertyGetter(selector = "lineSpacing")
    public native float getLineSpacing();
    @ObjCPropertySetter(selector = "setLineSpacing:")
    public native void setLineSpacing(float v);
    @ObjCProperty public float lineSpacing;

    @ObjCPropertyGetter(selector = "paragraphSpacing")
    public native float getParagraphSpacing();
    @ObjCPropertySetter(selector = "setParagraphSpacing:")
    public native void setParagraphSpacing(float v);
    @ObjCProperty public float paragraphSpacing;

    @ObjCPropertyGetter(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @ObjCPropertySetter(selector = "setAlignment:")
    public native void setAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment alignment;

    @ObjCPropertyGetter(selector = "firstLineHeadIndent")
    public native float getFirstLineHeadIndent();
    @ObjCPropertySetter(selector = "setFirstLineHeadIndent:")
    public native void setFirstLineHeadIndent(float v);
    @ObjCProperty public float firstLineHeadIndent;

    @ObjCPropertyGetter(selector = "headIndent")
    public native float getHeadIndent();
    @ObjCPropertySetter(selector = "setHeadIndent:")
    public native void setHeadIndent(float v);
    @ObjCProperty public float headIndent;

    @ObjCPropertyGetter(selector = "tailIndent")
    public native float getTailIndent();
    @ObjCPropertySetter(selector = "setTailIndent:")
    public native void setTailIndent(float v);
    @ObjCProperty public float tailIndent;

    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @ObjCPropertySetter(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    @ObjCPropertyGetter(selector = "minimumLineHeight")
    public native float getMinimumLineHeight();
    @ObjCPropertySetter(selector = "setMinimumLineHeight:")
    public native void setMinimumLineHeight(float v);
    @ObjCProperty public float minimumLineHeight;

    @ObjCPropertyGetter(selector = "maximumLineHeight")
    public native float getMaximumLineHeight();
    @ObjCPropertySetter(selector = "setMaximumLineHeight:")
    public native void setMaximumLineHeight(float v);
    @ObjCProperty public float maximumLineHeight;

    @ObjCPropertyGetter(selector = "baseWritingDirection")
    public native NSWritingDirection getBaseWritingDirection();
    @ObjCPropertySetter(selector = "setBaseWritingDirection:")
    public native void setBaseWritingDirection(NSWritingDirection v);
    @ObjCProperty public NSWritingDirection baseWritingDirection;

    @ObjCPropertyGetter(selector = "lineHeightMultiple")
    public native float getLineHeightMultiple();
    @ObjCPropertySetter(selector = "setLineHeightMultiple:")
    public native void setLineHeightMultiple(float v);
    @ObjCProperty public float lineHeightMultiple;

    @ObjCPropertyGetter(selector = "paragraphSpacingBefore")
    public native float getParagraphSpacingBefore();
    @ObjCPropertySetter(selector = "setParagraphSpacingBefore:")
    public native void setParagraphSpacingBefore(float v);
    @ObjCProperty public float paragraphSpacingBefore;

    @ObjCPropertyGetter(selector = "hyphenationFactor")
    public native float getHyphenationFactor();
    @ObjCPropertySetter(selector = "setHyphenationFactor:")
    public native void setHyphenationFactor(float v);
    @ObjCProperty public float hyphenationFactor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "tabStops")
    public native NSArray getTabStops();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setTabStops:")
    public native void setTabStops(NSArray v);
    @ObjCProperty public NSArray tabStops;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "defaultTabInterval")
    public native float getDefaultTabInterval();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setDefaultTabInterval:")
    public native void setDefaultTabInterval(float v);
    @ObjCProperty public float defaultTabInterval;
    
    
}
