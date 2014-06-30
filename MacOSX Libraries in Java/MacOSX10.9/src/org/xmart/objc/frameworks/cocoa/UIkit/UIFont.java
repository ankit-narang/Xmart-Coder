package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIFont extends NSObject implements NSCopying {
    
    public UIFont() {}
    @ObjCPropertyGetter(selector = "familyName")
    public native NSString getFamilyName();
    @ObjCProperty public NSString familyName;

    @ObjCPropertyGetter(selector = "fontName")
    public native NSString getFontName();
    @ObjCProperty public NSString fontName;

    @ObjCPropertyGetter(selector = "pointSize")
    public native float getPointSize();
    @ObjCProperty public float pointSize;

    @ObjCPropertyGetter(selector = "ascender")
    public native float getAscender();
    @ObjCProperty public float ascender;

    @ObjCPropertyGetter(selector = "descender")
    public native float getDescender();
    @ObjCProperty public float descender;

    @ObjCPropertyGetter(selector = "capHeight")
    public native float getCapHeight();
    @ObjCProperty public float capHeight;

    @ObjCPropertyGetter(selector = "xHeight")
    public native float getXHeight();
    @ObjCProperty public float xHeight;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "lineHeight")
    public native float getLineHeight();
    @ObjCProperty public float lineHeight;

    @ObjCPropertyGetter(selector = "leading")
    public native float getLeading();
    @ObjCProperty public float leading;
    
    @ObjCMethodSign(sign = "- (UIFont *)fontWithSize:(CGFloat)fontSize;", selector = "fontWithSize:")
    public native UIFont fontWithSize$(float fontSize);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptor NS_AVAILABLE_IOS(7_0);", selector = "fontDescriptor")
    public native UIFontDescriptor fontDescriptor();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIFont *)preferredFontForTextStyle:(NSString *)style NS_AVAILABLE_IOS(7_0);", selector = "preferredFontForTextStyle:")
    public static native UIFont preferredFontForTextStyle$(NSString style);

    @ObjCMethodSign(sign = "+ (UIFont *)fontWithName:(NSString *)fontName size:(CGFloat)fontSize;", selector = "fontWithName:size:")
    public static native UIFont fontWithName$size$(NSString fontName, float fontSize);

    @ObjCMethodSign(sign = "+ (NSArray *)familyNames;", selector = "familyNames")
    public static native NSArray familyNames();

    @ObjCMethodSign(sign = "+ (NSArray *)fontNamesForFamilyName:(NSString *)familyName;", selector = "fontNamesForFamilyName:")
    public static native NSArray fontNamesForFamilyName$(NSString familyName);

    @ObjCMethodSign(sign = "+ (UIFont *)systemFontOfSize:(CGFloat)fontSize;", selector = "systemFontOfSize:")
    public static native UIFont systemFontOfSize$(float fontSize);

    @ObjCMethodSign(sign = "+ (UIFont *)boldSystemFontOfSize:(CGFloat)fontSize;", selector = "boldSystemFontOfSize:")
    public static native UIFont boldSystemFontOfSize$(float fontSize);

    @ObjCMethodSign(sign = "+ (UIFont *)italicSystemFontOfSize:(CGFloat)fontSize;", selector = "italicSystemFontOfSize:")
    public static native UIFont italicSystemFontOfSize$(float fontSize);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIFont *)fontWithDescriptor:(UIFontDescriptor *)descriptor size:(CGFloat)pointSize NS_AVAILABLE_IOS(7_0);", selector = "fontWithDescriptor:size:")
    public static native UIFont fontWithDescriptor$size$(UIFontDescriptor descriptor, float pointSize);

    @ObjCCategoryMethod(catname = "UIFontSystemFonts", catownername = "UIFont")
    @ObjCMethodSign(sign = "+ (CGFloat)labelFontSize;", selector = "labelFontSize")
    public static native float labelFontSize();

    @ObjCCategoryMethod(catname = "UIFontSystemFonts", catownername = "UIFont")
    @ObjCMethodSign(sign = "+ (CGFloat)buttonFontSize;", selector = "buttonFontSize")
    public static native float buttonFontSize();

    @ObjCCategoryMethod(catname = "UIFontSystemFonts", catownername = "UIFont")
    @ObjCMethodSign(sign = "+ (CGFloat)smallSystemFontSize;", selector = "smallSystemFontSize")
    public static native float smallSystemFontSize();

    @ObjCCategoryMethod(catname = "UIFontSystemFonts", catownername = "UIFont")
    @ObjCMethodSign(sign = "+ (CGFloat)systemFontSize;", selector = "systemFontSize")
    public static native float systemFontSize();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
