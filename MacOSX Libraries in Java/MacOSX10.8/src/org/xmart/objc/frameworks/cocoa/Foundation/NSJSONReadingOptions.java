package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSJSONReadingOptions {
    NSJSONReadingMutableContainers($Foundation.NSJSONReadingMutableContainers),
    NSJSONReadingMutableLeaves($Foundation.NSJSONReadingMutableLeaves),
    NSJSONReadingAllowFragments($Foundation.NSJSONReadingAllowFragments);

    private final long value;

    private NSJSONReadingOptions(long value) { this.value = value; }
}
