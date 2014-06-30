package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIActivityViewController extends UIViewController  {
    
    public UIActivityViewController() {}
    @ObjCPropertyGetter(selector = "completionHandler")
    public native ObjCFunctionPtr getCompletionHandler();
    @ObjCPropertySetter(selector = "setCompletionHandler:")
    public native void setCompletionHandler(ObjCFunctionPtr v);
    @ObjCProperty public ObjCFunctionPtr completionHandler;

    @ObjCPropertyGetter(selector = "excludedActivityTypes")
    public native NSArray getExcludedActivityTypes();
    @ObjCPropertySetter(selector = "setExcludedActivityTypes:")
    public native void setExcludedActivityTypes(NSArray v);
    @ObjCProperty public NSArray excludedActivityTypes;
    
    @ObjCMethodSign(sign = "- (id)initWithActivityItems:(NSArray *)activityItems applicationActivities:(NSArray *)applicationActivities;", selector = "initWithActivityItems:applicationActivities:")
    public native UIActivityViewController initWithActivityItems$applicationActivities$(NSArray activityItems, NSArray applicationActivities);
}
