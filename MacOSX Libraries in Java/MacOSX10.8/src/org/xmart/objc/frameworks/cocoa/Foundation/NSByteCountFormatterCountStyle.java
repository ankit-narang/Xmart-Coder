package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSByteCountFormatterCountStyle {
    NSByteCountFormatterCountStyleFile($Foundation.NSByteCountFormatterCountStyleFile),
    NSByteCountFormatterCountStyleMemory($Foundation.NSByteCountFormatterCountStyleMemory),
    NSByteCountFormatterCountStyleDecimal($Foundation.NSByteCountFormatterCountStyleDecimal),
    NSByteCountFormatterCountStyleBinary($Foundation.NSByteCountFormatterCountStyleBinary);

    private final long value;

    private NSByteCountFormatterCountStyle(long value) { this.value = value; }
}
