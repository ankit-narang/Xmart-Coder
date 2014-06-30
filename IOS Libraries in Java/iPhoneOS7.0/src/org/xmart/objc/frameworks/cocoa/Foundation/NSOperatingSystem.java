package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSOperatingSystem {
    NSWindowsNTOperatingSystem($Foundation.NSWindowsNTOperatingSystem),
    NSWindows95OperatingSystem($Foundation.NSWindows95OperatingSystem),
    NSSolarisOperatingSystem($Foundation.NSSolarisOperatingSystem),
    NSHPUXOperatingSystem($Foundation.NSHPUXOperatingSystem),
    NSMACHOperatingSystem($Foundation.NSMACHOperatingSystem),
    NSSunOSOperatingSystem($Foundation.NSSunOSOperatingSystem),
    NSOSF1OperatingSystem($Foundation.NSOSF1OperatingSystem);

    private final long value;

    private NSOperatingSystem(long value) { this.value = value; }
}
