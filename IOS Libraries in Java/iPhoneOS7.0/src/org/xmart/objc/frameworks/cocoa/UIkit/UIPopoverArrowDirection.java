package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPopoverArrowDirection {
    UIPopoverArrowDirectionUp($UIKit.UIPopoverArrowDirectionUp),
    UIPopoverArrowDirectionDown($UIKit.UIPopoverArrowDirectionDown),
    UIPopoverArrowDirectionLeft($UIKit.UIPopoverArrowDirectionLeft),
    UIPopoverArrowDirectionRight($UIKit.UIPopoverArrowDirectionRight),
    UIPopoverArrowDirectionAny($UIKit.UIPopoverArrowDirectionAny),
    UIPopoverArrowDirectionUnknown($UIKit.UIPopoverArrowDirectionUnknown);

    private final long value;

    private UIPopoverArrowDirection(long value) { this.value = value; }
}
