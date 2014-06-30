package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSActivityOptions {
    NSActivityIdleDisplaySleepDisabled($Foundation.NSActivityIdleDisplaySleepDisabled),
    NSActivityIdleSystemSleepDisabled($Foundation.NSActivityIdleSystemSleepDisabled),
    NSActivitySuddenTerminationDisabled($Foundation.NSActivitySuddenTerminationDisabled),
    NSActivityAutomaticTerminationDisabled($Foundation.NSActivityAutomaticTerminationDisabled),
    NSActivityUserInitiated($Foundation.NSActivityUserInitiated),
    NSActivityUserInitiatedAllowingIdleSystemSleep($Foundation.NSActivityUserInitiatedAllowingIdleSystemSleep),
    NSActivityBackground($Foundation.NSActivityBackground),
    NSActivityLatencyCritical($Foundation.NSActivityLatencyCritical);

    private final long value;

    private NSActivityOptions(long value) { this.value = value; }
}
