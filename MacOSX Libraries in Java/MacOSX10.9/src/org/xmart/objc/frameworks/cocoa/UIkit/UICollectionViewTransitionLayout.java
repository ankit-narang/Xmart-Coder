package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewTransitionLayout extends UICollectionViewLayout  {
    
    public UICollectionViewTransitionLayout() {}
    @ObjCPropertyGetter(selector = "transitionProgress")
    public native float getTransitionProgress();
    @ObjCPropertySetter(selector = "setTransitionProgress:")
    public native void setTransitionProgress(float v);
    @ObjCProperty public float transitionProgress;

    @ObjCPropertyGetter(selector = "currentLayout")
    public native UICollectionViewLayout getCurrentLayout();
    @ObjCProperty public UICollectionViewLayout currentLayout;

    @ObjCPropertyGetter(selector = "nextLayout")
    public native UICollectionViewLayout getNextLayout();
    @ObjCProperty public UICollectionViewLayout nextLayout;
    
    @ObjCMethodSign(sign = "- (id)initWithCurrentLayout:(UICollectionViewLayout *)currentLayout nextLayout:(UICollectionViewLayout *)newLayout;", selector = "initWithCurrentLayout:nextLayout:")
    public native UICollectionViewTransitionLayout initWithCurrentLayout$nextLayout$(UICollectionViewLayout currentLayout, UICollectionViewLayout newLayout);

    @ObjCMethodSign(sign = "- (void)updateValue:(CGFloat)value forAnimatedKey:(NSString *)key;", selector = "updateValue:forAnimatedKey:")
    public native void updateValue$forAnimatedKey$(float value, NSString key);

    @ObjCMethodSign(sign = "- (CGFloat)valueForAnimatedKey:(NSString *)key;", selector = "valueForAnimatedKey:")
    public native float valueForAnimatedKey$(NSString key);
}
