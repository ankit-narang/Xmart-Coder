package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLSessionTaskState {
    NSURLSessionTaskStateRunning($Foundation.NSURLSessionTaskStateRunning),
    NSURLSessionTaskStateSuspended($Foundation.NSURLSessionTaskStateSuspended),
    NSURLSessionTaskStateCanceling($Foundation.NSURLSessionTaskStateCanceling),
    NSURLSessionTaskStateCompleted($Foundation.NSURLSessionTaskStateCompleted);

    private final long value;

    private NSURLSessionTaskState(long value) { this.value = value; }
}
