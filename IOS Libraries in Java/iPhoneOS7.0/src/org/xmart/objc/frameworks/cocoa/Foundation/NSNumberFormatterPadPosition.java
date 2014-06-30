package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNumberFormatterPadPosition {
    NSNumberFormatterPadBeforePrefix($Foundation.NSNumberFormatterPadBeforePrefix),
    NSNumberFormatterPadAfterPrefix($Foundation.NSNumberFormatterPadAfterPrefix),
    NSNumberFormatterPadBeforeSuffix($Foundation.NSNumberFormatterPadBeforeSuffix),
    NSNumberFormatterPadAfterSuffix($Foundation.NSNumberFormatterPadAfterSuffix);

    private final long value;

    private NSNumberFormatterPadPosition(long value) { this.value = value; }
}
