package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIStatusBarAnimation {
    UIStatusBarAnimationNone($UIKit.UIStatusBarAnimationNone),
    UIStatusBarAnimationFade($UIKit.UIStatusBarAnimationFade),
    UIStatusBarAnimationSlide($UIKit.UIStatusBarAnimationSlide);

    private final long value;

    private UIStatusBarAnimation(long value) { this.value = value; }
}
