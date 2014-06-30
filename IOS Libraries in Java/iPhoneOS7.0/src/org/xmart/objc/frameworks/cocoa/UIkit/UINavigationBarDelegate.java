package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UINavigationBarDelegate 
    extends UIBarPositioningDelegate {

    
    
    @ObjCMethodSign(sign = "- (BOOL)navigationBar:(UINavigationBar *)navigationBar shouldPushItem:(UINavigationItem *)item;", selector = "navigationBar:shouldPushItem:")
    boolean navigationBar$shouldPushItem$(UINavigationBar navigationBar, UINavigationItem item);

    @ObjCMethodSign(sign = "- (void)navigationBar:(UINavigationBar *)navigationBar didPushItem:(UINavigationItem *)item;", selector = "navigationBar:didPushItem:")
    void navigationBar$didPushItem$(UINavigationBar navigationBar, UINavigationItem item);

    @ObjCMethodSign(sign = "- (BOOL)navigationBar:(UINavigationBar *)navigationBar shouldPopItem:(UINavigationItem *)item;", selector = "navigationBar:shouldPopItem:")
    boolean navigationBar$shouldPopItem$(UINavigationBar navigationBar, UINavigationItem item);

    @ObjCMethodSign(sign = "- (void)navigationBar:(UINavigationBar *)navigationBar didPopItem:(UINavigationItem *)item;", selector = "navigationBar:didPopItem:")
    void navigationBar$didPopItem$(UINavigationBar navigationBar, UINavigationItem item);
}
