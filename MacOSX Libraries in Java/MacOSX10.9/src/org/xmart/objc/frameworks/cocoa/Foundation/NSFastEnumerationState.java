package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFastEnumerationState extends ObjCStructure  {
    
    public NSFastEnumerationState() {}
    public NSFastEnumerationState(@Unsigned long state, NSObject itemsPtr, @Unsigned long[] mutationsPtr, @Unsigned long[] extra) {
        this.state = state;
        this.itemsPtr = itemsPtr;
        this.mutationsPtr = mutationsPtr;
        this.extra = extra;
    }
    
    @ObjCStructureMember(index=0, name="state") public @Unsigned long state;
    @ObjCStructureMember(index=1, name="itemsPtr") public NSObject itemsPtr;
    @ObjCStructureMember(index=2, name="mutationsPtr") public @Unsigned long[] mutationsPtr;
    @ObjCStructureMember(index=3, name="extra") public @ObjCArray("5") @Unsigned long[] extra;
    
}
