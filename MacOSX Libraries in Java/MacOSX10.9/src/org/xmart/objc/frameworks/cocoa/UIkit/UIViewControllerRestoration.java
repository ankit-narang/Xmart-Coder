package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIViewControllerRestoration 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "+ (UIViewController *) viewControllerWithRestorationIdentifierPath:(NSArray *)identifierComponents coder:(NSCoder *)coder;", selector = "viewControllerWithRestorationIdentifierPath:coder:")
    UIViewController viewControllerWithRestorationIdentifierPath$coder$(NSArray identifierComponents, NSCoder coder);
}
