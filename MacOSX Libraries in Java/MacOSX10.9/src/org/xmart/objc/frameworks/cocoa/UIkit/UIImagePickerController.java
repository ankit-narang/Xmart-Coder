package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIImagePickerController extends UINavigationController implements NSCoding {
    
    public UIImagePickerController() {}
    @ObjCPropertyGetter(selector = "sourceType")
    public native UIImagePickerControllerSourceType getSourceType();
    @ObjCPropertySetter(selector = "setSourceType:")
    public native void setSourceType(UIImagePickerControllerSourceType v);
    @ObjCProperty public UIImagePickerControllerSourceType sourceType;

    @ObjCPropertyGetter(selector = "mediaTypes")
    public native NSArray getMediaTypes();
    @ObjCPropertySetter(selector = "setMediaTypes:")
    public native void setMediaTypes(NSArray v);
    @ObjCProperty public NSArray mediaTypes;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "allowsEditing")
    public native boolean isAllowsEditing();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsEditing:")
    public native void setAllowsEditing(boolean v);
    @ObjCProperty public boolean allowsEditing;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.1.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "allowsImageEditing")
    public native boolean isAllowsImageEditing();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.1.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setAllowsImageEditing:")
    public native void setAllowsImageEditing(boolean v);
    @ObjCProperty public boolean allowsImageEditing;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "videoMaximumDuration")
    public native double getVideoMaximumDuration();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setVideoMaximumDuration:")
    public native void setVideoMaximumDuration(double v);
    @ObjCProperty public double videoMaximumDuration;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "videoQuality")
    public native UIImagePickerControllerQualityType getVideoQuality();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setVideoQuality:")
    public native void setVideoQuality(UIImagePickerControllerQualityType v);
    @ObjCProperty public UIImagePickerControllerQualityType videoQuality;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "showsCameraControls")
    public native boolean isShowsCameraControls();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setShowsCameraControls:")
    public native void setShowsCameraControls(boolean v);
    @ObjCProperty public boolean showsCameraControls;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "cameraOverlayView")
    public native UIView getCameraOverlayView();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setCameraOverlayView:")
    public native void setCameraOverlayView(UIView v);
    @ObjCProperty public UIView cameraOverlayView;

    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertyGetter(selector = "cameraViewTransform")
    public native @ObjCByValue CGAffineTransform getCameraViewTransform();
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCPropertySetter(selector = "setCameraViewTransform:")
    public native void setCameraViewTransform(@ObjCByValue CGAffineTransform v);
    @ObjCProperty public @ObjCByValue CGAffineTransform cameraViewTransform;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "cameraCaptureMode")
    public native UIImagePickerControllerCameraCaptureMode getCameraCaptureMode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setCameraCaptureMode:")
    public native void setCameraCaptureMode(UIImagePickerControllerCameraCaptureMode v);
    @ObjCProperty public UIImagePickerControllerCameraCaptureMode cameraCaptureMode;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "cameraDevice")
    public native UIImagePickerControllerCameraDevice getCameraDevice();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setCameraDevice:")
    public native void setCameraDevice(UIImagePickerControllerCameraDevice v);
    @ObjCProperty public UIImagePickerControllerCameraDevice cameraDevice;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "cameraFlashMode")
    public native UIImagePickerControllerCameraFlashMode getCameraFlashMode();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setCameraFlashMode:")
    public native void setCameraFlashMode(UIImagePickerControllerCameraFlashMode v);
    @ObjCProperty public UIImagePickerControllerCameraFlashMode cameraFlashMode;
    
    /**
     * @since Available in iOS 3.1 and later.
     */
    @ObjCMethodSign(sign = "- (void)takePicture NS_AVAILABLE_IOS(3_1);", selector = "takePicture")
    public native void takePicture();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)startVideoCapture NS_AVAILABLE_IOS(4_0);", selector = "startVideoCapture")
    public native boolean startVideoCapture();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)stopVideoCapture  NS_AVAILABLE_IOS(4_0);", selector = "stopVideoCapture")
    public native void stopVideoCapture();

    @ObjCMethodSign(sign = "+ (BOOL)isSourceTypeAvailable:(UIImagePickerControllerSourceType)sourceType;", selector = "isSourceTypeAvailable:")
    public static native boolean isSourceTypeAvailable$(UIImagePickerControllerSourceType sourceType);

    @ObjCMethodSign(sign = "+ (NSArray *)availableMediaTypesForSourceType:(UIImagePickerControllerSourceType)sourceType;", selector = "availableMediaTypesForSourceType:")
    public static native NSArray availableMediaTypesForSourceType$(UIImagePickerControllerSourceType sourceType);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)isCameraDeviceAvailable:(UIImagePickerControllerCameraDevice)cameraDevice                   NS_AVAILABLE_IOS(4_0);", selector = "isCameraDeviceAvailable:")
    public static native boolean isCameraDeviceAvailable$(UIImagePickerControllerCameraDevice cameraDevice);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (BOOL)isFlashAvailableForCameraDevice:(UIImagePickerControllerCameraDevice)cameraDevice           NS_AVAILABLE_IOS(4_0);", selector = "isFlashAvailableForCameraDevice:")
    public static native boolean isFlashAvailableForCameraDevice$(UIImagePickerControllerCameraDevice cameraDevice);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "+ (NSArray *)availableCaptureModesForCameraDevice:(UIImagePickerControllerCameraDevice)cameraDevice NS_AVAILABLE_IOS(4_0);", selector = "availableCaptureModesForCameraDevice:")
    public static native NSArray availableCaptureModesForCameraDevice$(UIImagePickerControllerCameraDevice cameraDevice);
}
