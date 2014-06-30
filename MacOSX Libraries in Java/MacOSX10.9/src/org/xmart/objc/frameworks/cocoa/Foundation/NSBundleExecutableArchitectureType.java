package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSBundleExecutableArchitectureType {
    NSBundleExecutableArchitectureI386($Foundation.NSBundleExecutableArchitectureI386),
    NSBundleExecutableArchitecturePPC($Foundation.NSBundleExecutableArchitecturePPC),
    NSBundleExecutableArchitectureX86_64($Foundation.NSBundleExecutableArchitectureX86_64),
    NSBundleExecutableArchitecturePPC64($Foundation.NSBundleExecutableArchitecturePPC64);

    private final long value;

    private NSBundleExecutableArchitectureType(long value) { this.value = value; }
}
