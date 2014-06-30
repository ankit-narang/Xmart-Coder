package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSURLBookmarkCreationOptions {
    /**
     * @since Available in iOS 4.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    NSURLBookmarkCreationPreferFileIDResolution($Foundation.NSURLBookmarkCreationPreferFileIDResolution),
    NSURLBookmarkCreationMinimalBookmark($Foundation.NSURLBookmarkCreationMinimalBookmark),
    NSURLBookmarkCreationSuitableForBookmarkFile($Foundation.NSURLBookmarkCreationSuitableForBookmarkFile),
    NSURLBookmarkCreationWithSecurityScope($Foundation.NSURLBookmarkCreationWithSecurityScope),
    NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess($Foundation.NSURLBookmarkCreationSecurityScopeAllowOnlyReadAccess);

    private final long value;

    private NSURLBookmarkCreationOptions(long value) { this.value = value; }
}
