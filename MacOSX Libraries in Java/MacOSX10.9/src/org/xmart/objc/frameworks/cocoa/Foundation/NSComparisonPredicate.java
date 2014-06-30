package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSComparisonPredicate extends NSPredicate  {
    
    public NSComparisonPredicate() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithLeftExpression:(NSExpression *)lhs rightExpression:(NSExpression *)rhs modifier:(NSComparisonPredicateModifier)modifier type:(NSPredicateOperatorType)type options:(NSComparisonPredicateOptions)options;", selector = "initWithLeftExpression:rightExpression:modifier:type:options:")
    public native NSComparisonPredicate initWithLeftExpression$rightExpression$modifier$type$options$(NSExpression lhs, NSExpression rhs, NSComparisonPredicateModifier modifier, NSPredicateOperatorType type, NSComparisonPredicateOptions options);

    @ObjCMethodSign(sign = "- (id)initWithLeftExpression:(NSExpression *)lhs rightExpression:(NSExpression *)rhs customSelector:(SEL)selector;", selector = "initWithLeftExpression:rightExpression:customSelector:")
    public native NSComparisonPredicate initWithLeftExpression$rightExpression$customSelector$(NSExpression lhs, NSExpression rhs, ObjCSelector selector);

    @ObjCMethodSign(sign = "- (NSPredicateOperatorType)predicateOperatorType;", selector = "predicateOperatorType")
    public native NSPredicateOperatorType predicateOperatorType();

    @ObjCMethodSign(sign = "- (NSComparisonPredicateModifier)comparisonPredicateModifier;", selector = "comparisonPredicateModifier")
    public native NSComparisonPredicateModifier comparisonPredicateModifier();

    @ObjCMethodSign(sign = "- (NSExpression *)leftExpression;", selector = "leftExpression")
    public native NSExpression leftExpression();

    @ObjCMethodSign(sign = "- (NSExpression *)rightExpression;", selector = "rightExpression")
    public native NSExpression rightExpression();

    @ObjCMethodSign(sign = "- (SEL)customSelector;", selector = "customSelector")
    public native ObjCSelector customSelector();

    @ObjCMethodSign(sign = "- (NSComparisonPredicateOptions)options;", selector = "options")
    public native NSComparisonPredicateOptions options();

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithLeftExpression:(NSExpression *)lhs rightExpression:(NSExpression *)rhs modifier:(NSComparisonPredicateModifier)modifier type:(NSPredicateOperatorType)type options:(NSComparisonPredicateOptions)options;", selector = "predicateWithLeftExpression:rightExpression:modifier:type:options:")
    public static native NSPredicate predicateWithLeftExpression$rightExpression$modifier$type$options$(NSExpression lhs, NSExpression rhs, NSComparisonPredicateModifier modifier, NSPredicateOperatorType type, NSComparisonPredicateOptions options);

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithLeftExpression:(NSExpression *)lhs rightExpression:(NSExpression *)rhs customSelector:(SEL)selector;", selector = "predicateWithLeftExpression:rightExpression:customSelector:")
    public static native NSPredicate predicateWithLeftExpression$rightExpression$customSelector$(NSExpression lhs, NSExpression rhs, ObjCSelector selector);
}
