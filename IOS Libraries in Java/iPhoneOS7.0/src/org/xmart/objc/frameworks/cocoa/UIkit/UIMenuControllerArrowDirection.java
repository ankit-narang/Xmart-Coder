package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIMenuControllerArrowDirection {
    UIMenuControllerArrowDefault($UIKit.UIMenuControllerArrowDefault),
    UIMenuControllerArrowUp($UIKit.UIMenuControllerArrowUp),
    UIMenuControllerArrowDown($UIKit.UIMenuControllerArrowDown),
    UIMenuControllerArrowLeft($UIKit.UIMenuControllerArrowLeft),
    UIMenuControllerArrowRight($UIKit.UIMenuControllerArrowRight);

    private final long value;

    private UIMenuControllerArrowDirection(long value) { this.value = value; }
}
