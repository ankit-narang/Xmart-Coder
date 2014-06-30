package org.xmart.objc.frameworks.cocoa.Foundation;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;

@ObjCFramework("Foundation")
public class NSMetadataQuery extends NSObject  {
    
    public NSMetadataQuery() {}
    
    
    @ObjCMethodSign(sign = "- (id)init;", selector = "init")
    public native NSMetadataQuery init();

    @ObjCMethodSign(sign = "- (id <NSMetadataQueryDelegate>)delegate;", selector = "delegate")
    public native NSMetadataQueryDelegate delegate();

    @ObjCMethodSign(sign = "- (void)setDelegate:(id <NSMetadataQueryDelegate>)delegate;", selector = "setDelegate:")
    public native void setDelegate(NSMetadataQueryDelegate delegate);

    @ObjCMethodSign(sign = "- (NSPredicate *)predicate;", selector = "predicate")
    public native NSPredicate predicate();

    @ObjCMethodSign(sign = "- (void)setPredicate:(NSPredicate *)predicate;", selector = "setPredicate:")
    public native void setPredicate(NSPredicate predicate);

    @ObjCMethodSign(sign = "- (NSArray *)sortDescriptors;", selector = "sortDescriptors")
    public native NSArray sortDescriptors();

    @ObjCMethodSign(sign = "- (void)setSortDescriptors:(NSArray *)descriptors;", selector = "setSortDescriptors:")
    public native void setSortDescriptors(NSArray descriptors);

    @ObjCMethodSign(sign = "- (NSArray *)valueListAttributes;", selector = "valueListAttributes")
    public native NSArray valueListAttributes();

    @ObjCMethodSign(sign = "- (void)setValueListAttributes:(NSArray *)attrs;", selector = "setValueListAttributes:")
    public native void setValueListAttributes(NSArray attrs);

    @ObjCMethodSign(sign = "- (NSArray *)groupingAttributes;", selector = "groupingAttributes")
    public native NSArray groupingAttributes();

    @ObjCMethodSign(sign = "- (void)setGroupingAttributes:(NSArray *)attrs;", selector = "setGroupingAttributes:")
    public native void setGroupingAttributes(NSArray attrs);

    @ObjCMethodSign(sign = "- (NSTimeInterval)notificationBatchingInterval;", selector = "notificationBatchingInterval")
    public native double notificationBatchingInterval();

    @ObjCMethodSign(sign = "- (void)setNotificationBatchingInterval:(NSTimeInterval)ti;", selector = "setNotificationBatchingInterval:")
    public native void setNotificationBatchingInterval(double ti);

    @ObjCMethodSign(sign = "- (NSArray *)searchScopes;", selector = "searchScopes")
    public native NSArray searchScopes();

    @ObjCMethodSign(sign = "- (void)setSearchScopes:(NSArray *)scopes;", selector = "setSearchScopes:")
    public native void setSearchScopes(NSArray scopes);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)searchItems NS_AVAILABLE(10_9, 7_0);", selector = "searchItems")
    public native NSArray searchItems();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setSearchItems:(NSArray *)items NS_AVAILABLE(10_9, 7_0);", selector = "setSearchItems:")
    public native void setSearchItems(NSArray items);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSOperationQueue *)operationQueue NS_AVAILABLE(10_9, 7_0);", selector = "operationQueue")
    public native NSOperationQueue operationQueue();

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)setOperationQueue:(NSOperationQueue *)operationQueue NS_AVAILABLE(10_9, 7_0);", selector = "setOperationQueue:")
    public native void setOperationQueue(NSOperationQueue operationQueue);

    @ObjCMethodSign(sign = "- (BOOL)startQuery;", selector = "startQuery")
    public native boolean startQuery();

    @ObjCMethodSign(sign = "- (void)stopQuery;", selector = "stopQuery")
    public native void stopQuery();

    @ObjCMethodSign(sign = "- (BOOL)isStarted;", selector = "isStarted")
    public native boolean isStarted();

    @ObjCMethodSign(sign = "- (BOOL)isGathering;", selector = "isGathering")
    public native boolean isGathering();

    @ObjCMethodSign(sign = "- (BOOL)isStopped;", selector = "isStopped")
    public native boolean isStopped();

    @ObjCMethodSign(sign = "- (void)disableUpdates;", selector = "disableUpdates")
    public native void disableUpdates();

    @ObjCMethodSign(sign = "- (void)enableUpdates;", selector = "enableUpdates")
    public native void enableUpdates();

    @ObjCMethodSign(sign = "- (NSUInteger)resultCount;", selector = "resultCount")
    public native @NSUInteger long resultCount();

    @ObjCMethodSign(sign = "- (id)resultAtIndex:(NSUInteger)idx;", selector = "resultAtIndex:")
    public native NSObject resultAtIndex$(@NSUInteger long idx);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateResultsUsingBlock:(void (^)(id result, NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_9, 7_0);", selector = "enumerateResultsUsingBlock:")
    public native void enumerateResultsUsingBlock$(ObjCBlock block);

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)enumerateResultsWithOptions:(NSEnumerationOptions)opts usingBlock:(void (^)(id result, NSUInteger idx, BOOL *stop))block NS_AVAILABLE(10_9, 7_0);", selector = "enumerateResultsWithOptions:usingBlock:")
    public native void enumerateResultsWithOptions$usingBlock$(NSEnumerationOptions opts, ObjCBlock block);

    @ObjCMethodSign(sign = "- (NSArray *)results;", selector = "results")
    public native NSArray results();

    @ObjCMethodSign(sign = "- (NSUInteger)indexOfResult:(id)result;", selector = "indexOfResult:")
    public native @NSUInteger long indexOfResult$(NSObject result);

    @ObjCMethodSign(sign = "- (NSDictionary *)valueLists;", selector = "valueLists")
    public native NSDictionary valueLists();

    @ObjCMethodSign(sign = "- (NSArray *)groupedResults;", selector = "groupedResults")
    public native NSArray groupedResults();

    @ObjCMethodSign(sign = "- (id)valueOfAttribute:(NSString *)attrName forResultAtIndex:(NSUInteger)idx;", selector = "valueOfAttribute:forResultAtIndex:")
    public native NSObject valueOfAttribute$forResultAtIndex$(NSString attrName, @NSUInteger long idx);
}
