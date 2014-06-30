package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public enum NSControlCharacterAction {
    NSControlCharacterZeroAdvancementAction($UIKit.NSControlCharacterZeroAdvancementAction),
    NSControlCharacterWhitespaceAction($UIKit.NSControlCharacterWhitespaceAction),
    NSControlCharacterHorizontalTabAction($UIKit.NSControlCharacterHorizontalTabAction),
    NSControlCharacterLineBreakAction($UIKit.NSControlCharacterLineBreakAction),
    NSControlCharacterParagraphBreakAction($UIKit.NSControlCharacterParagraphBreakAction),
    NSControlCharacterContainerBreakAction($UIKit.NSControlCharacterContainerBreakAction);

    private final long value;

    private NSControlCharacterAction(long value) { this.value = value; }
}
