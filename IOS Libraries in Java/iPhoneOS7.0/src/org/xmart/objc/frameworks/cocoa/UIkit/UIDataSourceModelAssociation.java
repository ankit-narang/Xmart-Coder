package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIDataSourceModelAssociation 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSString *) modelIdentifierForElementAtIndexPath:(NSIndexPath *)idx inView:(UIView *)view;", selector = "modelIdentifierForElementAtIndexPath:inView:")
    NSString modelIdentifierForElementAtIndexPath$inView$(NSIndexPath idx, UIView view);

    @ObjCMethodSign(sign = "- (NSIndexPath *) indexPathForElementWithModelIdentifier:(NSString *)identifier inView:(UIView *)view;", selector = "indexPathForElementWithModelIdentifier:inView:")
    NSIndexPath indexPathForElementWithModelIdentifier$inView$(NSString identifier, UIView view);
}
