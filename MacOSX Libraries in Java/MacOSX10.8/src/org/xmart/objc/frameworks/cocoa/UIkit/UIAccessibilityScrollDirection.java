package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIAccessibilityScrollDirection {
    UIAccessibilityScrollDirectionRight($UIKit.UIAccessibilityScrollDirectionRight),
    UIAccessibilityScrollDirectionLeft($UIKit.UIAccessibilityScrollDirectionLeft),
    UIAccessibilityScrollDirectionUp($UIKit.UIAccessibilityScrollDirectionUp),
    UIAccessibilityScrollDirectionDown($UIKit.UIAccessibilityScrollDirectionDown),
    UIAccessibilityScrollDirectionNext($UIKit.UIAccessibilityScrollDirectionNext),
    UIAccessibilityScrollDirectionPrevious($UIKit.UIAccessibilityScrollDirectionPrevious);

    private final long value;

    private UIAccessibilityScrollDirection(long value) { this.value = value; }
}
