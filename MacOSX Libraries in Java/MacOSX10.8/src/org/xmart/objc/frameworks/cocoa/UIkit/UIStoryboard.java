package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIStoryboard extends NSObject  {
    
    public UIStoryboard() {}
    
    
    @ObjCMethodSign(sign = "- (id)instantiateInitialViewController;", selector = "instantiateInitialViewController")
    public native NSObject instantiateInitialViewController();

    @ObjCMethodSign(sign = "- (id)instantiateViewControllerWithIdentifier:(NSString *)identifier;", selector = "instantiateViewControllerWithIdentifier:")
    public native NSObject instantiateViewControllerWithIdentifier$(NSString identifier);

    @ObjCMethodSign(sign = "+ (UIStoryboard *)storyboardWithName:(NSString *)name bundle:(NSBundle *)storyboardBundleOrNil;", selector = "storyboardWithName:bundle:")
    public static native UIStoryboard storyboardWithName$bundle$(NSString name, NSBundle storyboardBundleOrNil);
}
