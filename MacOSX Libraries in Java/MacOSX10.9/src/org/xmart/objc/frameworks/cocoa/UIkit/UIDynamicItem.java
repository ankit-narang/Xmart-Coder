package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIDynamicItem 
    extends NSObjectProtocol {

    
    @ObjCPropertyGetter(selector = "center")
    @ObjCByValue CGPoint getCenter();
    @ObjCPropertySetter(selector = "setCenter:")
    void setCenter(@ObjCByValue CGPoint v);
    @ObjCPropertyGetter(selector = "bounds")
    @ObjCByValue CGRect getBounds();
    @ObjCPropertyGetter(selector = "transform")
    @ObjCByValue CGAffineTransform getTransform();
    @ObjCPropertySetter(selector = "setTransform:")
    void setTransform(@ObjCByValue CGAffineTransform v);
    
}
