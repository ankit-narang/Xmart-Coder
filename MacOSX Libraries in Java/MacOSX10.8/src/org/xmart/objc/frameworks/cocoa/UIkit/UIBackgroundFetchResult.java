package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBackgroundFetchResult {
    UIBackgroundFetchResultNewData($UIKit.UIBackgroundFetchResultNewData),
    UIBackgroundFetchResultNoData($UIKit.UIBackgroundFetchResultNoData),
    UIBackgroundFetchResultFailed($UIKit.UIBackgroundFetchResultFailed);

    private final long value;

    private UIBackgroundFetchResult(long value) { this.value = value; }
}
