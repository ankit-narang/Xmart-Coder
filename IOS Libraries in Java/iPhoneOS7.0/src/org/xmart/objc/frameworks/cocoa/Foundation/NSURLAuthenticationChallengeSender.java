package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSURLAuthenticationChallengeSender 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)useCredential:(NSURLCredential *)credential forAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "useCredential:forAuthenticationChallenge:")
    void useCredential$forAuthenticationChallenge$(NSURLCredential credential, NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)continueWithoutCredentialForAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "continueWithoutCredentialForAuthenticationChallenge:")
    void continueWithoutCredentialForAuthenticationChallenge$(NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)cancelAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "cancelAuthenticationChallenge:")
    void cancelAuthenticationChallenge$(NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)performDefaultHandlingForAuthenticationChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "performDefaultHandlingForAuthenticationChallenge:")
    void performDefaultHandlingForAuthenticationChallenge$(NSURLAuthenticationChallenge challenge);

    @ObjCMethodSign(sign = "- (void)rejectProtectionSpaceAndContinueWithChallenge:(NSURLAuthenticationChallenge *)challenge;", selector = "rejectProtectionSpaceAndContinueWithChallenge:")
    void rejectProtectionSpaceAndContinueWithChallenge$(NSURLAuthenticationChallenge challenge);
}
