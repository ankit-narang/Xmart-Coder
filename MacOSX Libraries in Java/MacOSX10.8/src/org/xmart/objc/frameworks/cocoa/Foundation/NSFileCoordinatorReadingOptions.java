package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileCoordinatorReadingOptions {
    NSFileCoordinatorReadingWithoutChanges($Foundation.NSFileCoordinatorReadingWithoutChanges),
    NSFileCoordinatorReadingResolvesSymbolicLink($Foundation.NSFileCoordinatorReadingResolvesSymbolicLink);

    private final long value;

    private NSFileCoordinatorReadingOptions(long value) { this.value = value; }
}
