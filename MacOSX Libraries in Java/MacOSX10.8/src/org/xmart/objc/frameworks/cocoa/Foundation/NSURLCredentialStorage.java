package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLCredentialStorage extends NSObject  {
    
    public NSURLCredentialStorage() {}
    
    
    @ObjCMethodSign(sign = "- (NSDictionary *)credentialsForProtectionSpace:(NSURLProtectionSpace *)space;", selector = "credentialsForProtectionSpace:")
    public native NSDictionary credentialsForProtectionSpace$(NSURLProtectionSpace space);

    @ObjCMethodSign(sign = "- (NSDictionary *)allCredentials;", selector = "allCredentials")
    public native NSDictionary allCredentials();

    @ObjCMethodSign(sign = "- (void)setCredential:(NSURLCredential *)credential forProtectionSpace:(NSURLProtectionSpace *)space;", selector = "setCredential:forProtectionSpace:")
    public native void setCredential$forProtectionSpace$(NSURLCredential credential, NSURLProtectionSpace space);

    @ObjCMethodSign(sign = "- (void)removeCredential:(NSURLCredential *)credential forProtectionSpace:(NSURLProtectionSpace *)space;", selector = "removeCredential:forProtectionSpace:")
    public native void removeCredential$forProtectionSpace$(NSURLCredential credential, NSURLProtectionSpace space);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)removeCredential:(NSURLCredential *)credential forProtectionSpace:(NSURLProtectionSpace *)space options:(NSDictionary *)options NS_AVAILABLE(10_9, 7_0);", selector = "removeCredential:forProtectionSpace:options:")
    public native void removeCredential$forProtectionSpace$options$(NSURLCredential credential, NSURLProtectionSpace space, NSDictionary options);

    @ObjCMethodSign(sign = "- (NSURLCredential *)defaultCredentialForProtectionSpace:(NSURLProtectionSpace *)space;", selector = "defaultCredentialForProtectionSpace:")
    public native NSURLCredential defaultCredentialForProtectionSpace$(NSURLProtectionSpace space);

    @ObjCMethodSign(sign = "- (void)setDefaultCredential:(NSURLCredential *)credential forProtectionSpace:(NSURLProtectionSpace *)space;", selector = "setDefaultCredential:forProtectionSpace:")
    public native void setDefaultCredential$forProtectionSpace$(NSURLCredential credential, NSURLProtectionSpace space);

    @ObjCMethodSign(sign = "+ (NSURLCredentialStorage *)sharedCredentialStorage;", selector = "sharedCredentialStorage")
    public static native NSURLCredentialStorage sharedCredentialStorage();
}
