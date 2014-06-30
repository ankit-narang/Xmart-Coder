package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIRemoteNotificationType {
    UIRemoteNotificationTypeNone($UIKit.UIRemoteNotificationTypeNone),
    UIRemoteNotificationTypeBadge($UIKit.UIRemoteNotificationTypeBadge),
    UIRemoteNotificationTypeSound($UIKit.UIRemoteNotificationTypeSound),
    UIRemoteNotificationTypeAlert($UIKit.UIRemoteNotificationTypeAlert),
    UIRemoteNotificationTypeNewsstandContentAvailability($UIKit.UIRemoteNotificationTypeNewsstandContentAvailability);

    private final long value;

    private UIRemoteNotificationType(long value) { this.value = value; }
}
