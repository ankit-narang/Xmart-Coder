package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSEnumerationOptions {
    NSEnumerationConcurrent($Foundation.NSEnumerationConcurrent),
    NSEnumerationReverse($Foundation.NSEnumerationReverse);

    private final long value;

    private NSEnumerationOptions(long value) { this.value = value; }
}
