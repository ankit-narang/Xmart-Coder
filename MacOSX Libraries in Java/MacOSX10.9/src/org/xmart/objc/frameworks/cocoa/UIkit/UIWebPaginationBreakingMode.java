package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIWebPaginationBreakingMode {
    UIWebPaginationBreakingModePage($UIKit.UIWebPaginationBreakingModePage),
    UIWebPaginationBreakingModeColumn($UIKit.UIWebPaginationBreakingModeColumn);

    private final long value;

    private UIWebPaginationBreakingMode(long value) { this.value = value; }
}
