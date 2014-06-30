package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImageOrientation {
    UIImageOrientationUp($UIKit.UIImageOrientationUp),
    UIImageOrientationDown($UIKit.UIImageOrientationDown),
    UIImageOrientationLeft($UIKit.UIImageOrientationLeft),
    UIImageOrientationRight($UIKit.UIImageOrientationRight),
    UIImageOrientationUpMirrored($UIKit.UIImageOrientationUpMirrored),
    UIImageOrientationDownMirrored($UIKit.UIImageOrientationDownMirrored),
    UIImageOrientationLeftMirrored($UIKit.UIImageOrientationLeftMirrored),
    UIImageOrientationRightMirrored($UIKit.UIImageOrientationRightMirrored);

    private final long value;

    private UIImageOrientation(long value) { this.value = value; }
}
