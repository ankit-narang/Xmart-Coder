package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSCondition extends NSObject implements NSLocking {
    
    public NSCondition() {}
    
    
    @ObjCMethodSign(sign = "- (void)wait;", selector = "wait")
    public native void wait__ObjC();

    @ObjCMethodSign(sign = "- (BOOL)waitUntilDate:(NSDate *)limit;", selector = "waitUntilDate:")
    public native boolean waitUntilDate$(NSDate limit);

    @ObjCMethodSign(sign = "- (void)signal;", selector = "signal")
    public native void signal();

    @ObjCMethodSign(sign = "- (void)broadcast;", selector = "broadcast")
    public native void broadcast();

    @ObjCMethodSign(sign = "- (void)setName:(NSString *)n;", selector = "setName:")
    public native void setName(NSString n);

    @ObjCMethodSign(sign = "- (NSString *)name;", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (void)lock;", selector = "lock")
    public native void lock();

    @ObjCMethodSign(sign = "- (void)unlock;", selector = "unlock")
    public native void unlock();
}
