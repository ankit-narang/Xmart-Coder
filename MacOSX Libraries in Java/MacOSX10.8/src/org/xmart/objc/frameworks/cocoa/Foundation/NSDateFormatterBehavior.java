package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDateFormatterBehavior {
    NSDateFormatterBehaviorDefault($Foundation.NSDateFormatterBehaviorDefault),
    NSDateFormatterBehavior10_4($Foundation.NSDateFormatterBehavior10_4);

    private final long value;

    private NSDateFormatterBehavior(long value) { this.value = value; }
}
