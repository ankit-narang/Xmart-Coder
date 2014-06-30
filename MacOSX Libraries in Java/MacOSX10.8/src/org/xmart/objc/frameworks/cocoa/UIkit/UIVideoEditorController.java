package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIVideoEditorController extends UINavigationController  {
    
    public UIVideoEditorController() {}
    @ObjCPropertyGetter(selector = "videoPath")
    public native NSString getVideoPath();
    @ObjCPropertySetter(selector = "setVideoPath:")
    public native void setVideoPath(NSString v);
    @ObjCProperty public NSString videoPath;

    @ObjCPropertyGetter(selector = "videoMaximumDuration")
    public native double getVideoMaximumDuration();
    @ObjCPropertySetter(selector = "setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double v);
    @ObjCProperty public double videoMaximumDuration;

    @ObjCPropertyGetter(selector = "videoQuality")
    public native UIImagePickerControllerQualityType getVideoQuality();
    @ObjCPropertySetter(selector = "setVideoQuality:")
    public native void setVideoQuality(UIImagePickerControllerQualityType v);
    @ObjCProperty public UIImagePickerControllerQualityType videoQuality;
    
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)canEditVideoAtPath:(NSString *)videoPath NS_AVAILABLE_IOS(3_1);", selector = "canEditVideoAtPath:")
    public static native boolean canEditVideoAtPath$(NSString videoPath);
}
