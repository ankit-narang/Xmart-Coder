package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIMenuItem extends NSObject  {
    
    public UIMenuItem() {}
    @ObjCPropertyGetter(selector = "title")
    public native NSString getTitle();
    @ObjCPropertySetter(selector = "setTitle:")
    public native void setTitle(NSString v);
    @ObjCProperty public NSString title;

    @ObjCPropertyGetter(selector = "action")
    public native ObjCSelector getAction();
    @ObjCPropertySetter(selector = "setAction:")
    public native void setAction(ObjCSelector v);
    @ObjCProperty public ObjCSelector action;
    
    @ObjCMethodSign(sign = "- (id)initWithTitle:(NSString *)title action:(SEL)action;", selector = "initWithTitle:action:")
    public native UIMenuItem initWithTitle$action$(NSString title, ObjCSelector action);
}
