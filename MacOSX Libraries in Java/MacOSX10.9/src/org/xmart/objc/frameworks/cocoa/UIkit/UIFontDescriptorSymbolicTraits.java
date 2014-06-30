package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum UIFontDescriptorSymbolicTraits {
    UIFontDescriptorTraitItalic($UIKit.UIFontDescriptorTraitItalic),
    UIFontDescriptorTraitBold($UIKit.UIFontDescriptorTraitBold),
    UIFontDescriptorTraitExpanded($UIKit.UIFontDescriptorTraitExpanded),
    UIFontDescriptorTraitCondensed($UIKit.UIFontDescriptorTraitCondensed),
    UIFontDescriptorTraitMonoSpace($UIKit.UIFontDescriptorTraitMonoSpace),
    UIFontDescriptorTraitVertical($UIKit.UIFontDescriptorTraitVertical),
    UIFontDescriptorTraitUIOptimized($UIKit.UIFontDescriptorTraitUIOptimized),
    UIFontDescriptorTraitTightLeading($UIKit.UIFontDescriptorTraitTightLeading),
    UIFontDescriptorTraitLooseLeading($UIKit.UIFontDescriptorTraitLooseLeading),
    UIFontDescriptorClassMask($UIKit.UIFontDescriptorClassMask),
    UIFontDescriptorClassUnknown($UIKit.UIFontDescriptorClassUnknown),
    UIFontDescriptorClassOldStyleSerifs($UIKit.UIFontDescriptorClassOldStyleSerifs),
    UIFontDescriptorClassTransitionalSerifs($UIKit.UIFontDescriptorClassTransitionalSerifs),
    UIFontDescriptorClassModernSerifs($UIKit.UIFontDescriptorClassModernSerifs),
    UIFontDescriptorClassClarendonSerifs($UIKit.UIFontDescriptorClassClarendonSerifs),
    UIFontDescriptorClassSlabSerifs($UIKit.UIFontDescriptorClassSlabSerifs),
    UIFontDescriptorClassFreeformSerifs($UIKit.UIFontDescriptorClassFreeformSerifs),
    UIFontDescriptorClassSansSerif($UIKit.UIFontDescriptorClassSansSerif),
    UIFontDescriptorClassOrnamentals($UIKit.UIFontDescriptorClassOrnamentals),
    UIFontDescriptorClassScripts($UIKit.UIFontDescriptorClassScripts),
    UIFontDescriptorClassSymbolic($UIKit.UIFontDescriptorClassSymbolic);

    private final long value;

    private UIFontDescriptorSymbolicTraits(long value) { this.value = value; }
}
