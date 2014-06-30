package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewLayoutAttributes extends NSObject implements NSCopying, UIDynamicItem {
    
    public UICollectionViewLayoutAttributes() {}
    @ObjCPropertyGetter(selector = "frame")
    public native @ObjCByValue CGRect getFrame();
    @ObjCPropertySetter(selector = "setFrame:")
    public native void setFrame(@ObjCByValue CGRect v);
    @ObjCProperty public @ObjCByValue CGRect frame;

    @ObjCPropertyGetter(selector = "size")
    public native @ObjCByValue CGSize getSize();
    @ObjCPropertySetter(selector = "setSize:")
    public native void setSize(@ObjCByValue CGSize v);
    @ObjCProperty public @ObjCByValue CGSize size;

    @ObjCPropertyGetter(selector = "transform3D")
    public native @ObjCByValue CATransform3D getTransform3D();
    @ObjCPropertySetter(selector = "setTransform3D:")
    public native void setTransform3D(@ObjCByValue CATransform3D v);
    @ObjCProperty public @ObjCByValue CATransform3D transform3D;

    @ObjCPropertyGetter(selector = "alpha")
    public native float getAlpha();
    @ObjCPropertySetter(selector = "setAlpha:")
    public native void setAlpha(float v);
    @ObjCProperty public float alpha;

    @ObjCPropertyGetter(selector = "zIndex")
    public native @NSInteger long getZIndex();
    @ObjCPropertySetter(selector = "setZIndex:")
    public native void setZIndex(@NSInteger long v);
    @ObjCProperty public @NSInteger long zIndex;

    @ObjCPropertyGetter(selector = "isHidden")
    public native boolean isHidden();
    @ObjCPropertySetter(selector = "setHidden:")
    public native void setHidden(boolean v);
    @ObjCProperty public boolean hidden;

    @ObjCPropertyGetter(selector = "indexPath")
    public native NSIndexPath getIndexPath();
    @ObjCPropertySetter(selector = "setIndexPath:")
    public native void setIndexPath(NSIndexPath v);
    @ObjCProperty public NSIndexPath indexPath;

    @ObjCPropertyGetter(selector = "representedElementCategory")
    public native UICollectionElementCategory getRepresentedElementCategory();
    @ObjCProperty public UICollectionElementCategory representedElementCategory;

    @ObjCPropertyGetter(selector = "representedElementKind")
    public native NSString getRepresentedElementKind();
    @ObjCProperty public NSString representedElementKind;

    @ObjCPropertyGetter(selector = "center")
    public native @ObjCByValue CGPoint getCenter();
    @ObjCPropertySetter(selector = "setCenter:")
    public native void setCenter(@ObjCByValue CGPoint v);
    @ObjCProperty public @ObjCByValue CGPoint center;

    @ObjCPropertyGetter(selector = "bounds")
    public native @ObjCByValue CGRect getBounds();
    @ObjCProperty public @ObjCByValue CGRect bounds;

    @ObjCPropertyGetter(selector = "transform")
    public native @ObjCByValue CGAffineTransform getTransform();
    @ObjCPropertySetter(selector = "setTransform:")
    public native void setTransform(@ObjCByValue CGAffineTransform v);
    @ObjCProperty public @ObjCByValue CGAffineTransform transform;
    
    @ObjCMethodSign(sign = "+ (instancetype)layoutAttributesForCellWithIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForCellWithIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForCellWithIndexPath$(NSIndexPath indexPath);

    @ObjCMethodSign(sign = "+ (instancetype)layoutAttributesForSupplementaryViewOfKind:(NSString *)elementKind withIndexPath:(NSIndexPath *)indexPath;", selector = "layoutAttributesForSupplementaryViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForSupplementaryViewOfKind$withIndexPath$(NSString elementKind, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "+ (instancetype)layoutAttributesForDecorationViewOfKind:(NSString *)decorationViewKind withIndexPath:(NSIndexPath*)indexPath;", selector = "layoutAttributesForDecorationViewOfKind:withIndexPath:")
    public static native UICollectionViewLayoutAttributes layoutAttributesForDecorationViewOfKind$withIndexPath$(NSString decorationViewKind, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (id)copyWithZone:(NSZone *)zone;", selector = "copyWithZone:")
    public native NSObject copyWithZone$(NSZone zone);
}
