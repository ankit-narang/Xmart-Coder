package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

/**
 * @since Available in iOS 7.0 and later.
 */
@ObjCFramework("UIKit")
public interface UIGuidedAccessRestrictionDelegate 
    extends NSObjectProtocol {

    
    
    @ObjCMethodSign(sign = "- (NSArray *)guidedAccessRestrictionIdentifiers;", selector = "guidedAccessRestrictionIdentifiers")
    NSArray guidedAccessRestrictionIdentifiers();

    @ObjCMethodSign(sign = "- (void)guidedAccessRestrictionWithIdentifier:(NSString *)restrictionIdentifier didChangeState:(UIGuidedAccessRestrictionState)newRestrictionState;", selector = "guidedAccessRestrictionWithIdentifier:didChangeState:")
    void guidedAccessRestrictionWithIdentifier$didChangeState$(NSString restrictionIdentifier, UIGuidedAccessRestrictionState newRestrictionState);

    @ObjCMethodSign(sign = "- (NSString *)textForGuidedAccessRestrictionWithIdentifier:(NSString *)restrictionIdentifier;", selector = "textForGuidedAccessRestrictionWithIdentifier:")
    NSString textForGuidedAccessRestrictionWithIdentifier$(NSString restrictionIdentifier);

    @ObjCMethodSign(sign = "- (NSString *)detailTextForGuidedAccessRestrictionWithIdentifier:(NSString *)restrictionIdentifier;", selector = "detailTextForGuidedAccessRestrictionWithIdentifier:")
    NSString detailTextForGuidedAccessRestrictionWithIdentifier$(NSString restrictionIdentifier);
}
