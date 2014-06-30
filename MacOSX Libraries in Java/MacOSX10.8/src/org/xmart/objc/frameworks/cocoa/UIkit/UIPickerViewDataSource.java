package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIPickerViewDataSource 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSInteger)numberOfComponentsInPickerView:(UIPickerView *)pickerView;", selector = "numberOfComponentsInPickerView:")
    @NSInteger long numberOfComponentsInPickerView$(UIPickerView pickerView);

    @ObjCMethodSign(sign = "- (NSInteger)pickerView:(UIPickerView *)pickerView numberOfRowsInComponent:(NSInteger)component;", selector = "pickerView:numberOfRowsInComponent:")
    @NSInteger long pickerView$numberOfRowsInComponent$(UIPickerView pickerView, @NSInteger long component);
}
