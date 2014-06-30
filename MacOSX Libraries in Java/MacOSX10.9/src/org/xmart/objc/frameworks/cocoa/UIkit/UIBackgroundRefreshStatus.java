package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBackgroundRefreshStatus {
    UIBackgroundRefreshStatusRestricted($UIKit.UIBackgroundRefreshStatusRestricted),
    UIBackgroundRefreshStatusDenied($UIKit.UIBackgroundRefreshStatusDenied),
    UIBackgroundRefreshStatusAvailable($UIKit.UIBackgroundRefreshStatusAvailable);

    private final long value;

    private UIBackgroundRefreshStatus(long value) { this.value = value; }
}
