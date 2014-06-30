package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITabBarDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didSelectItem:(UITabBarItem *)item;", selector = "tabBar:didSelectItem:")
    void tabBar$didSelectItem$(UITabBar tabBar, UITabBarItem item);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar willBeginCustomizingItems:(NSArray *)items;", selector = "tabBar:willBeginCustomizingItems:")
    void tabBar$willBeginCustomizingItems$(UITabBar tabBar, NSArray items);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didBeginCustomizingItems:(NSArray *)items;", selector = "tabBar:didBeginCustomizingItems:")
    void tabBar$didBeginCustomizingItems$(UITabBar tabBar, NSArray items);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar willEndCustomizingItems:(NSArray *)items changed:(BOOL)changed;", selector = "tabBar:willEndCustomizingItems:changed:")
    void tabBar$willEndCustomizingItems$changed$(UITabBar tabBar, NSArray items, boolean changed);

    @ObjCMethodSign(sign = "- (void)tabBar:(UITabBar *)tabBar didEndCustomizingItems:(NSArray *)items changed:(BOOL)changed;", selector = "tabBar:didEndCustomizingItems:changed:")
    void tabBar$didEndCustomizingItems$changed$(UITabBar tabBar, NSArray items, boolean changed);
}
