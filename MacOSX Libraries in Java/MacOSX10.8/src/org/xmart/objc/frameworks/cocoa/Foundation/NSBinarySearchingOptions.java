package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSBinarySearchingOptions {
    NSBinarySearchingFirstEqual($Foundation.NSBinarySearchingFirstEqual),
    NSBinarySearchingLastEqual($Foundation.NSBinarySearchingLastEqual),
    NSBinarySearchingInsertionIndex($Foundation.NSBinarySearchingInsertionIndex);

    private final long value;

    private NSBinarySearchingOptions(long value) { this.value = value; }
}
