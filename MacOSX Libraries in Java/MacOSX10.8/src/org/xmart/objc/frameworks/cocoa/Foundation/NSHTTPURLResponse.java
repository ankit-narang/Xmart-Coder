package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSHTTPURLResponse extends NSURLResponse  {
    
    public NSHTTPURLResponse() {}
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "-(id)initWithURL:(NSURL*) url statusCode:(NSInteger) statusCode HTTPVersion:(NSString*) HTTPVersion headerFields:(NSDictionary*) headerFields NS_AVAILABLE(10_7, 5_0);", selector = "initWithURL:statusCode:HTTPVersion:headerFields:")
    public native NSHTTPURLResponse initWithURL$statusCode$HTTPVersion$headerFields$(NSURL url, @NSInteger long statusCode, NSString HTTPVersion, NSDictionary headerFields);

    @ObjCMethodSign(sign = "- (NSInteger)statusCode;", selector = "statusCode")
    public native @NSInteger long statusCode();

    @ObjCMethodSign(sign = "- (NSDictionary *)allHeaderFields;", selector = "allHeaderFields")
    public native NSDictionary allHeaderFields();

    @ObjCMethodSign(sign = "+ (NSString *)localizedStringForStatusCode:(NSInteger)statusCode;", selector = "localizedStringForStatusCode:")
    public static native NSString localizedStringForStatusCode$(@NSInteger long statusCode);
}
