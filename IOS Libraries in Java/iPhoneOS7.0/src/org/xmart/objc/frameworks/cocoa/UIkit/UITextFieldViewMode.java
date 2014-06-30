package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextFieldViewMode {
    UITextFieldViewModeNever($UIKit.UITextFieldViewModeNever),
    UITextFieldViewModeWhileEditing($UIKit.UITextFieldViewModeWhileEditing),
    UITextFieldViewModeUnlessEditing($UIKit.UITextFieldViewModeUnlessEditing),
    UITextFieldViewModeAlways($UIKit.UITextFieldViewModeAlways);

    private final long value;

    private UITextFieldViewMode(long value) { this.value = value; }
}
