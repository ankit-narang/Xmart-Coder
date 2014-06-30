package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextSpellCheckingType {
    UITextSpellCheckingTypeDefault($UIKit.UITextSpellCheckingTypeDefault),
    UITextSpellCheckingTypeNo($UIKit.UITextSpellCheckingTypeNo),
    UITextSpellCheckingTypeYes($UIKit.UITextSpellCheckingTypeYes);

    private final long value;

    private UITextSpellCheckingType(long value) { this.value = value; }
}
