package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPickerViewAccessibilityDelegate 
    extends UIPickerViewDelegate {

    
    
    @ObjCMethodSign(sign = "- (NSString *)pickerView:(UIPickerView *)pickerView accessibilityLabelForComponent:(NSInteger)component;", selector = "pickerView:accessibilityLabelForComponent:")
    NSString pickerView$accessibilityLabelForComponent$(UIPickerView pickerView, @NSInteger long component);

    @ObjCMethodSign(sign = "- (NSString *)pickerView:(UIPickerView *)pickerView accessibilityHintForComponent:(NSInteger)component;", selector = "pickerView:accessibilityHintForComponent:")
    NSString pickerView$accessibilityHintForComponent$(UIPickerView pickerView, @NSInteger long component);
}
