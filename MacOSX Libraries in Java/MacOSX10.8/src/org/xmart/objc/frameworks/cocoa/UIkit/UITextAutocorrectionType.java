package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextAutocorrectionType {
    UITextAutocorrectionTypeDefault($UIKit.UITextAutocorrectionTypeDefault),
    UITextAutocorrectionTypeNo($UIKit.UITextAutocorrectionTypeNo),
    UITextAutocorrectionTypeYes($UIKit.UITextAutocorrectionTypeYes);

    private final long value;

    private UITextAutocorrectionType(long value) { this.value = value; }
}
