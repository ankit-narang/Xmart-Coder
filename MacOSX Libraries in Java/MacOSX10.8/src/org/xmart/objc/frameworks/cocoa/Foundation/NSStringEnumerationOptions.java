package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSStringEnumerationOptions {
    NSStringEnumerationByLines($Foundation.NSStringEnumerationByLines),
    NSStringEnumerationByParagraphs($Foundation.NSStringEnumerationByParagraphs),
    NSStringEnumerationByComposedCharacterSequences($Foundation.NSStringEnumerationByComposedCharacterSequences),
    NSStringEnumerationByWords($Foundation.NSStringEnumerationByWords),
    NSStringEnumerationBySentences($Foundation.NSStringEnumerationBySentences),
    NSStringEnumerationReverse($Foundation.NSStringEnumerationReverse),
    NSStringEnumerationSubstringNotRequired($Foundation.NSStringEnumerationSubstringNotRequired),
    NSStringEnumerationLocalized($Foundation.NSStringEnumerationLocalized);

    private final long value;

    private NSStringEnumerationOptions(long value) { this.value = value; }
}
