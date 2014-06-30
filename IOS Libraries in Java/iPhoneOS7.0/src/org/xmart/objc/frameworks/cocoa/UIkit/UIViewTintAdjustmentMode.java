package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewTintAdjustmentMode {
    UIViewTintAdjustmentModeAutomatic($UIKit.UIViewTintAdjustmentModeAutomatic),
    UIViewTintAdjustmentModeNormal($UIKit.UIViewTintAdjustmentModeNormal),
    UIViewTintAdjustmentModeDimmed($UIKit.UIViewTintAdjustmentModeDimmed);

    private final long value;

    private UIViewTintAdjustmentMode(long value) { this.value = value; }
}
