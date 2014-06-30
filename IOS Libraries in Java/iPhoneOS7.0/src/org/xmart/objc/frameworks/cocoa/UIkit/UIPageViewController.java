package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPageViewController extends UIViewController  {
    
    public UIPageViewController() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIPageViewControllerDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPageViewControllerDelegate v);
    @ObjCProperty public UIPageViewControllerDelegate delegate;

    @ObjCPropertyGetter(selector = "dataSource")
    public native UIPageViewControllerDataSource getDataSource();
    @ObjCPropertySetter(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UIPageViewControllerDataSource v);
    @ObjCProperty public UIPageViewControllerDataSource dataSource;

    @ObjCPropertyGetter(selector = "transitionStyle")
    public native UIPageViewControllerTransitionStyle getTransitionStyle();
    @ObjCProperty public UIPageViewControllerTransitionStyle transitionStyle;

    @ObjCPropertyGetter(selector = "navigationOrientation")
    public native UIPageViewControllerNavigationOrientation getNavigationOrientation();
    @ObjCProperty public UIPageViewControllerNavigationOrientation navigationOrientation;

    @ObjCPropertyGetter(selector = "spineLocation")
    public native UIPageViewControllerSpineLocation getSpineLocation();
    @ObjCProperty public UIPageViewControllerSpineLocation spineLocation;

    @ObjCPropertyGetter(selector = "isDoubleSided")
    public native boolean isDoubleSided();
    @ObjCPropertySetter(selector = "setDoubleSided:")
    public native void setDoubleSided(boolean v);
    @ObjCProperty public boolean doubleSided;

    @ObjCPropertyGetter(selector = "gestureRecognizers")
    public native NSArray getGestureRecognizers();
    @ObjCProperty public NSArray gestureRecognizers;

    @ObjCPropertyGetter(selector = "viewControllers")
    public native NSArray getViewControllers();
    @ObjCProperty public NSArray viewControllers;
    
    @ObjCMethodSign(sign = "- (id)initWithTransitionStyle:(UIPageViewControllerTransitionStyle)style navigationOrientation:(UIPageViewControllerNavigationOrientation)navigationOrientation options:(NSDictionary *)options;", selector = "initWithTransitionStyle:navigationOrientation:options:")
    public native UIPageViewController initWithTransitionStyle$navigationOrientation$options$(UIPageViewControllerTransitionStyle style, UIPageViewControllerNavigationOrientation navigationOrientation, NSDictionary options);

    @ObjCMethodSign(sign = "- (void)setViewControllers:(NSArray *)viewControllers direction:(UIPageViewControllerNavigationDirection)direction animated:(BOOL)animated completion:(void (^)(BOOL finished))completion;", selector = "setViewControllers:direction:animated:completion:")
    public native void setViewControllers$direction$animated$completion$(NSArray viewControllers, UIPageViewControllerNavigationDirection direction, boolean animated, ObjCBlock completion);
}
