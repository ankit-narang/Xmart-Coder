package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSTextLayoutOrientation {
    NSTextLayoutOrientationHorizontal($UIKit.NSTextLayoutOrientationHorizontal),
    NSTextLayoutOrientationVertical($UIKit.NSTextLayoutOrientationVertical);

    private final long value;

    private NSTextLayoutOrientation(long value) { this.value = value; }
}
