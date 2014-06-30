package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccessibilityAction 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)accessibilityActivate NS_AVAILABLE_IOS(7_0);", selector = "accessibilityActivate")
    boolean accessibilityActivate();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)accessibilityIncrement NS_AVAILABLE_IOS(4_0);", selector = "accessibilityIncrement")
    void accessibilityIncrement();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)accessibilityDecrement NS_AVAILABLE_IOS(4_0);", selector = "accessibilityDecrement")
    void accessibilityDecrement();

    /**
     * @since Available in iOS 4.2 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)accessibilityScroll:(UIAccessibilityScrollDirection)direction NS_AVAILABLE_IOS(4_2);", selector = "accessibilityScroll:")
    boolean accessibilityScroll$(UIAccessibilityScrollDirection direction);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)accessibilityPerformEscape NS_AVAILABLE_IOS(5_0);", selector = "accessibilityPerformEscape")
    boolean accessibilityPerformEscape();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)accessibilityPerformMagicTap NS_AVAILABLE_IOS(6_0);", selector = "accessibilityPerformMagicTap")
    boolean accessibilityPerformMagicTap();
}
