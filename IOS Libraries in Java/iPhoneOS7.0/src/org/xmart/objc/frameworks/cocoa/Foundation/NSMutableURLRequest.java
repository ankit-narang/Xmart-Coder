package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMutableURLRequest extends NSURLRequest  {
    
    public NSMutableURLRequest() {}
    
    
    @ObjCMethodSign(sign = "- (void)setURL:(NSURL *)URL;", selector = "setURL:")
    public native void setURL(NSURL URL);

    @ObjCMethodSign(sign = "- (void)setCachePolicy:(NSURLRequestCachePolicy)policy;", selector = "setCachePolicy:")
    public native void setCachePolicy(NSURLRequestCachePolicy policy);

    @ObjCMethodSign(sign = "- (void)setTimeoutInterval:(NSTimeInterval)seconds;", selector = "setTimeoutInterval:")
    public native void setTimeoutInterval(double seconds);

    @ObjCMethodSign(sign = "- (void)setMainDocumentURL:(NSURL *)URL;", selector = "setMainDocumentURL:")
    public native void setMainDocumentURL(NSURL URL);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setNetworkServiceType:(NSURLRequestNetworkServiceType)networkServiceType NS_AVAILABLE(10_7, 4_0);", selector = "setNetworkServiceType:")
    public native void setNetworkServiceType(NSURLRequestNetworkServiceType networkServiceType);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setAllowsCellularAccess:(BOOL)allow NS_AVAILABLE(10_8, 6_0);", selector = "setAllowsCellularAccess:")
    public native void setAllowsCellularAccess(boolean allow);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setHTTPMethod:(NSString *)method;", selector = "setHTTPMethod:")
    public native void setHTTPMethod(NSString method);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setAllHTTPHeaderFields:(NSDictionary *)headerFields;", selector = "setAllHTTPHeaderFields:")
    public native void setAllHTTPHeaderFields(NSDictionary headerFields);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setValue:(NSString *)value forHTTPHeaderField:(NSString *)field;", selector = "setValue:forHTTPHeaderField:")
    public native void setValue$forHTTPHeaderField$(NSString value, NSString field);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)addValue:(NSString *)value forHTTPHeaderField:(NSString *)field;", selector = "addValue:forHTTPHeaderField:")
    public native void addValue$forHTTPHeaderField$(NSString value, NSString field);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setHTTPBody:(NSData *)data;", selector = "setHTTPBody:")
    public native void setHTTPBody(NSData data);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setHTTPBodyStream:(NSInputStream *)inputStream;", selector = "setHTTPBodyStream:")
    public native void setHTTPBodyStream(NSInputStream inputStream);

    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setHTTPShouldHandleCookies:(BOOL)should;", selector = "setHTTPShouldHandleCookies:")
    public native void setHTTPShouldHandleCookies(boolean should);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "NSMutableHTTPURLRequest", catownername = "NSMutableURLRequest")
    @ObjCMethodSign(sign = "- (void)setHTTPShouldUsePipelining:(BOOL)shouldUsePipelining NS_AVAILABLE(10_7, 4_0);", selector = "setHTTPShouldUsePipelining:")
    public native void setHTTPShouldUsePipelining(boolean shouldUsePipelining);
}
