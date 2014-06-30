package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSPipe extends NSObject  {
    
    public NSPipe() {}
    
    
    @ObjCMethodSign(sign = "- (NSFileHandle *)fileHandleForReading;", selector = "fileHandleForReading")
    public native NSFileHandle fileHandleForReading();

    @ObjCMethodSign(sign = "- (NSFileHandle *)fileHandleForWriting;", selector = "fileHandleForWriting")
    public native NSFileHandle fileHandleForWriting();

    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSPipe init();

    @ObjCMethodSign(sign = "+ (id)pipe;", selector = "pipe")
    public static native NSObject pipe();
}
