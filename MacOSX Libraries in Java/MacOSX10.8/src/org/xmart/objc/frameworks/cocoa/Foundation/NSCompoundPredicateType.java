package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSCompoundPredicateType {
    NSNotPredicateType($Foundation.NSNotPredicateType),
    NSAndPredicateType($Foundation.NSAndPredicateType),
    NSOrPredicateType($Foundation.NSOrPredicateType);

    private final long value;

    private NSCompoundPredicateType(long value) { this.value = value; }
}
