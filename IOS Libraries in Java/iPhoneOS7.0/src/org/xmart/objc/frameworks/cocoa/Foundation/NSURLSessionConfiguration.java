package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLSessionConfiguration extends NSObject implements NSCopying {
    
    public NSURLSessionConfiguration() {}
    @ObjCPropertyGetter(selector = "identifier")
    public native NSString getIdentifier();
    @ObjCProperty public NSString identifier;

    @ObjCPropertyGetter(selector = "requestCachePolicy")
    public native NSURLRequestCachePolicy getRequestCachePolicy();
    @ObjCPropertySetter(selector = "setRequestCachePolicy:")
    public native void setRequestCachePolicy(NSURLRequestCachePolicy v);
    @ObjCProperty public NSURLRequestCachePolicy requestCachePolicy;

    @ObjCPropertyGetter(selector = "timeoutIntervalForRequest")
    public native double getTimeoutIntervalForRequest();
    @ObjCPropertySetter(selector = "setTimeoutIntervalForRequest:")
    public native void setTimeoutIntervalForRequest(double v);
    @ObjCProperty public double timeoutIntervalForRequest;

    @ObjCPropertyGetter(selector = "timeoutIntervalForResource")
    public native double getTimeoutIntervalForResource();
    @ObjCPropertySetter(selector = "setTimeoutIntervalForResource:")
    public native void setTimeoutIntervalForResource(double v);
    @ObjCProperty public double timeoutIntervalForResource;

    @ObjCPropertyGetter(selector = "networkServiceType")
    public native NSURLRequestNetworkServiceType getNetworkServiceType();
    @ObjCPropertySetter(selector = "setNetworkServiceType:")
    public native void setNetworkServiceType(NSURLRequestNetworkServiceType v);
    @ObjCProperty public NSURLRequestNetworkServiceType networkServiceType;

    @ObjCPropertyGetter(selector = "allowsCellularAccess")
    public native boolean isAllowsCellularAccess();
    @ObjCPropertySetter(selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean v);
    @ObjCProperty public boolean allowsCellularAccess;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "isDiscretionary")
    public native boolean isDiscretionary();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setDiscretionary:")
    public native void setDiscretionary(boolean v);
    @ObjCProperty public boolean discretionary;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "sessionSendsLaunchEvents")
    public native boolean isSessionSendsLaunchEvents();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSessionSendsLaunchEvents:")
    public native void setSessionSendsLaunchEvents(boolean v);
    @ObjCProperty public boolean sessionSendsLaunchEvents;

    @ObjCPropertyGetter(selector = "connectionProxyDictionary")
    public native NSDictionary getConnectionProxyDictionary();
    @ObjCPropertySetter(selector = "setConnectionProxyDictionary:")
    public native void setConnectionProxyDictionary(NSDictionary v);
    @ObjCProperty public NSDictionary connectionProxyDictionary;

    @ObjCPropertyGetter(selector = "TLSMinimumSupportedProtocol")
    public native SSLProtocol getTLSMinimumSupportedProtocol();
    @ObjCPropertySetter(selector = "setTLSMinimumSupportedProtocol:")
    public native void setTLSMinimumSupportedProtocol(SSLProtocol v);
    @ObjCProperty public SSLProtocol TLSMinimumSupportedProtocol;

    @ObjCPropertyGetter(selector = "TLSMaximumSupportedProtocol")
    public native SSLProtocol getTLSMaximumSupportedProtocol();
    @ObjCPropertySetter(selector = "setTLSMaximumSupportedProtocol:")
    public native void setTLSMaximumSupportedProtocol(SSLProtocol v);
    @ObjCProperty public SSLProtocol TLSMaximumSupportedProtocol;

    @ObjCPropertyGetter(selector = "HTTPShouldUsePipelining")
    public native boolean isHTTPShouldUsePipelining();
    @ObjCPropertySetter(selector = "setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean v);
    @ObjCProperty public boolean HTTPShouldUsePipelining;

    @ObjCPropertyGetter(selector = "HTTPShouldSetCookies")
    public native boolean isHTTPShouldSetCookies();
    @ObjCPropertySetter(selector = "setHTTPShouldSetCookies:")
    public native void setHTTPShouldSetCookies(boolean v);
    @ObjCProperty public boolean HTTPShouldSetCookies;

    @ObjCPropertyGetter(selector = "HTTPCookieAcceptPolicy")
    public native NSHTTPCookieAcceptPolicy getHTTPCookieAcceptPolicy();
    @ObjCPropertySetter(selector = "setHTTPCookieAcceptPolicy:")
    public native void setHTTPCookieAcceptPolicy(NSHTTPCookieAcceptPolicy v);
    @ObjCProperty public NSHTTPCookieAcceptPolicy HTTPCookieAcceptPolicy;

    @ObjCPropertyGetter(selector = "HTTPAdditionalHeaders")
    public native NSDictionary getHTTPAdditionalHeaders();
    @ObjCPropertySetter(selector = "setHTTPAdditionalHeaders:")
    public native void setHTTPAdditionalHeaders(NSDictionary v);
    @ObjCProperty public NSDictionary HTTPAdditionalHeaders;

    @ObjCPropertyGetter(selector = "HTTPMaximumConnectionsPerHost")
    public native @NSInteger long getHTTPMaximumConnectionsPerHost();
    @ObjCPropertySetter(selector = "setHTTPMaximumConnectionsPerHost:")
    public native void setHTTPMaximumConnectionsPerHost(@NSInteger long v);
    @ObjCProperty public @NSInteger long HTTPMaximumConnectionsPerHost;

    @ObjCPropertyGetter(selector = "HTTPCookieStorage")
    public native NSHTTPCookieStorage getHTTPCookieStorage();
    @ObjCPropertySetter(selector = "setHTTPCookieStorage:")
    public native void setHTTPCookieStorage(NSHTTPCookieStorage v);
    @ObjCProperty public NSHTTPCookieStorage HTTPCookieStorage;

    @ObjCPropertyGetter(selector = "URLCredentialStorage")
    public native NSURLCredentialStorage getURLCredentialStorage();
    @ObjCPropertySetter(selector = "setURLCredentialStorage:")
    public native void setURLCredentialStorage(NSURLCredentialStorage v);
    @ObjCProperty public NSURLCredentialStorage URLCredentialStorage;

    @ObjCPropertyGetter(selector = "URLCache")
    public native NSURLCache getURLCache();
    @ObjCPropertySetter(selector = "setURLCache:")
    public native void setURLCache(NSURLCache v);
    @ObjCProperty public NSURLCache URLCache;

    @ObjCPropertyGetter(selector = "protocolClasses")
    public native NSArray getProtocolClasses();
    @ObjCPropertySetter(selector = "setProtocolClasses:")
    public native void setProtocolClasses(NSArray v);
    @ObjCProperty public NSArray protocolClasses;
    
    @ObjCMethodSign(sign = "+ (NSURLSessionConfiguration *)defaultSessionConfiguration;", selector = "defaultSessionConfiguration")
    public static native NSURLSessionConfiguration defaultSessionConfiguration();

    @ObjCMethodSign(sign = "+ (NSURLSessionConfiguration *)ephemeralSessionConfiguration;", selector = "ephemeralSessionConfiguration")
    public static native NSURLSessionConfiguration ephemeralSessionConfiguration();

    @ObjCMethodSign(sign = "+ (NSURLSessionConfiguration *)backgroundSessionConfiguration:(NSString *)identifier;", selector = "backgroundSessionConfiguration:")
    public static native NSURLSessionConfiguration backgroundSessionConfiguration$(NSString identifier);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
