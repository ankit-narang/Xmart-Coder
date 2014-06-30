package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UISwipeGestureRecognizerDirection {
    UISwipeGestureRecognizerDirectionRight($UIKit.UISwipeGestureRecognizerDirectionRight),
    UISwipeGestureRecognizerDirectionLeft($UIKit.UISwipeGestureRecognizerDirectionLeft),
    UISwipeGestureRecognizerDirectionUp($UIKit.UISwipeGestureRecognizerDirectionUp),
    UISwipeGestureRecognizerDirectionDown($UIKit.UISwipeGestureRecognizerDirectionDown);

    private final long value;

    private UISwipeGestureRecognizerDirection(long value) { this.value = value; }
}
