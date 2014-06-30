package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIEventType {
    UIEventTypeTouches($UIKit.UIEventTypeTouches),
    UIEventTypeMotion($UIKit.UIEventTypeMotion),
    UIEventTypeRemoteControl($UIKit.UIEventTypeRemoteControl);

    private final long value;

    private UIEventType(long value) { this.value = value; }
}
