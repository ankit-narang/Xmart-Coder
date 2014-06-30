package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDataReadingOptions {
    NSDataReadingMappedIfSafe($Foundation.NSDataReadingMappedIfSafe),
    NSDataReadingUncached($Foundation.NSDataReadingUncached),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSDataReadingMappedAlways($Foundation.NSDataReadingMappedAlways),
    NSDataReadingMapped($Foundation.NSDataReadingMapped),
    NSMappedRead($Foundation.NSMappedRead),
    NSUncachedRead($Foundation.NSUncachedRead);

    private final long value;

    private NSDataReadingOptions(long value) { this.value = value; }
}
