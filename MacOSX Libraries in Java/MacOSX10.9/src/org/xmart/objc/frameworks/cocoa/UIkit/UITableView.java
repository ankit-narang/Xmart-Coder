package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UITableView extends UIScrollView implements NSCoding {
    
    public UITableView() {}
    @ObjCPropertyGetter(selector = "style")
    public native UITableViewStyle getStyle();
    @ObjCProperty public UITableViewStyle style;

    @ObjCPropertyGetter(selector = "dataSource")
    public native UITableViewDataSource getDataSource();
    @ObjCPropertySetter(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UITableViewDataSource v);
    @ObjCProperty public UITableViewDataSource dataSource;

    @ObjCPropertyGetter(selector = "delegate")
    public native UITableViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UITableViewDelegate v);
    @ObjCProperty public UITableViewDelegate delegate;

    @ObjCPropertyGetter(selector = "rowHeight")
    public native float getRowHeight();
    @ObjCPropertySetter(selector = "setRowHeight:")
    public native void setRowHeight(float v);
    @ObjCProperty public float rowHeight;

    @ObjCPropertyGetter(selector = "sectionHeaderHeight")
    public native float getSectionHeaderHeight();
    @ObjCPropertySetter(selector = "setSectionHeaderHeight:")
    public native void setSectionHeaderHeight(float v);
    @ObjCProperty public float sectionHeaderHeight;

    @ObjCPropertyGetter(selector = "sectionFooterHeight")
    public native float getSectionFooterHeight();
    @ObjCPropertySetter(selector = "setSectionFooterHeight:")
    public native void setSectionFooterHeight(float v);
    @ObjCProperty public float sectionFooterHeight;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "estimatedRowHeight")
    public native float getEstimatedRowHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setEstimatedRowHeight:")
    public native void setEstimatedRowHeight(float v);
    @ObjCProperty public float estimatedRowHeight;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "estimatedSectionHeaderHeight")
    public native float getEstimatedSectionHeaderHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setEstimatedSectionHeaderHeight:")
    public native void setEstimatedSectionHeaderHeight(float v);
    @ObjCProperty public float estimatedSectionHeaderHeight;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "estimatedSectionFooterHeight")
    public native float getEstimatedSectionFooterHeight();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setEstimatedSectionFooterHeight:")
    public native void setEstimatedSectionFooterHeight(float v);
    @ObjCProperty public float estimatedSectionFooterHeight;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "separatorInset")
    public native @ObjCByValue UIEdgeInsets getSeparatorInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSeparatorInset:")
    public native void setSeparatorInset(@ObjCByValue UIEdgeInsets v);
    @ObjCProperty public @ObjCByValue UIEdgeInsets separatorInset;

    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertyGetter(selector = "backgroundView")
    public native UIView getBackgroundView();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @ObjCPropertySetter(selector = "setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @ObjCProperty public UIView backgroundView;

    @ObjCPropertyGetter(selector = "isEditing")
    public native boolean isEditing();
    @ObjCPropertySetter(selector = "setEditing:")
    public native void setEditing(boolean v);
    @ObjCProperty public boolean editing;

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertyGetter(selector = "allowsSelection")
    public native boolean isAllowsSelection();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsSelection:")
    public native void setAllowsSelection(boolean v);
    @ObjCProperty public boolean allowsSelection;

    @ObjCPropertyGetter(selector = "allowsSelectionDuringEditing")
    public native boolean isAllowsSelectionDuringEditing();
    @ObjCPropertySetter(selector = "setAllowsSelectionDuringEditing:")
    public native void setAllowsSelectionDuringEditing(boolean v);
    @ObjCProperty public boolean allowsSelectionDuringEditing;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "allowsMultipleSelection")
    public native boolean isAllowsMultipleSelection();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsMultipleSelection:")
    public native void setAllowsMultipleSelection(boolean v);
    @ObjCProperty public boolean allowsMultipleSelection;

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertyGetter(selector = "allowsMultipleSelectionDuringEditing")
    public native boolean isAllowsMultipleSelectionDuringEditing();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCPropertySetter(selector = "setAllowsMultipleSelectionDuringEditing:")
    public native void setAllowsMultipleSelectionDuringEditing(boolean v);
    @ObjCProperty public boolean allowsMultipleSelectionDuringEditing;

    @ObjCPropertyGetter(selector = "sectionIndexMinimumDisplayRowCount")
    public native @NSInteger long getSectionIndexMinimumDisplayRowCount();
    @ObjCPropertySetter(selector = "setSectionIndexMinimumDisplayRowCount:")
    public native void setSectionIndexMinimumDisplayRowCount(@NSInteger long v);
    @ObjCProperty public @NSInteger long sectionIndexMinimumDisplayRowCount;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "sectionIndexColor")
    public native UIColor getSectionIndexColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setSectionIndexColor:")
    public native void setSectionIndexColor(UIColor v);
    @ObjCProperty public UIColor sectionIndexColor;

    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertyGetter(selector = "sectionIndexBackgroundColor")
    public native UIColor getSectionIndexBackgroundColor();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @ObjCPropertySetter(selector = "setSectionIndexBackgroundColor:")
    public native void setSectionIndexBackgroundColor(UIColor v);
    @ObjCProperty public UIColor sectionIndexBackgroundColor;

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertyGetter(selector = "sectionIndexTrackingBackgroundColor")
    public native UIColor getSectionIndexTrackingBackgroundColor();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCPropertySetter(selector = "setSectionIndexTrackingBackgroundColor:")
    public native void setSectionIndexTrackingBackgroundColor(UIColor v);
    @ObjCProperty public UIColor sectionIndexTrackingBackgroundColor;

    @ObjCPropertyGetter(selector = "separatorStyle")
    public native UITableViewCellSeparatorStyle getSeparatorStyle();
    @ObjCPropertySetter(selector = "setSeparatorStyle:")
    public native void setSeparatorStyle(UITableViewCellSeparatorStyle v);
    @ObjCProperty public UITableViewCellSeparatorStyle separatorStyle;

    @ObjCPropertyGetter(selector = "separatorColor")
    public native UIColor getSeparatorColor();
    @ObjCPropertySetter(selector = "setSeparatorColor:")
    public native void setSeparatorColor(UIColor v);
    @ObjCProperty public UIColor separatorColor;

    @ObjCPropertyGetter(selector = "tableHeaderView")
    public native UIView getTableHeaderView();
    @ObjCPropertySetter(selector = "setTableHeaderView:")
    public native void setTableHeaderView(UIView v);
    @ObjCProperty public UIView tableHeaderView;

    @ObjCPropertyGetter(selector = "tableFooterView")
    public native UIView getTableFooterView();
    @ObjCPropertySetter(selector = "setTableFooterView:")
    public native void setTableFooterView(UIView v);
    @ObjCProperty public UIView tableFooterView;
    
    @ObjCMethodSign(sign = "- (id)initWithFrame:(CGRect)frame style:(UITableViewStyle)style;", selector = "initWithFrame:style:")
    public native UITableView initWithFrame$style$(@ObjCByValue CGRect frame, UITableViewStyle style);

    @ObjCMethodSign(sign = "- (void)reloadData;", selector = "reloadData")
    public native void reloadData();

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)reloadSectionIndexTitles NS_AVAILABLE_IOS(3_0);", selector = "reloadSectionIndexTitles")
    public native void reloadSectionIndexTitles();

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSections;", selector = "numberOfSections")
    public native @NSInteger long numberOfSections();

    @ObjCMethodSign(sign = "- (NSInteger)numberOfRowsInSection:(NSInteger)section;", selector = "numberOfRowsInSection:")
    public native @NSInteger long numberOfRowsInSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (CGRect)rectForSection:(NSInteger)section;", selector = "rectForSection:")
    public native @ObjCByValue CGRect rectForSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (CGRect)rectForHeaderInSection:(NSInteger)section;", selector = "rectForHeaderInSection:")
    public native @ObjCByValue CGRect rectForHeaderInSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (CGRect)rectForFooterInSection:(NSInteger)section;", selector = "rectForFooterInSection:")
    public native @ObjCByValue CGRect rectForFooterInSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (CGRect)rectForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "rectForRowAtIndexPath:")
    public native @ObjCByValue CGRect rectForRowAtIndexPath$(NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathForRowAtPoint:(CGPoint)point;", selector = "indexPathForRowAtPoint:")
    public native NSIndexPath indexPathForRowAtPoint$(@ObjCByValue CGPoint point);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathForCell:(UITableViewCell *)cell;", selector = "indexPathForCell:")
    public native NSIndexPath indexPathForCell$(UITableViewCell cell);

    @ObjCMethodSign(sign = "- (NSArray *)indexPathsForRowsInRect:(CGRect)rect;", selector = "indexPathsForRowsInRect:")
    public native NSArray indexPathsForRowsInRect$(@ObjCByValue CGRect rect);

    @ObjCMethodSign(sign = "- (UITableViewCell *)cellForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "cellForRowAtIndexPath:")
    public native UITableViewCell cellForRowAtIndexPath$(NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)visibleCells;", selector = "visibleCells")
    public native NSArray visibleCells();

    @ObjCMethodSign(sign = "- (NSArray *)indexPathsForVisibleRows;", selector = "indexPathsForVisibleRows")
    public native NSArray indexPathsForVisibleRows();

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UITableViewHeaderFooterView *)headerViewForSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "headerViewForSection:")
    public native UITableViewHeaderFooterView headerViewForSection$(@NSInteger long section);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (UITableViewHeaderFooterView *)footerViewForSection:(NSInteger)section NS_AVAILABLE_IOS(6_0);", selector = "footerViewForSection:")
    public native UITableViewHeaderFooterView footerViewForSection$(@NSInteger long section);

    @ObjCMethodSign(sign = "- (void)scrollToRowAtIndexPath:(NSIndexPath *)indexPath atScrollPosition:(UITableViewScrollPosition)scrollPosition animated:(BOOL)animated;", selector = "scrollToRowAtIndexPath:atScrollPosition:animated:")
    public native void scrollToRowAtIndexPath$atScrollPosition$animated$(NSIndexPath indexPath, UITableViewScrollPosition scrollPosition, boolean animated);

    @ObjCMethodSign(sign = "- (void)scrollToNearestSelectedRowAtScrollPosition:(UITableViewScrollPosition)scrollPosition animated:(BOOL)animated;", selector = "scrollToNearestSelectedRowAtScrollPosition:animated:")
    public native void scrollToNearestSelectedRowAtScrollPosition$animated$(UITableViewScrollPosition scrollPosition, boolean animated);

    @ObjCMethodSign(sign = "- (void)beginUpdates;", selector = "beginUpdates")
    public native void beginUpdates();

    @ObjCMethodSign(sign = "- (void)endUpdates;", selector = "endUpdates")
    public native void endUpdates();

    @ObjCMethodSign(sign = "- (void)insertSections:(NSIndexSet *)sections withRowAnimation:(UITableViewRowAnimation)animation;", selector = "insertSections:withRowAnimation:")
    public native void insertSections$withRowAnimation$(NSIndexSet sections, UITableViewRowAnimation animation);

    @ObjCMethodSign(sign = "- (void)deleteSections:(NSIndexSet *)sections withRowAnimation:(UITableViewRowAnimation)animation;", selector = "deleteSections:withRowAnimation:")
    public native void deleteSections$withRowAnimation$(NSIndexSet sections, UITableViewRowAnimation animation);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)reloadSections:(NSIndexSet *)sections withRowAnimation:(UITableViewRowAnimation)animation NS_AVAILABLE_IOS(3_0);", selector = "reloadSections:withRowAnimation:")
    public native void reloadSections$withRowAnimation$(NSIndexSet sections, UITableViewRowAnimation animation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)moveSection:(NSInteger)section toSection:(NSInteger)newSection NS_AVAILABLE_IOS(5_0);", selector = "moveSection:toSection:")
    public native void moveSection$toSection$(@NSInteger long section, @NSInteger long newSection);

    @ObjCMethodSign(sign = "- (void)insertRowsAtIndexPaths:(NSArray *)indexPaths withRowAnimation:(UITableViewRowAnimation)animation;", selector = "insertRowsAtIndexPaths:withRowAnimation:")
    public native void insertRowsAtIndexPaths$withRowAnimation$(NSArray indexPaths, UITableViewRowAnimation animation);

    @ObjCMethodSign(sign = "- (void)deleteRowsAtIndexPaths:(NSArray *)indexPaths withRowAnimation:(UITableViewRowAnimation)animation;", selector = "deleteRowsAtIndexPaths:withRowAnimation:")
    public native void deleteRowsAtIndexPaths$withRowAnimation$(NSArray indexPaths, UITableViewRowAnimation animation);

    /**
     * @since Available in iOS 3.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)reloadRowsAtIndexPaths:(NSArray *)indexPaths withRowAnimation:(UITableViewRowAnimation)animation NS_AVAILABLE_IOS(3_0);", selector = "reloadRowsAtIndexPaths:withRowAnimation:")
    public native void reloadRowsAtIndexPaths$withRowAnimation$(NSArray indexPaths, UITableViewRowAnimation animation);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)moveRowAtIndexPath:(NSIndexPath *)indexPath toIndexPath:(NSIndexPath *)newIndexPath NS_AVAILABLE_IOS(5_0);", selector = "moveRowAtIndexPath:toIndexPath:")
    public native void moveRowAtIndexPath$toIndexPath$(NSIndexPath indexPath, NSIndexPath newIndexPath);

    @ObjCMethodSign(sign = "- (void)setEditing:(BOOL)editing animated:(BOOL)animated;", selector = "setEditing:animated:")
    public native void setEditing$animated$(boolean editing, boolean animated);

    @ObjCMethodSign(sign = "- (NSIndexPath *)indexPathForSelectedRow;", selector = "indexPathForSelectedRow")
    public native NSIndexPath indexPathForSelectedRow();

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (NSArray *)indexPathsForSelectedRows NS_AVAILABLE_IOS(5_0);", selector = "indexPathsForSelectedRows")
    public native NSArray indexPathsForSelectedRows();

    @ObjCMethodSign(sign = "- (void)selectRowAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated scrollPosition:(UITableViewScrollPosition)scrollPosition;", selector = "selectRowAtIndexPath:animated:scrollPosition:")
    public native void selectRowAtIndexPath$animated$scrollPosition$(NSIndexPath indexPath, boolean animated, UITableViewScrollPosition scrollPosition);

    @ObjCMethodSign(sign = "- (void)deselectRowAtIndexPath:(NSIndexPath *)indexPath animated:(BOOL)animated;", selector = "deselectRowAtIndexPath:animated:")
    public native void deselectRowAtIndexPath$animated$(NSIndexPath indexPath, boolean animated);

    @ObjCMethodSign(sign = "- (id)dequeueReusableCellWithIdentifier:(NSString *)identifier;", selector = "dequeueReusableCellWithIdentifier:")
    public native NSObject dequeueReusableCellWithIdentifier$(NSString identifier);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)dequeueReusableCellWithIdentifier:(NSString *)identifier forIndexPath:(NSIndexPath *)indexPath NS_AVAILABLE_IOS(6_0);", selector = "dequeueReusableCellWithIdentifier:forIndexPath:")
    public native NSObject dequeueReusableCellWithIdentifier$forIndexPath$(NSString identifier, NSIndexPath indexPath);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (id)dequeueReusableHeaderFooterViewWithIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(6_0);", selector = "dequeueReusableHeaderFooterViewWithIdentifier:")
    public native NSObject dequeueReusableHeaderFooterViewWithIdentifier$(NSString identifier);

    /**
     * @since Available in iOS 5.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)registerNib:(UINib *)nib forCellReuseIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(5_0);", selector = "registerNib:forCellReuseIdentifier:")
    public native void registerNib$forCellReuseIdentifier$(UINib nib, NSString identifier);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)registerClass:(Class)cellClass forCellReuseIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(6_0);", selector = "registerClass:forCellReuseIdentifier:")
    public native void registerClass$forCellReuseIdentifier$(ObjCClass cellClass, NSString identifier);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)registerNib:(UINib *)nib forHeaderFooterViewReuseIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(6_0);", selector = "registerNib:forHeaderFooterViewReuseIdentifier:")
    public native void registerNib$forHeaderFooterViewReuseIdentifier$(UINib nib, NSString identifier);

    /**
     * @since Available in iOS 6.0 and later.
     */
    @ObjCMethodSign(sign = "- (void)registerClass:(Class)aClass forHeaderFooterViewReuseIdentifier:(NSString *)identifier NS_AVAILABLE_IOS(6_0);", selector = "registerClass:forHeaderFooterViewReuseIdentifier:")
    public native void registerClass$forHeaderFooterViewReuseIdentifier$(ObjCClass aClass, NSString identifier);
}
