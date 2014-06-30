package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIGuidedAccessRestrictionState {
    UIGuidedAccessRestrictionStateAllow($UIKit.UIGuidedAccessRestrictionStateAllow),
    UIGuidedAccessRestrictionStateDeny($UIKit.UIGuidedAccessRestrictionStateDeny);

    private final long value;

    private UIGuidedAccessRestrictionState(long value) { this.value = value; }
}
