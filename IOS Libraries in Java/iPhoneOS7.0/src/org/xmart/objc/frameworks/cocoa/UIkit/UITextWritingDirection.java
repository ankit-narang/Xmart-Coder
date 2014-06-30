package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextWritingDirection {
    UITextWritingDirectionNatural($UIKit.UITextWritingDirectionNatural),
    UITextWritingDirectionLeftToRight($UIKit.UITextWritingDirectionLeftToRight),
    UITextWritingDirectionRightToLeft($UIKit.UITextWritingDirectionRightToLeft);

    private final long value;

    private UITextWritingDirection(long value) { this.value = value; }
}
