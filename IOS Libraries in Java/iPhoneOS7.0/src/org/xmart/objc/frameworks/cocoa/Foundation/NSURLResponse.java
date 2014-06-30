package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSURLResponse extends NSObject implements NSSecureCoding, NSCopying {
    
    public NSURLResponse() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithURL:(NSURL *)URL MIMEType:(NSString *)MIMEType expectedContentLength:(NSInteger)length textEncodingName:(NSString *)name;", selector = "initWithURL:MIMEType:expectedContentLength:textEncodingName:")
    public native NSURLResponse initWithURL$MIMEType$expectedContentLength$textEncodingName$(NSURL URL, NSString MIMEType, @NSInteger long length, NSString name);

    @ObjCMethodSign(sign = "- (NSURL *)URL;", selector = "URL")
    public native NSURL URL();

    @ObjCMethodSign(sign = "- (NSString *)MIMEType;", selector = "MIMEType")
    public native NSString MIMEType();

    @ObjCMethodSign(sign = "- (long long)expectedContentLength;", selector = "expectedContentLength")
    public native @LongLong long expectedContentLength();

    @ObjCMethodSign(sign = "- (NSString *)textEncodingName;", selector = "textEncodingName")
    public native NSString textEncodingName();

    @ObjCMethodSign(sign = "- (NSString *)suggestedFilename;", selector = "suggestedFilename")
    public native NSString suggestedFilename();

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSURLResponse initWithCoder$(NSCoder aDecoder);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
