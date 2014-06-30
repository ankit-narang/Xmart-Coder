package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPageControl extends UIControl  {
    
    public UIPageControl() {}
    @ObjCPropertyGetter(selector = "numberOfPages")
    public native @NSInteger long getNumberOfPages();
    @ObjCPropertySetter(selector = "setNumberOfPages:")
    public native void setNumberOfPages(@NSInteger long v);
    @ObjCProperty public @NSInteger long numberOfPages;

    @ObjCPropertyGetter(selector = "currentPage")
    public native @NSInteger long getCurrentPage();
    @ObjCPropertySetter(selector = "setCurrentPage:")
    public native void setCurrentPage(@NSInteger long v);
    @ObjCProperty public @NSInteger long currentPage;

    @ObjCPropertyGetter(selector = "hidesForSinglePage")
    public native boolean isHidesForSinglePage();
    @ObjCPropertySetter(selector = "setHidesForSinglePage:")
    public native void setHidesForSinglePage(boolean v);
    @ObjCProperty public boolean hidesForSinglePage;

    @ObjCPropertyGetter(selector = "defersCurrentPageDisplay")
    public native boolean isDefersCurrentPageDisplay();
    @ObjCPropertySetter(selector = "setDefersCurrentPageDisplay:")
    public native void setDefersCurrentPageDisplay(boolean v);
    @ObjCProperty public boolean defersCurrentPageDisplay;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "pageIndicatorTintColor")
    public native UIColor getPageIndicatorTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setPageIndicatorTintColor:")
    public native void setPageIndicatorTintColor(UIColor v);
    @ObjCProperty public UIColor pageIndicatorTintColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "currentPageIndicatorTintColor")
    public native UIColor getCurrentPageIndicatorTintColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setCurrentPageIndicatorTintColor:")
    public native void setCurrentPageIndicatorTintColor(UIColor v);
    @ObjCProperty public UIColor currentPageIndicatorTintColor;
    
    @ObjCMethodSign(sign = "- (void)updateCurrentPageDisplay;", selector = "updateCurrentPageDisplay")
    public native void updateCurrentPageDisplay();

    @ObjCMethodSign(sign = "- (CGSize)sizeForNumberOfPages:(NSInteger)pageCount;", selector = "sizeForNumberOfPages:")
    public native @ObjCByValue CGSize sizeForNumberOfPages$(@NSInteger long pageCount);
}
