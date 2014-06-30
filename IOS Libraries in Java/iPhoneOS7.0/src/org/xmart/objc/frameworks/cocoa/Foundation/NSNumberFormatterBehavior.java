package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNumberFormatterBehavior {
    NSNumberFormatterBehaviorDefault($Foundation.NSNumberFormatterBehaviorDefault),
    NSNumberFormatterBehavior10_4($Foundation.NSNumberFormatterBehavior10_4);

    private final long value;

    private NSNumberFormatterBehavior(long value) { this.value = value; }
}
