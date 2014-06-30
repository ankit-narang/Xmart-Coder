package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSPostingStyle {
    NSPostWhenIdle($Foundation.NSPostWhenIdle),
    NSPostASAP($Foundation.NSPostASAP),
    NSPostNow($Foundation.NSPostNow);

    private final long value;

    private NSPostingStyle(long value) { this.value = value; }
}
