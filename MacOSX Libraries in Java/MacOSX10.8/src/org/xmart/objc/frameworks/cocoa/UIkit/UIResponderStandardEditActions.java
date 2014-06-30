package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;


@ObjCFramework("UIKit")
public interface UIResponderStandardEditActions 
    extends NSObjectProtocol {

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)cut:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "cut:")
    void cut$(NSObject sender);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)copy:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "copy:")
    void copy$(NSObject sender);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)paste:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "paste:")
    void paste$(NSObject sender);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)select:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "select:")
    void select$(NSObject sender);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)selectAll:(id)sender NS_AVAILABLE_IOS(3_0);", selector = "selectAll:")
    void selectAll$(NSObject sender);

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCMethodSign(sign = "- (void)delete:(id)sender NS_AVAILABLE_IOS(3_2);", selector = "delete:")
    void delete$(NSObject sender);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)makeTextWritingDirectionLeftToRight:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "makeTextWritingDirectionLeftToRight:")
    void makeTextWritingDirectionLeftToRight$(NSObject sender);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)makeTextWritingDirectionRightToLeft:(id)sender NS_AVAILABLE_IOS(5_0);", selector = "makeTextWritingDirectionRightToLeft:")
    void makeTextWritingDirectionRightToLeft$(NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)toggleBoldface:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "toggleBoldface:")
    void toggleBoldface$(NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)toggleItalics:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "toggleItalics:")
    void toggleItalics$(NSObject sender);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)toggleUnderline:(id)sender NS_AVAILABLE_IOS(6_0);", selector = "toggleUnderline:")
    void toggleUnderline$(NSObject sender);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)increaseSize:(id)sender NS_AVAILABLE_IOS(7_0);", selector = "increaseSize:")
    void increaseSize$(NSObject sender);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)decreaseSize:(id)sender NS_AVAILABLE_IOS(7_0);", selector = "decreaseSize:")
    void decreaseSize$(NSObject sender);
}
