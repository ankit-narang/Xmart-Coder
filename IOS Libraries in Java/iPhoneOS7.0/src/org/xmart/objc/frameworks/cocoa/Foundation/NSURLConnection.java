package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLConnection extends NSObject  {
    
    public NSURLConnection() {}
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)initWithRequest:(NSURLRequest *)request delegate:(id)delegate startImmediately:(BOOL)startImmediately NS_AVAILABLE(10_5, 2_0);", selector = "initWithRequest:delegate:startImmediately:")
    public native NSURLConnection initWithRequest$delegate$startImmediately$(NSURLRequest request, NSObject delegate, boolean startImmediately);

    @ObjCMethodSign(sign = "- (id)initWithRequest:(NSURLRequest *)request delegate:(id)delegate;", selector = "initWithRequest:delegate:")
    public native NSURLConnection initWithRequest$delegate$(NSURLRequest request, NSObject delegate);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURLRequest *)originalRequest NS_AVAILABLE(10_8, 5_0);", selector = "originalRequest")
    public native NSURLRequest originalRequest();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSURLRequest *)currentRequest NS_AVAILABLE(10_8, 5_0);", selector = "currentRequest")
    public native NSURLRequest currentRequest();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)start NS_AVAILABLE(10_5, 2_0);", selector = "start")
    public native void start();

    @ObjCMethodSign(sign = "- (void)cancel;", selector = "cancel")
    public native void cancel();

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode NS_AVAILABLE(10_5, 2_0);", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    /**
     * @since Available in iOS 2.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)unscheduleFromRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode NS_AVAILABLE(10_5, 2_0);", selector = "unscheduleFromRunLoop:forMode:")
    public native void unscheduleFromRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setDelegateQueue:(NSOperationQueue*) queue NS_AVAILABLE(10_7, 5_0);", selector = "setDelegateQueue:")
    public native void setDelegateQueue(NSOperationQueue queue);

    @ObjCMethodSign(sign = "+ (NSURLConnection*)connectionWithRequest:(NSURLRequest *)request delegate:(id)delegate;", selector = "connectionWithRequest:delegate:")
    public static native NSURLConnection connectionWithRequest$delegate$(NSURLRequest request, NSObject delegate);

    @ObjCMethodSign(sign = "+ (BOOL)canHandleRequest:(NSURLRequest *)request;", selector = "canHandleRequest:")
    public static native boolean canHandleRequest$(NSURLRequest request);

    @ObjCCategoryMethod(catname = "NSURLConnectionSynchronousLoading", catownername = "NSURLConnection")
    @ObjCMethodSign(sign = "+ (NSData *)sendSynchronousRequest:(NSURLRequest *)request returningResponse:(NSURLResponse **)response error:(NSError **)error;", selector = "sendSynchronousRequest:returningResponse:error:")
    public static native NSData sendSynchronousRequest$returningResponse$error$(NSURLRequest request, NSURLResponse[] response, NSError[] error);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSURLConnectionQueuedLoading", catownername = "NSURLConnection")
    @ObjCMethodSign(sign = "+ (void)sendAsynchronousRequest:(NSURLRequest*) request                           queue:(NSOperationQueue*) queue               completionHandler:(void (^)(NSURLResponse* response, NSData* data, NSError* connectionError)) handler NS_AVAILABLE(10_7, 5_0);", selector = "sendAsynchronousRequest:queue:completionHandler:")
    public static native void sendAsynchronousRequest$queue$completionHandler$(NSURLRequest request, NSOperationQueue queue, ObjCBlock handler);
}
