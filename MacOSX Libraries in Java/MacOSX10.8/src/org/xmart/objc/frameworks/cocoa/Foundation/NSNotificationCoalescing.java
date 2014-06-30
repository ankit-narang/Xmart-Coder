package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNotificationCoalescing {
    NSNotificationNoCoalescing($Foundation.NSNotificationNoCoalescing),
    NSNotificationCoalescingOnName($Foundation.NSNotificationCoalescingOnName),
    NSNotificationCoalescingOnSender($Foundation.NSNotificationCoalescingOnSender);

    private final long value;

    private NSNotificationCoalescing(long value) { this.value = value; }
}
