package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIInterpolatingMotionEffectType {
    UIInterpolatingMotionEffectTypeTiltAlongHorizontalAxis($UIKit.UIInterpolatingMotionEffectTypeTiltAlongHorizontalAxis),
    UIInterpolatingMotionEffectTypeTiltAlongVerticalAxis($UIKit.UIInterpolatingMotionEffectTypeTiltAlongVerticalAxis);

    private final long value;

    private UIInterpolatingMotionEffectType(long value) { this.value = value; }
}
