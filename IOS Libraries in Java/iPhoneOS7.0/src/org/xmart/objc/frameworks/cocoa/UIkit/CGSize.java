package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CGSize extends ObjCStructure  {
    
    public CGSize() {}
    public CGSize(float width, float height) {
        this.width = width;
        this.height = height;
    }
    
    @ObjCStructureMember(index=0, name="width") public float width;
    @ObjCStructureMember(index=1, name="height") public float height;
    
}
