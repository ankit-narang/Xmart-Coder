package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSUUID extends NSObject implements NSCopying, NSSecureCoding {
    
    public NSUUID() {}
    
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSUUID init();

    @ObjCMethodSign(sign = "- (id)initWithUUIDString:(NSString *)string;", selector = "initWithUUIDString:")
    public native NSUUID initWithUUIDString$(NSString string);

    @ObjCMethodSign(sign = "- (id)initWithUUIDBytes:(const uuid_t)bytes;", selector = "initWithUUIDBytes:")
    public native NSUUID initWithUUIDBytes$(byte[] bytes);

    @ObjCMethodSign(sign = "- (void)getUUIDBytes:(uuid_t)uuid;", selector = "getUUIDBytes:")
    public native void getUUIDBytes$(byte[] uuid);

    @ObjCMethodSign(sign = "- (NSString *)UUIDString;", selector = "UUIDString")
    public native NSString UUIDString();

    @ObjCMethodSign(sign = "+ (id)UUID;", selector = "UUID")
    public static native NSObject UUID();

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSUUID initWithCoder$(NSCoder aDecoder);
}
