package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UINib extends NSObject  {
    
    public UINib() {}
    
    
    @ObjCMethodSign(sign = "- (NSArray *)instantiateWithOwner:(id)ownerOrNil options:(NSDictionary *)optionsOrNil;", selector = "instantiateWithOwner:options:")
    public native NSArray instantiateWithOwner$options$(NSObject ownerOrNil, NSDictionary optionsOrNil);

    @ObjCMethodSign(sign = "+ (UINib *)nibWithNibName:(NSString *)name bundle:(NSBundle *)bundleOrNil;", selector = "nibWithNibName:bundle:")
    public static native UINib nibWithNibName$bundle$(NSString name, NSBundle bundleOrNil);

    @ObjCMethodSign(sign = "+ (UINib *)nibWithData:(NSData *)data bundle:(NSBundle *)bundleOrNil;", selector = "nibWithData:bundle:")
    public static native UINib nibWithData$bundle$(NSData data, NSBundle bundleOrNil);
}
