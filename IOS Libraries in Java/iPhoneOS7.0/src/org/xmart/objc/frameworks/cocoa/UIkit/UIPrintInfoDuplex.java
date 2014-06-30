package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPrintInfoDuplex {
    UIPrintInfoDuplexNone($UIKit.UIPrintInfoDuplexNone),
    UIPrintInfoDuplexLongEdge($UIKit.UIPrintInfoDuplexLongEdge),
    UIPrintInfoDuplexShortEdge($UIKit.UIPrintInfoDuplexShortEdge);

    private final long value;

    private UIPrintInfoDuplex(long value) { this.value = value; }
}
