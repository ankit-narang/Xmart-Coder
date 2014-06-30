package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDatePicker extends UIControl implements NSCoding {
    
    public UIDatePicker() {}
    @ObjCPropertyGetter(selector = "datePickerMode")
    public native UIDatePickerMode getDatePickerMode();
    @ObjCPropertySetter(selector = "setDatePickerMode:")
    public native void setDatePickerMode(UIDatePickerMode v);
    @ObjCProperty public UIDatePickerMode datePickerMode;

    @ObjCPropertyGetter(selector = "locale")
    public native NSLocale getLocale();
    @ObjCPropertySetter(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @ObjCProperty public NSLocale locale;

    @ObjCPropertyGetter(selector = "calendar")
    public native NSCalendar getCalendar();
    @ObjCPropertySetter(selector = "setCalendar:")
    public native void setCalendar(NSCalendar v);
    @ObjCProperty public NSCalendar calendar;

    @ObjCPropertyGetter(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @ObjCPropertySetter(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @ObjCProperty public NSTimeZone timeZone;

    @ObjCPropertyGetter(selector = "date")
    public native NSDate getDate();
    @ObjCPropertySetter(selector = "setDate:")
    public native void setDate(NSDate v);
    @ObjCProperty public NSDate date;

    @ObjCPropertyGetter(selector = "minimumDate")
    public native NSDate getMinimumDate();
    @ObjCPropertySetter(selector = "setMinimumDate:")
    public native void setMinimumDate(NSDate v);
    @ObjCProperty public NSDate minimumDate;

    @ObjCPropertyGetter(selector = "maximumDate")
    public native NSDate getMaximumDate();
    @ObjCPropertySetter(selector = "setMaximumDate:")
    public native void setMaximumDate(NSDate v);
    @ObjCProperty public NSDate maximumDate;

    @ObjCPropertyGetter(selector = "countDownDuration")
    public native double getCountDownDuration();
    @ObjCPropertySetter(selector = "setCountDownDuration:")
    public native void setCountDownDuration(double v);
    @ObjCProperty public double countDownDuration;

    @ObjCPropertyGetter(selector = "minuteInterval")
    public native @NSInteger long getMinuteInterval();
    @ObjCPropertySetter(selector = "setMinuteInterval:")
    public native void setMinuteInterval(@NSInteger long v);
    @ObjCProperty public @NSInteger long minuteInterval;
    
    @ObjCMethodSign(sign = "- (void)setDate:(NSDate *)date animated:(BOOL)animated;", selector = "setDate:animated:")
    public native void setDate$animated$(NSDate date, boolean animated);
}
