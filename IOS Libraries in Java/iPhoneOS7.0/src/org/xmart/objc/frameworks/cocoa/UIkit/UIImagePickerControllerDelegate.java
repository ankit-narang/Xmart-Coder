package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIImagePickerControllerDelegate 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (void)imagePickerController:(UIImagePickerController *)picker didFinishPickingImage:(UIImage *)image editingInfo:(NSDictionary *)editingInfo NS_DEPRECATED_IOS(2_0, 3_0);", selector = "imagePickerController:didFinishPickingImage:editingInfo:")
    void imagePickerController$didFinishPickingImage$editingInfo$(UIImagePickerController picker, UIImage image, NSDictionary editingInfo);

    @ObjCMethodSign(sign = "- (void)imagePickerController:(UIImagePickerController *)picker didFinishPickingMediaWithInfo:(NSDictionary *)info;", selector = "imagePickerController:didFinishPickingMediaWithInfo:")
    void imagePickerController$didFinishPickingMediaWithInfo$(UIImagePickerController picker, NSDictionary info);

    @ObjCMethodSign(sign = "- (void)imagePickerControllerDidCancel:(UIImagePickerController *)picker;", selector = "imagePickerControllerDidCancel:")
    void imagePickerControllerDidCancel$(UIImagePickerController picker);
}
