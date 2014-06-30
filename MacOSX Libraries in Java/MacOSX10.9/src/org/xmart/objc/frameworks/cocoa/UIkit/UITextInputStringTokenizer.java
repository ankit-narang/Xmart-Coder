package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITextInputStringTokenizer extends NSObject implements UITextInputTokenizer {
    
    public UITextInputStringTokenizer() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithTextInput:(UIResponder <UITextInput> *)textInput;", selector = "initWithTextInput:")
    public native UITextInputStringTokenizer initWithTextInput$(UITextInput textInput);

    @ObjCMethodSign(sign = "- (UITextRange *)rangeEnclosingPosition:(UITextPosition *)position withGranularity:(UITextGranularity)granularity inDirection:(UITextDirection)direction;", selector = "rangeEnclosingPosition:withGranularity:inDirection:")
    public native UITextRange rangeEnclosingPosition$withGranularity$inDirection$(UITextPosition position, UITextGranularity granularity, @NSInteger long direction);

    @ObjCMethodSign(sign = "- (BOOL)isPosition:(UITextPosition *)position atBoundary:(UITextGranularity)granularity inDirection:(UITextDirection)direction;", selector = "isPosition:atBoundary:inDirection:")
    public native boolean isPosition$atBoundary$inDirection$(UITextPosition position, UITextGranularity granularity, @NSInteger long direction);

    @ObjCMethodSign(sign = "- (UITextPosition *)positionFromPosition:(UITextPosition *)position toBoundary:(UITextGranularity)granularity inDirection:(UITextDirection)direction;", selector = "positionFromPosition:toBoundary:inDirection:")
    public native UITextPosition positionFromPosition$toBoundary$inDirection$(UITextPosition position, UITextGranularity granularity, @NSInteger long direction);

    @ObjCMethodSign(sign = "- (BOOL)isPosition:(UITextPosition *)position withinTextUnit:(UITextGranularity)granularity inDirection:(UITextDirection)direction;", selector = "isPosition:withinTextUnit:inDirection:")
    public native boolean isPosition$withinTextUnit$inDirection$(UITextPosition position, UITextGranularity granularity, @NSInteger long direction);
}
