package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccessibilityIdentification 
    extends NSObjectProtocol {

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "accessibilityIdentifier")
    NSString getAccessibilityIdentifier();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAccessibilityIdentifier:")
    void setAccessibilityIdentifier(NSString v);
    
}
