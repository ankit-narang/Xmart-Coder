package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSOperation extends NSObject  {
    
    public NSOperation() {}
    
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSOperation init();

    @ObjCMethodSign(sign = "- (void)start;", selector = "start")
    public native void start();

    @ObjCMethodSign(sign = "- (void)main;", selector = "main")
    public native void main();

    @ObjCMethodSign(sign = "- (BOOL)isCancelled;", selector = "isCancelled")
    public native boolean isCancelled();

    @ObjCMethodSign(sign = "- (void)cancel;", selector = "cancel")
    public native void cancel();

    @ObjCMethodSign(sign = "- (BOOL)isExecuting;", selector = "isExecuting")
    public native boolean isExecuting();

    @ObjCMethodSign(sign = "- (BOOL)isFinished;", selector = "isFinished")
    public native boolean isFinished();

    @ObjCMethodSign(sign = "- (BOOL)isConcurrent;", selector = "isConcurrent")
    public native boolean isConcurrent();

    @ObjCMethodSign(sign = "- (BOOL)isReady;", selector = "isReady")
    public native boolean isReady();

    @ObjCMethodSign(sign = "- (void)addDependency:(NSOperation *)op;", selector = "addDependency:")
    public native void addDependency$(NSOperation op);

    @ObjCMethodSign(sign = "- (void)removeDependency:(NSOperation *)op;", selector = "removeDependency:")
    public native void removeDependency$(NSOperation op);

    @ObjCMethodSign(sign = "- (NSArray *)dependencies;", selector = "dependencies")
    public native NSArray dependencies();

    @ObjCMethodSign(sign = "- (NSOperationQueuePriority)queuePriority;", selector = "queuePriority")
    public native NSOperationQueuePriority queuePriority();

    @ObjCMethodSign(sign = "- (void)setQueuePriority:(NSOperationQueuePriority)p;", selector = "setQueuePriority:")
    public native void setQueuePriority(NSOperationQueuePriority p);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void (^)(void))completionBlock NS_AVAILABLE(10_6, 4_0);", selector = "completionBlock")
    public native ObjCBlock completionBlock();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setCompletionBlock:(void (^)(void))block NS_AVAILABLE(10_6, 4_0);", selector = "setCompletionBlock:")
    public native void setCompletionBlock(ObjCBlock block);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)waitUntilFinished NS_AVAILABLE(10_6, 4_0);", selector = "waitUntilFinished")
    public native void waitUntilFinished();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (double)threadPriority NS_AVAILABLE(10_6, 4_0);", selector = "threadPriority")
    public native double threadPriority();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setThreadPriority:(double)p NS_AVAILABLE(10_6, 4_0);", selector = "setThreadPriority:")
    public native void setThreadPriority(double p);
}
