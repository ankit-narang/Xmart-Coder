package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIActivityItemSource 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (id)activityViewControllerPlaceholderItem:(UIActivityViewController *)activityViewController;", selector = "activityViewControllerPlaceholderItem:")
    NSObject activityViewControllerPlaceholderItem$(UIActivityViewController activityViewController);

    @ObjCMethodSign(sign = "- (id)activityViewController:(UIActivityViewController *)activityViewController itemForActivityType:(NSString *)activityType;", selector = "activityViewController:itemForActivityType:")
    NSObject activityViewController$itemForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (NSString *)activityViewController:(UIActivityViewController *)activityViewController subjectForActivityType:(NSString *)activityType;", selector = "activityViewController:subjectForActivityType:")
    NSString activityViewController$subjectForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (NSString *)activityViewController:(UIActivityViewController *)activityViewController dataTypeIdentifierForActivityType:(NSString *)activityType;", selector = "activityViewController:dataTypeIdentifierForActivityType:")
    NSString activityViewController$dataTypeIdentifierForActivityType$(UIActivityViewController activityViewController, NSString activityType);

    @ObjCMethodSign(sign = "- (UIImage *)activityViewController:(UIActivityViewController *)activityViewController thumbnailImageForActivityType:(NSString *)activityType suggestedSize:(CGSize)size;", selector = "activityViewController:thumbnailImageForActivityType:suggestedSize:")
    UIImage activityViewController$thumbnailImageForActivityType$suggestedSize$(UIActivityViewController activityViewController, NSString activityType, @ObjCByValue CGSize size);
}
