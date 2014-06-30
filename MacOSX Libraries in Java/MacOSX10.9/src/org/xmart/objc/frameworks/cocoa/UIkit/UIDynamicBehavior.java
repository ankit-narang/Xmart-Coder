package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIDynamicBehavior extends NSObject  {
    
    public UIDynamicBehavior() {}
    @ObjCPropertyGetter(selector = "childBehaviors")
    public native NSArray getChildBehaviors();
    @ObjCProperty public NSArray childBehaviors;

    @ObjCPropertyGetter(selector = "action")
    public native ObjCBlock getAction();
    @ObjCPropertySetter(selector = "setAction:")
    public native void setAction(ObjCBlock v);
    @ObjCProperty public ObjCBlock action;

    @ObjCPropertyGetter(selector = "dynamicAnimator")
    public native UIDynamicAnimator getDynamicAnimator();
    @ObjCProperty public UIDynamicAnimator dynamicAnimator;
    
    @ObjCMethodSign(sign = "- (void)addChildBehavior:(UIDynamicBehavior *)behavior;", selector = "addChildBehavior:")
    public native void addChildBehavior$(UIDynamicBehavior behavior);

    @ObjCMethodSign(sign = "- (void)removeChildBehavior:(UIDynamicBehavior *)behavior;", selector = "removeChildBehavior:")
    public native void removeChildBehavior$(UIDynamicBehavior behavior);

    @ObjCMethodSign(sign = "- (void)willMoveToAnimator:(UIDynamicAnimator *)dynamicAnimator;", selector = "willMoveToAnimator:")
    public native void willMoveToAnimator$(UIDynamicAnimator dynamicAnimator);
}
