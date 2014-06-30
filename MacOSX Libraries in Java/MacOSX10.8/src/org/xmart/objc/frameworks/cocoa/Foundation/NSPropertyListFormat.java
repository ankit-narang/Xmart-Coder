package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSPropertyListFormat {
    NSPropertyListOpenStepFormat($Foundation.NSPropertyListOpenStepFormat),
    NSPropertyListXMLFormat_v1_0($Foundation.NSPropertyListXMLFormat_v1_0),
    NSPropertyListBinaryFormat_v1_0($Foundation.NSPropertyListBinaryFormat_v1_0);

    private final long value;

    private NSPropertyListFormat(long value) { this.value = value; }
}
