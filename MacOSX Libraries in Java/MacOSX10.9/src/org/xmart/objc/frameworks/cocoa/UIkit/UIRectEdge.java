package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIRectEdge {
    UIRectEdgeNone($UIKit.UIRectEdgeNone),
    UIRectEdgeTop($UIKit.UIRectEdgeTop),
    UIRectEdgeLeft($UIKit.UIRectEdgeLeft),
    UIRectEdgeBottom($UIKit.UIRectEdgeBottom),
    UIRectEdgeRight($UIKit.UIRectEdgeRight),
    UIRectEdgeAll($UIKit.UIRectEdgeAll);

    private final long value;

    private UIRectEdge(long value) { this.value = value; }
}
