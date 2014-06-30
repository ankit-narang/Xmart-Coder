package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIKeyCommand extends NSObject implements NSCopying, NSSecureCoding {
    
    public UIKeyCommand() {}
    @ObjCPropertyGetter(selector = "input")
    public native NSString getInput();
    @ObjCProperty public NSString input;

    @ObjCPropertyGetter(selector = "modifierFlags")
    public native UIKeyModifierFlags getModifierFlags();
    @ObjCProperty public UIKeyModifierFlags modifierFlags;
    
    @ObjCMethodSign(sign = "+ (UIKeyCommand *)keyCommandWithInput:(NSString *)input modifierFlags:(UIKeyModifierFlags)modifierFlags action:(SEL)action;", selector = "keyCommandWithInput:modifierFlags:action:")
    public static native UIKeyCommand keyCommandWithInput$modifierFlags$action$(NSString input, UIKeyModifierFlags modifierFlags, ObjCSelector action);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIKeyCommand initWithCoder$(NSCoder aDecoder);
}
