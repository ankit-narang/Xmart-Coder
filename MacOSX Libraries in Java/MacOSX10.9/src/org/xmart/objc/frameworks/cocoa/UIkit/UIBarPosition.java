package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBarPosition {
    UIBarPositionAny($UIKit.UIBarPositionAny),
    UIBarPositionBottom($UIKit.UIBarPositionBottom),
    UIBarPositionTop($UIKit.UIBarPositionTop),
    UIBarPositionTopAttached($UIKit.UIBarPositionTopAttached);

    private final long value;

    private UIBarPosition(long value) { this.value = value; }
}
