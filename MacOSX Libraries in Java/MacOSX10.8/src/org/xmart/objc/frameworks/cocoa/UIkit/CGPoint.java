package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CGPoint extends ObjCStructure  {
    
    public CGPoint() {}
    public CGPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    @ObjCStructureMember(index=0, name="x") public float x;
    @ObjCStructureMember(index=1, name="y") public float y;
    
}
