package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIEvent extends NSObject  {
    
    public UIEvent() {}
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "type")
    public native UIEventType getType();
    @ObjCProperty public UIEventType type;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "subtype")
    public native UIEventSubtype getSubtype();
    @ObjCProperty public UIEventSubtype subtype;

    @ObjCPropertyGetter(selector = "timestamp")
    public native double getTimestamp();
    @ObjCProperty public double timestamp;
    
    @ObjCMethodSign(sign = "- (NSSet *)allTouches;", selector = "allTouches")
    public native NSSet allTouches();

    @ObjCMethodSign(sign = "- (NSSet *)touchesForWindow:(UIWindow *)window;", selector = "touchesForWindow:")
    public native NSSet touchesForWindow$(UIWindow window);

    @ObjCMethodSign(sign = "- (NSSet *)touchesForView:(UIView *)view;", selector = "touchesForView:")
    public native NSSet touchesForView$(UIView view);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (NSSet *)touchesForGestureRecognizer:(UIGestureRecognizer *)gesture NS_AVAILABLE_IOS(3_2);", selector = "touchesForGestureRecognizer:")
    public native NSSet touchesForGestureRecognizer$(UIGestureRecognizer gesture);
}
