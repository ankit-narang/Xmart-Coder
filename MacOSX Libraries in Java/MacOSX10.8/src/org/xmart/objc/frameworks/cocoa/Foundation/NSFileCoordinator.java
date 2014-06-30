package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSFileCoordinator extends NSObject  {
    
    public NSFileCoordinator() {}
    
    
    @ObjCMethodSign(sign = "- (id)initWithFilePresenter:(id<NSFilePresenter>)filePresenterOrNil;", selector = "initWithFilePresenter:")
    public native NSFileCoordinator initWithFilePresenter$(NSFilePresenter filePresenterOrNil);

    @ObjCMethodSign(sign = "- (void)coordinateReadingItemAtURL:(NSURL *)url options:(NSFileCoordinatorReadingOptions)options error:(NSError **)outError byAccessor:(void (^)(NSURL *newURL))reader;", selector = "coordinateReadingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItemAtURL$options$error$byAccessor$(NSURL url, NSFileCoordinatorReadingOptions options, NSError[] outError, ObjCBlock reader);

    @ObjCMethodSign(sign = "- (void)coordinateWritingItemAtURL:(NSURL *)url options:(NSFileCoordinatorWritingOptions)options error:(NSError **)outError byAccessor:(void (^)(NSURL *newURL))writer;", selector = "coordinateWritingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItemAtURL$options$error$byAccessor$(NSURL url, NSFileCoordinatorWritingOptions options, NSError[] outError, ObjCBlock writer);

    @ObjCMethodSign(sign = "- (void)coordinateReadingItemAtURL:(NSURL *)readingURL options:(NSFileCoordinatorReadingOptions)readingOptions writingItemAtURL:(NSURL *)writingURL options:(NSFileCoordinatorWritingOptions)writingOptions error:(NSError **)outError byAccessor:(void (^)(NSURL *newReadingURL, NSURL *newWritingURL))readerWriter;", selector = "coordinateReadingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateReadingItemAtURL$options$writingItemAtURL$options$error$byAccessor$(NSURL readingURL, NSFileCoordinatorReadingOptions readingOptions, NSURL writingURL, NSFileCoordinatorWritingOptions writingOptions, NSError[] outError, ObjCBlock readerWriter);

    @ObjCMethodSign(sign = "- (void)coordinateWritingItemAtURL:(NSURL *)url1 options:(NSFileCoordinatorWritingOptions)options1 writingItemAtURL:(NSURL *)url2 options:(NSFileCoordinatorWritingOptions)options2 error:(NSError **)outError byAccessor:(void (^)(NSURL *newURL1, NSURL *newURL2))writer;", selector = "coordinateWritingItemAtURL:options:writingItemAtURL:options:error:byAccessor:")
    public native void coordinateWritingItemAtURL$options$writingItemAtURL$options$error$byAccessor$(NSURL url1, NSFileCoordinatorWritingOptions options1, NSURL url2, NSFileCoordinatorWritingOptions options2, NSError[] outError, ObjCBlock writer);

    @ObjCMethodSign(sign = "- (void)prepareForReadingItemsAtURLs:(NSArray *)readingURLs options:(NSFileCoordinatorReadingOptions)readingOptions writingItemsAtURLs:(NSArray *)writingURLs options:(NSFileCoordinatorWritingOptions)writingOptions error:(NSError **)outError byAccessor:(void (^)(void (^completionHandler)(void)))batchAccessor;", selector = "prepareForReadingItemsAtURLs:options:writingItemsAtURLs:options:error:byAccessor:")
    public native void prepareForReadingItemsAtURLs$options$writingItemsAtURLs$options$error$byAccessor$(NSArray readingURLs, NSFileCoordinatorReadingOptions readingOptions, NSArray writingURLs, NSFileCoordinatorWritingOptions writingOptions, NSError[] outError, ObjCBlock batchAccessor);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)itemAtURL:(NSURL *)oldURL willMoveToURL:(NSURL *)newURL NS_AVAILABLE(10_8, 6_0);", selector = "itemAtURL:willMoveToURL:")
    public native void itemAtURL$willMoveToURL$(NSURL oldURL, NSURL newURL);

    @ObjCMethodSign(sign = "- (void)itemAtURL:(NSURL *)oldURL didMoveToURL:(NSURL *)newURL;", selector = "itemAtURL:didMoveToURL:")
    public native void itemAtURL$didMoveToURL$(NSURL oldURL, NSURL newURL);

    @ObjCMethodSign(sign = "- (void)cancel;", selector = "cancel")
    public native void cancel();

    @ObjCMethodSign(sign = "+ (void)addFilePresenter:(id<NSFilePresenter>)filePresenter;", selector = "addFilePresenter:")
    public static native void addFilePresenter$(NSFilePresenter filePresenter);

    @ObjCMethodSign(sign = "+ (void)removeFilePresenter:(id<NSFilePresenter>)filePresenter;", selector = "removeFilePresenter:")
    public static native void removeFilePresenter$(NSFilePresenter filePresenter);

    @ObjCMethodSign(sign = "+ (NSArray *)filePresenters;", selector = "filePresenters")
    public static native NSArray filePresenters();
}
