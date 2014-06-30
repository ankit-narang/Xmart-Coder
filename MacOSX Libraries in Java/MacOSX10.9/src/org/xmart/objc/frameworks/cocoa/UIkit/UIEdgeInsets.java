package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIEdgeInsets extends ObjCStructure  {
    
    public UIEdgeInsets() {}
    public UIEdgeInsets(float top, float left, float bottom, float right) {
        this.top = top;
        this.left = left;
        this.bottom = bottom;
        this.right = right;
    }
    
    @ObjCStructureMember(index=0, name="top") public float top;
    @ObjCStructureMember(index=1, name="left") public float left;
    @ObjCStructureMember(index=2, name="bottom") public float bottom;
    @ObjCStructureMember(index=3, name="right") public float right;
    
}
