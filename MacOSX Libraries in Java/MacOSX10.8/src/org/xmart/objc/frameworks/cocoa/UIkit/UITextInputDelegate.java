package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITextInputDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (void)selectionWillChange:(id <UITextInput>)textInput;", selector = "selectionWillChange:")
    void selectionWillChange$(UITextInput textInput);

    @ObjCMethodSign(sign = "- (void)selectionDidChange:(id <UITextInput>)textInput;", selector = "selectionDidChange:")
    void selectionDidChange$(UITextInput textInput);

    @ObjCMethodSign(sign = "- (void)textWillChange:(id <UITextInput>)textInput;", selector = "textWillChange:")
    void textWillChange$(UITextInput textInput);

    @ObjCMethodSign(sign = "- (void)textDidChange:(id <UITextInput>)textInput;", selector = "textDidChange:")
    void textDidChange$(UITextInput textInput);
}
