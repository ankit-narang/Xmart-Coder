package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextAlignment {
    UITextAlignmentLeft($UIKit.UITextAlignmentLeft),
    UITextAlignmentCenter($UIKit.UITextAlignmentCenter),
    UITextAlignmentRight($UIKit.UITextAlignmentRight);

    private final long value;

    private UITextAlignment(long value) { this.value = value; }
}
