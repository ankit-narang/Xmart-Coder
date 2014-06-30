package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIActivity extends NSObject  {
    
    public UIActivity() {}
    
    
    @ObjCMethodSign(sign = "- (NSString *)activityType;", selector = "activityType")
    public native NSString activityType();

    @ObjCMethodSign(sign = "- (NSString *)activityTitle;", selector = "activityTitle")
    public native NSString activityTitle();

    @ObjCMethodSign(sign = "- (UIImage *)activityImage;", selector = "activityImage")
    public native UIImage activityImage();

    @ObjCMethodSign(sign = "- (BOOL)canPerformWithActivityItems:(NSArray *)activityItems;", selector = "canPerformWithActivityItems:")
    public native boolean canPerformWithActivityItems$(NSArray activityItems);

    @ObjCMethodSign(sign = "- (void)prepareWithActivityItems:(NSArray *)activityItems;", selector = "prepareWithActivityItems:")
    public native void prepareWithActivityItems$(NSArray activityItems);

    @ObjCMethodSign(sign = "- (UIViewController *)activityViewController;", selector = "activityViewController")
    public native UIViewController activityViewController();

    @ObjCMethodSign(sign = "- (void)performActivity;", selector = "performActivity")
    public native void performActivity();

    @ObjCMethodSign(sign = "- (void)activityDidFinish:(BOOL)completed;", selector = "activityDidFinish:")
    public native void activityDidFinish$(boolean completed);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "+ (UIActivityCategory)activityCategory NS_AVAILABLE_IOS(7_0);", selector = "activityCategory")
    public static native UIActivityCategory activityCategory();
}
