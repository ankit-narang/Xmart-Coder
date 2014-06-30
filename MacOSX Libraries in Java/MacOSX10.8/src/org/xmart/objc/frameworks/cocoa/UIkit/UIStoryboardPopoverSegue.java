package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIStoryboardPopoverSegue extends UIStoryboardSegue  {
    
    public UIStoryboardPopoverSegue() {}
    @ObjCPropertyGetter(selector = "popoverController")
    public native UIPopoverController getPopoverController();
    @ObjCProperty public UIPopoverController popoverController;
    
    
}
