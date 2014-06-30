package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextBorderStyle {
    UITextBorderStyleNone($UIKit.UITextBorderStyleNone),
    UITextBorderStyleLine($UIKit.UITextBorderStyleLine),
    UITextBorderStyleBezel($UIKit.UITextBorderStyleBezel),
    UITextBorderStyleRoundedRect($UIKit.UITextBorderStyleRoundedRect);

    private final long value;

    private UITextBorderStyle(long value) { this.value = value; }
}
