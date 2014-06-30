package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSRecursiveLock extends NSObject implements NSLocking {
    
    public NSRecursiveLock() {}
    
    
    @ObjCMethodSign(sign = "- (BOOL)tryLock;", selector = "tryLock")
    public native boolean tryLock();

    @ObjCMethodSign(sign = "- (BOOL)lockBeforeDate:(NSDate *)limit;", selector = "lockBeforeDate:")
    public native boolean lockBeforeDate$(NSDate limit);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setName:(NSString *)n NS_AVAILABLE(10_5, 2_0);", selector = "setName:")
    public native void setName(NSString n);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)name NS_AVAILABLE(10_5, 2_0);", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (void)lock;", selector = "lock")
    public native void lock();

    @ObjCMethodSign(sign = "- (void)unlock;", selector = "unlock")
    public native void unlock();
}
