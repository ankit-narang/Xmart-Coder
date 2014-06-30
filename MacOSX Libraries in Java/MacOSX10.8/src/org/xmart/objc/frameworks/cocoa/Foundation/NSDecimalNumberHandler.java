package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDecimalNumberHandler extends NSObject implements NSDecimalNumberBehaviors, NSCoding {
    
    public NSDecimalNumberHandler() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithRoundingMode:(NSRoundingMode)roundingMode scale:(short)scale raiseOnExactness:(BOOL)exact raiseOnOverflow:(BOOL)overflow raiseOnUnderflow:(BOOL)underflow raiseOnDivideByZero:(BOOL)divideByZero;", selector = "initWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
    public native NSDecimalNumberHandler initWithRoundingMode$scale$raiseOnExactness$raiseOnOverflow$raiseOnUnderflow$raiseOnDivideByZero$(NSRoundingMode roundingMode, short scale, boolean exact, boolean overflow, boolean underflow, boolean divideByZero);

    @ObjCMethodSign(sign = "+ (id)defaultDecimalNumberHandler;", selector = "defaultDecimalNumberHandler")
    public static native NSObject defaultDecimalNumberHandler();

    @ObjCMethodSign(sign = "+ (id)decimalNumberHandlerWithRoundingMode:(NSRoundingMode)roundingMode scale:(short)scale raiseOnExactness:(BOOL)exact raiseOnOverflow:(BOOL)overflow raiseOnUnderflow:(BOOL)underflow raiseOnDivideByZero:(BOOL)divideByZero;", selector = "decimalNumberHandlerWithRoundingMode:scale:raiseOnExactness:raiseOnOverflow:raiseOnUnderflow:raiseOnDivideByZero:")
    public static native NSObject decimalNumberHandlerWithRoundingMode$scale$raiseOnExactness$raiseOnOverflow$raiseOnUnderflow$raiseOnDivideByZero$(NSRoundingMode roundingMode, short scale, boolean exact, boolean overflow, boolean underflow, boolean divideByZero);

    @ObjCMethodSign(sign = "- (NSRoundingMode)roundingMode;", selector = "roundingMode")
    public native NSRoundingMode roundingMode();

    @ObjCMethodSign(sign = "- (short)scale;", selector = "scale")
    public native short scale();

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)exceptionDuringOperation:(SEL)operation error:(NSCalculationError)error leftOperand:(NSDecimalNumber *)leftOperand rightOperand:(NSDecimalNumber *)rightOperand;", selector = "exceptionDuringOperation:error:leftOperand:rightOperand:")
    public native NSDecimalNumber exceptionDuringOperation$error$leftOperand$rightOperand$(ObjCSelector operation, NSCalculationError error, NSDecimalNumber leftOperand, NSDecimalNumber rightOperand);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSDecimalNumberHandler initWithCoder$(NSCoder aDecoder);
}
