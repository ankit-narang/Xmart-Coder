package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIDocumentInteractionControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (UIViewController *)documentInteractionControllerViewControllerForPreview:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerViewControllerForPreview:")
    UIViewController documentInteractionControllerViewControllerForPreview$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (CGRect)documentInteractionControllerRectForPreview:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerRectForPreview:")
    @ObjCByValue CGRect documentInteractionControllerRectForPreview$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (UIView *)documentInteractionControllerViewForPreview:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerViewForPreview:")
    UIView documentInteractionControllerViewForPreview$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerWillBeginPreview:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerWillBeginPreview:")
    void documentInteractionControllerWillBeginPreview$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerDidEndPreview:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerDidEndPreview:")
    void documentInteractionControllerDidEndPreview$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerWillPresentOptionsMenu:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerWillPresentOptionsMenu:")
    void documentInteractionControllerWillPresentOptionsMenu$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerDidDismissOptionsMenu:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerDidDismissOptionsMenu:")
    void documentInteractionControllerDidDismissOptionsMenu$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerWillPresentOpenInMenu:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerWillPresentOpenInMenu:")
    void documentInteractionControllerWillPresentOpenInMenu$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionControllerDidDismissOpenInMenu:(UIDocumentInteractionController *)controller;", selector = "documentInteractionControllerDidDismissOpenInMenu:")
    void documentInteractionControllerDidDismissOpenInMenu$(UIDocumentInteractionController controller);

    @ObjCMethodSign(sign = "- (void)documentInteractionController:(UIDocumentInteractionController *)controller willBeginSendingToApplication:(NSString *)application;", selector = "documentInteractionController:willBeginSendingToApplication:")
    void documentInteractionController$willBeginSendingToApplication$(UIDocumentInteractionController controller, NSString application);

    @ObjCMethodSign(sign = "- (void)documentInteractionController:(UIDocumentInteractionController *)controller didEndSendingToApplication:(NSString *)application;", selector = "documentInteractionController:didEndSendingToApplication:")
    void documentInteractionController$didEndSendingToApplication$(UIDocumentInteractionController controller, NSString application);

    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (BOOL)documentInteractionController:(UIDocumentInteractionController *)controller canPerformAction:(SEL)action NS_DEPRECATED_IOS(3_2, 6_0);", selector = "documentInteractionController:canPerformAction:")
    boolean documentInteractionController$canPerformAction$(UIDocumentInteractionController controller, ObjCSelector action);

    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @ObjCMethodSign(sign = "- (BOOL)documentInteractionController:(UIDocumentInteractionController *)controller performAction:(SEL)action NS_DEPRECATED_IOS(3_2, 6_0);", selector = "documentInteractionController:performAction:")
    boolean documentInteractionController$performAction$(UIDocumentInteractionController controller, ObjCSelector action);
}
