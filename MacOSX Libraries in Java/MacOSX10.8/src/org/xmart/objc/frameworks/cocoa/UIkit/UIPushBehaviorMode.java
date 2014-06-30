package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIPushBehaviorMode {
    UIPushBehaviorModeContinuous($UIKit.UIPushBehaviorModeContinuous),
    UIPushBehaviorModeInstantaneous($UIKit.UIPushBehaviorModeInstantaneous);

    private final long value;

    private UIPushBehaviorMode(long value) { this.value = value; }
}
