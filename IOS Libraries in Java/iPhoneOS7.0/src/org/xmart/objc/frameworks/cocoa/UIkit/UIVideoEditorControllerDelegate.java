package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIVideoEditorControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)videoEditorController:(UIVideoEditorController *)editor didSaveEditedVideoToPath:(NSString *)editedVideoPath;", selector = "videoEditorController:didSaveEditedVideoToPath:")
    void videoEditorController$didSaveEditedVideoToPath$(UIVideoEditorController editor, NSString editedVideoPath);

    @ObjCMethodSign(sign = "- (void)videoEditorController:(UIVideoEditorController *)editor didFailWithError:(NSError *)error;", selector = "videoEditorController:didFailWithError:")
    void videoEditorController$didFailWithError$(UIVideoEditorController editor, NSError error);

    @ObjCMethodSign(sign = "- (void)videoEditorControllerDidCancel:(UIVideoEditorController *)editor;", selector = "videoEditorControllerDidCancel:")
    void videoEditorControllerDidCancel$(UIVideoEditorController editor);
}
