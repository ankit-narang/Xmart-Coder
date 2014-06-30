package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class NSStringDrawingContext extends NSObject  {
    
    public NSStringDrawingContext() {}
    @ObjCPropertyGetter(selector = "minimumScaleFactor")
    public native float getMinimumScaleFactor();
    @ObjCPropertySetter(selector = "setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(float v);
    @ObjCProperty public float minimumScaleFactor;

    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "minimumTrackingAdjustment")
    public native float getMinimumTrackingAdjustment();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertySetter(selector = "setMinimumTrackingAdjustment:")
    public native void setMinimumTrackingAdjustment(float v);
    @ObjCProperty public float minimumTrackingAdjustment;

    @ObjCPropertyGetter(selector = "actualScaleFactor")
    public native float getActualScaleFactor();
    @ObjCProperty public float actualScaleFactor;

    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @ObjCPropertyGetter(selector = "actualTrackingAdjustment")
    public native float getActualTrackingAdjustment();
    @ObjCProperty public float actualTrackingAdjustment;

    @ObjCPropertyGetter(selector = "totalBounds")
    public native @ObjCByValue CGRect getTotalBounds();
    @ObjCProperty public @ObjCByValue CGRect totalBounds;
    
    
}
