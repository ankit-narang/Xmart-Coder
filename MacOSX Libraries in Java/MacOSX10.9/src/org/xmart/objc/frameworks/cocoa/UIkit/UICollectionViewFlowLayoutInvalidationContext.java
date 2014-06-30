package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewFlowLayoutInvalidationContext extends UICollectionViewLayoutInvalidationContext  {
    
    public UICollectionViewFlowLayoutInvalidationContext() {}
    @ObjCPropertyGetter(selector = "invalidateFlowLayoutDelegateMetrics")
    public native boolean isInvalidateFlowLayoutDelegateMetrics();
    @ObjCPropertySetter(selector = "setInvalidateFlowLayoutDelegateMetrics:")
    public native void setInvalidateFlowLayoutDelegateMetrics(boolean v);
    @ObjCProperty public boolean invalidateFlowLayoutDelegateMetrics;

    @ObjCPropertyGetter(selector = "invalidateFlowLayoutAttributes")
    public native boolean isInvalidateFlowLayoutAttributes();
    @ObjCPropertySetter(selector = "setInvalidateFlowLayoutAttributes:")
    public native void setInvalidateFlowLayoutAttributes(boolean v);
    @ObjCProperty public boolean invalidateFlowLayoutAttributes;
    
    
}
