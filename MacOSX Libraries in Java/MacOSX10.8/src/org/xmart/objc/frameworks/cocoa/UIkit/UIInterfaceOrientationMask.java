package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIInterfaceOrientationMask {
    UIInterfaceOrientationMaskPortrait($UIKit.UIInterfaceOrientationMaskPortrait),
    UIInterfaceOrientationMaskLandscapeLeft($UIKit.UIInterfaceOrientationMaskLandscapeLeft),
    UIInterfaceOrientationMaskLandscapeRight($UIKit.UIInterfaceOrientationMaskLandscapeRight),
    UIInterfaceOrientationMaskPortraitUpsideDown($UIKit.UIInterfaceOrientationMaskPortraitUpsideDown),
    UIInterfaceOrientationMaskLandscape($UIKit.UIInterfaceOrientationMaskLandscape),
    UIInterfaceOrientationMaskAll($UIKit.UIInterfaceOrientationMaskAll),
    UIInterfaceOrientationMaskAllButUpsideDown($UIKit.UIInterfaceOrientationMaskAllButUpsideDown);

    private final long value;

    private UIInterfaceOrientationMask(long value) { this.value = value; }
}
