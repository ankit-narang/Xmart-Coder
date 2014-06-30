package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSLayoutFormatOptions {
    NSLayoutFormatAlignAllLeft($UIKit.NSLayoutFormatAlignAllLeft),
    NSLayoutFormatAlignAllRight($UIKit.NSLayoutFormatAlignAllRight),
    NSLayoutFormatAlignAllTop($UIKit.NSLayoutFormatAlignAllTop),
    NSLayoutFormatAlignAllBottom($UIKit.NSLayoutFormatAlignAllBottom),
    NSLayoutFormatAlignAllLeading($UIKit.NSLayoutFormatAlignAllLeading),
    NSLayoutFormatAlignAllTrailing($UIKit.NSLayoutFormatAlignAllTrailing),
    NSLayoutFormatAlignAllCenterX($UIKit.NSLayoutFormatAlignAllCenterX),
    NSLayoutFormatAlignAllCenterY($UIKit.NSLayoutFormatAlignAllCenterY),
    NSLayoutFormatAlignAllBaseline($UIKit.NSLayoutFormatAlignAllBaseline),
    NSLayoutFormatAlignmentMask($UIKit.NSLayoutFormatAlignmentMask),
    NSLayoutFormatDirectionLeadingToTrailing($UIKit.NSLayoutFormatDirectionLeadingToTrailing),
    NSLayoutFormatDirectionLeftToRight($UIKit.NSLayoutFormatDirectionLeftToRight),
    NSLayoutFormatDirectionRightToLeft($UIKit.NSLayoutFormatDirectionRightToLeft),
    NSLayoutFormatDirectionMask($UIKit.NSLayoutFormatDirectionMask);

    private final long value;

    private NSLayoutFormatOptions(long value) { this.value = value; }
}
