package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSStreamDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)stream:(NSStream *)aStream handleEvent:(NSStreamEvent)eventCode;", selector = "stream:handleEvent:")
    void stream$handleEvent$(NSStream aStream, NSStreamEvent eventCode);
}
