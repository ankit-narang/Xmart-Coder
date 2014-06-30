package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLSessionDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session didBecomeInvalidWithError:(NSError *)error;", selector = "URLSession:didBecomeInvalidWithError:")
    void URLSession$didBecomeInvalidWithError$(NSURLSession session, NSError error);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session didReceiveChallenge:(NSURLAuthenticationChallenge *)challenge                                              completionHandler:(void (^)(NSURLSessionAuthChallengeDisposition disposition, NSURLCredential *credential))completionHandler;", selector = "URLSession:didReceiveChallenge:completionHandler:")
    void URLSession$didReceiveChallenge$completionHandler$(NSURLSession session, NSURLAuthenticationChallenge challenge, ObjCBlock completionHandler);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)URLSessionDidFinishEventsForBackgroundURLSession:(NSURLSession *)session NS_AVAILABLE_IOS(7_0);", selector = "URLSessionDidFinishEventsForBackgroundURLSession:")
    void URLSessionDidFinishEventsForBackgroundURLSession$(NSURLSession session);
}
