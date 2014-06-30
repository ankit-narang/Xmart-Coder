package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewAnimationTransition {
    UIViewAnimationTransitionNone($UIKit.UIViewAnimationTransitionNone),
    UIViewAnimationTransitionFlipFromLeft($UIKit.UIViewAnimationTransitionFlipFromLeft),
    UIViewAnimationTransitionFlipFromRight($UIKit.UIViewAnimationTransitionFlipFromRight),
    UIViewAnimationTransitionCurlUp($UIKit.UIViewAnimationTransitionCurlUp),
    UIViewAnimationTransitionCurlDown($UIKit.UIViewAnimationTransitionCurlDown);

    private final long value;

    private UIViewAnimationTransition(long value) { this.value = value; }
}
