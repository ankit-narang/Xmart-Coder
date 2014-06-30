package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIInterfaceOrientation {
    UIInterfaceOrientationPortrait($UIKit.UIInterfaceOrientationPortrait),
    UIInterfaceOrientationPortraitUpsideDown($UIKit.UIInterfaceOrientationPortraitUpsideDown),
    UIInterfaceOrientationLandscapeLeft($UIKit.UIInterfaceOrientationLandscapeLeft),
    UIInterfaceOrientationLandscapeRight($UIKit.UIInterfaceOrientationLandscapeRight);

    private final long value;

    private UIInterfaceOrientation(long value) { this.value = value; }
}
