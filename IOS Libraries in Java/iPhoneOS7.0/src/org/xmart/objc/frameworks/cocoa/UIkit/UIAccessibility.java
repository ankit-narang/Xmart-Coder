package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccessibility 
    extends NSObjectProtocol {

    
    @ObjCPropertyGetter(selector = "isAccessibilityElement")
    boolean isIsAccessibilityElement();
    @ObjCPropertySetter(selector = "setIsAccessibilityElement:")
    void setIsAccessibilityElement(boolean v);
    @ObjCPropertyGetter(selector = "accessibilityLabel")
    NSString getAccessibilityLabel();
    @ObjCPropertySetter(selector = "setAccessibilityLabel:")
    void setAccessibilityLabel(NSString v);
    @ObjCPropertyGetter(selector = "accessibilityHint")
    NSString getAccessibilityHint();
    @ObjCPropertySetter(selector = "setAccessibilityHint:")
    void setAccessibilityHint(NSString v);
    @ObjCPropertyGetter(selector = "accessibilityValue")
    NSString getAccessibilityValue();
    @ObjCPropertySetter(selector = "setAccessibilityValue:")
    void setAccessibilityValue(NSString v);
    @ObjCPropertyGetter(selector = "accessibilityTraits")
    @Unsigned @LongLong long getAccessibilityTraits();
    @ObjCPropertySetter(selector = "setAccessibilityTraits:")
    void setAccessibilityTraits(@Unsigned @LongLong long v);
    @ObjCPropertyGetter(selector = "accessibilityFrame")
    @ObjCByValue CGRect getAccessibilityFrame();
    @ObjCPropertySetter(selector = "setAccessibilityFrame:")
    void setAccessibilityFrame(@ObjCByValue CGRect v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityPath")
    UIBezierPath getAccessibilityPath();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityPath:")
    void setAccessibilityPath(UIBezierPath v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityActivationPoint")
    @ObjCByValue CGPoint getAccessibilityActivationPoint();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityActivationPoint:")
    void setAccessibilityActivationPoint(@ObjCByValue CGPoint v);
    @ObjCPropertyGetter(selector = "accessibilityLanguage")
    NSString getAccessibilityLanguage();
    @ObjCPropertySetter(selector = "setAccessibilityLanguage:")
    void setAccessibilityLanguage(NSString v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityElementsHidden")
    boolean isAccessibilityElementsHidden();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityElementsHidden:")
    void setAccessibilityElementsHidden(boolean v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityViewIsModal")
    boolean isAccessibilityViewIsModal();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityViewIsModal:")
    void setAccessibilityViewIsModal(boolean v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "shouldGroupAccessibilityChildren")
    boolean isShouldGroupAccessibilityChildren();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setShouldGroupAccessibilityChildren:")
    void setShouldGroupAccessibilityChildren(boolean v);
    
}
