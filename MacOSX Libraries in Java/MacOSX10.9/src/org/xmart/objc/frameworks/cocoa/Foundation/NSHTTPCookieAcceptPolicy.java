package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSHTTPCookieAcceptPolicy {
    NSHTTPCookieAcceptPolicyAlways($Foundation.NSHTTPCookieAcceptPolicyAlways),
    NSHTTPCookieAcceptPolicyNever($Foundation.NSHTTPCookieAcceptPolicyNever),
    NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain($Foundation.NSHTTPCookieAcceptPolicyOnlyFromMainDocumentDomain);

    private final long value;

    private NSHTTPCookieAcceptPolicy(long value) { this.value = value; }
}
