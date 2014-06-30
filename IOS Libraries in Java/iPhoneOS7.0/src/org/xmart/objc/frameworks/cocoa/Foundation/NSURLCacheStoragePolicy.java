package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLCacheStoragePolicy {
    NSURLCacheStorageAllowed($Foundation.NSURLCacheStorageAllowed),
    NSURLCacheStorageAllowedInMemoryOnly($Foundation.NSURLCacheStorageAllowedInMemoryOnly),
    NSURLCacheStorageNotAllowed($Foundation.NSURLCacheStorageNotAllowed);

    private final long value;

    private NSURLCacheStoragePolicy(long value) { this.value = value; }
}
