package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIObjectRestoration 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "+ (id<UIStateRestoring>) objectWithRestorationIdentifierPath:(NSArray *)identifierComponents coder:(NSCoder *)coder;", selector = "objectWithRestorationIdentifierPath:coder:")
    UIStateRestoring objectWithRestorationIdentifierPath$coder$(NSArray identifierComponents, NSCoder coder);
}
