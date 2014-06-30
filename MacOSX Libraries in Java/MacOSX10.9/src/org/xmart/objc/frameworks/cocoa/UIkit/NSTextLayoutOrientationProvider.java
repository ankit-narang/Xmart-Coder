package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface NSTextLayoutOrientationProvider 
    extends NSObjectProtocol {

    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "layoutOrientation")
    NSTextLayoutOrientation getLayoutOrientation();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setLayoutOrientation:")
    void setLayoutOrientation(NSTextLayoutOrientation v);
    
}
