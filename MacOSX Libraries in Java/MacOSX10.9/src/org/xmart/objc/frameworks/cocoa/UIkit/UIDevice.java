package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDevice extends NSObject  {
    
    public UIDevice() {}
    @ObjCPropertyGetter(selector = "name")
    public native NSString getName();
    @ObjCProperty public NSString name;

    @ObjCPropertyGetter(selector = "model")
    public native NSString getModel();
    @ObjCProperty public NSString model;

    @ObjCPropertyGetter(selector = "localizedModel")
    public native NSString getLocalizedModel();
    @ObjCProperty public NSString localizedModel;

    @ObjCPropertyGetter(selector = "systemName")
    public native NSString getSystemName();
    @ObjCProperty public NSString systemName;

    @ObjCPropertyGetter(selector = "systemVersion")
    public native NSString getSystemVersion();
    @ObjCProperty public NSString systemVersion;

    @ObjCPropertyGetter(selector = "orientation")
    public native UIDeviceOrientation getOrientation();
    @ObjCProperty public UIDeviceOrientation orientation;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "identifierForVendor")
    public native NSUUID getIdentifierForVendor();
    @ObjCProperty public NSUUID identifierForVendor;

    @ObjCPropertyGetter(selector = "isGeneratingDeviceOrientationNotifications")
    public native boolean isGeneratesDeviceOrientationNotifications();
    @ObjCProperty public boolean generatesDeviceOrientationNotifications;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isBatteryMonitoringEnabled")
    public native boolean isBatteryMonitoringEnabled();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setBatteryMonitoringEnabled:")
    public native void setBatteryMonitoringEnabled(boolean v);
    @ObjCProperty public boolean batteryMonitoringEnabled;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "batteryState")
    public native UIDeviceBatteryState getBatteryState();
    @ObjCProperty public UIDeviceBatteryState batteryState;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "batteryLevel")
    public native float getBatteryLevel();
    @ObjCProperty public float batteryLevel;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "isProximityMonitoringEnabled")
    public native boolean isProximityMonitoringEnabled();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setProximityMonitoringEnabled:")
    public native void setProximityMonitoringEnabled(boolean v);
    @ObjCProperty public boolean proximityMonitoringEnabled;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "proximityState")
    public native boolean isProximityState();
    @ObjCProperty public boolean proximityState;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "isMultitaskingSupported")
    public native boolean isMultitaskingSupported();
    @ObjCProperty public boolean multitaskingSupported;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "userInterfaceIdiom")
    public native UIUserInterfaceIdiom getUserInterfaceIdiom();
    @ObjCProperty public UIUserInterfaceIdiom userInterfaceIdiom;
    
    @ObjCMethodSign(sign = "- (void)beginGeneratingDeviceOrientationNotifications;", selector = "beginGeneratingDeviceOrientationNotifications")
    public native void beginGeneratingDeviceOrientationNotifications();

    @ObjCMethodSign(sign = "- (void)endGeneratingDeviceOrientationNotifications;", selector = "endGeneratingDeviceOrientationNotifications")
    public native void endGeneratingDeviceOrientationNotifications();

    /**
     * @since Available in iOS 4.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)playInputClick NS_AVAILABLE_IOS(4_2);", selector = "playInputClick")
    public native void playInputClick();

    @ObjCMethodSign(sign = "+ (UIDevice *)currentDevice;", selector = "currentDevice")
    public static native UIDevice currentDevice();
}
