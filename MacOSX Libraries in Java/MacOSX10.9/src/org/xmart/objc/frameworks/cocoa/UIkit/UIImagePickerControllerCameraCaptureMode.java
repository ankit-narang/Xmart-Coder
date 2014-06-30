package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImagePickerControllerCameraCaptureMode {
    UIImagePickerControllerCameraCaptureModePhoto($UIKit.UIImagePickerControllerCameraCaptureModePhoto),
    UIImagePickerControllerCameraCaptureModeVideo($UIKit.UIImagePickerControllerCameraCaptureModeVideo);

    private final long value;

    private UIImagePickerControllerCameraCaptureMode(long value) { this.value = value; }
}
