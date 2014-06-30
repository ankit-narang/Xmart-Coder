package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStreamStatus {
    NSStreamStatusNotOpen($Foundation.NSStreamStatusNotOpen),
    NSStreamStatusOpening($Foundation.NSStreamStatusOpening),
    NSStreamStatusOpen($Foundation.NSStreamStatusOpen),
    NSStreamStatusReading($Foundation.NSStreamStatusReading),
    NSStreamStatusWriting($Foundation.NSStreamStatusWriting),
    NSStreamStatusAtEnd($Foundation.NSStreamStatusAtEnd),
    NSStreamStatusClosed($Foundation.NSStreamStatusClosed),
    NSStreamStatusError($Foundation.NSStreamStatusError);

    private final long value;

    private NSStreamStatus(long value) { this.value = value; }
}
