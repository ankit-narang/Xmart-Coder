package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIModalPresentationStyle {
    UIModalPresentationFullScreen($UIKit.UIModalPresentationFullScreen),
    UIModalPresentationPageSheet($UIKit.UIModalPresentationPageSheet),
    UIModalPresentationFormSheet($UIKit.UIModalPresentationFormSheet),
    UIModalPresentationCurrentContext($UIKit.UIModalPresentationCurrentContext),
    UIModalPresentationCustom($UIKit.UIModalPresentationCustom),
    UIModalPresentationNone($UIKit.UIModalPresentationNone);

    private final long value;

    private UIModalPresentationStyle(long value) { this.value = value; }
}
