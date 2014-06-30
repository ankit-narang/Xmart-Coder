package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPageViewControllerNavigationDirection {
    UIPageViewControllerNavigationDirectionForward($UIKit.UIPageViewControllerNavigationDirectionForward),
    UIPageViewControllerNavigationDirectionReverse($UIKit.UIPageViewControllerNavigationDirectionReverse);

    private final long value;

    private UIPageViewControllerNavigationDirection(long value) { this.value = value; }
}
