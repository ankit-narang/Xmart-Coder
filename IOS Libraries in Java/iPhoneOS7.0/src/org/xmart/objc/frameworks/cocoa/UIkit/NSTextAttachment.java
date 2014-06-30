package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSTextAttachment extends NSObject implements NSTextAttachmentContainer, NSCoding {
    
    public NSTextAttachment() {}
    @ObjCPropertyGetter(selector = "contents")
    public native NSData getContents();
    @ObjCPropertySetter(selector = "setContents:")
    public native void setContents(NSData v);
    @ObjCProperty public NSData contents;

    @ObjCPropertyGetter(selector = "fileType")
    public native NSString getFileType();
    @ObjCPropertySetter(selector = "setFileType:")
    public native void setFileType(NSString v);
    @ObjCProperty public NSString fileType;

    @ObjCPropertyGetter(selector = "fileWrapper")
    public native NSFileWrapper getFileWrapper();
    @ObjCPropertySetter(selector = "setFileWrapper:")
    public native void setFileWrapper(NSFileWrapper v);
    @ObjCProperty public NSFileWrapper fileWrapper;

    @ObjCPropertyGetter(selector = "image")
    public native UIImage getImage();
    @ObjCPropertySetter(selector = "setImage:")
    public native void setImage(UIImage v);
    @ObjCProperty public UIImage image;

    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCPropertySetter(selector = "setBounds:")
    public native void setBounds(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect bounds;
    
    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)contentData ofType:(NSString *)uti;", selector = "initWithData:ofType:")
    public native NSTextAttachment initWithData$ofType$(NSData contentData, NSString uti);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)imageForBounds:(CGRect)imageBounds textContainer:(NSTextContainer *)textContainer characterIndex:(NSUInteger)charIndex  NS_AVAILABLE_IOS(7_0);", selector = "imageForBounds:textContainer:characterIndex:")
    public native UIImage imageForBounds$textContainer$characterIndex$(@ObjCByValue CGRect imageBounds, NSTextContainer textContainer, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGRect)attachmentBoundsForTextContainer:(NSTextContainer *)textContainer proposedLineFragment:(CGRect)lineFrag glyphPosition:(CGPoint)position characterIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    public native @ObjCByValue CGRect attachmentBoundsForTextContainer$proposedLineFragment$glyphPosition$characterIndex$(NSTextContainer textContainer, @ObjCByValue CGRect lineFrag, @ObjCByValue CGPoint position, @NSUInteger long charIndex);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSTextAttachment initWithCoder$(NSCoder aDecoder);
}
