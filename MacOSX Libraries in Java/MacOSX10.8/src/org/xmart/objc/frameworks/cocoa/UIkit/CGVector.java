package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CGVector extends ObjCStructure  {
    
    public CGVector() {}
    public CGVector(float dx, float dy) {
        this.dx = dx;
        this.dy = dy;
    }
    
    @ObjCStructureMember(index=0, name="dx") public float dx;
    @ObjCStructureMember(index=1, name="dy") public float dy;
    
}
