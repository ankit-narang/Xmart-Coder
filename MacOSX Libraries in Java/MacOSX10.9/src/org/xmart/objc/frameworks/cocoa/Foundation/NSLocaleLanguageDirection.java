package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSLocaleLanguageDirection {
    NSLocaleLanguageDirectionUnknown($Foundation.NSLocaleLanguageDirectionUnknown),
    NSLocaleLanguageDirectionLeftToRight($Foundation.NSLocaleLanguageDirectionLeftToRight),
    NSLocaleLanguageDirectionRightToLeft($Foundation.NSLocaleLanguageDirectionRightToLeft),
    NSLocaleLanguageDirectionTopToBottom($Foundation.NSLocaleLanguageDirectionTopToBottom),
    NSLocaleLanguageDirectionBottomToTop($Foundation.NSLocaleLanguageDirectionBottomToTop);

    private final long value;

    private NSLocaleLanguageDirection(long value) { this.value = value; }
}
