package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface NSTextStorageDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)textStorage:(NSTextStorage *)textStorage willProcessEditing:(NSTextStorageEditActions)editedMask range:(NSRange)editedRange changeInLength:(NSInteger)delta NS_AVAILABLE_IOS(7_0);", selector = "textStorage:willProcessEditing:range:changeInLength:")
    void textStorage$willProcessEditing$range$changeInLength$(NSTextStorage textStorage, NSTextStorageEditActions editedMask, @ObjCByValue NSRange editedRange, @NSInteger long delta);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)textStorage:(NSTextStorage *)textStorage didProcessEditing:(NSTextStorageEditActions)editedMask range:(NSRange)editedRange changeInLength:(NSInteger)delta NS_AVAILABLE_IOS(7_0);", selector = "textStorage:didProcessEditing:range:changeInLength:")
    void textStorage$didProcessEditing$range$changeInLength$(NSTextStorage textStorage, NSTextStorageEditActions editedMask, @ObjCByValue NSRange editedRange, @NSInteger long delta);
}
