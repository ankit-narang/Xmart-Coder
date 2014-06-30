package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImageResizingMode {
    UIImageResizingModeTile($UIKit.UIImageResizingModeTile),
    UIImageResizingModeStretch($UIKit.UIImageResizingModeStretch);

    private final long value;

    private UIImageResizingMode(long value) { this.value = value; }
}
