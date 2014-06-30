package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCCategoryOwner("NSBundle")
@ObjCFramework("UIKit")
public final class NSBundleUIKitCategories extends NSBundle  {
    
    private NSBundleUIKitCategories() {}
    
    
    @ObjCCategoryMethod(catname = "UINibLoadingAdditions", catownername = "NSBundle")
    @ObjCMethodSign(sign = "- (NSArray *)loadNibNamed:(NSString *)name owner:(id)owner options:(NSDictionary *)options;", selector = "loadNibNamed:owner:options:")
    public static native NSArray loadNibNamed$owner$options$(NSString name, NSObject owner, NSDictionary options);
}
