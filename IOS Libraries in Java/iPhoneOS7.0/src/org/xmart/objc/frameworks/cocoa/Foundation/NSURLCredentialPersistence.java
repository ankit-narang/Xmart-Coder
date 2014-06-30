package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLCredentialPersistence {
    NSURLCredentialPersistenceNone($Foundation.NSURLCredentialPersistenceNone),
    NSURLCredentialPersistenceForSession($Foundation.NSURLCredentialPersistenceForSession),
    NSURLCredentialPersistencePermanent($Foundation.NSURLCredentialPersistencePermanent),
    /**
     * @since Available in iOS 6.0 and later.
     */
    NSURLCredentialPersistenceSynchronizable($Foundation.NSURLCredentialPersistenceSynchronizable);

    private final long value;

    private NSURLCredentialPersistence(long value) { this.value = value; }
}
