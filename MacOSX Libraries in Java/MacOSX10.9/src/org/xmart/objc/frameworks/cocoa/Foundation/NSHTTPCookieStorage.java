package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSHTTPCookieStorage extends NSObject  {
    
    public NSHTTPCookieStorage() {}
    
    
    @ObjCMethodSign(sign = "- (NSArray *)cookies;", selector = "cookies")
    public native NSArray cookies();

    @ObjCMethodSign(sign = "- (void)setCookie:(NSHTTPCookie *)cookie;", selector = "setCookie:")
    public native void setCookie(NSHTTPCookie cookie);

    @ObjCMethodSign(sign = "- (void)deleteCookie:(NSHTTPCookie *)cookie;", selector = "deleteCookie:")
    public native void deleteCookie$(NSHTTPCookie cookie);

    @ObjCMethodSign(sign = "- (NSArray *)cookiesForURL:(NSURL *)URL;", selector = "cookiesForURL:")
    public native NSArray cookiesForURL$(NSURL URL);

    @ObjCMethodSign(sign = "- (void)setCookies:(NSArray *)cookies forURL:(NSURL *)URL mainDocumentURL:(NSURL *)mainDocumentURL;", selector = "setCookies:forURL:mainDocumentURL:")
    public native void setCookies$forURL$mainDocumentURL$(NSArray cookies, NSURL URL, NSURL mainDocumentURL);

    @ObjCMethodSign(sign = "- (NSHTTPCookieAcceptPolicy)cookieAcceptPolicy;", selector = "cookieAcceptPolicy")
    public native NSHTTPCookieAcceptPolicy cookieAcceptPolicy();

    @ObjCMethodSign(sign = "- (void)setCookieAcceptPolicy:(NSHTTPCookieAcceptPolicy)cookieAcceptPolicy;", selector = "setCookieAcceptPolicy:")
    public native void setCookieAcceptPolicy(NSHTTPCookieAcceptPolicy cookieAcceptPolicy);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray*)sortedCookiesUsingDescriptors:(NSArray*) sortOrder NS_AVAILABLE(10_7, 5_0);", selector = "sortedCookiesUsingDescriptors:")
    public native NSArray sortedCookiesUsingDescriptors$(NSArray sortOrder);

    @ObjCMethodSign(sign = "+ (NSHTTPCookieStorage *)sharedHTTPCookieStorage;", selector = "sharedHTTPCookieStorage")
    public static native NSHTTPCookieStorage sharedHTTPCookieStorage();
}
