package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIModalTransitionStyle {
    UIModalTransitionStyleCoverVertical($UIKit.UIModalTransitionStyleCoverVertical),
    UIModalTransitionStyleFlipHorizontal($UIKit.UIModalTransitionStyleFlipHorizontal),
    UIModalTransitionStyleCrossDissolve($UIKit.UIModalTransitionStyleCrossDissolve),
    UIModalTransitionStylePartialCurl($UIKit.UIModalTransitionStylePartialCurl);

    private final long value;

    private UIModalTransitionStyle(long value) { this.value = value; }
}
