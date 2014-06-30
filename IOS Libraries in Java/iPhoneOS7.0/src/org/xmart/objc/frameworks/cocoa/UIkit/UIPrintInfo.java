package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPrintInfo extends NSObject implements NSCopying, NSCoding {
    
    public UIPrintInfo() {}
    @ObjCPropertyGetter(selector = "printerID")
    public native NSString getPrinterID();
    @ObjCPropertySetter(selector = "setPrinterID:")
    public native void setPrinterID(NSString v);
    @ObjCProperty public NSString printerID;

    @ObjCPropertyGetter(selector = "jobName")
    public native NSString getJobName();
    @ObjCPropertySetter(selector = "setJobName:")
    public native void setJobName(NSString v);
    @ObjCProperty public NSString jobName;

    @ObjCPropertyGetter(selector = "outputType")
    public native UIPrintInfoOutputType getOutputType();
    @ObjCPropertySetter(selector = "setOutputType:")
    public native void setOutputType(UIPrintInfoOutputType v);
    @ObjCProperty public UIPrintInfoOutputType outputType;

    @ObjCPropertyGetter(selector = "orientation")
    public native UIPrintInfoOrientation getOrientation();
    @ObjCPropertySetter(selector = "setOrientation:")
    public native void setOrientation(UIPrintInfoOrientation v);
    @ObjCProperty public UIPrintInfoOrientation orientation;

    @ObjCPropertyGetter(selector = "duplex")
    public native UIPrintInfoDuplex getDuplex();
    @ObjCPropertySetter(selector = "setDuplex:")
    public native void setDuplex(UIPrintInfoDuplex v);
    @ObjCProperty public UIPrintInfoDuplex duplex;
    
    @ObjCMethodSign(sign = "- (NSDictionary *)dictionaryRepresentation;", selector = "dictionaryRepresentation")
    public native NSDictionary dictionaryRepresentation();

    @ObjCMethodSign(sign = "+ (UIPrintInfo *)printInfo;", selector = "printInfo")
    public static native UIPrintInfo printInfo();

    @ObjCMethodSign(sign = "+ (UIPrintInfo *)printInfoWithDictionary:(NSDictionary *)dictionary;", selector = "printInfoWithDictionary:")
    public static native UIPrintInfo printInfoWithDictionary$(NSDictionary dictionary);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIPrintInfo initWithCoder$(NSCoder aDecoder);
}
