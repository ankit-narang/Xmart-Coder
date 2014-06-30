package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIMarkupTextPrintFormatter extends UIPrintFormatter  {
    
    public UIMarkupTextPrintFormatter() {}
    @ObjCPropertyGetter(selector = "markupText")
    public native NSString getMarkupText();
    @ObjCPropertySetter(selector = "setMarkupText:")
    public native void setMarkupText(NSString v);
    @ObjCProperty public NSString markupText;
    
    @ObjCMethodSign(sign = "- (id)initWithMarkupText:(NSString *)markupText;", selector = "initWithMarkupText:")
    public native UIMarkupTextPrintFormatter initWithMarkupText$(NSString markupText);
}
