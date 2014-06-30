package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIKeyboardAppearance {
    UIKeyboardAppearanceDefault($UIKit.UIKeyboardAppearanceDefault),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UIKeyboardAppearanceDark($UIKit.UIKeyboardAppearanceDark),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UIKeyboardAppearanceLight($UIKit.UIKeyboardAppearanceLight),
    UIKeyboardAppearanceAlert($UIKit.UIKeyboardAppearanceAlert);

    private final long value;

    private UIKeyboardAppearance(long value) { this.value = value; }
}
