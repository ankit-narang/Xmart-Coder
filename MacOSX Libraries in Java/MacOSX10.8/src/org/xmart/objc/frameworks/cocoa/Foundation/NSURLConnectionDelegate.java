package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLConnectionDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didFailWithError:(NSError *)error;", selector = "connection:didFailWithError:")
    void connection$didFailWithError$(NSURLConnection connection, NSError error);

    @ObjCMethodSign(sign = "- (BOOL)connectionShouldUseCredentialStorage:(NSURLConnection *)connection;", selector = "connectionShouldUseCredentialStorage:")
    boolean connectionShouldUseCredentialStorage$(NSURLConnection connection);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection willSendRequestForAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "connection:willSendRequestForAuthenticationChallenge:")
    void connection$willSendRequestForAuthenticationChallenge$(NSURLConnection connection, NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (BOOL)connection:(NSURLConnection *)connection canAuthenticateAgainstProtectionSpace:(NSURLProtectionSpace *)protectionSpace;", selector = "connection:canAuthenticateAgainstProtectionSpace:")
    boolean connection$canAuthenticateAgainstProtectionSpace$(NSURLConnection connection, NSURLProtectionSpace protectionSpace);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didReceiveAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "connection:didReceiveAuthenticationChallenge:")
    void connection$didReceiveAuthenticationChallenge$(NSURLConnection connection, NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)connection:(NSURLConnection *)connection didCancelAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "connection:didCancelAuthenticationChallenge:")
    void connection$didCancelAuthenticationChallenge$(NSURLConnection connection, NSURLAuthenticationChallenge challenge);
}
