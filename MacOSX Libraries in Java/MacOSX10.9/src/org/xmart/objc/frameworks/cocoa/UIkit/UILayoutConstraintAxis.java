package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UILayoutConstraintAxis {
    UILayoutConstraintAxisHorizontal($UIKit.UILayoutConstraintAxisHorizontal),
    UILayoutConstraintAxisVertical($UIKit.UILayoutConstraintAxisVertical);

    private final long value;

    private UILayoutConstraintAxis(long value) { this.value = value; }
}
