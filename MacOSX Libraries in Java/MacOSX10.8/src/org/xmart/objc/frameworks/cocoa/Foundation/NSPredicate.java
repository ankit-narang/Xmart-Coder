package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPredicate extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSPredicate() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)predicateFormat;", selector = "predicateFormat")
    public native NSString predicateFormat();

    @ObjCMethodSign(sign = "- (NSPredicate *)predicateWithSubstitutionVariables:(NSDictionary *)variables;", selector = "predicateWithSubstitutionVariables:")
    public native NSPredicate predicateWithSubstitutionVariables$(NSDictionary variables);

    @ObjCMethodSign(sign = "- (BOOL)evaluateWithObject:(id)object;", selector = "evaluateWithObject:")
    public native boolean evaluateWithObject$(NSObject object);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)evaluateWithObject:(id)object substitutionVariables:(NSDictionary *)bindings NS_AVAILABLE(10_5, 3_0);", selector = "evaluateWithObject:substitutionVariables:")
    public native boolean evaluateWithObject$substitutionVariables$(NSObject object, NSDictionary bindings);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)allowEvaluation NS_AVAILABLE(10_9, 7_0);", selector = "allowEvaluation")
    public native void allowEvaluation();

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithFormat:(NSString *)predicateFormat argumentArray:(NSArray *)arguments;", selector = "predicateWithFormat:argumentArray:")
    public static native NSPredicate predicateWithFormat$argumentArray$(NSString predicateFormat, NSArray arguments);

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithFormat:(NSString *)predicateFormat, ...;", selector = "predicateWithFormat:")
    public static native NSPredicate predicateWithFormat$(NSString predicateFormat, NSObject... varArgs);

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithFormat:(NSString *)predicateFormat arguments:(va_list)argList;", selector = "predicateWithFormat:arguments:")
    public static native NSPredicate predicateWithFormat$arguments$(NSString predicateFormat, NSObject... argList);

    @ObjCMethodSign(sign = "+ (NSPredicate *)predicateWithValue:(BOOL)value;", selector = "predicateWithValue:")
    public static native NSPredicate predicateWithValue$(boolean value);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSPredicate*)predicateWithBlock:(BOOL (^)(id evaluatedObject, NSDictionary *bindings))block NS_AVAILABLE(10_6, 4_0);", selector = "predicateWithBlock:")
    public static native NSPredicate predicateWithBlock$(ObjCBlock block);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSPredicate initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
