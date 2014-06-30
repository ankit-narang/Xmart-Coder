package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileCoordinatorWritingOptions {
    NSFileCoordinatorWritingForDeleting($Foundation.NSFileCoordinatorWritingForDeleting),
    NSFileCoordinatorWritingForMoving($Foundation.NSFileCoordinatorWritingForMoving),
    NSFileCoordinatorWritingForMerging($Foundation.NSFileCoordinatorWritingForMerging),
    NSFileCoordinatorWritingForReplacing($Foundation.NSFileCoordinatorWritingForReplacing);

    private final long value;

    private NSFileCoordinatorWritingOptions(long value) { this.value = value; }
}
