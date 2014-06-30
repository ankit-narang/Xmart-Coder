package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBarMetrics {
    UIBarMetricsDefault($UIKit.UIBarMetricsDefault),
    UIBarMetricsLandscapePhone($UIKit.UIBarMetricsLandscapePhone),
    UIBarMetricsDefaultPrompt($UIKit.UIBarMetricsDefaultPrompt),
    UIBarMetricsLandscapePhonePrompt($UIKit.UIBarMetricsLandscapePhonePrompt);

    private final long value;

    private UIBarMetrics(long value) { this.value = value; }
}
