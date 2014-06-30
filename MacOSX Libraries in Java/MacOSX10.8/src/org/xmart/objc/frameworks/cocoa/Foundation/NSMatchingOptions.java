package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSMatchingOptions {
    NSMatchingReportProgress($Foundation.NSMatchingReportProgress),
    NSMatchingReportCompletion($Foundation.NSMatchingReportCompletion),
    NSMatchingAnchored($Foundation.NSMatchingAnchored),
    NSMatchingWithTransparentBounds($Foundation.NSMatchingWithTransparentBounds),
    NSMatchingWithoutAnchoringBounds($Foundation.NSMatchingWithoutAnchoringBounds);

    private final long value;

    private NSMatchingOptions(long value) { this.value = value; }
}
