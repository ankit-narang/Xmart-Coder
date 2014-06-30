package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSNetServiceBrowser extends NSObject  {
    
    public NSNetServiceBrowser() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native NSNetServiceBrowserDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSNetServiceBrowserDelegate v);
    @ObjCProperty public NSNetServiceBrowserDelegate delegate;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "includesPeerToPeer")
    public native boolean isIncludesPeerToPeer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setIncludesPeerToPeer:")
    public native void setIncludesPeerToPeer(boolean v);
    @ObjCProperty public boolean includesPeerToPeer;
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSNetServiceBrowser init();

    @ObjCMethodSign(sign = "- (void)scheduleInRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)removeFromRunLoop:(NSRunLoop *)aRunLoop forMode:(NSString *)mode;", selector = "removeFromRunLoop:forMode:")
    public native void removeFromRunLoop$forMode$(NSRunLoop aRunLoop, NSString mode);

    @ObjCMethodSign(sign = "- (void)searchForBrowsableDomains;", selector = "searchForBrowsableDomains")
    public native void searchForBrowsableDomains();

    @ObjCMethodSign(sign = "- (void)searchForRegistrationDomains;", selector = "searchForRegistrationDomains")
    public native void searchForRegistrationDomains();

    @ObjCMethodSign(sign = "- (void)searchForServicesOfType:(NSString *)type inDomain:(NSString *)domainString;", selector = "searchForServicesOfType:inDomain:")
    public native void searchForServicesOfType$inDomain$(NSString type, NSString domainString);

    @ObjCMethodSign(sign = "- (void)stop;", selector = "stop")
    public native void stop();
}
