package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIAccessibilityElement extends NSObject implements UIAccessibilityIdentification {
    
    public UIAccessibilityElement() {}
    @ObjCPropertyGetter(selector = "accessibilityContainer")
    public native NSObject getAccessibilityContainer();
    @ObjCPropertySetter(selector = "setAccessibilityContainer:", strongRef = true)
    public native void setAccessibilityContainer(NSObject v);
    @ObjCProperty public NSObject accessibilityContainer;

    @ObjCPropertyGetter(selector = "isAccessibilityElement")
    public native boolean isIsAccessibilityElement();
    @ObjCPropertySetter(selector = "setIsAccessibilityElement:")
    public native void setIsAccessibilityElement(boolean v);
    @ObjCProperty public boolean isAccessibilityElement;

    @ObjCPropertyGetter(selector = "accessibilityLabel")
    public native NSString getAccessibilityLabel();
    @ObjCPropertySetter(selector = "setAccessibilityLabel:")
    public native void setAccessibilityLabel(NSString v);
    @ObjCProperty public NSString accessibilityLabel;

    @ObjCPropertyGetter(selector = "accessibilityHint")
    public native NSString getAccessibilityHint();
    @ObjCPropertySetter(selector = "setAccessibilityHint:")
    public native void setAccessibilityHint(NSString v);
    @ObjCProperty public NSString accessibilityHint;

    @ObjCPropertyGetter(selector = "accessibilityValue")
    public native NSString getAccessibilityValue();
    @ObjCPropertySetter(selector = "setAccessibilityValue:")
    public native void setAccessibilityValue(NSString v);
    @ObjCProperty public NSString accessibilityValue;

    @ObjCPropertyGetter(selector = "accessibilityFrame")
    public native @ObjCByValue CGRect getAccessibilityFrame();
    @ObjCPropertySetter(selector = "setAccessibilityFrame:")
    public native void setAccessibilityFrame(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect accessibilityFrame;

    @ObjCPropertyGetter(selector = "accessibilityTraits")
    public native @Unsigned @LongLong long getAccessibilityTraits();
    @ObjCPropertySetter(selector = "setAccessibilityTraits:")
    public native void setAccessibilityTraits(@Unsigned @LongLong long v);
    @ObjCProperty public @Unsigned @LongLong long accessibilityTraits;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityIdentifier")
    public native NSString getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityIdentifier:")
    public native void setAccessibilityIdentifier(NSString v);
    @ObjCProperty public NSString accessibilityIdentifier;
    
    @ObjCMethodSign(sign = "- (id)initWithAccessibilityContainer:(id)container;", selector = "initWithAccessibilityContainer:")
    public native UIAccessibilityElement initWithAccessibilityContainer$(NSObject container);
}
