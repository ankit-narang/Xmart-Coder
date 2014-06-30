package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSParagraphStyle extends NSObject implements NSCopying, NSMutableCopying, NSCoding {
    
    public NSParagraphStyle() {}
    @ObjCPropertyGetter(selector = "lineSpacing")
    public native float getLineSpacing();
    @ObjCProperty public float lineSpacing;

    @ObjCPropertyGetter(selector = "paragraphSpacing")
    public native float getParagraphSpacing();
    @ObjCProperty public float paragraphSpacing;

    @ObjCPropertyGetter(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @ObjCProperty public NSTextAlignment alignment;

    @ObjCPropertyGetter(selector = "headIndent")
    public native float getHeadIndent();
    @ObjCProperty public float headIndent;

    @ObjCPropertyGetter(selector = "tailIndent")
    public native float getTailIndent();
    @ObjCProperty public float tailIndent;

    @ObjCPropertyGetter(selector = "firstLineHeadIndent")
    public native float getFirstLineHeadIndent();
    @ObjCProperty public float firstLineHeadIndent;

    @ObjCPropertyGetter(selector = "minimumLineHeight")
    public native float getMinimumLineHeight();
    @ObjCProperty public float minimumLineHeight;

    @ObjCPropertyGetter(selector = "maximumLineHeight")
    public native float getMaximumLineHeight();
    @ObjCProperty public float maximumLineHeight;

    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    @ObjCPropertyGetter(selector = "baseWritingDirection")
    public native NSWritingDirection getBaseWritingDirection();
    @ObjCProperty public NSWritingDirection baseWritingDirection;

    @ObjCPropertyGetter(selector = "lineHeightMultiple")
    public native float getLineHeightMultiple();
    @ObjCProperty public float lineHeightMultiple;

    @ObjCPropertyGetter(selector = "paragraphSpacingBefore")
    public native float getParagraphSpacingBefore();
    @ObjCProperty public float paragraphSpacingBefore;

    @ObjCPropertyGetter(selector = "hyphenationFactor")
    public native float getHyphenationFactor();
    @ObjCProperty public float hyphenationFactor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "tabStops")
    public native NSArray getTabStops();
    @ObjCProperty public NSArray tabStops;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "defaultTabInterval")
    public native float getDefaultTabInterval();
    @ObjCProperty public float defaultTabInterval;
    
    @ObjCMethodSign(sign = "+ (NSParagraphStyle *)defaultParagraphStyle;", selector = "defaultParagraphStyle")
    public static native NSParagraphStyle defaultParagraphStyle();

    @ObjCMethodSign(sign = "+ (NSWritingDirection)defaultWritingDirectionForLanguage:(NSString *)languageName;", selector = "defaultWritingDirectionForLanguage:")
    public static native NSWritingDirection defaultWritingDirectionForLanguage$(NSString languageName);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (id)mutableCopyWithZone:(NSZone *)zone;", selector = "mutableCopyWithZone:")
    public native NSObject mutableCopyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSParagraphStyle initWithCoder$(NSCoder aDecoder);
}
