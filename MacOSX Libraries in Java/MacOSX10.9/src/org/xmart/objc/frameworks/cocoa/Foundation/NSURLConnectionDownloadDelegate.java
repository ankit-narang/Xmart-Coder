package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLConnectionDownloadDelegate 
    extends NSURLConnectionDelegate {

    
    
    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didWriteData:(long long)bytesWritten totalBytesWritten:(long long)totalBytesWritten expectedTotalBytes:(long long) expectedTotalBytes;", selector = "connection:didWriteData:totalBytesWritten:expectedTotalBytes:")
    void connection$didWriteData$totalBytesWritten$expectedTotalBytes$(NSURLConnection connection, @LongLong long bytesWritten, @LongLong long totalBytesWritten, @LongLong long expectedTotalBytes);

    @ObjCMethodSign(sign = "- (void)connectionDidResumeDownloading:(NSURLConnection *)connection totalBytesWritten:(long long)totalBytesWritten expectedTotalBytes:(long long) expectedTotalBytes;", selector = "connectionDidResumeDownloading:totalBytesWritten:expectedTotalBytes:")
    void connectionDidResumeDownloading$totalBytesWritten$expectedTotalBytes$(NSURLConnection connection, @LongLong long totalBytesWritten, @LongLong long expectedTotalBytes);

    @ObjCMethodSign(sign = "- (void)connectionDidFinishDownloading:(NSURLConnection *)connection destinationURL:(NSURL *) destinationURL;", selector = "connectionDidFinishDownloading:destinationURL:")
    void connectionDidFinishDownloading$destinationURL$(NSURLConnection connection, NSURL destinationURL);
}
