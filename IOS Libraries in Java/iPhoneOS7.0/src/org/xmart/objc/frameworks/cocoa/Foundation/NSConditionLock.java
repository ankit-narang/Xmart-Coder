package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSConditionLock extends NSObject implements NSLocking {
    
    public NSConditionLock() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithCondition:(NSInteger)condition;", selector = "initWithCondition:")
    public native NSConditionLock initWithCondition$(@NSInteger long condition);

    @ObjCMethodSign(sign = "- (NSInteger)condition;", selector = "condition")
    public native @NSInteger long condition();

    @ObjCMethodSign(sign = "- (void)lockWhenCondition:(NSInteger)condition;", selector = "lockWhenCondition:")
    public native void lockWhenCondition$(@NSInteger long condition);

    @ObjCMethodSign(sign = "- (BOOL)tryLock;", selector = "tryLock")
    public native boolean tryLock();

    @ObjCMethodSign(sign = "- (BOOL)tryLockWhenCondition:(NSInteger)condition;", selector = "tryLockWhenCondition:")
    public native boolean tryLockWhenCondition$(@NSInteger long condition);

    @ObjCMethodSign(sign = "- (void)unlockWithCondition:(NSInteger)condition;", selector = "unlockWithCondition:")
    public native void unlockWithCondition$(@NSInteger long condition);

    @ObjCMethodSign(sign = "- (BOOL)lockBeforeDate:(NSDate *)limit;", selector = "lockBeforeDate:")
    public native boolean lockBeforeDate$(NSDate limit);

    @ObjCMethodSign(sign = "- (BOOL)lockWhenCondition:(NSInteger)condition beforeDate:(NSDate *)limit;", selector = "lockWhenCondition:beforeDate:")
    public native boolean lockWhenCondition$beforeDate$(@NSInteger long condition, NSDate limit);

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
