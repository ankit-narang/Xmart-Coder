package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITouchPhase {
    UITouchPhaseBegan($UIKit.UITouchPhaseBegan),
    UITouchPhaseMoved($UIKit.UITouchPhaseMoved),
    UITouchPhaseStationary($UIKit.UITouchPhaseStationary),
    UITouchPhaseEnded($UIKit.UITouchPhaseEnded),
    UITouchPhaseCancelled($UIKit.UITouchPhaseCancelled);

    private final long value;

    private UITouchPhase(long value) { this.value = value; }
}
