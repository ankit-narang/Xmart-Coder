package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSNumberFormatterRoundingMode {
    NSNumberFormatterRoundCeiling($Foundation.NSNumberFormatterRoundCeiling),
    NSNumberFormatterRoundFloor($Foundation.NSNumberFormatterRoundFloor),
    NSNumberFormatterRoundDown($Foundation.NSNumberFormatterRoundDown),
    NSNumberFormatterRoundUp($Foundation.NSNumberFormatterRoundUp),
    NSNumberFormatterRoundHalfEven($Foundation.NSNumberFormatterRoundHalfEven),
    NSNumberFormatterRoundHalfDown($Foundation.NSNumberFormatterRoundHalfDown),
    NSNumberFormatterRoundHalfUp($Foundation.NSNumberFormatterRoundHalfUp);

    private final long value;

    private NSNumberFormatterRoundingMode(long value) { this.value = value; }
}
