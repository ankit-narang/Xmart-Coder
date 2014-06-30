package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNetServicesError {
    NSNetServicesUnknownError($Foundation.NSNetServicesUnknownError),
    NSNetServicesCollisionError($Foundation.NSNetServicesCollisionError),
    NSNetServicesNotFoundError($Foundation.NSNetServicesNotFoundError),
    NSNetServicesActivityInProgress($Foundation.NSNetServicesActivityInProgress),
    NSNetServicesBadArgumentError($Foundation.NSNetServicesBadArgumentError),
    NSNetServicesCancelledError($Foundation.NSNetServicesCancelledError),
    NSNetServicesInvalidError($Foundation.NSNetServicesInvalidError),
    NSNetServicesTimeoutError($Foundation.NSNetServicesTimeoutError);

    private final long value;

    private NSNetServicesError(long value) { this.value = value; }
}
