package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSLocking 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)lock;", selector = "lock")
    void lock();

    @ObjCMethodSign(sign = "- (void)unlock;", selector = "unlock")
    void unlock();
}
