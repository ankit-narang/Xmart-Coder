package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UICollisionBehaviorMode {
    UICollisionBehaviorModeItems($UIKit.UICollisionBehaviorModeItems),
    UICollisionBehaviorModeBoundaries($UIKit.UICollisionBehaviorModeBoundaries),
    UICollisionBehaviorModeEverything($UIKit.UICollisionBehaviorModeEverything);

    private final long value;

    private UICollisionBehaviorMode(long value) { this.value = value; }
}
