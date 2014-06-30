package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIFontDescriptor extends NSObject implements NSCopying, NSCoding {
    
    public UIFontDescriptor() {}
    @ObjCPropertyGetter(selector = "postscriptName")
    public native NSString getPostscriptName();
    @ObjCProperty public NSString postscriptName;

    @ObjCPropertyGetter(selector = "pointSize")
    public native float getPointSize();
    @ObjCProperty public float pointSize;

    @ObjCPropertyGetter(selector = "matrix")
    public native @ObjCByValue CGAffineTransform getMatrix();
    @ObjCProperty public @ObjCByValue CGAffineTransform matrix;

    @ObjCPropertyGetter(selector = "symbolicTraits")
    public native UIFontDescriptorSymbolicTraits getSymbolicTraits();
    @ObjCProperty public UIFontDescriptorSymbolicTraits symbolicTraits;
    
    @ObjCMethodSign(sign = "- (id)objectForKey:(NSString *)anAttribute;", selector = "objectForKey:")
    public native NSObject objectForKey$(NSString anAttribute);

    @ObjCMethodSign(sign = "- (NSDictionary *)fontAttributes;", selector = "fontAttributes")
    public native NSDictionary fontAttributes();

    @ObjCMethodSign(sign = "- (NSArray *)matchingFontDescriptorsWithMandatoryKeys:(NSSet *)mandatoryKeys;", selector = "matchingFontDescriptorsWithMandatoryKeys:")
    public native NSArray matchingFontDescriptorsWithMandatoryKeys$(NSSet mandatoryKeys);

    @ObjCMethodSign(sign = "- (instancetype)initWithFontAttributes:(NSDictionary *)attributes;", selector = "initWithFontAttributes:")
    public native UIFontDescriptor initWithFontAttributes$(NSDictionary attributes);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorByAddingAttributes:(NSDictionary *)attributes;", selector = "fontDescriptorByAddingAttributes:")
    public native UIFontDescriptor fontDescriptorByAddingAttributes$(NSDictionary attributes);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorWithSymbolicTraits:(UIFontDescriptorSymbolicTraits)symbolicTraits;", selector = "fontDescriptorWithSymbolicTraits:")
    public native UIFontDescriptor fontDescriptorWithSymbolicTraits$(UIFontDescriptorSymbolicTraits symbolicTraits);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorWithSize:(CGFloat)newPointSize;", selector = "fontDescriptorWithSize:")
    public native UIFontDescriptor fontDescriptorWithSize$(float newPointSize);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorWithMatrix:(CGAffineTransform)matrix;", selector = "fontDescriptorWithMatrix:")
    public native UIFontDescriptor fontDescriptorWithMatrix$(@ObjCByValue CGAffineTransform matrix);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorWithFace:(NSString *)newFace;", selector = "fontDescriptorWithFace:")
    public native UIFontDescriptor fontDescriptorWithFace$(NSString newFace);

    @ObjCMethodSign(sign = "- (UIFontDescriptor *)fontDescriptorWithFamily:(NSString *)newFamily;", selector = "fontDescriptorWithFamily:")
    public native UIFontDescriptor fontDescriptorWithFamily$(NSString newFamily);

    @ObjCMethodSign(sign = "+ (UIFontDescriptor *)fontDescriptorWithFontAttributes:(NSDictionary *)attributes;", selector = "fontDescriptorWithFontAttributes:")
    public static native UIFontDescriptor fontDescriptorWithFontAttributes$(NSDictionary attributes);

    @ObjCMethodSign(sign = "+ (UIFontDescriptor *)fontDescriptorWithName:(NSString *)fontName size:(CGFloat)size;", selector = "fontDescriptorWithName:size:")
    public static native UIFontDescriptor fontDescriptorWithName$size$(NSString fontName, float size);

    @ObjCMethodSign(sign = "+ (UIFontDescriptor *)fontDescriptorWithName:(NSString *)fontName matrix:(CGAffineTransform)matrix;", selector = "fontDescriptorWithName:matrix:")
    public static native UIFontDescriptor fontDescriptorWithName$matrix$(NSString fontName, @ObjCByValue CGAffineTransform matrix);

    @ObjCMethodSign(sign = "+ (UIFontDescriptor *)preferredFontDescriptorWithTextStyle:(NSString *)style;", selector = "preferredFontDescriptorWithTextStyle:")
    public static native UIFontDescriptor preferredFontDescriptorWithTextStyle$(NSString style);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIFontDescriptor initWithCoder$(NSCoder aDecoder);
}
