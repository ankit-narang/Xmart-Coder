package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIOffset extends ObjCStructure  {
    
    public UIOffset() {}
    public UIOffset(float horizontal, float vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }
    
    @ObjCStructureMember(index=0, name="horizontal") public float horizontal;
    @ObjCStructureMember(index=1, name="vertical") public float vertical;
    
}
