package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextLayoutDirection {
    UITextLayoutDirectionRight($UIKit.UITextLayoutDirectionRight),
    UITextLayoutDirectionLeft($UIKit.UITextLayoutDirectionLeft),
    UITextLayoutDirectionUp($UIKit.UITextLayoutDirectionUp),
    UITextLayoutDirectionDown($UIKit.UITextLayoutDirectionDown);

    private final long value;

    private UITextLayoutDirection(long value) { this.value = value; }
}
