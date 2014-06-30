package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSTextTab extends NSObject implements NSCopying, NSCoding {
    
    public NSTextTab() {}
    @ObjCPropertyGetter(selector = "alignment")
    public native NSTextAlignment getAlignment();
    @ObjCProperty public NSTextAlignment alignment;

    @ObjCPropertyGetter(selector = "location")
    public native float getLocation();
    @ObjCProperty public float location;

    @ObjCPropertyGetter(selector = "options")
    public native NSDictionary getOptions();
    @ObjCProperty public NSDictionary options;
    
    @ObjCMethodSign(sign = "- (id)initWithTextAlignment:(NSTextAlignment)alignment location:(CGFloat)loc options:(NSDictionary *)options;", selector = "initWithTextAlignment:location:options:")
    public native NSTextTab initWithTextAlignment$location$options$(NSTextAlignment alignment, float loc, NSDictionary options);

    @ObjCMethodSign(sign = "+ (NSCharacterSet *)columnTerminatorsForLocale:(NSLocale *)aLocale;", selector = "columnTerminatorsForLocale:")
    public static native NSCharacterSet columnTerminatorsForLocale$(NSLocale aLocale);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native NSTextTab initWithCoder$(NSCoder aDecoder);
}
