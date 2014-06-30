package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSRange extends ObjCStructure  {
    
    public NSRange() {}
    public NSRange(@NSUInteger long location, @NSUInteger long length) {
        this.location = location;
        this.length = length;
    }
    
    @ObjCStructureMember(index=0, name="location") public @NSUInteger long location;
    @ObjCStructureMember(index=1, name="length") public @NSUInteger long length;
    
}
