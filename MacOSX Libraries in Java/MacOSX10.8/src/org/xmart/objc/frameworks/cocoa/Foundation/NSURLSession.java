package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLSession extends NSObject  {
    
    public NSURLSession() {}
    @ObjCPropertyGetter(selector = "delegateQueue")
    public native NSOperationQueue getDelegateQueue();
    @ObjCProperty public NSOperationQueue delegateQueue;

    @ObjCPropertyGetter(selector = "delegate")
    public native NSURLSessionDelegate getDelegate();
    @ObjCProperty public NSURLSessionDelegate delegate;

    @ObjCPropertyGetter(selector = "configuration")
    public native NSURLSessionConfiguration getConfiguration();
    @ObjCProperty public NSURLSessionConfiguration configuration;

    @ObjCPropertyGetter(selector = "sessionDescription")
    public native NSString getSessionDescription();
    @ObjCPropertySetter(selector = "setSessionDescription:")
    public native void setSessionDescription(NSString v);
    @ObjCProperty public NSString sessionDescription;
    
    @ObjCMethodSign(sign = "- (void)finishTasksAndInvalidate;", selector = "finishTasksAndInvalidate")
    public native void finishTasksAndInvalidate();

    @ObjCMethodSign(sign = "- (void)invalidateAndCancel;", selector = "invalidateAndCancel")
    public native void invalidateAndCancel();

    @ObjCMethodSign(sign = "- (void)resetWithCompletionHandler:(void (^)(void))completionHandler;", selector = "resetWithCompletionHandler:")
    public native void resetWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)flushWithCompletionHandler:(void (^)(void))completionHandler;", selector = "flushWithCompletionHandler:")
    public native void flushWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)getTasksWithCompletionHandler:(void (^)(NSArray *dataTasks, NSArray *uploadTasks, NSArray *downloadTasks))completionHandler;", selector = "getTasksWithCompletionHandler:")
    public native void getTasksWithCompletionHandler$(ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithRequest:(NSURLRequest *)request;", selector = "dataTaskWithRequest:")
    public native NSURLSessionDataTask dataTaskWithRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithURL:(NSURL *)url;", selector = "dataTaskWithURL:")
    public native NSURLSessionDataTask dataTaskWithURL$(NSURL url);

    @ObjCMethodSign(sign = "- (NSURLSessionUploadTask *)uploadTaskWithRequest:(NSURLRequest *)request fromFile:(NSURL *)fileURL;", selector = "uploadTaskWithRequest:fromFile:")
    public native NSURLSessionUploadTask uploadTaskWithRequest$fromFile$(NSURLRequest request, NSURL fileURL);

    @ObjCMethodSign(sign = "- (NSURLSessionUploadTask *)uploadTaskWithRequest:(NSURLRequest *)request fromData:(NSData *)bodyData;", selector = "uploadTaskWithRequest:fromData:")
    public native NSURLSessionUploadTask uploadTaskWithRequest$fromData$(NSURLRequest request, NSData bodyData);

    @ObjCMethodSign(sign = "- (NSURLSessionUploadTask *)uploadTaskWithStreamedRequest:(NSURLRequest *)request;", selector = "uploadTaskWithStreamedRequest:")
    public native NSURLSessionUploadTask uploadTaskWithStreamedRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithRequest:(NSURLRequest *)request;", selector = "downloadTaskWithRequest:")
    public native NSURLSessionDownloadTask downloadTaskWithRequest$(NSURLRequest request);

    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithURL:(NSURL *)url;", selector = "downloadTaskWithURL:")
    public native NSURLSessionDownloadTask downloadTaskWithURL$(NSURL url);

    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithResumeData:(NSData *)resumeData;", selector = "downloadTaskWithResumeData:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeData$(NSData resumeData);

    @ObjCMethodSign(sign = "+ (NSURLSession *)sharedSession;", selector = "sharedSession")
    public static native NSURLSession sharedSession();

    @ObjCMethodSign(sign = "+ (NSURLSession *)sessionWithConfiguration:(NSURLSessionConfiguration *)configuration;", selector = "sessionWithConfiguration:")
    public static native NSURLSession sessionWithConfiguration$(NSURLSessionConfiguration configuration);

    @ObjCMethodSign(sign = "+ (NSURLSession *)sessionWithConfiguration:(NSURLSessionConfiguration *)configuration delegate:(id <NSURLSessionDelegate>)delegate delegateQueue:(NSOperationQueue *)queue;", selector = "sessionWithConfiguration:delegate:delegateQueue:")
    public static native NSURLSession sessionWithConfiguration$delegate$delegateQueue$(NSURLSessionConfiguration configuration, NSURLSessionDelegate delegate, NSOperationQueue queue);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithRequest:(NSURLRequest *)request completionHandler:(void (^)(NSData *data, NSURLResponse *response, NSError *error))completionHandler;", selector = "dataTaskWithRequest:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithRequest$completionHandler$(NSURLRequest request, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithURL:(NSURL *)url completionHandler:(void (^)(NSData *data, NSURLResponse *response, NSError *error))completionHandler;", selector = "dataTaskWithURL:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithURL$completionHandler$(NSURL url, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionUploadTask *)uploadTaskWithRequest:(NSURLRequest *)request fromFile:(NSURL *)fileURL completionHandler:(void (^)(NSData *data, NSURLResponse *response, NSError *error))completionHandler;", selector = "uploadTaskWithRequest:fromFile:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequest$fromFile$completionHandler$(NSURLRequest request, NSURL fileURL, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionUploadTask *)uploadTaskWithRequest:(NSURLRequest *)request fromData:(NSData *)bodyData completionHandler:(void (^)(NSData *data, NSURLResponse *response, NSError *error))completionHandler;", selector = "uploadTaskWithRequest:fromData:completionHandler:")
    public native NSURLSessionUploadTask uploadTaskWithRequest$fromData$completionHandler$(NSURLRequest request, NSData bodyData, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithRequest:(NSURLRequest *)request completionHandler:(void (^)(NSURL *location, NSURLResponse *response, NSError *error))completionHandler;", selector = "downloadTaskWithRequest:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithRequest$completionHandler$(NSURLRequest request, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithURL:(NSURL *)url completionHandler:(void (^)(NSURL *location, NSURLResponse *response, NSError *error))completionHandler;", selector = "downloadTaskWithURL:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithURL$completionHandler$(NSURL url, ObjCBlock completionHandler);

    @ObjCCategoryMethod(catname = "NSURLSessionAsynchronousConvenience", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDownloadTask *)downloadTaskWithResumeData:(NSData *)resumeData completionHandler:(void (^)(NSURL *location, NSURLResponse *response, NSError *error))completionHandler;", selector = "downloadTaskWithResumeData:completionHandler:")
    public native NSURLSessionDownloadTask downloadTaskWithResumeData$completionHandler$(NSData resumeData, ObjCBlock completionHandler);

    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSURLSessionDeprecated", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithHTTPGetRequest:(NSURL *)url NS_DEPRECATED(10_9, 10_9, 7_0, 7_0);", selector = "dataTaskWithHTTPGetRequest:")
    public native NSURLSessionDataTask dataTaskWithHTTPGetRequest$(NSURL url);

    /**
     * @since Available in iOS 7.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "NSURLSessionDeprecated", catownername = "NSURLSession")
    @ObjCMethodSign(sign = "- (NSURLSessionDataTask *)dataTaskWithHTTPGetRequest:(NSURL *)url completionHandler:(void (^)(NSData *data, NSURLResponse *response, NSError *error))completionHandler NS_DEPRECATED(10_9, 10_9, 7_0, 7_0);", selector = "dataTaskWithHTTPGetRequest:completionHandler:")
    public native NSURLSessionDataTask dataTaskWithHTTPGetRequest$completionHandler$(NSURL url, ObjCBlock completionHandler);
}
