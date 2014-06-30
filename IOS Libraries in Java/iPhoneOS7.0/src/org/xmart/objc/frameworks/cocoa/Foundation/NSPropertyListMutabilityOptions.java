package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSPropertyListMutabilityOptions {
    NSPropertyListImmutable($Foundation.NSPropertyListImmutable),
    NSPropertyListMutableContainers($Foundation.NSPropertyListMutableContainers),
    NSPropertyListMutableContainersAndLeaves($Foundation.NSPropertyListMutableContainersAndLeaves);

    private final long value;

    private NSPropertyListMutabilityOptions(long value) { this.value = value; }
}
