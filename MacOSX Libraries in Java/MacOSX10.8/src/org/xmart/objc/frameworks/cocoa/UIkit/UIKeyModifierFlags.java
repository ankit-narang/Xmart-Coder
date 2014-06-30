package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIKeyModifierFlags {
    UIKeyModifierAlphaShift($UIKit.UIKeyModifierAlphaShift),
    UIKeyModifierShift($UIKit.UIKeyModifierShift),
    UIKeyModifierControl($UIKit.UIKeyModifierControl),
    UIKeyModifierAlternate($UIKit.UIKeyModifierAlternate),
    UIKeyModifierCommand($UIKit.UIKeyModifierCommand),
    UIKeyModifierNumericPad($UIKit.UIKeyModifierNumericPad);

    private final long value;

    private UIKeyModifierFlags(long value) { this.value = value; }
}
