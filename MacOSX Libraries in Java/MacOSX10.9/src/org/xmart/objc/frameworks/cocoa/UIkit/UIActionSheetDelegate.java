package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIActionSheetDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet clickedButtonAtIndex:(NSInteger)buttonIndex;", selector = "actionSheet:clickedButtonAtIndex:")
    void actionSheet$clickedButtonAtIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheetCancel:(UIActionSheet *)actionSheet;", selector = "actionSheetCancel:")
    void actionSheetCancel$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)willPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "willPresentActionSheet:")
    void willPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)didPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "didPresentActionSheet:")
    void didPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet willDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:willDismissWithButtonIndex:")
    void actionSheet$willDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet didDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:didDismissWithButtonIndex:")
    void actionSheet$didDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);
}
