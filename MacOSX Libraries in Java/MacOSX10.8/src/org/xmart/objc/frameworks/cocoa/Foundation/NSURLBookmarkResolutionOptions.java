package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLBookmarkResolutionOptions {
    NSURLBookmarkResolutionWithoutUI($Foundation.NSURLBookmarkResolutionWithoutUI),
    NSURLBookmarkResolutionWithoutMounting($Foundation.NSURLBookmarkResolutionWithoutMounting),
    NSURLBookmarkResolutionWithSecurityScope($Foundation.NSURLBookmarkResolutionWithSecurityScope);

    private final long value;

    private NSURLBookmarkResolutionOptions(long value) { this.value = value; }
}
