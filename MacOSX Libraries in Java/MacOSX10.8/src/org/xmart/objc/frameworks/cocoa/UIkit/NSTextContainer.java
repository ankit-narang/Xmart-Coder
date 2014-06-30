package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSTextContainer extends NSObject implements NSCoding, NSTextLayoutOrientationProvider {
    
    public NSTextContainer() {}
    @ObjCPropertyGetter(selector = "layoutManager")
    public native NSLayoutManager getLayoutManager();
    @ObjCPropertySetter(selector = "setLayoutManager:", strongRef = true)
    public native void setLayoutManager(NSLayoutManager v);
    @ObjCProperty public NSLayoutManager layoutManager;

    @ObjCPropertyGetter(selector = "size")
    public native @ObjCByValue CGSize getSize();
    @ObjCPropertySetter(selector = "setSize:")
    public native void setSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize size;

    @ObjCPropertyGetter(selector = "exclusionPaths")
    public native NSArray getExclusionPaths();
    @ObjCPropertySetter(selector = "setExclusionPaths:")
    public native void setExclusionPaths(NSArray v);
    @ObjCProperty public NSArray exclusionPaths;

    @ObjCPropertyGetter(selector = "lineBreakMode")
    public native NSLineBreakMode getLineBreakMode();
    @ObjCPropertySetter(selector = "setLineBreakMode:")
    public native void setLineBreakMode(NSLineBreakMode v);
    @ObjCProperty public NSLineBreakMode lineBreakMode;

    @ObjCPropertyGetter(selector = "lineFragmentPadding")
    public native float getLineFragmentPadding();
    @ObjCPropertySetter(selector = "setLineFragmentPadding:")
    public native void setLineFragmentPadding(float v);
    @ObjCProperty public float lineFragmentPadding;

    @ObjCPropertyGetter(selector = "maximumNumberOfLines")
    public native @NSUInteger long getMaximumNumberOfLines();
    @ObjCPropertySetter(selector = "setMaximumNumberOfLines:")
    public native void setMaximumNumberOfLines(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long maximumNumberOfLines;

    @ObjCPropertyGetter(selector = "widthTracksTextView")
    public native boolean isWidthTracksTextView();
    @ObjCPropertySetter(selector = "setWidthTracksTextView:")
    public native void setWidthTracksTextView(boolean v);
    @ObjCProperty public boolean widthTracksTextView;

    @ObjCPropertyGetter(selector = "heightTracksTextView")
    public native boolean isHeightTracksTextView();
    @ObjCPropertySetter(selector = "setHeightTracksTextView:")
    public native void setHeightTracksTextView(boolean v);
    @ObjCProperty public boolean heightTracksTextView;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "layoutOrientation")
    public native NSTextLayoutOrientation getLayoutOrientation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setLayoutOrientation:")
    public native void setLayoutOrientation(NSTextLayoutOrientation v);
    @ObjCProperty public NSTextLayoutOrientation layoutOrientation;
    
    @ObjCMethodSign(sign = "- (id)initWithSize:(CGSize)size;", selector = "initWithSize:")
    public native NSTextContainer initWithSize$(@ObjCByValue CGSize size);

    @ObjCMethodSign(sign = "- (CGRect)lineFragmentRectForProposedRect:(CGRect)proposedRect atIndex:(NSUInteger)characterIndex writingDirection:(NSWritingDirection)baseWritingDirection remainingRect:(CGRect *)remainingRect;", selector = "lineFragmentRectForProposedRect:atIndex:writingDirection:remainingRect:")
    public native @ObjCByValue CGRect lineFragmentRectForProposedRect$atIndex$writingDirection$remainingRect$(@ObjCByValue CGRect proposedRect, @NSUInteger long characterIndex, NSWritingDirection baseWritingDirection, CGRect remainingRect);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSTextContainer initWithCoder$(NSCoder aDecoder);
}
