package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSFileWrapperReadingOptions {
    NSFileWrapperReadingImmediate($Foundation.NSFileWrapperReadingImmediate),
    NSFileWrapperReadingWithoutMapping($Foundation.NSFileWrapperReadingWithoutMapping);

    private final long value;

    private NSFileWrapperReadingOptions(long value) { this.value = value; }
}
