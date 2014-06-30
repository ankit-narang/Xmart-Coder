package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface NSTextAttachmentContainer 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIImage *)imageForBounds:(CGRect)imageBounds textContainer:(NSTextContainer *)textContainer characterIndex:(NSUInteger)charIndex  NS_AVAILABLE_IOS(7_0);", selector = "imageForBounds:textContainer:characterIndex:")
    UIImage imageForBounds$textContainer$characterIndex$(@ObjCByValue CGRect imageBounds, NSTextContainer textContainer, @NSUInteger long charIndex);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGRect)attachmentBoundsForTextContainer:(NSTextContainer *)textContainer proposedLineFragment:(CGRect)lineFrag glyphPosition:(CGPoint)position characterIndex:(NSUInteger)charIndex NS_AVAILABLE_IOS(7_0);", selector = "attachmentBoundsForTextContainer:proposedLineFragment:glyphPosition:characterIndex:")
    @ObjCByValue CGRect attachmentBoundsForTextContainer$proposedLineFragment$glyphPosition$characterIndex$(NSTextContainer textContainer, @ObjCByValue CGRect lineFrag, @ObjCByValue CGPoint position, @NSUInteger long charIndex);
}
