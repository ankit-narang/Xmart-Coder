package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStringEncodingConversionOptions {
    NSStringEncodingConversionAllowLossy($Foundation.NSStringEncodingConversionAllowLossy),
    NSStringEncodingConversionExternalRepresentation($Foundation.NSStringEncodingConversionExternalRepresentation);

    private final long value;

    private NSStringEncodingConversionOptions(long value) { this.value = value; }
}
