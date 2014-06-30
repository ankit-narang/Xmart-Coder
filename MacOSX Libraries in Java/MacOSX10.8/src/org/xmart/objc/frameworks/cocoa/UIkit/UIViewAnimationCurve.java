package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewAnimationCurve {
    UIViewAnimationCurveEaseInOut($UIKit.UIViewAnimationCurveEaseInOut),
    UIViewAnimationCurveEaseIn($UIKit.UIViewAnimationCurveEaseIn),
    UIViewAnimationCurveEaseOut($UIKit.UIViewAnimationCurveEaseOut),
    UIViewAnimationCurveLinear($UIKit.UIViewAnimationCurveLinear);

    private final long value;

    private UIViewAnimationCurve(long value) { this.value = value; }
}
