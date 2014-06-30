package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSSwappedDouble extends ObjCStructure  {
    
    public NSSwappedDouble() {}
    public NSSwappedDouble(@Unsigned @LongLong long v) {
        this.v = v;
    }
    
    @ObjCStructureMember(index=0, name="v") public @Unsigned @LongLong long v;
    
}
