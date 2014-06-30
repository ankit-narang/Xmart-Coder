package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIScrollViewKeyboardDismissMode {
    UIScrollViewKeyboardDismissModeNone($UIKit.UIScrollViewKeyboardDismissModeNone),
    UIScrollViewKeyboardDismissModeOnDrag($UIKit.UIScrollViewKeyboardDismissModeOnDrag),
    UIScrollViewKeyboardDismissModeInteractive($UIKit.UIScrollViewKeyboardDismissModeInteractive);

    private final long value;

    private UIScrollViewKeyboardDismissMode(long value) { this.value = value; }
}
