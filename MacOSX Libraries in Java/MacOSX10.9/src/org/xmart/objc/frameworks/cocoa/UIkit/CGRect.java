package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class CGRect extends ObjCStructure  {
    
    public CGRect() {}
    public CGRect(CGPoint origin, CGSize size) {
        this.origin = origin;
        this.size = size;
    }
    
    @ObjCStructureMember(index=0, name="origin") public @ObjCByValue CGPoint origin;
    @ObjCStructureMember(index=1, name="size") public @ObjCByValue CGSize size;
    
}
