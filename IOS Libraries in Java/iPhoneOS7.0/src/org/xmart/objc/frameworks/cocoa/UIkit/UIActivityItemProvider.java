package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIActivityItemProvider extends NSOperation implements UIActivityItemSource {
    
    public UIActivityItemProvider() {}
    @ObjCPropertyGetter(selector = "placeholderItem")
    public native NSObject getPlaceholderItem();
    @ObjCProperty public NSObject placeholderItem;

    @ObjCPropertyGetter(selector = "activityType")
    public native NSString getActivityType();
    @ObjCProperty public NSString activityType;
    
    @ObjCMethodSign(sign = "- (id)initWithPlaceholderItem:(id)placeholderItem;", selector = "initWithPlaceholderItem:")
    public native UIActivityItemProvider initWithPlaceholderItem$(NSObject placeholderItem);

    @ObjCMethodSign(sign = "- (id)item;", selector = "item")
    public native NSObject item();

    @ObjCMethodSign(sign = "- (id)activityViewControllerPlaceholderItem:(UIActivityViewController *)activityViewController;", selector = "activityViewControllerPlaceholderItem:")
    public native NSObject activityViewControllerPlaceholderItem$(UIActivityViewController activityViewController);

    @ObjCMethodSign(sign = "- (id)activityViewController:(UIActivityViewController *)activityViewController itemForActivityType:(NSString *)activityType;", selector = "activityViewController:itemForActivityType:")
    public native NSObject activityViewController$itemForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (NSString *)activityViewController:(UIActivityViewController *)activityViewController subjectForActivityType:(NSString *)activityType;", selector = "activityViewController:subjectForActivityType:")
    public native NSString activityViewController$subjectForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (NSString *)activityViewController:(UIActivityViewController *)activityViewController dataTypeIdentifierForActivityType:(NSString *)activityType;", selector = "activityViewController:dataTypeIdentifierForActivityType:")
    public native NSString activityViewController$dataTypeIdentifierForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (UIImage *)activityViewController:(UIActivityViewController *)activityViewController thumbnailImageForActivityType:(NSString *)activityType suggestedSize:(CGSize)size;", selector = "activityViewController:thumbnailImageForActivityType:suggestedSize:")
    public native UIImage activityViewController$thumbnailImageForActivityType$suggestedSize$(UIActivityViewController activityViewController, NSString activityType, @ObjCByValue CGSize size);
}
