package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLSessionDownloadDelegate 
    extends NSURLSessionTaskDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session downloadTask:(NSURLSessionDownloadTask *)downloadTask                               didFinishDownloadingToURL:(NSURL *)location;", selector = "URLSession:downloadTask:didFinishDownloadingToURL:")
    void URLSession$downloadTask$didFinishDownloadingToURL$(NSURLSession session, NSURLSessionDownloadTask downloadTask, NSURL location);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session downloadTask:(NSURLSessionDownloadTask *)downloadTask                                            didWriteData:(int64_t)bytesWritten                                       totalBytesWritten:(int64_t)totalBytesWritten                               totalBytesExpectedToWrite:(int64_t)totalBytesExpectedToWrite;", selector = "URLSession:downloadTask:didWriteData:totalBytesWritten:totalBytesExpectedToWrite:")
    void URLSession$downloadTask$didWriteData$totalBytesWritten$totalBytesExpectedToWrite$(NSURLSession session, NSURLSessionDownloadTask downloadTask, @LongLong long bytesWritten, @LongLong long totalBytesWritten, @LongLong long totalBytesExpectedToWrite);

    @ObjCMethodSign(sign = "- (void)URLSession:(NSURLSession *)session downloadTask:(NSURLSessionDownloadTask *)downloadTask                                       didResumeAtOffset:(int64_t)fileOffset                                      expectedTotalBytes:(int64_t)expectedTotalBytes;", selector = "URLSession:downloadTask:didResumeAtOffset:expectedTotalBytes:")
    void URLSession$downloadTask$didResumeAtOffset$expectedTotalBytes$(NSURLSession session, NSURLSessionDownloadTask downloadTask, @LongLong long fileOffset, @LongLong long expectedTotalBytes);
}
