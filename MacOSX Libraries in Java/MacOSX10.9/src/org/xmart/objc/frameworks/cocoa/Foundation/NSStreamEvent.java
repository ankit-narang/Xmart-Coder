package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStreamEvent {
    NSStreamEventNone($Foundation.NSStreamEventNone),
    NSStreamEventOpenCompleted($Foundation.NSStreamEventOpenCompleted),
    NSStreamEventHasBytesAvailable($Foundation.NSStreamEventHasBytesAvailable),
    NSStreamEventHasSpaceAvailable($Foundation.NSStreamEventHasSpaceAvailable),
    NSStreamEventErrorOccurred($Foundation.NSStreamEventErrorOccurred),
    NSStreamEventEndEncountered($Foundation.NSStreamEventEndEncountered);

    private final long value;

    private NSStreamEvent(long value) { this.value = value; }
}
