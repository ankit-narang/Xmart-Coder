package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSCalculationError {
    NSCalculationNoError($Foundation.NSCalculationNoError),
    NSCalculationLossOfPrecision($Foundation.NSCalculationLossOfPrecision),
    NSCalculationUnderflow($Foundation.NSCalculationUnderflow),
    NSCalculationOverflow($Foundation.NSCalculationOverflow),
    NSCalculationDivideByZero($Foundation.NSCalculationDivideByZero);

    private final long value;

    private NSCalculationError(long value) { this.value = value; }
}
