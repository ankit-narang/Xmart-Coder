package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSByteCountFormatterUnits {
    NSByteCountFormatterUseDefault($Foundation.NSByteCountFormatterUseDefault),
    NSByteCountFormatterUseBytes($Foundation.NSByteCountFormatterUseBytes),
    NSByteCountFormatterUseKB($Foundation.NSByteCountFormatterUseKB),
    NSByteCountFormatterUseMB($Foundation.NSByteCountFormatterUseMB),
    NSByteCountFormatterUseGB($Foundation.NSByteCountFormatterUseGB),
    NSByteCountFormatterUseTB($Foundation.NSByteCountFormatterUseTB),
    NSByteCountFormatterUsePB($Foundation.NSByteCountFormatterUsePB),
    NSByteCountFormatterUseEB($Foundation.NSByteCountFormatterUseEB),
    NSByteCountFormatterUseZB($Foundation.NSByteCountFormatterUseZB),
    NSByteCountFormatterUseYBOrHigher($Foundation.NSByteCountFormatterUseYBOrHigher),
    NSByteCountFormatterUseAll($Foundation.NSByteCountFormatterUseAll);

    private final long value;

    private NSByteCountFormatterUnits(long value) { this.value = value; }
}
