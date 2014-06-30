package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNetServiceOptions {
    NSNetServiceNoAutoRename($Foundation.NSNetServiceNoAutoRename),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSNetServiceListenForConnections($Foundation.NSNetServiceListenForConnections);

    private final long value;

    private NSNetServiceOptions(long value) { this.value = value; }
}
