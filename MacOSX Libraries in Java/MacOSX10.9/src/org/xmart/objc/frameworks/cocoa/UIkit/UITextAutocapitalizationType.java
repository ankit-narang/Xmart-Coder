package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UITextAutocapitalizationType {
    UITextAutocapitalizationTypeNone($UIKit.UITextAutocapitalizationTypeNone),
    UITextAutocapitalizationTypeWords($UIKit.UITextAutocapitalizationTypeWords),
    UITextAutocapitalizationTypeSentences($UIKit.UITextAutocapitalizationTypeSentences),
    UITextAutocapitalizationTypeAllCharacters($UIKit.UITextAutocapitalizationTypeAllCharacters);

    private final long value;

    private UITextAutocapitalizationType(long value) { this.value = value; }
}
