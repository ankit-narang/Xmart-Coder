package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccessibilityFocus 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)accessibilityElementDidBecomeFocused NS_AVAILABLE_IOS(4_0);", selector = "accessibilityElementDidBecomeFocused")
    void accessibilityElementDidBecomeFocused();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)accessibilityElementDidLoseFocus NS_AVAILABLE_IOS(4_0);", selector = "accessibilityElementDidLoseFocus")
    void accessibilityElementDidLoseFocus();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)accessibilityElementIsFocused NS_AVAILABLE_IOS(4_0);", selector = "accessibilityElementIsFocused")
    boolean accessibilityElementIsFocused();
}
