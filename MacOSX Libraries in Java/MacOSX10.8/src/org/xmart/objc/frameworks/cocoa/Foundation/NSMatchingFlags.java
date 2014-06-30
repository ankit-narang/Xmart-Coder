package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSMatchingFlags {
    NSMatchingProgress($Foundation.NSMatchingProgress),
    NSMatchingCompleted($Foundation.NSMatchingCompleted),
    NSMatchingHitEnd($Foundation.NSMatchingHitEnd),
    NSMatchingRequiredEnd($Foundation.NSMatchingRequiredEnd),
    NSMatchingInternalError($Foundation.NSMatchingInternalError);

    private final long value;

    private NSMatchingFlags(long value) { this.value = value; }
}
