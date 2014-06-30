package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSLayoutAttribute {
    NSLayoutAttributeLeft($UIKit.NSLayoutAttributeLeft),
    NSLayoutAttributeRight($UIKit.NSLayoutAttributeRight),
    NSLayoutAttributeTop($UIKit.NSLayoutAttributeTop),
    NSLayoutAttributeBottom($UIKit.NSLayoutAttributeBottom),
    NSLayoutAttributeLeading($UIKit.NSLayoutAttributeLeading),
    NSLayoutAttributeTrailing($UIKit.NSLayoutAttributeTrailing),
    NSLayoutAttributeWidth($UIKit.NSLayoutAttributeWidth),
    NSLayoutAttributeHeight($UIKit.NSLayoutAttributeHeight),
    NSLayoutAttributeCenterX($UIKit.NSLayoutAttributeCenterX),
    NSLayoutAttributeCenterY($UIKit.NSLayoutAttributeCenterY),
    NSLayoutAttributeBaseline($UIKit.NSLayoutAttributeBaseline),
    NSLayoutAttributeNotAnAttribute($UIKit.NSLayoutAttributeNotAnAttribute);

    private final long value;

    private NSLayoutAttribute(long value) { this.value = value; }
}
