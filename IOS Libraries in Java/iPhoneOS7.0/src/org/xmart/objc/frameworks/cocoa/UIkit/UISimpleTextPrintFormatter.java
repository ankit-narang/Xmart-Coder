package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UISimpleTextPrintFormatter extends UIPrintFormatter  {
    
    public UISimpleTextPrintFormatter() {}
    @ObjCPropertyGetter(selector = "text")
    public native NSString getText();
    @ObjCPropertySetter(selector = "setText:")
    public native void setText(NSString v);
    @ObjCProperty public NSString text;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "attributedText")
    public native NSAttributedString getAttributedText();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setAttributedText:")
    public native void setAttributedText(NSAttributedString v);
    @ObjCProperty public NSAttributedString attributedText;

    @ObjCPropertyGetter(selector = "font")
    public native UIFont getFont();
    @ObjCPropertySetter(selector = "setFont:")
    public native void setFont(UIFont v);
    @ObjCProperty public UIFont font;

    @ObjCPropertyGetter(selector = "color")
    public native UIColor getColor();
    @ObjCPropertySetter(selector = "setColor:")
    public native void setColor(UIColor v);
    @ObjCProperty public UIColor color;

    @ObjCPropertyGetter(selector = "textAlignment")
    public native NSTextAlignment getTextAlignment();
    @ObjCPropertySetter(selector = "setTextAlignment:")
    public native void setTextAlignment(NSTextAlignment v);
    @ObjCProperty public NSTextAlignment textAlignment;
    
    @ObjCMethodSign(sign = "- (id)initWithText:(NSString *)text;", selector = "initWithText:")
    public native UISimpleTextPrintFormatter initWithText$(NSString text);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (instancetype)initWithAttributedText:(NSAttributedString *)attributedText NS_AVAILABLE_IOS(7_0);", selector = "initWithAttributedText:")
    public native UISimpleTextPrintFormatter initWithAttributedText$(NSAttributedString attributedText);
}
