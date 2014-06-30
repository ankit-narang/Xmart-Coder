package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPickerViewDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (CGFloat)pickerView:(UIPickerView *)pickerView widthForComponent:(NSInteger)component;", selector = "pickerView:widthForComponent:")
    float pickerView$widthForComponent$(UIPickerView pickerView, @NSInteger long component);

    @ObjCMethodSign(sign = "- (CGFloat)pickerView:(UIPickerView *)pickerView rowHeightForComponent:(NSInteger)component;", selector = "pickerView:rowHeightForComponent:")
    float pickerView$rowHeightForComponent$(UIPickerView pickerView, @NSInteger long component);

    @ObjCMethodSign(sign = "- (NSString *)pickerView:(UIPickerView *)pickerView titleForRow:(NSInteger)row forComponent:(NSInteger)component;", selector = "pickerView:titleForRow:forComponent:")
    NSString pickerView$titleForRow$forComponent$(UIPickerView pickerView, @NSInteger long row, @NSInteger long component);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSAttributedString *)pickerView:(UIPickerView *)pickerView attributedTitleForRow:(NSInteger)row forComponent:(NSInteger)component NS_AVAILABLE_IOS(6_0);", selector = "pickerView:attributedTitleForRow:forComponent:")
    NSAttributedString pickerView$attributedTitleForRow$forComponent$(UIPickerView pickerView, @NSInteger long row, @NSInteger long component);

    @ObjCMethodSign(sign = "- (UIView *)pickerView:(UIPickerView *)pickerView viewForRow:(NSInteger)row forComponent:(NSInteger)component reusingView:(UIView *)view;", selector = "pickerView:viewForRow:forComponent:reusingView:")
    UIView pickerView$viewForRow$forComponent$reusingView$(UIPickerView pickerView, @NSInteger long row, @NSInteger long component, UIView view);

    @ObjCMethodSign(sign = "- (void)pickerView:(UIPickerView *)pickerView didSelectRow:(NSInteger)row inComponent:(NSInteger)component;", selector = "pickerView:didSelectRow:inComponent:")
    void pickerView$didSelectRow$inComponent$(UIPickerView pickerView, @NSInteger long row, @NSInteger long component);
}
