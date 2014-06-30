package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIAccessibilityZoomType {
    UIAccessibilityZoomTypeInsertionPoint($UIKit.UIAccessibilityZoomTypeInsertionPoint);

    private final long value;

    private UIAccessibilityZoomType(long value) { this.value = value; }
}
