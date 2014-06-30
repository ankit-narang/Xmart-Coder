package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public enum NSMachPortRights {
    NSMachPortDeallocateNone($Foundation.NSMachPortDeallocateNone),
    NSMachPortDeallocateSendRight($Foundation.NSMachPortDeallocateSendRight),
    NSMachPortDeallocateReceiveRight($Foundation.NSMachPortDeallocateReceiveRight);

    private final long value;

    private NSMachPortRights(long value) { this.value = value; }
}
