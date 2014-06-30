package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSBlockOperation extends NSOperation  {
    
    public NSBlockOperation() {}
    
    
    @ObjCMethodSign(sign = "- (void)addExecutionBlock:(void (^)(void))block;", selector = "addExecutionBlock:")
    public native void addExecutionBlock$(ObjCBlock block);

    @ObjCMethodSign(sign = "- (NSArray *)executionBlocks;", selector = "executionBlocks")
    public native NSArray executionBlocks();

    @ObjCMethodSign(sign = "+ (id)blockOperationWithBlock:(void (^)(void))block;", selector = "blockOperationWithBlock:")
    public static native NSObject blockOperationWithBlock$(ObjCBlock block);
}
