package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITabBarItemPositioning {
    UITabBarItemPositioningAutomatic($UIKit.UITabBarItemPositioningAutomatic),
    UITabBarItemPositioningFill($UIKit.UITabBarItemPositioningFill),
    UITabBarItemPositioningCentered($UIKit.UITabBarItemPositioningCentered);

    private final long value;

    private UITabBarItemPositioning(long value) { this.value = value; }
}
