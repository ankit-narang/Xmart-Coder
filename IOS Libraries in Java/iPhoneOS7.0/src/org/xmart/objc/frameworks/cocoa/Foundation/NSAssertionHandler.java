package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSAssertionHandler extends NSObject  {
    
    public NSAssertionHandler() {}
    
    
    @ObjCMethodSign(sign = "- (void)handleFailureInMethod:(SEL)selector object:(id)object file:(NSString *)fileName lineNumber:(NSInteger)line description:(NSString *)format,... NS_FORMAT_FUNCTION(5,6);", selector = "handleFailureInMethod:object:file:lineNumber:description:")
    public native void handleFailureInMethod$object$file$lineNumber$description$(ObjCSelector selector, NSObject object, NSString fileName, @NSInteger long line, NSString format, NSObject... varArgs);

    @ObjCMethodSign(sign = "- (void)handleFailureInFunction:(NSString *)functionName file:(NSString *)fileName lineNumber:(NSInteger)line description:(NSString *)format,... NS_FORMAT_FUNCTION(4,5);", selector = "handleFailureInFunction:file:lineNumber:description:")
    public native void handleFailureInFunction$file$lineNumber$description$(NSString functionName, NSString fileName, @NSInteger long line, NSString format, NSObject... varArgs);

    @ObjCMethodSign(sign = "+ (NSAssertionHandler *)currentHandler;", selector = "currentHandler")
    public static native NSAssertionHandler currentHandler();
}
