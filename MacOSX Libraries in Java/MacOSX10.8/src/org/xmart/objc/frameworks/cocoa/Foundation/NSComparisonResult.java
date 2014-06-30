package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSComparisonResult {
    NSOrderedAscending($Foundation.NSOrderedAscending),
    NSOrderedSame($Foundation.NSOrderedSame),
    NSOrderedDescending($Foundation.NSOrderedDescending);

    private final long value;

    private NSComparisonResult(long value) { this.value = value; }
}
