package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImagePickerControllerQualityType {
    UIImagePickerControllerQualityTypeHigh($UIKit.UIImagePickerControllerQualityTypeHigh),
    UIImagePickerControllerQualityTypeMedium($UIKit.UIImagePickerControllerQualityTypeMedium),
    UIImagePickerControllerQualityTypeLow($UIKit.UIImagePickerControllerQualityTypeLow),
    UIImagePickerControllerQualityType640x480($UIKit.UIImagePickerControllerQualityType640x480),
    UIImagePickerControllerQualityTypeIFrame1280x720($UIKit.UIImagePickerControllerQualityTypeIFrame1280x720),
    UIImagePickerControllerQualityTypeIFrame960x540($UIKit.UIImagePickerControllerQualityTypeIFrame960x540);

    private final long value;

    private UIImagePickerControllerQualityType(long value) { this.value = value; }
}
