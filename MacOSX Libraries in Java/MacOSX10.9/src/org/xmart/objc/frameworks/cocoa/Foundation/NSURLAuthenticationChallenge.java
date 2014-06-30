package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLAuthenticationChallenge extends NSObject implements NSSecureCoding {
    
    public NSURLAuthenticationChallenge() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithProtectionSpace:(NSURLProtectionSpace *)space proposedCredential:(NSURLCredential *)credential previousFailureCount:(NSInteger)previousFailureCount failureResponse:(NSURLResponse *)response error:(NSError *)error sender:(id<NSURLAuthenticationChallengeSender>)sender;", selector = "initWithProtectionSpace:proposedCredential:previousFailureCount:failureResponse:error:sender:")
    public native NSURLAuthenticationChallenge initWithProtectionSpace$proposedCredential$previousFailureCount$failureResponse$error$sender$(NSURLProtectionSpace space, NSURLCredential credential, @NSInteger long previousFailureCount, NSURLResponse response, NSError error, NSURLAuthenticationChallengeSender sender);

    @ObjCMethodSign(sign = "- (id)initWithAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge sender:(id<NSURLAuthenticationChallengeSender>)sender;", selector = "initWithAuthenticationChallenge:sender:")
    public native NSURLAuthenticationChallenge initWithAuthenticationChallenge$sender$(NSURLAuthenticationChallenge challenge, NSURLAuthenticationChallengeSender sender);

    @ObjCMethodSign(sign = "- (NSURLProtectionSpace *)protectionSpace;", selector = "protectionSpace")
    public native NSURLProtectionSpace protectionSpace();

    @ObjCMethodSign(sign = "- (NSURLCredential *)proposedCredential;", selector = "proposedCredential")
    public native NSURLCredential proposedCredential();

    @ObjCMethodSign(sign = "- (NSInteger)previousFailureCount;", selector = "previousFailureCount")
    public native @NSInteger long previousFailureCount();

    @ObjCMethodSign(sign = "- (NSURLResponse *)failureResponse;", selector = "failureResponse")
    public native NSURLResponse failureResponse();

    @ObjCMethodSign(sign = "- (NSError *)error;", selector = "error")
    public native NSError error();

    @ObjCMethodSign(sign = "- (id<NSURLAuthenticationChallengeSender>)sender;", selector = "sender")
    public native NSURLAuthenticationChallengeSender sender();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURLAuthenticationChallenge initWithCoder$(NSCoder aDecoder);
}
