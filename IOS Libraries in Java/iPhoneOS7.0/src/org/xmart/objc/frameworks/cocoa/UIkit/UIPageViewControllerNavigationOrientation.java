package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPageViewControllerNavigationOrientation {
    UIPageViewControllerNavigationOrientationHorizontal($UIKit.UIPageViewControllerNavigationOrientationHorizontal),
    UIPageViewControllerNavigationOrientationVertical($UIKit.UIPageViewControllerNavigationOrientationVertical);

    private final long value;

    private UIPageViewControllerNavigationOrientation(long value) { this.value = value; }
}
