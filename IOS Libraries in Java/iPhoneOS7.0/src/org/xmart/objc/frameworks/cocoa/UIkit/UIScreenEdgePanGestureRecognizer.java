package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIScreenEdgePanGestureRecognizer extends UIPanGestureRecognizer  {
    
    public UIScreenEdgePanGestureRecognizer() {}
    @ObjCPropertyGetter(selector = "edges")
    public native UIRectEdge getEdges();
    @ObjCPropertySetter(selector = "setEdges:")
    public native void setEdges(UIRectEdge v);
    @ObjCProperty public UIRectEdge edges;
    
    
}
