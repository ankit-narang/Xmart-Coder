package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIGestureRecognizerState {
    UIGestureRecognizerStatePossible($UIKit.UIGestureRecognizerStatePossible),
    UIGestureRecognizerStateBegan($UIKit.UIGestureRecognizerStateBegan),
    UIGestureRecognizerStateChanged($UIKit.UIGestureRecognizerStateChanged),
    UIGestureRecognizerStateEnded($UIKit.UIGestureRecognizerStateEnded),
    UIGestureRecognizerStateCancelled($UIKit.UIGestureRecognizerStateCancelled),
    UIGestureRecognizerStateFailed($UIKit.UIGestureRecognizerStateFailed),
    UIGestureRecognizerStateRecognized($UIKit.UIGestureRecognizerStateRecognized);

    private final long value;

    private UIGestureRecognizerState(long value) { this.value = value; }
}
