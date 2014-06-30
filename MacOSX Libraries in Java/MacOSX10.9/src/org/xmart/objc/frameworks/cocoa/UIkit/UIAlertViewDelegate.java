package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAlertViewDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)alertView:(UIAlertView *)alertView clickedButtonAtIndex:(NSInteger)buttonIndex;", selector = "alertView:clickedButtonAtIndex:")
    void alertView$clickedButtonAtIndex$(UIAlertView alertView, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)alertViewCancel:(UIAlertView *)alertView;", selector = "alertViewCancel:")
    void alertViewCancel$(UIAlertView alertView);

    @ObjCMethodSign(sign = "- (void)willPresentAlertView:(UIAlertView *)alertView;", selector = "willPresentAlertView:")
    void willPresentAlertView$(UIAlertView alertView);

    @ObjCMethodSign(sign = "- (void)didPresentAlertView:(UIAlertView *)alertView;", selector = "didPresentAlertView:")
    void didPresentAlertView$(UIAlertView alertView);

    @ObjCMethodSign(sign = "- (void)alertView:(UIAlertView *)alertView willDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "alertView:willDismissWithButtonIndex:")
    void alertView$willDismissWithButtonIndex$(UIAlertView alertView, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)alertView:(UIAlertView *)alertView didDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "alertView:didDismissWithButtonIndex:")
    void alertView$didDismissWithButtonIndex$(UIAlertView alertView, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (BOOL)alertViewShouldEnableFirstOtherButton:(UIAlertView *)alertView;", selector = "alertViewShouldEnableFirstOtherButton:")
    boolean alertViewShouldEnableFirstOtherButton$(UIAlertView alertView);
}
