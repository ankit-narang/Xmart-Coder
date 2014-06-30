package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSMachPortDelegate 
    extends NSPortDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)handleMachMessage:(void *)msg;", selector = "handleMachMessage:")
    void handleMachMessage$(@VoidPointer() Object msg);
}
