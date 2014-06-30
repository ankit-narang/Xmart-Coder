package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPageViewControllerSpineLocation {
    UIPageViewControllerSpineLocationNone($UIKit.UIPageViewControllerSpineLocationNone),
    UIPageViewControllerSpineLocationMin($UIKit.UIPageViewControllerSpineLocationMin),
    UIPageViewControllerSpineLocationMid($UIKit.UIPageViewControllerSpineLocationMid),
    UIPageViewControllerSpineLocationMax($UIKit.UIPageViewControllerSpineLocationMax);

    private final long value;

    private UIPageViewControllerSpineLocation(long value) { this.value = value; }
}
