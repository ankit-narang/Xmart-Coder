package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLSessionTaskDelegate 
    extends NSURLSessionDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task                      willPerformHTTPRedirection:(NSHTTPURLResponse *)response                                      newRequest:(NSURLRequest *)request                               completionHandler:(void (^)(NSURLRequest *))completionHandler;", selector = "URLSession:task:willPerformHTTPRedirection:newRequest:completionHandler:")
    void URLSession$task$willPerformHTTPRedirection$newRequest$completionHandler$(NSURLSession session, NSURLSessionTask task, NSHTTPURLResponse response, NSURLRequest request, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task                             didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge                                completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition disposition, NSURLCredential *credential))completionHandler;", selector = "URLSession:task:didReceiveChallenge:completionHandler:")
    void URLSession$task$didReceiveChallenge$completionHandler$(NSURLSession session, NSURLSessionTask task, NSURLAuthenticationChallenge challenge, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task                               needNewBodyStream:(void (^)(NSInputStream *bodyStream))completionHandler;", selector = "URLSession:task:needNewBodyStream:")
    void URLSession$task$needNewBodyStream$(NSURLSession session, NSURLSessionTask task, ObjCBlock completionHandler);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task                                 didSendBodyData:(int64_t)bytesSent                                  totalBytesSent:(int64_t)totalBytesSent                        totalBytesExpectedToSend:(int64_t)totalBytesExpectedToSend;", selector = "URLSession:task:didSendBodyData:totalBytesSent:totalBytesExpectedToSend:")
    void URLSession$task$didSendBodyData$totalBytesSent$totalBytesExpectedToSend$(NSURLSession session, NSURLSessionTask task, @LongLong long bytesSent, @LongLong long totalBytesSent, @LongLong long totalBytesExpectedToSend);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session task:(NSURLSessionTask *)task                            didCompleteWithError:(NSError *)error;", selector = "URLSession:task:didCompleteWithError:")
    void URLSession$task$didCompleteWithError$(NSURLSession session, NSURLSessionTask task, NSError error);
}
