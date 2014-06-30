package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSComparisonPredicateOptions {
    NSCaseInsensitivePredicateOption($Foundation.NSCaseInsensitivePredicateOption),
    NSDiacriticInsensitivePredicateOption($Foundation.NSDiacriticInsensitivePredicateOption),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSNormalizedPredicateOption($Foundation.NSNormalizedPredicateOption);

    private final long value;

    private NSComparisonPredicateOptions(long value) { this.value = value; }
}
