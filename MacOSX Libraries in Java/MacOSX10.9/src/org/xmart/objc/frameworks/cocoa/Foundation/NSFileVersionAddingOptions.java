package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileVersionAddingOptions {
    NSFileVersionAddingByMoving($Foundation.NSFileVersionAddingByMoving);

    private final long value;

    private NSFileVersionAddingOptions(long value) { this.value = value; }
}
