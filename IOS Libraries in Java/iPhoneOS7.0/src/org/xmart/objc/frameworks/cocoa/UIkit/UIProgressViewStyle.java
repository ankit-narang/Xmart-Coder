package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIProgressViewStyle {
    UIProgressViewStyleDefault($UIKit.UIProgressViewStyleDefault),
    UIProgressViewStyleBar($UIKit.UIProgressViewStyleBar);

    private final long value;

    private UIProgressViewStyle(long value) { this.value = value; }
}
