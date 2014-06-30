package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITabBarController extends UIViewController implements UITabBarDelegate, NSCoding {
    
    public UITabBarController() {}
    @ObjCPropertyGetter(selector = "viewControllers")
    public native NSArray getViewControllers();
    @ObjCPropertySetter(selector = "setViewControllers:")
    public native void setViewControllers(NSArray v);
    @ObjCProperty public NSArray viewControllers;

    @ObjCPropertyGetter(selector = "selectedViewController")
    public native UIViewController getSelectedViewController();
    @ObjCPropertySetter(selector = "setSelectedViewController:", strongRef = true)
    public native void setSelectedViewController(UIViewController v);
    @ObjCProperty public UIViewController selectedViewController;

    @ObjCPropertyGetter(selector = "selectedIndex")
    public native @NSUInteger long getSelectedIndex();
    @ObjCPropertySetter(selector = "setSelectedIndex:")
    public native void setSelectedIndex(@NSUInteger long v);
    @ObjCProperty public @NSUInteger long selectedIndex;

    @ObjCPropertyGetter(selector = "moreNavigationController")
    public native UINavigationController getMoreNavigationController();
    @ObjCProperty public UINavigationController moreNavigationController;

    @ObjCPropertyGetter(selector = "customizableViewControllers")
    public native NSArray getCustomizableViewControllers();
    @ObjCPropertySetter(selector = "setCustomizableViewControllers:")
    public native void setCustomizableViewControllers(NSArray v);
    @ObjCProperty public NSArray customizableViewControllers;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "tabBar")
    public native UITabBar getTabBar();
    @ObjCProperty public UITabBar tabBar;

    @ObjCPropertyGetter(selector = "delegate")
    public native UITabBarControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITabBarControllerDelegate v);
    @ObjCProperty public UITabBarControllerDelegate delegate;
    
    @ObjCMethodSign(sign = "- (void)setViewControllers:(NSArray *)viewControllers animated:(BOOL)animated;", selector = "setViewControllers:animated:")
    public native void setViewControllers$animated$(NSArray viewControllers, boolean animated);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didSelectItem:(UITabBarItem *)item;", selector = "tabBar:didSelectItem:")
    public native void tabBar$didSelectItem$(UITabBar tabBar, UITabBarItem item);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar willBeginCustomizingItems:(NSArray *)items;", selector = "tabBar:willBeginCustomizingItems:")
    public native void tabBar$willBeginCustomizingItems$(UITabBar tabBar, NSArray items);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didBeginCustomizingItems:(NSArray *)items;", selector = "tabBar:didBeginCustomizingItems:")
    public native void tabBar$didBeginCustomizingItems$(UITabBar tabBar, NSArray items);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar willEndCustomizingItems:(NSArray *)items changed:(BOOL)changed;", selector = "tabBar:willEndCustomizingItems:changed:")
    public native void tabBar$willEndCustomizingItems$changed$(UITabBar tabBar, NSArray items, boolean changed);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didEndCustomizingItems:(NSArray *)items changed:(BOOL)changed;", selector = "tabBar:didEndCustomizingItems:changed:")
    public native void tabBar$didEndCustomizingItems$changed$(UITabBar tabBar, NSArray items, boolean changed);
}
