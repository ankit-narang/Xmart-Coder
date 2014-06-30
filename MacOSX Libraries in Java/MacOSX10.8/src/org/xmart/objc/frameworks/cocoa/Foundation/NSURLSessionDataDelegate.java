package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLSessionDataDelegate 
    extends NSURLSessionTaskDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session dataTask:(NSURLSessionDataTask *)dataTask                                  didReceiveResponse:(NSURLResponse *)response                                   completionHandler:(void (^)(NSURLSessionResponseDisposition disposition))completionHandler;", selector = "URLSession:dataTask:didReceiveResponse:completionHandler:")
    void URLSession$dataTask$didReceiveResponse$completionHandler$(NSURLSession session, NSURLSessionDataTask dataTask, NSURLResponse response, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session dataTask:(NSURLSessionDataTask *)dataTask                               didBecomeDownloadTask:(NSURLSessionDownloadTask *)downloadTask;", selector = "URLSession:dataTask:didBecomeDownloadTask:")
    void URLSession$dataTask$didBecomeDownloadTask$(NSURLSession session, NSURLSessionDataTask dataTask, NSURLSessionDownloadTask downloadTask);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session dataTask:(NSURLSessionDataTask *)dataTask                                      didReceiveData:(NSData *)data;", selector = "URLSession:dataTask:didReceiveData:")
    void URLSession$dataTask$didReceiveData$(NSURLSession session, NSURLSessionDataTask dataTask, NSData data);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session dataTask:(NSURLSessionDataTask *)dataTask                                   willCacheResponse:(NSCachedURLResponse *)proposedResponse                                    completionHandler:(void (^)(NSCachedURLResponse *cachedResponse))completionHandler;", selector = "URLSession:dataTask:willCacheResponse:completionHandler:")
    void URLSession$dataTask$willCacheResponse$completionHandler$(NSURLSession session, NSURLSessionDataTask dataTask, NSCachedURLResponse proposedResponse, ObjCBlock completionHandler);
}
