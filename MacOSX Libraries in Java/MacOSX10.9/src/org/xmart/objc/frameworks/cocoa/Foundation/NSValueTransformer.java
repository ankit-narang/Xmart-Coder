package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSValueTransformer extends NSObject  {
    
    public NSValueTransformer() {}
    
    
    @ObjCMethodSign(sign = "- (id)transformedValue:(id)value;", selector = "transformedValue:")
    public native NSObject transformedValue$(NSObject value);

    @ObjCMethodSign(sign = "- (id)reverseTransformedValue:(id)value;", selector = "reverseTransformedValue:")
    public native NSObject reverseTransformedValue$(NSObject value);

    @ObjCMethodSign(sign = "+ (void)setValueTransformer:(NSValueTransformer *)transformer forName:(NSString *)name;", selector = "setValueTransformer:forName:")
    public static native void setValueTransformer$forName$(NSValueTransformer transformer, NSString name);

    @ObjCMethodSign(sign = "+ (NSValueTransformer *)valueTransformerForName:(NSString *)name;", selector = "valueTransformerForName:")
    public static native NSValueTransformer valueTransformerForName$(NSString name);

    @ObjCMethodSign(sign = "+ (NSArray *)valueTransformerNames;", selector = "valueTransformerNames")
    public static native NSArray valueTransformerNames();

    @ObjCMethodSign(sign = "+ (Class)transformedValueClass;", selector = "transformedValueClass")
    public static native ObjCClass transformedValueClass();

    @ObjCMethodSign(sign = "+ (BOOL)allowsReverseTransformation;", selector = "allowsReverseTransformation")
    public static native boolean allowsReverseTransformation();
}
