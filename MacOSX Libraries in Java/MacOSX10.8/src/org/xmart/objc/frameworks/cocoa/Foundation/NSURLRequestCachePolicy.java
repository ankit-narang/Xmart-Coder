package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLRequestCachePolicy {
    NSURLRequestUseProtocolCachePolicy($Foundation.NSURLRequestUseProtocolCachePolicy),
    NSURLRequestReloadIgnoringLocalCacheData($Foundation.NSURLRequestReloadIgnoringLocalCacheData),
    NSURLRequestReloadIgnoringLocalAndRemoteCacheData($Foundation.NSURLRequestReloadIgnoringLocalAndRemoteCacheData),
    NSURLRequestReloadIgnoringCacheData($Foundation.NSURLRequestReloadIgnoringCacheData),
    NSURLRequestReturnCacheDataElseLoad($Foundation.NSURLRequestReturnCacheDataElseLoad),
    NSURLRequestReturnCacheDataDontLoad($Foundation.NSURLRequestReturnCacheDataDontLoad),
    NSURLRequestReloadRevalidatingCacheData($Foundation.NSURLRequestReloadRevalidatingCacheData);

    private final long value;

    private NSURLRequestCachePolicy(long value) { this.value = value; }
}
