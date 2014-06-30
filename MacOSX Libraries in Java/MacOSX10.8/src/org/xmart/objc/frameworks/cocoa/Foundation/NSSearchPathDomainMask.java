package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSSearchPathDomainMask {
    NSUserDomainMask($Foundation.NSUserDomainMask),
    NSLocalDomainMask($Foundation.NSLocalDomainMask),
    NSNetworkDomainMask($Foundation.NSNetworkDomainMask),
    NSSystemDomainMask($Foundation.NSSystemDomainMask),
    NSAllDomainsMask($Foundation.NSAllDomainsMask);

    private final long value;

    private NSSearchPathDomainMask(long value) { this.value = value; }
}
