package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDeviceOrientation {
    UIDeviceOrientationUnknown($UIKit.UIDeviceOrientationUnknown),
    UIDeviceOrientationPortrait($UIKit.UIDeviceOrientationPortrait),
    UIDeviceOrientationPortraitUpsideDown($UIKit.UIDeviceOrientationPortraitUpsideDown),
    UIDeviceOrientationLandscapeLeft($UIKit.UIDeviceOrientationLandscapeLeft),
    UIDeviceOrientationLandscapeRight($UIKit.UIDeviceOrientationLandscapeRight),
    UIDeviceOrientationFaceUp($UIKit.UIDeviceOrientationFaceUp),
    UIDeviceOrientationFaceDown($UIKit.UIDeviceOrientationFaceDown);

    private final long value;

    private UIDeviceOrientation(long value) { this.value = value; }
}
