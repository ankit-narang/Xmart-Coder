package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPrintInteractionController extends NSObject  {
    
    public UIPrintInteractionController() {}
    @ObjCPropertyGetter(selector = "printInfo")
    public native UIPrintInfo getPrintInfo();
    @ObjCPropertySetter(selector = "setPrintInfo:")
    public native void setPrintInfo(UIPrintInfo v);
    @ObjCProperty public UIPrintInfo printInfo;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIPrintInteractionControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPrintInteractionControllerDelegate v);
    @ObjCProperty public UIPrintInteractionControllerDelegate delegate;

    @ObjCPropertyGetter(selector = "showsPageRange")
    public native boolean isShowsPageRange();
    @ObjCPropertySetter(selector = "setShowsPageRange:")
    public native void setShowsPageRange(boolean v);
    @ObjCProperty public boolean showsPageRange;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "showsNumberOfCopies")
    public native boolean isShowsNumberOfCopies();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setShowsNumberOfCopies:")
    public native void setShowsNumberOfCopies(boolean v);
    @ObjCProperty public boolean showsNumberOfCopies;

    @ObjCPropertyGetter(selector = "printPaper")
    public native UIPrintPaper getPrintPaper();
    @ObjCProperty public UIPrintPaper printPaper;

    @ObjCPropertyGetter(selector = "printPageRenderer")
    public native UIPrintPageRenderer getPrintPageRenderer();
    @ObjCPropertySetter(selector = "setPrintPageRenderer:")
    public native void setPrintPageRenderer(UIPrintPageRenderer v);
    @ObjCProperty public UIPrintPageRenderer printPageRenderer;

    @ObjCPropertyGetter(selector = "printFormatter")
    public native UIPrintFormatter getPrintFormatter();
    @ObjCPropertySetter(selector = "setPrintFormatter:")
    public native void setPrintFormatter(UIPrintFormatter v);
    @ObjCProperty public UIPrintFormatter printFormatter;

    @ObjCPropertyGetter(selector = "printingItem")
    public native NSObject getPrintingItem();
    @ObjCPropertySetter(selector = "setPrintingItem:")
    public native void setPrintingItem(NSObject v);
    @ObjCProperty public NSObject printingItem;

    @ObjCPropertyGetter(selector = "printingItems")
    public native NSArray getPrintingItems();
    @ObjCPropertySetter(selector = "setPrintingItems:")
    public native void setPrintingItems(NSArray v);
    @ObjCProperty public NSArray printingItems;
    
    @ObjCMethodSign(sign = "- (BOOL)presentAnimated:(BOOL)animated completionHandler:(UIPrintInteractionCompletionHandler)completion;", selector = "presentAnimated:completionHandler:")
    public native boolean presentAnimated$completionHandler$(boolean animated, ObjCFunctionPtr completion);

    @ObjCMethodSign(sign = "- (BOOL)presentFromRect:(CGRect)rect inView:(UIView *)view animated:(BOOL)animated completionHandler:(UIPrintInteractionCompletionHandler)completion;", selector = "presentFromRect:inView:animated:completionHandler:")
    public native boolean presentFromRect$inView$animated$completionHandler$(@ObjCByValue CGRect rect, UIView view, boolean animated, ObjCFunctionPtr completion);

    @ObjCMethodSign(sign = "- (BOOL)presentFromBarButtonItem:(UIBarButtonItem *)item animated:(BOOL)animated completionHandler:(UIPrintInteractionCompletionHandler)completion;", selector = "presentFromBarButtonItem:animated:completionHandler:")
    public native boolean presentFromBarButtonItem$animated$completionHandler$(UIBarButtonItem item, boolean animated, ObjCFunctionPtr completion);

    @ObjCMethodSign(sign = "- (void)dismissAnimated:(BOOL)animated;", selector = "dismissAnimated:")
    public native void dismissAnimated$(boolean animated);

    @ObjCMethodSign(sign = "+ (BOOL)isPrintingAvailable;", selector = "isPrintingAvailable")
    public static native boolean isPrintingAvailable();

    @ObjCMethodSign(sign = "+ (NSSet *)printableUTIs;", selector = "printableUTIs")
    public static native NSSet printableUTIs();

    @ObjCMethodSign(sign = "+ (BOOL)canPrintURL:(NSURL *)url;", selector = "canPrintURL:")
    public static native boolean canPrintURL$(NSURL url);

    @ObjCMethodSign(sign = "+ (BOOL)canPrintData:(NSData *)data;", selector = "canPrintData:")
    public static native boolean canPrintData$(NSData data);

    @ObjCMethodSign(sign = "+ (UIPrintInteractionController *)sharedPrintController;", selector = "sharedPrintController")
    public static native UIPrintInteractionController sharedPrintController();
}
