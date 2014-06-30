package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIDeviceBatteryState {
    UIDeviceBatteryStateUnknown($UIKit.UIDeviceBatteryStateUnknown),
    UIDeviceBatteryStateUnplugged($UIKit.UIDeviceBatteryStateUnplugged),
    UIDeviceBatteryStateCharging($UIKit.UIDeviceBatteryStateCharging),
    UIDeviceBatteryStateFull($UIKit.UIDeviceBatteryStateFull);

    private final long value;

    private UIDeviceBatteryState(long value) { this.value = value; }
}
