package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIImagePickerControllerSourceType {
    UIImagePickerControllerSourceTypePhotoLibrary($UIKit.UIImagePickerControllerSourceTypePhotoLibrary),
    UIImagePickerControllerSourceTypeCamera($UIKit.UIImagePickerControllerSourceTypeCamera),
    UIImagePickerControllerSourceTypeSavedPhotosAlbum($UIKit.UIImagePickerControllerSourceTypeSavedPhotosAlbum);

    private final long value;

    private UIImagePickerControllerSourceType(long value) { this.value = value; }
}
