package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSMutableAttributedString")
@ObjCFramework("UIKit")
public final class NSMutableAttributedStringUIKitCategories extends NSMutableAttributedString  {
    
    private NSMutableAttributedStringUIKitCategories() {}
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSMutableAttributedStringKitAdditions", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (void)fixAttributesInRange:(NSRange)range NS_AVAILABLE_IOS(7_0);", selector = "fixAttributesInRange:")
    public static native void fixAttributesInRange$(@ObjCByValue NSRange range);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSMutableAttributedStringDocumentFormats", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (BOOL)readFromFileURL:(NSURL *)url options:(NSDictionary *)opts documentAttributes:(NSDictionary **)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "readFromFileURL:options:documentAttributes:error:")
    public static native boolean readFromFileURL$options$documentAttributes$error$(NSURL url, NSDictionary opts, ObjCPtr<NSDictionary> dict, NSError[] error);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSMutableAttributedStringDocumentFormats", catownername = "NSMutableAttributedString")
    @ObjCMethodSign(sign = "- (BOOL)readFromData:(NSData *)data options:(NSDictionary *)opts documentAttributes:(NSDictionary **)dict error:(NSError **)error NS_AVAILABLE_IOS(7_0);", selector = "readFromData:options:documentAttributes:error:")
    public static native boolean readFromData$options$documentAttributes$error$(NSData data, NSDictionary opts, ObjCPtr<NSDictionary> dict, NSError[] error);
}
