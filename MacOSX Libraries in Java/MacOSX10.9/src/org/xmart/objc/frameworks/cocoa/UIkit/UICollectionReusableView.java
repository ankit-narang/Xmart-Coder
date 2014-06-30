package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionReusableView extends UIView  {
    
    public UICollectionReusableView() {}
    @ObjCPropertyGetter(selector = "reuseIdentifier")
    public native NSString getReuseIdentifier();
    @ObjCProperty public NSString reuseIdentifier;
    
    @ObjCMethodSign(sign = "- (void)prepareForReuse;", selector = "prepareForReuse")
    public native void prepareForReuse();

    @ObjCMethodSign(sign = "- (void)applyLayoutAttributes:(UICollectionViewLayoutAttributes *)layoutAttributes;", selector = "applyLayoutAttributes:")
    public native void applyLayoutAttributes$(UICollectionViewLayoutAttributes layoutAttributes);

    @ObjCMethodSign(sign = "- (void)willTransitionFromLayout:(UICollectionViewLayout *)oldLayout toLayout:(UICollectionViewLayout *)newLayout;", selector = "willTransitionFromLayout:toLayout:")
    public native void willTransitionFromLayout$toLayout$(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);

    @ObjCMethodSign(sign = "- (void)didTransitionFromLayout:(UICollectionViewLayout *)oldLayout toLayout:(UICollectionViewLayout *)newLayout;", selector = "didTransitionFromLayout:toLayout:")
    public native void didTransitionFromLayout$toLayout$(UICollectionViewLayout oldLayout, UICollectionViewLayout newLayout);
}
