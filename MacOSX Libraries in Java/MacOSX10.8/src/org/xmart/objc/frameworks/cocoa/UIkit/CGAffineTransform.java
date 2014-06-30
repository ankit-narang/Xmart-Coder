package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CGAffineTransform extends ObjCStructure  {
    
    public CGAffineTransform() {}
    public CGAffineTransform(float a, float b, float c, float d, float tx, float ty) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.tx = tx;
        this.ty = ty;
    }
    
    @ObjCStructureMember(index=0, name="a") public float a;
    @ObjCStructureMember(index=1, name="b") public float b;
    @ObjCStructureMember(index=2, name="c") public float c;
    @ObjCStructureMember(index=3, name="d") public float d;
    @ObjCStructureMember(index=4, name="tx") public float tx;
    @ObjCStructureMember(index=5, name="ty") public float ty;
    
}
