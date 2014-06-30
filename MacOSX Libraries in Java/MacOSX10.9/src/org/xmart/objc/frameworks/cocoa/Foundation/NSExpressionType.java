package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSExpressionType {
    NSConstantValueExpressionType($Foundation.NSConstantValueExpressionType),
    NSEvaluatedObjectExpressionType($Foundation.NSEvaluatedObjectExpressionType),
    NSVariableExpressionType($Foundation.NSVariableExpressionType),
    NSKeyPathExpressionType($Foundation.NSKeyPathExpressionType),
    NSFunctionExpressionType($Foundation.NSFunctionExpressionType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSUnionSetExpressionType($Foundation.NSUnionSetExpressionType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSIntersectSetExpressionType($Foundation.NSIntersectSetExpressionType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSMinusSetExpressionType($Foundation.NSMinusSetExpressionType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSSubqueryExpressionType($Foundation.NSSubqueryExpressionType),
    /**
     * @since Available in iOS 3.0 and later.
     */
    NSAggregateExpressionType($Foundation.NSAggregateExpressionType),
    /**
     * @since Available in iOS 7.0 and later.
     */
    NSAnyKeyExpressionType($Foundation.NSAnyKeyExpressionType),
    NSBlockExpressionType($Foundation.NSBlockExpressionType);

    private final long value;

    private NSExpressionType(long value) { this.value = value; }
}
