package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UILocalNotification extends NSObject implements NSCopying, NSCoding {
    
    public UILocalNotification() {}
    @ObjCPropertyGetter(selector = "fireDate")
    public native NSDate getFireDate();
    @ObjCPropertySetter(selector = "setFireDate:")
    public native void setFireDate(NSDate v);
    @ObjCProperty public NSDate fireDate;

    @ObjCPropertyGetter(selector = "timeZone")
    public native NSTimeZone getTimeZone();
    @ObjCPropertySetter(selector = "setTimeZone:")
    public native void setTimeZone(NSTimeZone v);
    @ObjCProperty public NSTimeZone timeZone;

    @ObjCPropertyGetter(selector = "repeatInterval")
    public native NSCalendarUnit getRepeatInterval();
    @ObjCPropertySetter(selector = "setRepeatInterval:")
    public native void setRepeatInterval(NSCalendarUnit v);
    @ObjCProperty public NSCalendarUnit repeatInterval;

    @ObjCPropertyGetter(selector = "repeatCalendar")
    public native NSCalendar getRepeatCalendar();
    @ObjCPropertySetter(selector = "setRepeatCalendar:")
    public native void setRepeatCalendar(NSCalendar v);
    @ObjCProperty public NSCalendar repeatCalendar;

    @ObjCPropertyGetter(selector = "alertBody")
    public native NSString getAlertBody();
    @ObjCPropertySetter(selector = "setAlertBody:")
    public native void setAlertBody(NSString v);
    @ObjCProperty public NSString alertBody;

    @ObjCPropertyGetter(selector = "hasAction")
    public native boolean isHasAction();
    @ObjCPropertySetter(selector = "setHasAction:")
    public native void setHasAction(boolean v);
    @ObjCProperty public boolean hasAction;

    @ObjCPropertyGetter(selector = "alertAction")
    public native NSString getAlertAction();
    @ObjCPropertySetter(selector = "setAlertAction:")
    public native void setAlertAction(NSString v);
    @ObjCProperty public NSString alertAction;

    @ObjCPropertyGetter(selector = "alertLaunchImage")
    public native NSString getAlertLaunchImage();
    @ObjCPropertySetter(selector = "setAlertLaunchImage:")
    public native void setAlertLaunchImage(NSString v);
    @ObjCProperty public NSString alertLaunchImage;

    @ObjCPropertyGetter(selector = "soundName")
    public native NSString getSoundName();
    @ObjCPropertySetter(selector = "setSoundName:")
    public native void setSoundName(NSString v);
    @ObjCProperty public NSString soundName;

    @ObjCPropertyGetter(selector = "applicationIconBadgeNumber")
    public native @NSInteger long getApplicationIconBadgeNumber();
    @ObjCPropertySetter(selector = "setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@NSInteger long v);
    @ObjCProperty public @NSInteger long applicationIconBadgeNumber;

    @ObjCPropertyGetter(selector = "userInfo")
    public native NSDictionary getUserInfo();
    @ObjCPropertySetter(selector = "setUserInfo:")
    public native void setUserInfo(NSDictionary v);
    @ObjCProperty public NSDictionary userInfo;
    
    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UILocalNotification initWithCoder$(NSCoder aDecoder);
}
