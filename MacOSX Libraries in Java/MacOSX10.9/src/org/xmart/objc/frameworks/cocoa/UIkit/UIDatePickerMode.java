package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDatePickerMode {
    UIDatePickerModeTime($UIKit.UIDatePickerModeTime),
    UIDatePickerModeDate($UIKit.UIDatePickerModeDate),
    UIDatePickerModeDateAndTime($UIKit.UIDatePickerModeDateAndTime),
    UIDatePickerModeCountDownTimer($UIKit.UIDatePickerModeCountDownTimer);

    private final long value;

    private UIDatePickerMode(long value) { this.value = value; }
}
