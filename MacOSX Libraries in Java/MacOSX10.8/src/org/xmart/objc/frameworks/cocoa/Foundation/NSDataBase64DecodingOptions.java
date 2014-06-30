package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSDataBase64DecodingOptions {
    NSDataBase64DecodingIgnoreUnknownCharacters($Foundation.NSDataBase64DecodingIgnoreUnknownCharacters);

    private final long value;

    private NSDataBase64DecodingOptions(long value) { this.value = value; }
}
