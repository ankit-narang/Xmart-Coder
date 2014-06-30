package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextInputMode extends NSObject implements NSSecureCoding {
    
    public UITextInputMode() {}
    @ObjCPropertyGetter(selector = "primaryLanguage")
    public native NSString getPrimaryLanguage();
    @ObjCProperty public NSString primaryLanguage;
    
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "+ (UITextInputMode *)currentInputMode NS_DEPRECATED_IOS(4_2, 7_0);", selector = "currentInputMode")
    public static native UITextInputMode currentInputMode();

    @ObjCMethodSign(sign = "+ (NSArray *)activeInputModes;", selector = "activeInputModes")
    public static native NSArray activeInputModes();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UITextInputMode initWithCoder$(NSCoder aDecoder);
}
