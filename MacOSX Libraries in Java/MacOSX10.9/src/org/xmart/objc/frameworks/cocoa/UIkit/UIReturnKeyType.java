package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIReturnKeyType {
    UIReturnKeyDefault($UIKit.UIReturnKeyDefault),
    UIReturnKeyGo($UIKit.UIReturnKeyGo),
    UIReturnKeyGoogle($UIKit.UIReturnKeyGoogle),
    UIReturnKeyJoin($UIKit.UIReturnKeyJoin),
    UIReturnKeyNext($UIKit.UIReturnKeyNext),
    UIReturnKeyRoute($UIKit.UIReturnKeyRoute),
    UIReturnKeySearch($UIKit.UIReturnKeySearch),
    UIReturnKeySend($UIKit.UIReturnKeySend),
    UIReturnKeyYahoo($UIKit.UIReturnKeyYahoo),
    UIReturnKeyDone($UIKit.UIReturnKeyDone),
    UIReturnKeyEmergencyCall($UIKit.UIReturnKeyEmergencyCall);

    private final long value;

    private UIReturnKeyType(long value) { this.value = value; }
}
