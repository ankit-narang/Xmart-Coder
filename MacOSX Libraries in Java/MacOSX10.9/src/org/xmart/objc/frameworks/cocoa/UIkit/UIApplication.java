package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIApplication extends UIResponder implements UIActionSheetDelegate {
    
    public UIApplication() {}
    @ObjCPropertyGetter(selector = "delegate")
    public native UIApplicationDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIApplicationDelegate v);
    @ObjCProperty public UIApplicationDelegate delegate;

    @ObjCPropertyGetter(selector = "isIdleTimerDisabled")
    public native boolean isIdleTimerDisabled();
    @ObjCPropertySetter(selector = "setIdleTimerDisabled:")
    public native void setIdleTimerDisabled(boolean v);
    @ObjCProperty public boolean idleTimerDisabled;

    @ObjCPropertyGetter(selector = "keyWindow")
    public native UIWindow getKeyWindow();
    @ObjCProperty public UIWindow keyWindow;

    @ObjCPropertyGetter(selector = "windows")
    public native NSArray getWindows();
    @ObjCProperty public NSArray windows;

    @ObjCPropertyGetter(selector = "isNetworkActivityIndicatorVisible")
    public native boolean isNetworkActivityIndicatorVisible();
    @ObjCPropertySetter(selector = "setNetworkActivityIndicatorVisible:")
    public native void setNetworkActivityIndicatorVisible(boolean v);
    @ObjCProperty public boolean networkActivityIndicatorVisible;

    @ObjCPropertyGetter(selector = "statusBarStyle")
    public native UIStatusBarStyle getStatusBarStyle();
    @ObjCPropertySetter(selector = "setStatusBarStyle:")
    public native void setStatusBarStyle(UIStatusBarStyle v);
    @ObjCProperty public UIStatusBarStyle statusBarStyle;

    @ObjCPropertyGetter(selector = "isStatusBarHidden")
    public native boolean isStatusBarHidden();
    @ObjCPropertySetter(selector = "setStatusBarHidden:")
    public native void setStatusBarHidden(boolean v);
    @ObjCProperty public boolean statusBarHidden;

    @ObjCPropertyGetter(selector = "statusBarOrientation")
    public native UIInterfaceOrientation getStatusBarOrientation();
    @ObjCPropertySetter(selector = "setStatusBarOrientation:")
    public native void setStatusBarOrientation(UIInterfaceOrientation v);
    @ObjCProperty public UIInterfaceOrientation statusBarOrientation;

    @ObjCPropertyGetter(selector = "statusBarOrientationAnimationDuration")
    public native double getStatusBarOrientationAnimationDuration();
    @ObjCProperty public double statusBarOrientationAnimationDuration;

    @ObjCPropertyGetter(selector = "statusBarFrame")
    public native @ObjCByValue CGRect getStatusBarFrame();
    @ObjCProperty public @ObjCByValue CGRect statusBarFrame;

    @ObjCPropertyGetter(selector = "applicationIconBadgeNumber")
    public native @NSInteger long getApplicationIconBadgeNumber();
    @ObjCPropertySetter(selector = "setApplicationIconBadgeNumber:")
    public native void setApplicationIconBadgeNumber(@NSInteger long v);
    @ObjCProperty public @NSInteger long applicationIconBadgeNumber;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "applicationSupportsShakeToEdit")
    public native boolean isApplicationSupportsShakeToEdit();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setApplicationSupportsShakeToEdit:")
    public native void setApplicationSupportsShakeToEdit(boolean v);
    @ObjCProperty public boolean applicationSupportsShakeToEdit;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "applicationState")
    public native UIApplicationState getApplicationState();
    @ObjCProperty public UIApplicationState applicationState;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundTimeRemaining")
    public native double getBackgroundTimeRemaining();
    @ObjCProperty public double backgroundTimeRemaining;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundRefreshStatus")
    public native UIBackgroundRefreshStatus getBackgroundRefreshStatus();
    @ObjCProperty public UIBackgroundRefreshStatus backgroundRefreshStatus;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "isProtectedDataAvailable")
    public native boolean isProtectedDataAvailable();
    @ObjCProperty public boolean protectedDataAvailable;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "userInterfaceLayoutDirection")
    public native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection();
    @ObjCProperty public UIUserInterfaceLayoutDirection userInterfaceLayoutDirection;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "preferredContentSizeCategory")
    public native NSString getPreferredContentSizeCategory();
    @ObjCProperty public NSString preferredContentSizeCategory;

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertyGetter(selector = "scheduledLocalNotifications")
    public native NSArray getScheduledLocalNotifications();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCPropertySetter(selector = "setScheduledLocalNotifications:")
    public native void setScheduledLocalNotifications(NSArray v);
    @ObjCProperty public NSArray scheduledLocalNotifications;

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "isProximitySensingEnabled")
    public native boolean isProximitySensingEnabled();
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setProximitySensingEnabled:")
    public native void setProximitySensingEnabled(boolean v);
    @ObjCProperty public boolean proximitySensingEnabled;
    
    @ObjCMethodSign(sign = "- (void)beginIgnoringInteractionEvents;", selector = "beginIgnoringInteractionEvents")
    public native void beginIgnoringInteractionEvents();

    @ObjCMethodSign(sign = "- (void)endIgnoringInteractionEvents;", selector = "endIgnoringInteractionEvents")
    public native void endIgnoringInteractionEvents();

    @ObjCMethodSign(sign = "- (BOOL)isIgnoringInteractionEvents;", selector = "isIgnoringInteractionEvents")
    public native boolean isIgnoringInteractionEvents();

    @ObjCMethodSign(sign = "- (BOOL)openURL:(NSURL*)url;", selector = "openURL:")
    public native boolean openURL$(NSURL url);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)canOpenURL:(NSURL *)url NS_AVAILABLE_IOS(3_0);", selector = "canOpenURL:")
    public native boolean canOpenURL$(NSURL url);

    @ObjCMethodSign(sign = "- (void)sendEvent:(UIEvent *)event;", selector = "sendEvent:")
    public native void sendEvent$(UIEvent event);

    @ObjCMethodSign(sign = "- (BOOL)sendAction:(SEL)action to:(id)target from:(id)sender forEvent:(UIEvent *)event;", selector = "sendAction:to:from:forEvent:")
    public native boolean sendAction$to$from$forEvent$(ObjCSelector action, NSObject target, NSObject sender, UIEvent event);

    @ObjCMethodSign(sign = "- (void)setStatusBarStyle:(UIStatusBarStyle)statusBarStyle animated:(BOOL)animated;", selector = "setStatusBarStyle:animated:")
    public native void setStatusBarStyle$animated$(UIStatusBarStyle statusBarStyle, boolean animated);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)setStatusBarHidden:(BOOL)hidden withAnimation:(UIStatusBarAnimation)animation NS_AVAILABLE_IOS(3_2);", selector = "setStatusBarHidden:withAnimation:")
    public native void setStatusBarHidden$withAnimation$(boolean hidden, UIStatusBarAnimation animation);

    @ObjCMethodSign(sign = "- (void)setStatusBarOrientation:(UIInterfaceOrientation)interfaceOrientation animated:(BOOL)animated;", selector = "setStatusBarOrientation:animated:")
    public native void setStatusBarOrientation$animated$(UIInterfaceOrientation interfaceOrientation, boolean animated);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)supportedInterfaceOrientationsForWindow:(UIWindow *)window NS_AVAILABLE_IOS(6_0);", selector = "supportedInterfaceOrientationsForWindow:")
    public native @NSUInteger long supportedInterfaceOrientationsForWindow$(UIWindow window);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIBackgroundTaskIdentifier)beginBackgroundTaskWithExpirationHandler:(void(^)(void))handler  NS_AVAILABLE_IOS(4_0);", selector = "beginBackgroundTaskWithExpirationHandler:")
    public native @NSUInteger long beginBackgroundTaskWithExpirationHandler$(ObjCBlock handler);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIBackgroundTaskIdentifier)beginBackgroundTaskWithName:(NSString *)taskName expirationHandler:(void(^)(void))handler NS_AVAILABLE_IOS(7_0);", selector = "beginBackgroundTaskWithName:expirationHandler:")
    public native @NSUInteger long beginBackgroundTaskWithName$expirationHandler$(NSString taskName, ObjCBlock handler);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)endBackgroundTask:(UIBackgroundTaskIdentifier)identifier NS_AVAILABLE_IOS(4_0);", selector = "endBackgroundTask:")
    public native void endBackgroundTask$(@NSUInteger long identifier);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setMinimumBackgroundFetchInterval:(NSTimeInterval)minimumBackgroundFetchInterval NS_AVAILABLE_IOS(7_0);", selector = "setMinimumBackgroundFetchInterval:")
    public native void setMinimumBackgroundFetchInterval(double minimumBackgroundFetchInterval);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)setKeepAliveTimeout:(NSTimeInterval)timeout handler:(void(^)(void))keepAliveHandler NS_AVAILABLE_IOS(4_0);", selector = "setKeepAliveTimeout:handler:")
    public native boolean setKeepAliveTimeout$handler$(double timeout, ObjCBlock keepAliveHandler);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)clearKeepAliveTimeout NS_AVAILABLE_IOS(4_0);", selector = "clearKeepAliveTimeout")
    public native void clearKeepAliveTimeout();

    @ObjCMethodSign(sign = "+ (UIApplication *)sharedApplication;", selector = "sharedApplication")
    public static native UIApplication sharedApplication();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIRemoteNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)registerForRemoteNotificationTypes:(UIRemoteNotificationType)types NS_AVAILABLE_IOS(3_0);", selector = "registerForRemoteNotificationTypes:")
    public native void registerForRemoteNotificationTypes$(UIRemoteNotificationType types);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIRemoteNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)unregisterForRemoteNotifications NS_AVAILABLE_IOS(3_0);", selector = "unregisterForRemoteNotifications")
    public native void unregisterForRemoteNotifications();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIRemoteNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (UIRemoteNotificationType)enabledRemoteNotificationTypes NS_AVAILABLE_IOS(3_0);", selector = "enabledRemoteNotificationTypes")
    public native UIRemoteNotificationType enabledRemoteNotificationTypes();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UILocalNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)presentLocalNotificationNow:(UILocalNotification *)notification NS_AVAILABLE_IOS(4_0);", selector = "presentLocalNotificationNow:")
    public native void presentLocalNotificationNow$(UILocalNotification notification);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UILocalNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)scheduleLocalNotification:(UILocalNotification *)notification NS_AVAILABLE_IOS(4_0);", selector = "scheduleLocalNotification:")
    public native void scheduleLocalNotification$(UILocalNotification notification);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UILocalNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)cancelLocalNotification:(UILocalNotification *)notification NS_AVAILABLE_IOS(4_0);", selector = "cancelLocalNotification:")
    public native void cancelLocalNotification$(UILocalNotification notification);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UILocalNotifications", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)cancelAllLocalNotifications NS_AVAILABLE_IOS(4_0);", selector = "cancelAllLocalNotifications")
    public native void cancelAllLocalNotifications();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIRemoteControlEvents", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)beginReceivingRemoteControlEvents NS_AVAILABLE_IOS(4_0);", selector = "beginReceivingRemoteControlEvents")
    public native void beginReceivingRemoteControlEvents();

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIRemoteControlEvents", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)endReceivingRemoteControlEvents NS_AVAILABLE_IOS(4_0);", selector = "endReceivingRemoteControlEvents")
    public native void endReceivingRemoteControlEvents();

    @ObjCCategoryMethod(catname = "UINewsstand", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)setNewsstandIconImage:(UIImage *)image;", selector = "setNewsstandIconImage:")
    public native void setNewsstandIconImage(UIImage image);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)extendStateRestoration  NS_AVAILABLE_IOS(6_0);", selector = "extendStateRestoration")
    public native void extendStateRestoration();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)completeStateRestoration  NS_AVAILABLE_IOS(6_0);", selector = "completeStateRestoration")
    public native void completeStateRestoration();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)ignoreSnapshotOnNextApplicationLaunch NS_AVAILABLE_IOS(7_0);", selector = "ignoreSnapshotOnNextApplicationLaunch")
    public native void ignoreSnapshotOnNextApplicationLaunch();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCCategoryMethod(catname = "UIStateRestoration", catownername = "UIApplication")
    @ObjCMethodSign(sign = "+ (void) registerObjectForStateRestoration:(id<UIStateRestoring>)object restorationIdentifier:(NSString *)restorationIdentifier NS_AVAILABLE_IOS(7_0);", selector = "registerObjectForStateRestoration:restorationIdentifier:")
    public static native void registerObjectForStateRestoration$restorationIdentifier$(UIStateRestoring object, NSString restorationIdentifier);

    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 3.2.
     */
    @Deprecated
    @ObjCCategoryMethod(catname = "UIApplicationDeprecated", catownername = "UIApplication")
    @ObjCMethodSign(sign = "- (void)setStatusBarHidden:(BOOL)hidden animated:(BOOL)animated NS_DEPRECATED_IOS(2_0, 3_2);", selector = "setStatusBarHidden:animated:")
    public native void setStatusBarHidden$animated$(boolean hidden, boolean animated);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet clickedButtonAtIndex:(NSInteger)buttonIndex;", selector = "actionSheet:clickedButtonAtIndex:")
    public native void actionSheet$clickedButtonAtIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheetCancel:(UIActionSheet *)actionSheet;", selector = "actionSheetCancel:")
    public native void actionSheetCancel$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)willPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "willPresentActionSheet:")
    public native void willPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)didPresentActionSheet:(UIActionSheet *)actionSheet;", selector = "didPresentActionSheet:")
    public native void didPresentActionSheet$(UIActionSheet actionSheet);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet willDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:willDismissWithButtonIndex:")
    public native void actionSheet$willDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);

    @ObjCMethodSign(sign = "- (void)actionSheet:(UIActionSheet *)actionSheet didDismissWithButtonIndex:(NSInteger)buttonIndex;", selector = "actionSheet:didDismissWithButtonIndex:")
    public native void actionSheet$didDismissWithButtonIndex$(UIActionSheet actionSheet, @NSInteger long buttonIndex);
}
