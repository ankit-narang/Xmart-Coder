package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIDynamicAnimatorDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)dynamicAnimatorWillResume:(UIDynamicAnimator*)animator;", selector = "dynamicAnimatorWillResume:")
    void dynamicAnimatorWillResume$(UIDynamicAnimator animator);

    @ObjCMethodSign(sign = "- (void)dynamicAnimatorDidPause:(UIDynamicAnimator*)animator;", selector = "dynamicAnimatorDidPause:")
    void dynamicAnimatorDidPause$(UIDynamicAnimator animator);
}
