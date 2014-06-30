package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIMotionEffect extends NSObject implements NSCopying, NSCoding {
    
    public UIMotionEffect() {}
    
    
    @ObjCMethodSign(sign = "- (NSDictionary *)keyPathsAndRelativeValuesForViewerOffset:(UIOffset)viewerOffset;", selector = "keyPathsAndRelativeValuesForViewerOffset:")
    public native NSDictionary keyPathsAndRelativeValuesForViewerOffset$(@ObjCByValue UIOffset viewerOffset);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);

    @ObjCMethodSign(sign = "- (void)encodeWithCoder:(NSCoder *)aCoder;", selector = "encodeWithCoder:")
    public native void encodeWithCoder$(NSCoder aCoder);

    @ObjCMethodSign(sign = "- (id)initWithCoder:(NSCoder *)aDecoder;", selector = "initWithCoder:")
    public native UIMotionEffect initWithCoder$(NSCoder aDecoder);
}
