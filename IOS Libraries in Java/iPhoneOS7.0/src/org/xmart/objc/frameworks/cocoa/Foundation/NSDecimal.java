package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSDecimal extends ObjCStructure  {
    
    public NSDecimal() {}
    public NSDecimal(int _exponent, @Unsigned int _length, @Unsigned int _isNegative, @Unsigned int _isCompact, @Unsigned int _reserved, @Unsigned short[] _mantissa) {
        this._exponent = _exponent;
        this._length = _length;
        this._isNegative = _isNegative;
        this._isCompact = _isCompact;
        this._reserved = _reserved;
        this._mantissa = _mantissa;
    }
    
    @ObjCStructureMember(index=0, name="_exponent") public int _exponent;
    @ObjCStructureMember(index=1, name="_length") public @Unsigned int _length;
    @ObjCStructureMember(index=2, name="_isNegative") public @Unsigned int _isNegative;
    @ObjCStructureMember(index=3, name="_isCompact") public @Unsigned int _isCompact;
    @ObjCStructureMember(index=4, name="_reserved") public @Unsigned int _reserved;
    @ObjCStructureMember(index=5, name="_mantissa") public @ObjCArray("8") @Unsigned short[] _mantissa;
    
}
