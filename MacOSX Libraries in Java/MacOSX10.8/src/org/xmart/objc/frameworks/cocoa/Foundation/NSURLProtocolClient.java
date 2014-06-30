package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLProtocolClient 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol wasRedirectedToRequest:(NSURLRequest *)request redirectResponse:(NSURLResponse *)redirectResponse;", selector = "URLProtocol:wasRedirectedToRequest:redirectResponse:")
    void URLProtocol$wasRedirectedToRequest$redirectResponse$(NSURLProtocol protocol, NSURLRequest request, NSURLResponse redirectResponse);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol cachedResponseIsValid:(NSCachedURLResponse *)cachedResponse;", selector = "URLProtocol:cachedResponseIsValid:")
    void URLProtocol$cachedResponseIsValid$(NSURLProtocol protocol, NSCachedURLResponse cachedResponse);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol didReceiveResponse:(NSURLResponse *)response cacheStoragePolicy:(NSURLCacheStoragePolicy)policy;", selector = "URLProtocol:didReceiveResponse:cacheStoragePolicy:")
    void URLProtocol$didReceiveResponse$cacheStoragePolicy$(NSURLProtocol protocol, NSURLResponse response, NSURLCacheStoragePolicy policy);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol didLoadData:(NSData *)data;", selector = "URLProtocol:didLoadData:")
    void URLProtocol$didLoadData$(NSURLProtocol protocol, NSData data);

    @ObjCMethodSign(sign = "- (void)URLProtocolDidFinishLoading:(NSURLProtocol *)protocol;", selector = "URLProtocolDidFinishLoading:")
    void URLProtocolDidFinishLoading$(NSURLProtocol protocol);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol didFailWithError:(NSError *)error;", selector = "URLProtocol:didFailWithError:")
    void URLProtocol$didFailWithError$(NSURLProtocol protocol, NSError error);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol didReceiveAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "URLProtocol:didReceiveAuthenticationChallenge:")
    void URLProtocol$didReceiveAuthenticationChallenge$(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)URLProtocol:(NSURLProtocol *)protocol didCancelAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "URLProtocol:didCancelAuthenticationChallenge:")
    void URLProtocol$didCancelAuthenticationChallenge$(NSURLProtocol protocol, NSURLAuthenticationChallenge challenge);
}
