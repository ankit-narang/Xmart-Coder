package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewFlowLayout extends UICollectionViewLayout  {
    
    public UICollectionViewFlowLayout() {}
    @ObjCPropertyGetter(selector = "minimumLineSpacing")
    public native float getMinimumLineSpacing();
    @ObjCPropertySetter(selector = "setMinimumLineSpacing:")
    public native void setMinimumLineSpacing(float v);
    @ObjCProperty public float minimumLineSpacing;

    @ObjCPropertyGetter(selector = "minimumInteritemSpacing")
    public native float getMinimumInteritemSpacing();
    @ObjCPropertySetter(selector = "setMinimumInteritemSpacing:")
    public native void setMinimumInteritemSpacing(float v);
    @ObjCProperty public float minimumInteritemSpacing;

    @ObjCPropertyGetter(selector = "itemSize")
    public native @ObjCByValue CGSize getItemSize();
    @ObjCPropertySetter(selector = "setItemSize:")
    public native void setItemSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize itemSize;

    @ObjCPropertyGetter(selector = "scrollDirection")
    public native UICollectionViewScrollDirection getScrollDirection();
    @ObjCPropertySetter(selector = "setScrollDirection:")
    public native void setScrollDirection(UICollectionViewScrollDirection v);
    @ObjCProperty public UICollectionViewScrollDirection scrollDirection;

    @ObjCPropertyGetter(selector = "headerReferenceSize")
    public native @ObjCByValue CGSize getHeaderReferenceSize();
    @ObjCPropertySetter(selector = "setHeaderReferenceSize:")
    public native void setHeaderReferenceSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize headerReferenceSize;

    @ObjCPropertyGetter(selector = "footerReferenceSize")
    public native @ObjCByValue CGSize getFooterReferenceSize();
    @ObjCPropertySetter(selector = "setFooterReferenceSize:")
    public native void setFooterReferenceSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize footerReferenceSize;

    @ObjCPropertyGetter(selector = "sectionInset")
    public native @ObjCByValue UIEdgeInsets getSectionInset();
    @ObjCPropertySetter(selector = "setSectionInset:")
    public native void setSectionInset(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets sectionInset;
    
    
}
