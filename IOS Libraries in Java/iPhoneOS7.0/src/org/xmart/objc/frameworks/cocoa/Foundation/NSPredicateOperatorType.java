package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSPredicateOperatorType {
    NSLessThanPredicateOperatorType($Foundation.NSLessThanPredicateOperatorType),
    NSLessThanOrEqualToPredicateOperatorType($Foundation.NSLessThanOrEqualToPredicateOperatorType),
    NSGreaterThanPredicateOperatorType($Foundation.NSGreaterThanPredicateOperatorType),
    NSGreaterThanOrEqualToPredicateOperatorType($Foundation.NSGreaterThanOrEqualToPredicateOperatorType),
    NSEqualToPredicateOperatorType($Foundation.NSEqualToPredicateOperatorType),
    NSNotEqualToPredicateOperatorType($Foundation.NSNotEqualToPredicateOperatorType),
    NSMatchesPredicateOperatorType($Foundation.NSMatchesPredicateOperatorType),
    NSLikePredicateOperatorType($Foundation.NSLikePredicateOperatorType),
    NSBeginsWithPredicateOperatorType($Foundation.NSBeginsWithPredicateOperatorType),
    NSEndsWithPredicateOperatorType($Foundation.NSEndsWithPredicateOperatorType),
    NSInPredicateOperatorType($Foundation.NSInPredicateOperatorType),
    NSCustomSelectorPredicateOperatorType($Foundation.NSCustomSelectorPredicateOperatorType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSContainsPredicateOperatorType($Foundation.NSContainsPredicateOperatorType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSBetweenPredicateOperatorType($Foundation.NSBetweenPredicateOperatorType);

    private final long value;

    private NSPredicateOperatorType(long value) { this.value = value; }
}
