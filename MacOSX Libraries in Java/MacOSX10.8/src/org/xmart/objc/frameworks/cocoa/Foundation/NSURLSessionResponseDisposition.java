package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLSessionResponseDisposition {
    NSURLSessionResponseCancel($Foundation.NSURLSessionResponseCancel),
    NSURLSessionResponseAllow($Foundation.NSURLSessionResponseAllow),
    NSURLSessionResponseBecomeDownload($Foundation.NSURLSessionResponseBecomeDownload);

    private final long value;

    private NSURLSessionResponseDisposition(long value) { this.value = value; }
}
