package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIInputView extends UIView  {
    
    public UIInputView() {}
    @ObjCPropertyGetter(selector = "inputViewStyle")
    public native UIInputViewStyle getInputViewStyle();
    @ObjCProperty public UIInputViewStyle inputViewStyle;
    
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame inputViewStyle:(UIInputViewStyle)inputViewStyle;", selector = "initWithFrame:inputViewStyle:")
    public native UIInputView initWithFrame$inputViewStyle$(@ObjCByValue CGRect frame, UIInputViewStyle inputViewStyle);
}
