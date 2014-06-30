package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIMenuController extends NSObject  {
    
    public UIMenuController() {}
    @ObjCPropertyGetter(selector = "isMenuVisible")
    public native boolean isMenuVisible();
    @ObjCPropertySetter(selector = "setMenuVisible:")
    public native void setMenuVisible(boolean v);
    @ObjCProperty public boolean menuVisible;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "arrowDirection")
    public native UIMenuControllerArrowDirection getArrowDirection();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setArrowDirection:")
    public native void setArrowDirection(UIMenuControllerArrowDirection v);
    @ObjCProperty public UIMenuControllerArrowDirection arrowDirection;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "menuItems")
    public native NSArray getMenuItems();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setMenuItems:")
    public native void setMenuItems(NSArray v);
    @ObjCProperty public NSArray menuItems;

    @ObjCPropertyGetter(selector = "menuFrame")
    public native @ObjCByValue CGRect getMenuFrame();
    @ObjCProperty public @ObjCByValue CGRect menuFrame;
    
    @ObjCMethodSign(sign = "- (void)setMenuVisible:(BOOL)menuVisible animated:(BOOL)animated;", selector = "setMenuVisible:animated:")
    public native void setMenuVisible$animated$(boolean menuVisible, boolean animated);

    @ObjCMethodSign(sign = "- (void)setTargetRect:(CGRect)targetRect inView:(UIView *)targetView;", selector = "setTargetRect:inView:")
    public native void setTargetRect$inView$(@ObjCByValue CGRect targetRect, UIView targetView);

    @ObjCMethodSign(sign = "- (void)update;", selector = "update")
    public native void update();

    @ObjCMethodSign(sign = "+ (UIMenuController *)sharedMenuController;", selector = "sharedMenuController")
    public static native UIMenuController sharedMenuController();
}
