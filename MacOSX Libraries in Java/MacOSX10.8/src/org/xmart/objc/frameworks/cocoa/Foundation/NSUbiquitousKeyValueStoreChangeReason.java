package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSUbiquitousKeyValueStoreChangeReason {
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSUbiquitousKeyValueStoreServerChange($Foundation.NSUbiquitousKeyValueStoreServerChange),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSUbiquitousKeyValueStoreInitialSyncChange($Foundation.NSUbiquitousKeyValueStoreInitialSyncChange),
    /**
     * @since Available in iOS 5.0 and later.
     */
    NSUbiquitousKeyValueStoreQuotaViolationChange($Foundation.NSUbiquitousKeyValueStoreQuotaViolationChange),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSUbiquitousKeyValueStoreAccountChange($Foundation.NSUbiquitousKeyValueStoreAccountChange);

    private final long value;

    private NSUbiquitousKeyValueStoreChangeReason(long value) { this.value = value; }
}
