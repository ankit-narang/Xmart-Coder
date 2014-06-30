package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStringCompareOptions {
    NSCaseInsensitiveSearch($Foundation.NSCaseInsensitiveSearch),
    NSLiteralSearch($Foundation.NSLiteralSearch),
    NSBackwardsSearch($Foundation.NSBackwardsSearch),
    NSAnchoredSearch($Foundation.NSAnchoredSearch),
    NSNumericSearch($Foundation.NSNumericSearch),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSDiacriticInsensitiveSearch($Foundation.NSDiacriticInsensitiveSearch),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSWidthInsensitiveSearch($Foundation.NSWidthInsensitiveSearch),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSForcedOrderingSearch($Foundation.NSForcedOrderingSearch),
    /**
     * @since Available in iOS 3.2 and later.
     */
    NSRegularExpressionSearch($Foundation.NSRegularExpressionSearch);

    private final long value;

    private NSStringCompareOptions(long value) { this.value = value; }
}
