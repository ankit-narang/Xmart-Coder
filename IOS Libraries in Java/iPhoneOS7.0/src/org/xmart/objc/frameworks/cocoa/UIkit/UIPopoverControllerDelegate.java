package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPopoverControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)popoverControllerShouldDismissPopover:(UIPopoverController *)popoverController;", selector = "popoverControllerShouldDismissPopover:")
    boolean popoverControllerShouldDismissPopover$(UIPopoverController popoverController);

    @ObjCMethodSign(sign = "- (void)popoverControllerDidDismissPopover:(UIPopoverController *)popoverController;", selector = "popoverControllerDidDismissPopover:")
    void popoverControllerDidDismissPopover$(UIPopoverController popoverController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)popoverController:(UIPopoverController *)popoverController willRepositionPopoverToRect:(inout CGRect *)rect inView:(inout UIView **)view NS_AVAILABLE_IOS(7_0);", selector = "popoverController:willRepositionPopoverToRect:inView:")
    void popoverController$willRepositionPopoverToRect$inView$(UIPopoverController popoverController, CGRect rect, UIView[] view);
}
