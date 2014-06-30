package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPrintInfoOrientation {
    UIPrintInfoOrientationPortrait($UIKit.UIPrintInfoOrientationPortrait),
    UIPrintInfoOrientationLandscape($UIKit.UIPrintInfoOrientationLandscape);

    private final long value;

    private UIPrintInfoOrientation(long value) { this.value = value; }
}
