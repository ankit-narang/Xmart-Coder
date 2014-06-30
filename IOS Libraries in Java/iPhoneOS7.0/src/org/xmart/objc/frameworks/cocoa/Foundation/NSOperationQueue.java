package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSOperationQueue extends NSObject  {
    
    public NSOperationQueue() {}
    
    
    @ObjCMethodSign(sign = "- (void)addOperation:(NSOperation *)op;", selector = "addOperation:")
    public native void addOperation$(NSOperation op);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)addOperations:(NSArray *)ops waitUntilFinished:(BOOL)wait NS_AVAILABLE(10_6, 4_0);", selector = "addOperations:waitUntilFinished:")
    public native void addOperations$waitUntilFinished$(NSArray ops, boolean wait);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)addOperationWithBlock:(void (^)(void))block NS_AVAILABLE(10_6, 4_0);", selector = "addOperationWithBlock:")
    public native void addOperationWithBlock$(ObjCBlock block);

    @ObjCMethodSign(sign = "- (NSArray *)operations;", selector = "operations")
    public native NSArray operations();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)operationCount NS_AVAILABLE(10_6, 4_0);", selector = "operationCount")
    public native @NSUInteger long operationCount();

    @ObjCMethodSign(sign = "- (NSInteger)maxConcurrentOperationCount;", selector = "maxConcurrentOperationCount")
    public native @NSInteger long maxConcurrentOperationCount();

    @ObjCMethodSign(sign = "- (void)setMaxConcurrentOperationCount:(NSInteger)cnt;", selector = "setMaxConcurrentOperationCount:")
    public native void setMaxConcurrentOperationCount(@NSInteger long cnt);

    @ObjCMethodSign(sign = "- (void)setSuspended:(BOOL)b;", selector = "setSuspended:")
    public native void setSuspended(boolean b);

    @ObjCMethodSign(sign = "- (BOOL)isSuspended;", selector = "isSuspended")
    public native boolean isSuspended();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setName:(NSString *)n NS_AVAILABLE(10_6, 4_0);", selector = "setName:")
    public native void setName(NSString n);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSString *)name NS_AVAILABLE(10_6, 4_0);", selector = "name")
    public native NSString name();

    @ObjCMethodSign(sign = "- (void)cancelAllOperations;", selector = "cancelAllOperations")
    public native void cancelAllOperations();

    @ObjCMethodSign(sign = "- (void)waitUntilAllOperationsAreFinished;", selector = "waitUntilAllOperationsAreFinished")
    public native void waitUntilAllOperationsAreFinished();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)currentQueue NS_AVAILABLE(10_6, 4_0);", selector = "currentQueue")
    public static native NSObject currentQueue();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)mainQueue NS_AVAILABLE(10_6, 4_0);", selector = "mainQueue")
    public static native NSObject mainQueue();
}
