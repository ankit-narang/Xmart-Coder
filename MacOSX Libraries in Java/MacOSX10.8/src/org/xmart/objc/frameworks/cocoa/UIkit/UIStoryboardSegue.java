package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIStoryboardSegue extends NSObject  {
    
    public UIStoryboardSegue() {}
    @ObjCPropertyGetter(selector = "identifier")
    public native NSString getIdentifier();
    @ObjCProperty public NSString identifier;

    @ObjCPropertyGetter(selector = "sourceViewController")
    public native NSObject getSourceViewController();
    @ObjCProperty public NSObject sourceViewController;

    @ObjCPropertyGetter(selector = "destinationViewController")
    public native NSObject getDestinationViewController();
    @ObjCProperty public NSObject destinationViewController;
    
    @ObjCMethodSign(sign = "- (id)initWithIdentifier:(NSString *)identifier source:(UIViewController *)source destination:(UIViewController *)destination;", selector = "initWithIdentifier:source:destination:")
    public native UIStoryboardSegue initWithIdentifier$source$destination$(NSString identifier, UIViewController source, UIViewController destination);

    @ObjCMethodSign(sign = "- (void)perform;", selector = "perform")
    public native void perform();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "+ (id)segueWithIdentifier:(NSString *)identifier source:(UIViewController *)source destination:(UIViewController *)destination performHandler:(void (^)(void))performHandler NS_AVAILABLE_IOS(6_0);", selector = "segueWithIdentifier:source:destination:performHandler:")
    public static native NSObject segueWithIdentifier$source$destination$performHandler$(NSString identifier, UIViewController source, UIViewController destination, ObjCBlock performHandler);
}
