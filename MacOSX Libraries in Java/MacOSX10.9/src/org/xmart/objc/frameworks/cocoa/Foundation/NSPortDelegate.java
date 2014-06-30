package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSPortDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)handlePortMessage:(NSPortMessage *)message;", selector = "handlePortMessage:")
    void handlePortMessage$(NSPortMessage message);
}
