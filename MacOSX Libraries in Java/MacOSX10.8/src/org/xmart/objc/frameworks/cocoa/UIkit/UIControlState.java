package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIControlState {
    UIControlStateNormal($UIKit.UIControlStateNormal),
    UIControlStateHighlighted($UIKit.UIControlStateHighlighted),
    UIControlStateDisabled($UIKit.UIControlStateDisabled),
    UIControlStateSelected($UIKit.UIControlStateSelected),
    UIControlStateApplication($UIKit.UIControlStateApplication),
    UIControlStateReserved($UIKit.UIControlStateReserved);

    private final long value;

    private UIControlState(long value) { this.value = value; }
}
