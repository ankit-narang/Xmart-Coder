package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIBarPositioningDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (UIBarPosition)positionForBar:(id <UIBarPositioning>)bar;", selector = "positionForBar:")
    UIBarPosition positionForBar$(UIBarPositioning bar);
}
