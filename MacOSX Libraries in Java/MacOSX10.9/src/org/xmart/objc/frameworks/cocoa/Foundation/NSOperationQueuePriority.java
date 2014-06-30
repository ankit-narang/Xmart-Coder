package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSOperationQueuePriority {
    NSOperationQueuePriorityVeryLow($Foundation.NSOperationQueuePriorityVeryLow),
    NSOperationQueuePriorityLow($Foundation.NSOperationQueuePriorityLow),
    NSOperationQueuePriorityNormal($Foundation.NSOperationQueuePriorityNormal),
    NSOperationQueuePriorityHigh($Foundation.NSOperationQueuePriorityHigh),
    NSOperationQueuePriorityVeryHigh($Foundation.NSOperationQueuePriorityVeryHigh);

    private final long value;

    private NSOperationQueuePriority(long value) { this.value = value; }
}
