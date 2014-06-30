package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPrintFormatter extends NSObject implements NSCopying {
    
    public UIPrintFormatter() {}
    @ObjCPropertyGetter(selector = "printPageRenderer")
    public native UIPrintPageRenderer getPrintPageRenderer();
    @ObjCProperty public UIPrintPageRenderer printPageRenderer;

    @ObjCPropertyGetter(selector = "maximumContentHeight")
    public native float getMaximumContentHeight();
    @ObjCPropertySetter(selector = "setMaximumContentHeight:")
    public native void setMaximumContentHeight(float v);
    @ObjCProperty public float maximumContentHeight;

    @ObjCPropertyGetter(selector = "maximumContentWidth")
    public native float getMaximumContentWidth();
    @ObjCPropertySetter(selector = "setMaximumContentWidth:")
    public native void setMaximumContentWidth(float v);
    @ObjCProperty public float maximumContentWidth;

    @ObjCPropertyGetter(selector = "contentInsets")
    public native @ObjCByValue UIEdgeInsets getContentInsets();
    @ObjCPropertySetter(selector = "setContentInsets:")
    public native void setContentInsets(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets contentInsets;

    @ObjCPropertyGetter(selector = "startPage")
    public native @NSInteger long getStartPage();
    @ObjCPropertySetter(selector = "setStartPage:")
    public native void setStartPage(@NSInteger long v);
    @ObjCProperty public @NSInteger long startPage;

    @ObjCPropertyGetter(selector = "pageCount")
    public native @NSInteger long getPageCount();
    @ObjCProperty public @NSInteger long pageCount;
    
    @ObjCMethodSign(sign = "- (void)removeFromPrintPageRenderer;", selector = "removeFromPrintPageRenderer")
    public native void removeFromPrintPageRenderer();

    @ObjCMethodSign(sign = "- (CGRect)rectForPageAtIndex:(NSInteger)pageIndex;", selector = "rectForPageAtIndex:")
    public native @ObjCByValue CGRect rectForPageAtIndex$(@NSInteger long pageIndex);

    @ObjCMethodSign(sign = "- (void)drawInRect:(CGRect)rect forPageAtIndex:(NSInteger)pageIndex;", selector = "drawInRect:forPageAtIndex:")
    public native void drawInRect$forPageAtIndex$(@ObjCByValue CGRect rect, @NSInteger long pageIndex);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
