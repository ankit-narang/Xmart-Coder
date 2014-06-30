package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIViewPrintFormatter extends UIPrintFormatter  {
    
    public UIViewPrintFormatter() {}
    @ObjCPropertyGetter(selector = "view")
    public native UIView getView();
    @ObjCProperty public UIView view;
    
    
}
