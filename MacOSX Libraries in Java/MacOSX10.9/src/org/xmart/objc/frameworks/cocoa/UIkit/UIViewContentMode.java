package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewContentMode {
    UIViewContentModeScaleToFill($UIKit.UIViewContentModeScaleToFill),
    UIViewContentModeScaleAspectFit($UIKit.UIViewContentModeScaleAspectFit),
    UIViewContentModeScaleAspectFill($UIKit.UIViewContentModeScaleAspectFill),
    UIViewContentModeRedraw($UIKit.UIViewContentModeRedraw),
    UIViewContentModeCenter($UIKit.UIViewContentModeCenter),
    UIViewContentModeTop($UIKit.UIViewContentModeTop),
    UIViewContentModeBottom($UIKit.UIViewContentModeBottom),
    UIViewContentModeLeft($UIKit.UIViewContentModeLeft),
    UIViewContentModeRight($UIKit.UIViewContentModeRight),
    UIViewContentModeTopLeft($UIKit.UIViewContentModeTopLeft),
    UIViewContentModeTopRight($UIKit.UIViewContentModeTopRight),
    UIViewContentModeBottomLeft($UIKit.UIViewContentModeBottomLeft),
    UIViewContentModeBottomRight($UIKit.UIViewContentModeBottomRight);

    private final long value;

    private UIViewContentMode(long value) { this.value = value; }
}
