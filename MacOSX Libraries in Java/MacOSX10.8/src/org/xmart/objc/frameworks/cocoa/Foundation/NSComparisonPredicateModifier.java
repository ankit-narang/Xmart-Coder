package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSComparisonPredicateModifier {
    NSDirectPredicateModifier($Foundation.NSDirectPredicateModifier),
    NSAllPredicateModifier($Foundation.NSAllPredicateModifier),
    NSAnyPredicateModifier($Foundation.NSAnyPredicateModifier);

    private final long value;

    private NSComparisonPredicateModifier(long value) { this.value = value; }
}
