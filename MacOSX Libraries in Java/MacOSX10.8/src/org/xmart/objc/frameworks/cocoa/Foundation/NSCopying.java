package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;


@ObjCFramework("Foundation")
public interface NSCopying 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    NSObject copyWithZone$(NSZone zone);
}
