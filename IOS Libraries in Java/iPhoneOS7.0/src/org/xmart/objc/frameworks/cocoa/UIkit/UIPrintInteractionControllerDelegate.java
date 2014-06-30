package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPrintInteractionControllerDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (UIViewController *)printInteractionControllerParentViewController:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerParentViewController:")
    UIViewController printInteractionControllerParentViewController$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (UIPrintPaper *)printInteractionController:(UIPrintInteractionController *)printInteractionController choosePaper:(NSArray *)paperList;", selector = "printInteractionController:choosePaper:")
    UIPrintPaper printInteractionController$choosePaper$(UIPrintInteractionController printInteractionController, NSArray paperList);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerWillPresentPrinterOptions:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerWillPresentPrinterOptions:")
    void printInteractionControllerWillPresentPrinterOptions$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerDidPresentPrinterOptions:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerDidPresentPrinterOptions:")
    void printInteractionControllerDidPresentPrinterOptions$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerWillDismissPrinterOptions:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerWillDismissPrinterOptions:")
    void printInteractionControllerWillDismissPrinterOptions$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerDidDismissPrinterOptions:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerDidDismissPrinterOptions:")
    void printInteractionControllerDidDismissPrinterOptions$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerWillStartJob:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerWillStartJob:")
    void printInteractionControllerWillStartJob$(UIPrintInteractionController printInteractionController);

    @ObjCMethodSign(sign = "- (void)printInteractionControllerDidFinishJob:(UIPrintInteractionController *)printInteractionController;", selector = "printInteractionControllerDidFinishJob:")
    void printInteractionControllerDidFinishJob$(UIPrintInteractionController printInteractionController);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (CGFloat)printInteractionController:(UIPrintInteractionController *)printInteractionController cutLengthForPaper:(UIPrintPaper *)paper NS_AVAILABLE_IOS(7_0);", selector = "printInteractionController:cutLengthForPaper:")
    float printInteractionController$cutLengthForPaper$(UIPrintInteractionController printInteractionController, UIPrintPaper paper);
}
