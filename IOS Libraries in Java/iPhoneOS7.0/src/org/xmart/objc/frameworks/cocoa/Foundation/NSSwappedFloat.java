package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSSwappedFloat extends ObjCStructure  {
    
    public NSSwappedFloat() {}
    public NSSwappedFloat(@Unsigned int v) {
        this.v = v;
    }
    
    @ObjCStructureMember(index=0, name="v") public @Unsigned int v;
    
}
