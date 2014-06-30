package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextRange extends NSObject  {
    
    public UITextRange() {}
    @ObjCPropertyGetter(selector = "isEmpty")
    public native boolean isEmpty();
    @ObjCProperty public boolean empty;

    @ObjCPropertyGetter(selector = "start")
    public native UITextPosition getStart();
    @ObjCProperty public UITextPosition start;

    @ObjCPropertyGetter(selector = "end")
    public native UITextPosition getEnd();
    @ObjCProperty public UITextPosition end;
    
    
}
