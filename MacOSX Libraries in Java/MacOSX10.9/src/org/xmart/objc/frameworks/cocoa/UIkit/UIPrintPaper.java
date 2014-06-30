package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPrintPaper extends NSObject  {
    
    public UIPrintPaper() {}
    @ObjCPropertyGetter(selector = "paperSize")
    public native @ObjCByValue CGSize getPaperSize();
    @ObjCProperty public @ObjCByValue CGSize paperSize;

    @ObjCPropertyGetter(selector = "printableRect")
    public native @ObjCByValue CGRect getPrintableRect();
    @ObjCProperty public @ObjCByValue CGRect printableRect;
    
    @ObjCMethodSign(sign = "+ (UIPrintPaper *)bestPaperForPageSize:(CGSize)contentSize withPapersFromArray:(NSArray *)paperList;", selector = "bestPaperForPageSize:withPapersFromArray:")
    public static native UIPrintPaper bestPaperForPageSize$withPapersFromArray$(@ObjCByValue CGSize contentSize, NSArray paperList);

    @ObjCCategoryMethod(catname = "Deprecated_Nonfunctional", catownername = "UIPrintPaper")
    @ObjCMethodSign(sign = "- (CGRect)printRect;", selector = "printRect")
    public native @ObjCByValue CGRect printRect();
}
