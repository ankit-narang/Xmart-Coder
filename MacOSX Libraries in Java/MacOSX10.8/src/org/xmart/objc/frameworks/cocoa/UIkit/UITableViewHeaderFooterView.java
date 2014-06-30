package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITableViewHeaderFooterView extends UIView  {
    
    public UITableViewHeaderFooterView() {}
    @ObjCPropertyGetter(selector = "tintColor")
    public native UIColor getTintColor();
    @ObjCPropertySetter(selector = "setTintColor:")
    public native void setTintColor(UIColor v);
    @ObjCProperty public UIColor tintColor;

    @ObjCPropertyGetter(selector = "textLabel")
    public native UILabel getTextLabel();
    @ObjCProperty public UILabel textLabel;

    @ObjCPropertyGetter(selector = "detailTextLabel")
    public native UILabel getDetailTextLabel();
    @ObjCProperty public UILabel detailTextLabel;

    @ObjCPropertyGetter(selector = "contentView")
    public native UIView getContentView();
    @ObjCProperty public UIView contentView;

    @ObjCPropertyGetter(selector = "backgroundView")
    public native UIView getBackgroundView();
    @ObjCPropertySetter(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @ObjCProperty public UIView backgroundView;

    @ObjCPropertyGetter(selector = "reuseIdentifier")
    public native NSString getReuseIdentifier();
    @ObjCProperty public NSString reuseIdentifier;
    
    @ObjCMethodSign(sign = "- (id)initWithReuseIdentifier:(NSString *)reuseIdentifier;", selector = "initWithReuseIdentifier:")
    public native UITableViewHeaderFooterView initWithReuseIdentifier$(NSString reuseIdentifier);

    @ObjCMethodSign(sign = "- (void)prepareForReuse;", selector = "prepareForReuse")
    public native void prepareForReuse();
}
