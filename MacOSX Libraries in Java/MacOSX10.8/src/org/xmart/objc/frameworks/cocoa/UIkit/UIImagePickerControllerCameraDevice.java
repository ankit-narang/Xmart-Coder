package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImagePickerControllerCameraDevice {
    UIImagePickerControllerCameraDeviceRear($UIKit.UIImagePickerControllerCameraDeviceRear),
    UIImagePickerControllerCameraDeviceFront($UIKit.UIImagePickerControllerCameraDeviceFront);

    private final long value;

    private UIImagePickerControllerCameraDevice(long value) { this.value = value; }
}
