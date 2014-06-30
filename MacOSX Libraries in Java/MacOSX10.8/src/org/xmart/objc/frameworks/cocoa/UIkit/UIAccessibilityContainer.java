package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIAccessibilityContainer 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSInteger)accessibilityElementCount;", selector = "accessibilityElementCount")
    @NSInteger long accessibilityElementCount();

    @ObjCMethodSign(sign = "- (id)accessibilityElementAtIndex:(NSInteger)index;", selector = "accessibilityElementAtIndex:")
    NSObject accessibilityElementAtIndex$(@NSInteger long index);

    @ObjCMethodSign(sign = "- (NSInteger)indexOfAccessibilityElement:(id)element;", selector = "indexOfAccessibilityElement:")
    @NSInteger long indexOfAccessibilityElement$(NSObject element);
}
