package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITextInputTraits 
    extends NSObjectProtocol {

    
    @ObjCPropertyGetter(selector = "autocapitalizationType")
    UITextAutocapitalizationType getAutocapitalizationType();
    @ObjCPropertySetter(selector = "setAutocapitalizationType:")
    void setAutocapitalizationType(UITextAutocapitalizationType v);
    @ObjCPropertyGetter(selector = "autocorrectionType")
    UITextAutocorrectionType getAutocorrectionType();
    @ObjCPropertySetter(selector = "setAutocorrectionType:")
    void setAutocorrectionType(UITextAutocorrectionType v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "spellCheckingType")
    UITextSpellCheckingType getSpellCheckingType();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setSpellCheckingType:")
    void setSpellCheckingType(UITextSpellCheckingType v);
    @ObjCPropertyGetter(selector = "keyboardType")
    UIKeyboardType getKeyboardType();
    @ObjCPropertySetter(selector = "setKeyboardType:")
    void setKeyboardType(UIKeyboardType v);
    @ObjCPropertyGetter(selector = "keyboardAppearance")
    UIKeyboardAppearance getKeyboardAppearance();
    @ObjCPropertySetter(selector = "setKeyboardAppearance:")
    void setKeyboardAppearance(UIKeyboardAppearance v);
    @ObjCPropertyGetter(selector = "returnKeyType")
    UIReturnKeyType getReturnKeyType();
    @ObjCPropertySetter(selector = "setReturnKeyType:")
    void setReturnKeyType(UIReturnKeyType v);
    @ObjCPropertyGetter(selector = "enablesReturnKeyAutomatically")
    boolean isEnablesReturnKeyAutomatically();
    @ObjCPropertySetter(selector = "setEnablesReturnKeyAutomatically:")
    void setEnablesReturnKeyAutomatically(boolean v);
    @ObjCPropertyGetter(selector = "isSecureTextEntry")
    boolean isSecureTextEntry();
    @ObjCPropertySetter(selector = "setSecureTextEntry:")
    void setSecureTextEntry(boolean v);
    
}
