package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIApplicationDelegate 
    extends NSObjectProtocol {

    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "window")
    UIWindow getWindow();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setWindow:")
    void setWindow(UIWindow v);
    @ObjCMethodSign(sign = "- (void)applicationDidFinishLaunching:(UIApplication *)application;", selector = "applicationDidFinishLaunching:")
    void applicationDidFinishLaunching$(UIApplication application);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)application:(UIApplication *)application willFinishLaunchingWithOptions:(NSDictionary *)launchOptions NS_AVAILABLE_IOS(6_0);", selector = "application:willFinishLaunchingWithOptions:")
    boolean application$willFinishLaunchingWithOptions$(UIApplication application, NSDictionary launchOptions);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions NS_AVAILABLE_IOS(3_0);", selector = "application:didFinishLaunchingWithOptions:")
    boolean application$didFinishLaunchingWithOptions$(UIApplication application, NSDictionary launchOptions);

    @ObjCMethodSign(sign = "- (void)applicationDidBecomeActive:(UIApplication *)application;", selector = "applicationDidBecomeActive:")
    void applicationDidBecomeActive$(UIApplication application);

    @ObjCMethodSign(sign = "- (void)applicationWillResignActive:(UIApplication *)application;", selector = "applicationWillResignActive:")
    void applicationWillResignActive$(UIApplication application);

    @ObjCMethodSign(sign = "- (BOOL)application:(UIApplication *)application handleOpenURL:(NSURL *)url;", selector = "application:handleOpenURL:")
    boolean application$handleOpenURL$(UIApplication application, NSURL url);

    /**
     * @since Available in iOS 4.2 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL)application:(UIApplication *)application openURL:(NSURL *)url sourceApplication:(NSString *)sourceApplication annotation:(id)annotation NS_AVAILABLE_IOS(4_2);", selector = "application:openURL:sourceApplication:annotation:")
    boolean application$openURL$sourceApplication$annotation$(UIApplication application, NSURL url, NSString sourceApplication, NSObject annotation);

    @ObjCMethodSign(sign = "- (void)applicationDidReceiveMemoryWarning:(UIApplication *)application;", selector = "applicationDidReceiveMemoryWarning:")
    void applicationDidReceiveMemoryWarning$(UIApplication application);

    @ObjCMethodSign(sign = "- (void)applicationWillTerminate:(UIApplication *)application;", selector = "applicationWillTerminate:")
    void applicationWillTerminate$(UIApplication application);

    @ObjCMethodSign(sign = "- (void)applicationSignificantTimeChange:(UIApplication *)application;", selector = "applicationSignificantTimeChange:")
    void applicationSignificantTimeChange$(UIApplication application);

    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application willChangeStatusBarOrientation:(UIInterfaceOrientation)newStatusBarOrientation duration:(NSTimeInterval)duration;", selector = "application:willChangeStatusBarOrientation:duration:")
    void application$willChangeStatusBarOrientation$duration$(UIApplication application, UIInterfaceOrientation newStatusBarOrientation, double duration);

    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didChangeStatusBarOrientation:(UIInterfaceOrientation)oldStatusBarOrientation;", selector = "application:didChangeStatusBarOrientation:")
    void application$didChangeStatusBarOrientation$(UIApplication application, UIInterfaceOrientation oldStatusBarOrientation);

    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application willChangeStatusBarFrame:(CGRect)newStatusBarFrame;", selector = "application:willChangeStatusBarFrame:")
    void application$willChangeStatusBarFrame$(UIApplication application, @ObjCByValue CGRect newStatusBarFrame);

    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didChangeStatusBarFrame:(CGRect)oldStatusBarFrame;", selector = "application:didChangeStatusBarFrame:")
    void application$didChangeStatusBarFrame$(UIApplication application, @ObjCByValue CGRect oldStatusBarFrame);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didRegisterForRemoteNotificationsWithDeviceToken:(NSData *)deviceToken NS_AVAILABLE_IOS(3_0);", selector = "application:didRegisterForRemoteNotificationsWithDeviceToken:")
    void application$didRegisterForRemoteNotificationsWithDeviceToken$(UIApplication application, NSData deviceToken);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didFailToRegisterForRemoteNotificationsWithError:(NSError *)error NS_AVAILABLE_IOS(3_0);", selector = "application:didFailToRegisterForRemoteNotificationsWithError:")
    void application$didFailToRegisterForRemoteNotificationsWithError$(UIApplication application, NSError error);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo NS_AVAILABLE_IOS(3_0);", selector = "application:didReceiveRemoteNotification:")
    void application$didReceiveRemoteNotification$(UIApplication application, NSDictionary userInfo);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didReceiveLocalNotification:(UILocalNotification *)notification NS_AVAILABLE_IOS(4_0);", selector = "application:didReceiveLocalNotification:")
    void application$didReceiveLocalNotification$(UIApplication application, UILocalNotification notification);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application didReceiveRemoteNotification:(NSDictionary *)userInfo fetchCompletionHandler:(void (^)(UIBackgroundFetchResult result))completionHandler NS_AVAILABLE_IOS(7_0);", selector = "application:didReceiveRemoteNotification:fetchCompletionHandler:")
    void application$didReceiveRemoteNotification$fetchCompletionHandler$(UIApplication application, NSDictionary userInfo, ObjCBlock completionHandler);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application performFetchWithCompletionHandler:(void (^)(UIBackgroundFetchResult result))completionHandler NS_AVAILABLE_IOS(7_0);", selector = "application:performFetchWithCompletionHandler:")
    void application$performFetchWithCompletionHandler$(UIApplication application, ObjCBlock completionHandler);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)application:(UIApplication *)application handleEventsForBackgroundURLSession:(NSString *)identifier completionHandler:(void (^)())completionHandler NS_AVAILABLE_IOS(7_0);", selector = "application:handleEventsForBackgroundURLSession:completionHandler:")
    void application$handleEventsForBackgroundURLSession$completionHandler$(UIApplication application, NSString identifier, ObjCBlock completionHandler);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)applicationDidEnterBackground:(UIApplication *)application NS_AVAILABLE_IOS(4_0);", selector = "applicationDidEnterBackground:")
    void applicationDidEnterBackground$(UIApplication application);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)applicationWillEnterForeground:(UIApplication *)application NS_AVAILABLE_IOS(4_0);", selector = "applicationWillEnterForeground:")
    void applicationWillEnterForeground$(UIApplication application);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)applicationProtectedDataWillBecomeUnavailable:(UIApplication *)application NS_AVAILABLE_IOS(4_0);", selector = "applicationProtectedDataWillBecomeUnavailable:")
    void applicationProtectedDataWillBecomeUnavailable$(UIApplication application);

    /**
     * @since Available in iOS 4.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)applicationProtectedDataDidBecomeAvailable:(UIApplication *)application    NS_AVAILABLE_IOS(4_0);", selector = "applicationProtectedDataDidBecomeAvailable:")
    void applicationProtectedDataDidBecomeAvailable$(UIApplication application);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSUInteger)application:(UIApplication *)application supportedInterfaceOrientationsForWindow:(UIWindow *)window  NS_AVAILABLE_IOS(6_0);", selector = "application:supportedInterfaceOrientationsForWindow:")
    @NSUInteger long application$supportedInterfaceOrientationsForWindow$(UIApplication application, UIWindow window);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UIViewController *) application:(UIApplication *)application viewControllerWithRestorationIdentifierPath:(NSArray *)identifierComponents coder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "application:viewControllerWithRestorationIdentifierPath:coder:")
    UIViewController application$viewControllerWithRestorationIdentifierPath$coder$(UIApplication application, NSArray identifierComponents, NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL) application:(UIApplication *)application shouldSaveApplicationState:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "application:shouldSaveApplicationState:")
    boolean application$shouldSaveApplicationState$(UIApplication application, NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (BOOL) application:(UIApplication *)application shouldRestoreApplicationState:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "application:shouldRestoreApplicationState:")
    boolean application$shouldRestoreApplicationState$(UIApplication application, NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void) application:(UIApplication *)application willEncodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "application:willEncodeRestorableStateWithCoder:")
    void application$willEncodeRestorableStateWithCoder$(UIApplication application, NSCoder coder);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void) application:(UIApplication *)application didDecodeRestorableStateWithCoder:(NSCoder *)coder NS_AVAILABLE_IOS(6_0);", selector = "application:didDecodeRestorableStateWithCoder:")
    void application$didDecodeRestorableStateWithCoder$(UIApplication application, NSCoder coder);
}
