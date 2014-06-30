package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIBarButtonItemStyle {
    UIBarButtonItemStylePlain($UIKit.UIBarButtonItemStylePlain),
    UIBarButtonItemStyleBordered($UIKit.UIBarButtonItemStyleBordered),
    UIBarButtonItemStyleDone($UIKit.UIBarButtonItemStyleDone);

    private final long value;

    private UIBarButtonItemStyle(long value) { this.value = value; }
}
