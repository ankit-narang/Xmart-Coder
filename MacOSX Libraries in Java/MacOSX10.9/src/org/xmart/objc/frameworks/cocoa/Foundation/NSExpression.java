package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSExpression extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSExpression() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithExpressionType:(NSExpressionType)type;", selector = "initWithExpressionType:")
    public native NSExpression initWithExpressionType$(NSExpressionType type);

    @ObjCMethodSign(sign = "- (NSExpressionType)expressionType;", selector = "expressionType")
    public native NSExpressionType expressionType();

    @ObjCMethodSign(sign = "- (id)constantValue;", selector = "constantValue")
    public native NSObject constantValue();

    @ObjCMethodSign(sign = "- (NSString *)keyPath;", selector = "keyPath")
    public native NSString keyPath();

    @ObjCMethodSign(sign = "- (NSString *)function;", selector = "function")
    public native NSString function();

    @ObjCMethodSign(sign = "- (NSString *)variable;", selector = "variable")
    public native NSString variable();

    @ObjCMethodSign(sign = "- (NSExpression *)operand;", selector = "operand")
    public native NSExpression operand();

    @ObjCMethodSign(sign = "- (NSArray *)arguments;", selector = "arguments")
    public native NSArray arguments();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)collection NS_AVAILABLE(10_5, 3_0);", selector = "collection")
    public native NSObject collection();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSPredicate *)predicate NS_AVAILABLE(10_5, 3_0);", selector = "predicate")
    public native NSPredicate predicate();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSExpression *)leftExpression NS_AVAILABLE(10_5, 3_0);", selector = "leftExpression")
    public native NSExpression leftExpression();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSExpression *)rightExpression NS_AVAILABLE(10_5, 3_0);", selector = "rightExpression")
    public native NSExpression rightExpression();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (id (^)(id, NSArray *, NSMutableDictionary *))expressionBlock NS_AVAILABLE(10_6, 4_0);", selector = "expressionBlock")
    public native ObjCBlock expressionBlock(NSObject p0, NSArray p1, NSMutableDictionary p2);

    @ObjCMethodSign(sign = "- (id)expressionValueWithObject:(id)object context:(NSMutableDictionary *)context;", selector = "expressionValueWithObject:context:")
    public native NSObject expressionValueWithObject$context$(NSObject object, NSMutableDictionary context);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)allowEvaluation NS_AVAILABLE(10_9, 7_0);", selector = "allowEvaluation")
    public native void allowEvaluation();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionWithFormat:(NSString *)expressionFormat argumentArray:(NSArray *)arguments NS_AVAILABLE(10_6,4_0);", selector = "expressionWithFormat:argumentArray:")
    public static native NSExpression expressionWithFormat$argumentArray$(NSString expressionFormat, NSArray arguments);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionWithFormat:(NSString *)expressionFormat, ...  NS_AVAILABLE(10_6,4_0);", selector = "expressionWithFormat:")
    public static native NSExpression expressionWithFormat$(NSString expressionFormat, NSObject... varArgs);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionWithFormat:(NSString *)expressionFormat arguments:(va_list)argList NS_AVAILABLE(10_6,4_0);", selector = "expressionWithFormat:arguments:")
    public static native NSExpression expressionWithFormat$arguments$(NSString expressionFormat, NSObject... argList);

    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForConstantValue:(id)obj;", selector = "expressionForConstantValue:")
    public static native NSExpression expressionForConstantValue$(NSObject obj);

    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForEvaluatedObject;", selector = "expressionForEvaluatedObject")
    public static native NSExpression expressionForEvaluatedObject();

    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForVariable:(NSString *)string;", selector = "expressionForVariable:")
    public static native NSExpression expressionForVariable$(NSString string);

    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForKeyPath:(NSString *)keyPath;", selector = "expressionForKeyPath:")
    public static native NSExpression expressionForKeyPath$(NSString keyPath);

    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForFunction:(NSString *)name arguments:(NSArray *)parameters;", selector = "expressionForFunction:arguments:")
    public static native NSExpression expressionForFunction$arguments$(NSString name, NSArray parameters);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForAggregate:(NSArray *)subexpressions NS_AVAILABLE(10_5, 3_0);", selector = "expressionForAggregate:")
    public static native NSExpression expressionForAggregate$(NSArray subexpressions);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForUnionSet:(NSExpression *)left with:(NSExpression *)right NS_AVAILABLE(10_5, 3_0);", selector = "expressionForUnionSet:with:")
    public static native NSExpression expressionForUnionSet$with$(NSExpression left, NSExpression right);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForIntersectSet:(NSExpression *)left with:(NSExpression *)right NS_AVAILABLE(10_5, 3_0);", selector = "expressionForIntersectSet:with:")
    public static native NSExpression expressionForIntersectSet$with$(NSExpression left, NSExpression right);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForMinusSet:(NSExpression *)left with:(NSExpression *)right NS_AVAILABLE(10_5, 3_0);", selector = "expressionForMinusSet:with:")
    public static native NSExpression expressionForMinusSet$with$(NSExpression left, NSExpression right);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForSubquery:(NSExpression *)expression usingIteratorVariable:(NSString *)variable predicate:(id)predicate NS_AVAILABLE(10_5, 3_0);", selector = "expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression expressionForSubquery$usingIteratorVariable$predicate$(NSExpression expression, NSString variable, NSObject predicate);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForFunction:(NSExpression *)target selectorName:(NSString *)name arguments:(NSArray *)parameters NS_AVAILABLE(10_5, 3_0);", selector = "expressionForFunction:selectorName:arguments:")
    public static native NSExpression expressionForFunction$selectorName$arguments$(NSExpression target, NSString name, NSArray parameters);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForAnyKey NS_AVAILABLE(10_9, 7_0);", selector = "expressionForAnyKey")
    public static native NSExpression expressionForAnyKey();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSExpression *)expressionForBlock:(id (^)(id evaluatedObject, NSArray *expressions, NSMutableDictionary *context))block arguments:(NSArray *)arguments NS_AVAILABLE(10_6, 4_0);", selector = "expressionForBlock:arguments:")
    public static native NSExpression expressionForBlock$arguments$(ObjCBlock block, NSArray arguments);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSExpression initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
