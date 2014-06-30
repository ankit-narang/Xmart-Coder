package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSByteCountFormatter extends NSFormatter  {
    
    public NSByteCountFormatter() {}
    @ObjCPropertyGetter(selector = "allowedUnits")
    public native NSByteCountFormatterUnits getAllowedUnits();
    @ObjCPropertySetter(selector = "setAllowedUnits:")
    public native void setAllowedUnits(NSByteCountFormatterUnits v);
    @ObjCProperty public NSByteCountFormatterUnits allowedUnits;

    @ObjCPropertyGetter(selector = "countStyle")
    public native NSByteCountFormatterCountStyle getCountStyle();
    @ObjCPropertySetter(selector = "setCountStyle:")
    public native void setCountStyle(NSByteCountFormatterCountStyle v);
    @ObjCProperty public NSByteCountFormatterCountStyle countStyle;

    @ObjCPropertyGetter(selector = "allowsNonnumericFormatting")
    public native boolean isAllowsNonnumericFormatting();
    @ObjCPropertySetter(selector = "setAllowsNonnumericFormatting:")
    public native void setAllowsNonnumericFormatting(boolean v);
    @ObjCProperty public boolean allowsNonnumericFormatting;

    @ObjCPropertyGetter(selector = "includesUnit")
    public native boolean isIncludesUnit();
    @ObjCPropertySetter(selector = "setIncludesUnit:")
    public native void setIncludesUnit(boolean v);
    @ObjCProperty public boolean includesUnit;

    @ObjCPropertyGetter(selector = "includesCount")
    public native boolean isIncludesCount();
    @ObjCPropertySetter(selector = "setIncludesCount:")
    public native void setIncludesCount(boolean v);
    @ObjCProperty public boolean includesCount;

    @ObjCPropertyGetter(selector = "includesActualByteCount")
    public native boolean isIncludesActualByteCount();
    @ObjCPropertySetter(selector = "setIncludesActualByteCount:")
    public native void setIncludesActualByteCount(boolean v);
    @ObjCProperty public boolean includesActualByteCount;

    @ObjCPropertyGetter(selector = "isAdaptive")
    public native boolean isAdaptive();
    @ObjCPropertySetter(selector = "setAdaptive:")
    public native void setAdaptive(boolean v);
    @ObjCProperty public boolean adaptive;

    @ObjCPropertyGetter(selector = "zeroPadsFractionDigits")
    public native boolean isZeroPadsFractionDigits();
    @ObjCPropertySetter(selector = "setZeroPadsFractionDigits:")
    public native void setZeroPadsFractionDigits(boolean v);
    @ObjCProperty public boolean zeroPadsFractionDigits;
    
    @ObjCMethodSign(sign = "- (NSString *)stringFromByteCount:(long long)byteCount;", selector = "stringFromByteCount:")
    public native NSString stringFromByteCount$(@LongLong long byteCount);

    @ObjCMethodSign(sign = "+ (NSString *)stringFromByteCount:(long long)byteCount countStyle:(NSByteCountFormatterCountStyle)countStyle;", selector = "stringFromByteCount:countStyle:")
    public static native NSString stringFromByteCount$countStyle$(@LongLong long byteCount, NSByteCountFormatterCountStyle countStyle);
}
