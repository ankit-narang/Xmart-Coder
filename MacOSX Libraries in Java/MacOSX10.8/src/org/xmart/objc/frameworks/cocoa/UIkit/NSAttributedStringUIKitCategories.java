package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSAttributedString")
@ObjCFramework("UIKit")
public final class NSAttributedStringUIKitCategories extends NSAttributedString  {
    
    private NSAttributedStringUIKitCategories() {}
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSAttributedStringDocumentFormats", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)initWithFileURL:(NSURL *)url options:(NSDictionary *)options documentAttributes:(NSDictionary **)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "initWithFileURL:options:documentAttributes:error:")
    public static native NSObject initWithFileURL$options$documentAttributes$error$(NSURL url, NSDictionary options, ObjCPtr<NSDictionary> dict, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSAttributedStringDocumentFormats", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (id)initWithData:(NSData *)data options:(NSDictionary *)options documentAttributes:(NSDictionary **)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "initWithData:options:documentAttributes:error:")
    public static native NSObject initWithData$options$documentAttributes$error$(NSData data, NSDictionary options, ObjCPtr<NSDictionary> dict, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSAttributedStringDocumentFormats", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (NSData *)dataFromRange:(NSRange)range documentAttributes:(NSDictionary *)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "dataFromRange:documentAttributes:error:")
    public static native NSData dataFromRange$documentAttributes$error$(@ObjCByValue NSRange range, NSDictionary dict, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSAttributedStringDocumentFormats", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (NSFileWrapper *)fileWrapperFromRange:(NSRange)range documentAttributes:(NSDictionary *)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "fileWrapperFromRange:documentAttributes:error:")
    public static native NSFileWrapper fileWrapperFromRange$documentAttributes$error$(@ObjCByValue NSRange range, NSDictionary dict, NSError[] error);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (CGSize)size NS_AVAILABLE_IOS(6_0);", selector = "size")
    public static native @ObjCByValue CGSize size();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (void)drawAtPoint:(CGPoint)point NS_AVAILABLE_IOS(6_0);", selector = "drawAtPoint:")
    public static native void drawAtPoint$(@ObjCByValue CGPoint point);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSStringDrawing", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (void)drawInRect:(CGRect)rect NS_AVAILABLE_IOS(6_0);", selector = "drawInRect:")
    public static native void drawInRect$(@ObjCByValue CGRect rect);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedStringDrawing", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (void)drawWithRect:(CGRect)rect options:(NSStringDrawingOptions)options context:(NSStringDrawingContext *)context NS_AVAILABLE_IOS(6_0);", selector = "drawWithRect:options:context:")
    public static native void drawWithRect$options$context$(@ObjCByValue CGRect rect, NSStringDrawingOptions options, NSStringDrawingContext context);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSExtendedStringDrawing", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "- (CGRect)boundingRectWithSize:(CGSize)size options:(NSStringDrawingOptions)options context:(NSStringDrawingContext *)context NS_AVAILABLE_IOS(6_0);", selector = "boundingRectWithSize:options:context:")
    public static native @ObjCByValue CGRect boundingRectWithSize$options$context$(@ObjCByValue CGSize size, NSStringDrawingOptions options, NSStringDrawingContext context);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSAttributedStringAttachmentConveniences", catownername = "NSAttributedString")
    @ObjCMethodSign(sign = "+ (NSAttributedString *)attributedStringWithAttachment:(NSTextAttachment *)attachment NS_AVAILABLE_IOS(7_0);", selector = "attributedStringWithAttachment:")
    public static native NSAttributedString attributedStringWithAttachment$(NSTextAttachment attachment);
}
