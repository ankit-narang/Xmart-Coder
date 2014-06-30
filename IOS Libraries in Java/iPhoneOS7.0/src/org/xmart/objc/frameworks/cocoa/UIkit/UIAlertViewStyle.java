package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIAlertViewStyle {
    UIAlertViewStyleDefault($UIKit.UIAlertViewStyleDefault),
    UIAlertViewStyleSecureTextInput($UIKit.UIAlertViewStyleSecureTextInput),
    UIAlertViewStylePlainTextInput($UIKit.UIAlertViewStylePlainTextInput),
    UIAlertViewStyleLoginAndPasswordInput($UIKit.UIAlertViewStyleLoginAndPasswordInput);

    private final long value;

    private UIAlertViewStyle(long value) { this.value = value; }
}
