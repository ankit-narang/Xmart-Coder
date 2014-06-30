package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIScreenMode extends NSObject  {
    
    public UIScreenMode() {}
    @ObjCPropertyGetter(selector = "size")
    public native @ObjCByValue CGSize getSize();
    @ObjCProperty public @ObjCByValue CGSize size;

    @ObjCPropertyGetter(selector = "pixelAspectRatio")
    public native float getPixelAspectRatio();
    @ObjCProperty public float pixelAspectRatio;
    
    
}
