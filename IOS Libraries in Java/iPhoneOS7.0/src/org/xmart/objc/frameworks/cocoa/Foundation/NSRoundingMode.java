package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSRoundingMode {
    NSRoundPlain($Foundation.NSRoundPlain),
    NSRoundDown($Foundation.NSRoundDown),
    NSRoundUp($Foundation.NSRoundUp),
    NSRoundBankers($Foundation.NSRoundBankers);

    private final long value;

    private NSRoundingMode(long value) { this.value = value; }
}
