package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLErrorCancelledReason {
    NSURLErrorCancelledReasonUserForceQuitApplication($Foundation.NSURLErrorCancelledReasonUserForceQuitApplication),
    NSURLErrorCancelledReasonBackgroundUpdatesDisabled($Foundation.NSURLErrorCancelledReasonBackgroundUpdatesDisabled);

    private final long value;

    private NSURLErrorCancelledReason(long value) { this.value = value; }
}
