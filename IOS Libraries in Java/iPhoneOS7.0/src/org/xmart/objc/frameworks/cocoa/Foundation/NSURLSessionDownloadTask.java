package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLSessionDownloadTask extends NSURLSessionTask  {
    
    public NSURLSessionDownloadTask() {}
    
    
    @ObjCMethodSign(sign = "- (void)cancelByProducingResumeData:(void (^)(NSData *resumeData))completionHandler;", selector = "cancelByProducingResumeData:")
    public native void cancelByProducingResumeData$(ObjCBlock completionHandler);
}
