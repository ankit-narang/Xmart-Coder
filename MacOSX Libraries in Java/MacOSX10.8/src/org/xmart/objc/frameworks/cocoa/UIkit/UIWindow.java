package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIWindow extends UIView  {
    
    public UIWindow() {}
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "screen")
    public native UIScreen getScreen();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setScreen:")
    public native void setScreen(UIScreen v);
    @ObjCProperty public UIScreen screen;

    @ObjCPropertyGetter(selector = "windowLevel")
    public native float getWindowLevel();
    @ObjCPropertySetter(selector = "setWindowLevel:")
    public native void setWindowLevel(float v);
    @ObjCProperty public float windowLevel;

    @ObjCPropertyGetter(selector = "isKeyWindow")
    public native boolean isKeyWindow();
    @ObjCProperty public boolean keyWindow;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "rootViewController")
    public native UIViewController getRootViewController();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setRootViewController:")
    public native void setRootViewController(UIViewController v);
    @ObjCProperty public UIViewController rootViewController;
    
    @ObjCMethodSign(sign = "- (void)becomeKeyWindow;", selector = "becomeKeyWindow")
    public native void becomeKeyWindow();

    @ObjCMethodSign(sign = "- (void)resignKeyWindow;", selector = "resignKeyWindow")
    public native void resignKeyWindow();

    @ObjCMethodSign(sign = "- (void)makeKeyWindow;", selector = "makeKeyWindow")
    public native void makeKeyWindow();

    @ObjCMethodSign(sign = "- (void)makeKeyAndVisible;", selector = "makeKeyAndVisible")
    public native void makeKeyAndVisible();

    @ObjCMethodSign(sign = "- (void)sendEvent:(UIEvent *)event;", selector = "sendEvent:")
    public native void sendEvent$(UIEvent event);

    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)point toWindow:(UIWindow *)window;", selector = "convertPoint:toWindow:")
    public native @ObjCByValue CGPoint convertPoint$toWindow$(@ObjCByValue CGPoint point, UIWindow window);

    @ObjCMethodSign(sign = "- (CGPoint)convertPoint:(CGPoint)point fromWindow:(UIWindow *)window;", selector = "convertPoint:fromWindow:")
    public native @ObjCByValue CGPoint convertPoint$fromWindow$(@ObjCByValue CGPoint point, UIWindow window);

    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)rect toWindow:(UIWindow *)window;", selector = "convertRect:toWindow:")
    public native @ObjCByValue CGRect convertRect$toWindow$(@ObjCByValue CGRect rect, UIWindow window);

    @ObjCMethodSign(sign = "- (CGRect)convertRect:(CGRect)rect fromWindow:(UIWindow *)window;", selector = "convertRect:fromWindow:")
    public native @ObjCByValue CGRect convertRect$fromWindow$(@ObjCByValue CGRect rect, UIWindow window);
}
