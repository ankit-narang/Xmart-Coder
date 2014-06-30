package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDataDetector extends NSRegularExpression  {
    
    public NSDataDetector() {}
    @ObjCPropertyGetter(selector = "checkingTypes")
    public native @Unsigned @LongLong long getCheckingTypes();
    @ObjCProperty public @Unsigned @LongLong long checkingTypes;
    
    @ObjCMethodSign(sign = "- (id)initWithTypes:(NSTextCheckingTypes)checkingTypes error:(NSError **)error;", selector = "initWithTypes:error:")
    public native NSDataDetector initWithTypes$error$(@Unsigned @LongLong long checkingTypes, NSError[] error);

    @ObjCMethodSign(sign = "+ (NSDataDetector *)dataDetectorWithTypes:(NSTextCheckingTypes)checkingTypes error:(NSError **)error;", selector = "dataDetectorWithTypes:error:")
    public static native NSDataDetector dataDetectorWithTypes$error$(@Unsigned @LongLong long checkingTypes, NSError[] error);
}
