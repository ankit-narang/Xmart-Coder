package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSDecimalNumberBehaviors 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSRoundingMode)roundingMode;", selector = "roundingMode")
    NSRoundingMode roundingMode();

    @ObjCMethodSign(sign = "- (short)scale;", selector = "scale")
    short scale();

    @ObjCMethodSign(sign = "- (NSDecimalNumber *)exceptionDuringOperation:(SEL)operation error:(NSCalculationError)error leftOperand:(NSDecimalNumber *)leftOperand rightOperand:(NSDecimalNumber *)rightOperand;", selector = "exceptionDuringOperation:error:leftOperand:rightOperand:")
    NSDecimalNumber exceptionDuringOperation$error$leftOperand$rightOperand$(ObjCSelector operation, NSCalculationError error, NSDecimalNumber leftOperand, NSDecimalNumber rightOperand);
}
