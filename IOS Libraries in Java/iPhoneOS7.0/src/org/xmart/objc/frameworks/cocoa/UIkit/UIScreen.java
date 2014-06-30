package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIScreen extends NSObject  {
    
    public UIScreen() {}
    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCProperty public @ObjCByValue CGRect bounds;

    @ObjCPropertyGetter(selector = "applicationFrame")
    public native @ObjCByValue CGRect getApplicationFrame();
    @ObjCProperty public @ObjCByValue CGRect applicationFrame;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "scale")
    public native float getScale();
    @ObjCProperty public float scale;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "availableModes")
    public native NSArray getAvailableModes();
    @ObjCProperty public NSArray availableModes;

    /**
     * @since Available in iOS 4.3 and later.
     */
    @ObjCPropertyGetter(selector = "preferredMode")
    public native UIScreenMode getPreferredMode();
    @ObjCProperty public UIScreenMode preferredMode;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "currentMode")
    public native UIScreenMode getCurrentMode();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setCurrentMode:")
    public native void setCurrentMode(UIScreenMode v);
    @ObjCProperty public UIScreenMode currentMode;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "overscanCompensation")
    public native UIScreenOverscanCompensation getOverscanCompensation();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setOverscanCompensation:")
    public native void setOverscanCompensation(UIScreenOverscanCompensation v);
    @ObjCProperty public UIScreenOverscanCompensation overscanCompensation;

    /**
     * @since Available in iOS 4.3 and later.
     */
    @ObjCPropertyGetter(selector = "mirroredScreen")
    public native UIScreen getMirroredScreen();
    @ObjCProperty public UIScreen mirroredScreen;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "brightness")
    public native float getBrightness();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setBrightness:")
    public native void setBrightness(float v);
    @ObjCProperty public float brightness;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "wantsSoftwareDimming")
    public native boolean isWantsSoftwareDimming();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setWantsSoftwareDimming:")
    public native void setWantsSoftwareDimming(boolean v);
    @ObjCProperty public boolean wantsSoftwareDimming;
    
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (CADisplayLink *)displayLinkWithTarget:(id)target selector:(SEL)sel NS_AVAILABLE_IOS(4_0);", selector = "displayLinkWithTarget:selector:")
    public native CADisplayLink displayLinkWithTarget$selector$(NSObject target, ObjCSelector sel);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)screens NS_AVAILABLE_IOS(3_2);", selector = "screens")
    public static native NSArray screens();

    @ObjCMethodSign(sign = "+ (UIScreen *)mainScreen;", selector = "mainScreen")
    public static native UIScreen mainScreen();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UISnapshotting", catownername = "UIScreen")
    @ObjCMethodSign(sign = "- (UIView *)snapshotViewAfterScreenUpdates:(BOOL)afterUpdates NS_AVAILABLE_IOS(7_0);", selector = "snapshotViewAfterScreenUpdates:")
    public native UIView snapshotViewAfterScreenUpdates$(boolean afterUpdates);
}
