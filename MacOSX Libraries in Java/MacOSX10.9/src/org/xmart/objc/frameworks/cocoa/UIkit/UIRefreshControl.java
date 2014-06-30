package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIRefreshControl extends UIControl  {
    
    public UIRefreshControl() {}
    @ObjCPropertyGetter(selector = "isRefreshing")
    public native boolean isRefreshing();
    @ObjCProperty public boolean refreshing;

    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    @ObjCPropertyGetter(selector = "attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @ObjCPropertySetter(selector = "setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedTitle;
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native UIRefreshControl init();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)beginRefreshing NS_AVAILABLE_IOS(6_0);", selector = "beginRefreshing")
    public native void beginRefreshing();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)endRefreshing NS_AVAILABLE_IOS(6_0);", selector = "endRefreshing")
    public native void endRefreshing();
}
