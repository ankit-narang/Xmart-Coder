package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLConnectionDataDelegate 
    extends NSURLConnectionDelegate {

    
    
    @ObjCMethodSign(sign = "- (NSURLRequest *)connection:(NSURLConnection *)connection willSendRequest:(NSURLRequest *)request redirectResponse:(NSURLResponse *)response;", selector = "connection:willSendRequest:redirectResponse:")
    NSURLRequest connection$willSendRequest$redirectResponse$(NSURLConnection connection, NSURLRequest request, NSURLResponse response);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didReceiveResponse:(NSURLResponse *)response;", selector = "connection:didReceiveResponse:")
    void connection$didReceiveResponse$(NSURLConnection connection, NSURLResponse response);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didReceiveData:(NSData *)data;", selector = "connection:didReceiveData:")
    void connection$didReceiveData$(NSURLConnection connection, NSData data);

    @ObjCMethodSign(sign = "- (NSInputStream *)connection:(NSURLConnection *)connection needNewBodyStream:(NSURLRequest *)request;", selector = "connection:needNewBodyStream:")
    NSInputStream connection$needNewBodyStream$(NSURLConnection connection, NSURLRequest request);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection   didSendBodyData:(NSInteger)bytesWritten                                                  totalBytesWritten:(NSInteger)totalBytesWritten                                          totalBytesExpectedToWrite:(NSInteger)totalBytesExpectedToWrite;", selector = "connection:didSendBodyData:totalBytesWritten:totalBytesExpectedToWrite:")
    void connection$didSendBodyData$totalBytesWritten$totalBytesExpectedToWrite$(NSURLConnection connection, @NSInteger long bytesWritten, @NSInteger long totalBytesWritten, @NSInteger long totalBytesExpectedToWrite);

    @ObjCMethodSign(sign = "- (NSCachedURLResponse *)connection:(NSURLConnection *)connection willCacheResponse:(NSCachedURLResponse *)cachedResponse;", selector = "connection:willCacheResponse:")
    NSCachedURLResponse connection$willCacheResponse$(NSURLConnection connection, NSCachedURLResponse cachedResponse);

    @ObjCMethodSign(sign = "- (void)connectionDidFinishLoading:(NSURLConnection *)connection;", selector = "connectionDidFinishLoading:")
    void connectionDidFinishLoading$(NSURLConnection connection);
}
