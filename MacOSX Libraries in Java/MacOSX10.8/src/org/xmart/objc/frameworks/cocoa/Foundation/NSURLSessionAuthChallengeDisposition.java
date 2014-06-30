package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLSessionAuthChallengeDisposition {
    NSURLSessionAuthChallengeUseCredential($Foundation.NSURLSessionAuthChallengeUseCredential),
    NSURLSessionAuthChallengePerformDefaultHandling($Foundation.NSURLSessionAuthChallengePerformDefaultHandling),
    NSURLSessionAuthChallengeCancelAuthenticationChallenge($Foundation.NSURLSessionAuthChallengeCancelAuthenticationChallenge),
    NSURLSessionAuthChallengeRejectProtectionSpace($Foundation.NSURLSessionAuthChallengeRejectProtectionSpace);

    private final long value;

    private NSURLSessionAuthChallengeDisposition(long value) { this.value = value; }
}
