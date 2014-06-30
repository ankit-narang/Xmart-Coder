package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDataWritingOptions {
    NSDataWritingAtomic($Foundation.NSDataWritingAtomic),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSDataWritingWithoutOverwriting($Foundation.NSDataWritingWithoutOverwriting),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSDataWritingFileProtectionNone($Foundation.NSDataWritingFileProtectionNone),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSDataWritingFileProtectionComplete($Foundation.NSDataWritingFileProtectionComplete),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSDataWritingFileProtectionCompleteUnlessOpen($Foundation.NSDataWritingFileProtectionCompleteUnlessOpen),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication($Foundation.NSDataWritingFileProtectionCompleteUntilFirstUserAuthentication),
    /**
     * @since Available in iOS 4.0 and later.
     */
    NSDataWritingFileProtectionMask($Foundation.NSDataWritingFileProtectionMask),
    NSAtomicWrite($Foundation.NSAtomicWrite);

    private final long value;

    private NSDataWritingOptions(long value) { this.value = value; }
}
