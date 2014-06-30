package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UICollectionViewCell extends UICollectionReusableView  {
    
    public UICollectionViewCell() {}
    @ObjCPropertyGetter(selector = "contentView")
    public native UIView getContentView();
    @ObjCProperty public UIView contentView;

    @ObjCPropertyGetter(selector = "isSelected")
    public native boolean isSelected();
    @ObjCPropertySetter(selector = "setSelected:")
    public native void setSelected(boolean v);
    @ObjCProperty public boolean selected;

    @ObjCPropertyGetter(selector = "isHighlighted")
    public native boolean isHighlighted();
    @ObjCPropertySetter(selector = "setHighlighted:")
    public native void setHighlighted(boolean v);
    @ObjCProperty public boolean highlighted;

    @ObjCPropertyGetter(selector = "backgroundView")
    public native UIView getBackgroundView();
    @ObjCPropertySetter(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @ObjCProperty public UIView backgroundView;

    @ObjCPropertyGetter(selector = "selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @ObjCPropertySetter(selector = "setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    @ObjCProperty public UIView selectedBackgroundView;
    
    
}
