package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIViewAutoresizing {
    UIViewAutoresizingNone($UIKit.UIViewAutoresizingNone),
    UIViewAutoresizingFlexibleLeftMargin($UIKit.UIViewAutoresizingFlexibleLeftMargin),
    UIViewAutoresizingFlexibleWidth($UIKit.UIViewAutoresizingFlexibleWidth),
    UIViewAutoresizingFlexibleRightMargin($UIKit.UIViewAutoresizingFlexibleRightMargin),
    UIViewAutoresizingFlexibleTopMargin($UIKit.UIViewAutoresizingFlexibleTopMargin),
    UIViewAutoresizingFlexibleHeight($UIKit.UIViewAutoresizingFlexibleHeight),
    UIViewAutoresizingFlexibleBottomMargin($UIKit.UIViewAutoresizingFlexibleBottomMargin);

    private final long value;

    private UIViewAutoresizing(long value) { this.value = value; }
}
