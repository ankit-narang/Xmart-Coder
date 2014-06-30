package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDirectoryEnumerationOptions {
    NSDirectoryEnumerationSkipsSubdirectoryDescendants($Foundation.NSDirectoryEnumerationSkipsSubdirectoryDescendants),
    NSDirectoryEnumerationSkipsPackageDescendants($Foundation.NSDirectoryEnumerationSkipsPackageDescendants),
    NSDirectoryEnumerationSkipsHiddenFiles($Foundation.NSDirectoryEnumerationSkipsHiddenFiles);

    private final long value;

    private NSDirectoryEnumerationOptions(long value) { this.value = value; }
}
