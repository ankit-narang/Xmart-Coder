package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSLinguisticTaggerOptions {
    NSLinguisticTaggerOmitWords($Foundation.NSLinguisticTaggerOmitWords),
    NSLinguisticTaggerOmitPunctuation($Foundation.NSLinguisticTaggerOmitPunctuation),
    NSLinguisticTaggerOmitWhitespace($Foundation.NSLinguisticTaggerOmitWhitespace),
    NSLinguisticTaggerOmitOther($Foundation.NSLinguisticTaggerOmitOther),
    NSLinguisticTaggerJoinNames($Foundation.NSLinguisticTaggerJoinNames);

    private final long value;

    private NSLinguisticTaggerOptions(long value) { this.value = value; }
}
