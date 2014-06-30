package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIKeyboardType {
    UIKeyboardTypeDefault($UIKit.UIKeyboardTypeDefault),
    UIKeyboardTypeASCIICapable($UIKit.UIKeyboardTypeASCIICapable),
    UIKeyboardTypeNumbersAndPunctuation($UIKit.UIKeyboardTypeNumbersAndPunctuation),
    UIKeyboardTypeURL($UIKit.UIKeyboardTypeURL),
    UIKeyboardTypeNumberPad($UIKit.UIKeyboardTypeNumberPad),
    UIKeyboardTypePhonePad($UIKit.UIKeyboardTypePhonePad),
    UIKeyboardTypeNamePhonePad($UIKit.UIKeyboardTypeNamePhonePad),
    UIKeyboardTypeEmailAddress($UIKit.UIKeyboardTypeEmailAddress),
    /**
     * @since Available in iOS 4.1 and later.
     */
    UIKeyboardTypeDecimalPad($UIKit.UIKeyboardTypeDecimalPad),
    /**
     * @since Available in iOS 5.0 and later.
     */
    UIKeyboardTypeTwitter($UIKit.UIKeyboardTypeTwitter),
    /**
     * @since Available in iOS 7.0 and later.
     */
    UIKeyboardTypeWebSearch($UIKit.UIKeyboardTypeWebSearch),
    UIKeyboardTypeAlphabet($UIKit.UIKeyboardTypeAlphabet);

    private final long value;

    private UIKeyboardType(long value) { this.value = value; }
}
