package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileVersionReplacingOptions {
    NSFileVersionReplacingByMoving($Foundation.NSFileVersionReplacingByMoving);

    private final long value;

    private NSFileVersionReplacingOptions(long value) { this.value = value; }
}
