package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImageRenderingMode {
    UIImageRenderingModeAutomatic($UIKit.UIImageRenderingModeAutomatic),
    UIImageRenderingModeAlwaysOriginal($UIKit.UIImageRenderingModeAlwaysOriginal),
    UIImageRenderingModeAlwaysTemplate($UIKit.UIImageRenderingModeAlwaysTemplate);

    private final long value;

    private UIImageRenderingMode(long value) { this.value = value; }
}
