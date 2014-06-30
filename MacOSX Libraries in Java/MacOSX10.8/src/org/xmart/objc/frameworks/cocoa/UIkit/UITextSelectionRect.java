package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextSelectionRect extends NSObject  {
    
    public UITextSelectionRect() {}
    @ObjCPropertyGetter(selector = "rect")
    public native @ObjCByValue CGRect getRect();
    @ObjCProperty public @ObjCByValue CGRect rect;

    @ObjCPropertyGetter(selector = "writingDirection")
    public native UITextWritingDirection getWritingDirection();
    @ObjCProperty public UITextWritingDirection writingDirection;

    @ObjCPropertyGetter(selector = "containsStart")
    public native boolean isContainsStart();
    @ObjCProperty public boolean containsStart;

    @ObjCPropertyGetter(selector = "containsEnd")
    public native boolean isContainsEnd();
    @ObjCProperty public boolean containsEnd;

    @ObjCPropertyGetter(selector = "isVertical")
    public native boolean isIsVertical();
    @ObjCProperty public boolean isVertical;
    
    
}
