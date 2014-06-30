package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSKeyValueObservingOptions {
    NSKeyValueObservingOptionNew($Foundation.NSKeyValueObservingOptionNew),
    NSKeyValueObservingOptionOld($Foundation.NSKeyValueObservingOptionOld),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSKeyValueObservingOptionInitial($Foundation.NSKeyValueObservingOptionInitial),
    /**
     * @since Available in iOS 2.0 and later.
     */
    NSKeyValueObservingOptionPrior($Foundation.NSKeyValueObservingOptionPrior);

    private final long value;

    private NSKeyValueObservingOptions(long value) { this.value = value; }
}
