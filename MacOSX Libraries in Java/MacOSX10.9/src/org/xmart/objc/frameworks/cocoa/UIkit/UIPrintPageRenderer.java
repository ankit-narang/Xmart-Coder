package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPrintPageRenderer extends NSObject  {
    
    public UIPrintPageRenderer() {}
    @ObjCPropertyGetter(selector = "headerHeight")
    public native float getHeaderHeight();
    @ObjCPropertySetter(selector = "setHeaderHeight:")
    public native void setHeaderHeight(float v);
    @ObjCProperty public float headerHeight;

    @ObjCPropertyGetter(selector = "footerHeight")
    public native float getFooterHeight();
    @ObjCPropertySetter(selector = "setFooterHeight:")
    public native void setFooterHeight(float v);
    @ObjCProperty public float footerHeight;

    @ObjCPropertyGetter(selector = "paperRect")
    public native @ObjCByValue CGRect getPaperRect();
    @ObjCProperty public @ObjCByValue CGRect paperRect;

    @ObjCPropertyGetter(selector = "printableRect")
    public native @ObjCByValue CGRect getPrintableRect();
    @ObjCProperty public @ObjCByValue CGRect printableRect;

    @ObjCPropertyGetter(selector = "printFormatters")
    public native NSArray getPrintFormatters();
    @ObjCPropertySetter(selector = "setPrintFormatters:")
    public native void setPrintFormatters(NSArray v);
    @ObjCProperty public NSArray printFormatters;
    
    @ObjCMethodSign(sign = "- (NSArray *)printFormattersForPageAtIndex:(NSInteger)pageIndex;", selector = "printFormattersForPageAtIndex:")
    public native NSArray printFormattersForPageAtIndex$(@NSInteger long pageIndex);

    @ObjCMethodSign(sign = "- (void)addPrintFormatter:(UIPrintFormatter *)formatter startingAtPageAtIndex:(NSInteger)pageIndex;", selector = "addPrintFormatter:startingAtPageAtIndex:")
    public native void addPrintFormatter$startingAtPageAtIndex$(UIPrintFormatter formatter, @NSInteger long pageIndex);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfPages;", selector = "numberOfPages")
    public native @NSInteger long numberOfPages();

    @ObjCMethodSign(sign = "- (void)prepareForDrawingPages:(NSRange)range;", selector = "prepareForDrawingPages:")
    public native void prepareForDrawingPages$(@ObjCByValue NSRange range);

    @ObjCMethodSign(sign = "- (void)drawPageAtIndex:(NSInteger)pageIndex inRect:(CGRect)printableRect;", selector = "drawPageAtIndex:inRect:")
    public native void drawPageAtIndex$inRect$(@NSInteger long pageIndex, @ObjCByValue CGRect printableRect);

    @ObjCMethodSign(sign = "- (void)drawPrintFormatter:(UIPrintFormatter *)printFormatter forPageAtIndex:(NSInteger)pageIndex;", selector = "drawPrintFormatter:forPageAtIndex:")
    public native void drawPrintFormatter$forPageAtIndex$(UIPrintFormatter printFormatter, @NSInteger long pageIndex);

    @ObjCMethodSign(sign = "- (void)drawHeaderForPageAtIndex:(NSInteger)pageIndex  inRect:(CGRect)headerRect;", selector = "drawHeaderForPageAtIndex:inRect:")
    public native void drawHeaderForPageAtIndex$inRect$(@NSInteger long pageIndex, @ObjCByValue CGRect headerRect);

    @ObjCMethodSign(sign = "- (void)drawContentForPageAtIndex:(NSInteger)pageIndex inRect:(CGRect)contentRect;", selector = "drawContentForPageAtIndex:inRect:")
    public native void drawContentForPageAtIndex$inRect$(@NSInteger long pageIndex, @ObjCByValue CGRect contentRect);

    @ObjCMethodSign(sign = "- (void)drawFooterForPageAtIndex:(NSInteger)pageIndex  inRect:(CGRect)footerRect;", selector = "drawFooterForPageAtIndex:inRect:")
    public native void drawFooterForPageAtIndex$inRect$(@NSInteger long pageIndex, @ObjCByValue CGRect footerRect);
}
