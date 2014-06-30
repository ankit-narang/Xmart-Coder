package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImagePickerControllerCameraFlashMode {
    UIImagePickerControllerCameraFlashModeOff($UIKit.UIImagePickerControllerCameraFlashModeOff),
    UIImagePickerControllerCameraFlashModeAuto($UIKit.UIImagePickerControllerCameraFlashModeAuto),
    UIImagePickerControllerCameraFlashModeOn($UIKit.UIImagePickerControllerCameraFlashModeOn);

    private final long value;

    private UIImagePickerControllerCameraFlashMode(long value) { this.value = value; }
}
