package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSPointerFunctionsOptions {
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsStrongMemory($Foundation.NSPointerFunctionsStrongMemory),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsOpaqueMemory($Foundation.NSPointerFunctionsOpaqueMemory),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsMallocMemory($Foundation.NSPointerFunctionsMallocMemory),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsMachVirtualMemory($Foundation.NSPointerFunctionsMachVirtualMemory),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsWeakMemory($Foundation.NSPointerFunctionsWeakMemory),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsObjectPersonality($Foundation.NSPointerFunctionsObjectPersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsOpaquePersonality($Foundation.NSPointerFunctionsOpaquePersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsObjectPointerPersonality($Foundation.NSPointerFunctionsObjectPointerPersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsCStringPersonality($Foundation.NSPointerFunctionsCStringPersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsStructPersonality($Foundation.NSPointerFunctionsStructPersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsIntegerPersonality($Foundation.NSPointerFunctionsIntegerPersonality),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSPointerFunctionsCopyIn($Foundation.NSPointerFunctionsCopyIn);

    private final long value;

    private NSPointerFunctionsOptions(long value) { this.value = value; }
}
