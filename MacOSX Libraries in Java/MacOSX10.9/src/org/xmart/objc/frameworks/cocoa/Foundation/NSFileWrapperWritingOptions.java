package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileWrapperWritingOptions {
    NSFileWrapperWritingAtomic($Foundation.NSFileWrapperWritingAtomic),
    NSFileWrapperWritingWithNameUpdating($Foundation.NSFileWrapperWritingWithNameUpdating);

    private final long value;

    private NSFileWrapperWritingOptions(long value) { this.value = value; }
}
