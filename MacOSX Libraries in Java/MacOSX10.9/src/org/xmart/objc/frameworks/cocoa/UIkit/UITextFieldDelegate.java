package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UITextFieldDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (BOOL)textFieldShouldBeginEditing:(UITextField *)textField;", selector = "textFieldShouldBeginEditing:")
    boolean textFieldShouldBeginEditing$(UITextField textField);

    @ObjCMethodSign(sign = "- (void)textFieldDidBeginEditing:(UITextField *)textField;", selector = "textFieldDidBeginEditing:")
    void textFieldDidBeginEditing$(UITextField textField);

    @ObjCMethodSign(sign = "- (BOOL)textFieldShouldEndEditing:(UITextField *)textField;", selector = "textFieldShouldEndEditing:")
    boolean textFieldShouldEndEditing$(UITextField textField);

    @ObjCMethodSign(sign = "- (void)textFieldDidEndEditing:(UITextField *)textField;", selector = "textFieldDidEndEditing:")
    void textFieldDidEndEditing$(UITextField textField);

    @ObjCMethodSign(sign = "- (BOOL)textField:(UITextField *)textField shouldChangeCharactersInRange:(NSRange)range replacementString:(NSString *)string;", selector = "textField:shouldChangeCharactersInRange:replacementString:")
    boolean textField$shouldChangeCharactersInRange$replacementString$(UITextField textField, @ObjCByValue NSRange range, NSString string);

    @ObjCMethodSign(sign = "- (BOOL)textFieldShouldClear:(UITextField *)textField;", selector = "textFieldShouldClear:")
    boolean textFieldShouldClear$(UITextField textField);

    @ObjCMethodSign(sign = "- (BOOL)textFieldShouldReturn:(UITextField *)textField;", selector = "textFieldShouldReturn:")
    boolean textFieldShouldReturn$(UITextField textField);
}
