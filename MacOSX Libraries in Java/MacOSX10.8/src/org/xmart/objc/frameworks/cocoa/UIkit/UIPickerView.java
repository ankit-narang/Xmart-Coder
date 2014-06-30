package org.xmart.objc.frameworks.cocoa.UIkit;

import java.util.*;
import java.io.*;
import org.xmart.objc.type.*;
import org.xmart.objc.annotation.*;
import org.xmart.objc.frameworks.cocoa.Foundation.*;

@ObjCFramework("UIKit")
public class UIPickerView extends UIView implements NSCoding, UITableViewDataSource {
    
    public UIPickerView() {}
    @ObjCPropertyGetter(selector = "dataSource")
    public native UIPickerViewDataSource getDataSource();
    @ObjCPropertySetter(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UIPickerViewDataSource v);
    @ObjCProperty public UIPickerViewDataSource dataSource;

    @ObjCPropertyGetter(selector = "delegate")
    public native UIPickerViewDelegate getDelegate();
    @ObjCPropertySetter(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPickerViewDelegate v);
    @ObjCProperty public UIPickerViewDelegate delegate;

    @ObjCPropertyGetter(selector = "showsSelectionIndicator")
    public native boolean isShowsSelectionIndicator();
    @ObjCPropertySetter(selector = "setShowsSelectionIndicator:")
    public native void setShowsSelectionIndicator(boolean v);
    @ObjCProperty public boolean showsSelectionIndicator;

    @ObjCPropertyGetter(selector = "numberOfComponents")
    public native @NSInteger long getNumberOfComponents();
    @ObjCProperty public @NSInteger long numberOfComponents;
    
    @ObjCMethodSign(sign = "- (NSInteger)numberOfRowsInComponent:(NSInteger)component;", selector = "numberOfRowsInComponent:")
    public native @NSInteger long numberOfRowsInComponent$(@NSInteger long component);

    @ObjCMethodSign(sign = "- (CGSize)rowSizeForComponent:(NSInteger)component;", selector = "rowSizeForComponent:")
    public native @ObjCByValue CGSize rowSizeForComponent$(@NSInteger long component);

    @ObjCMethodSign(sign = "- (UIView *)viewForRow:(NSInteger)row forComponent:(NSInteger)component;", selector = "viewForRow:forComponent:")
    public native UIView viewForRow$forComponent$(@NSInteger long row, @NSInteger long component);

    @ObjCMethodSign(sign = "- (void)reloadAllComponents;", selector = "reloadAllComponents")
    public native void reloadAllComponents();

    @ObjCMethodSign(sign = "- (void)reloadComponent:(NSInteger)component;", selector = "reloadComponent:")
    public native void reloadComponent$(@NSInteger long component);

    @ObjCMethodSign(sign = "- (void)selectRow:(NSInteger)row inComponent:(NSInteger)component animated:(BOOL)animated;", selector = "selectRow:inComponent:animated:")
    public native void selectRow$inComponent$animated$(@NSInteger long row, @NSInteger long component, boolean animated);

    @ObjCMethodSign(sign = "- (NSInteger)selectedRowInComponent:(NSInteger)component;", selector = "selectedRowInComponent:")
    public native @NSInteger long selectedRowInComponent$(@NSInteger long component);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView numberOfRowsInSection:(NSInteger)section;", selector = "tableView:numberOfRowsInSection:")
    public native @NSInteger long tableView$numberOfRowsInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (UITableViewCell *)tableView:(UITableView *)tableView cellForRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:cellForRowAtIndexPath:")
    public native UITableViewCell tableView$cellForRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSInteger)numberOfSectionsInTableView:(UITableView *)tableView;", selector = "numberOfSectionsInTableView:")
    public native @NSInteger long numberOfSectionsInTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForHeaderInSection:(NSInteger)section;", selector = "tableView:titleForHeaderInSection:")
    public native NSString tableView$titleForHeaderInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (NSString *)tableView:(UITableView *)tableView titleForFooterInSection:(NSInteger)section;", selector = "tableView:titleForFooterInSection:")
    public native NSString tableView$titleForFooterInSection$(UITableView tableView, @NSInteger long section);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canEditRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canEditRowAtIndexPath:")
    public native boolean tableView$canEditRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (BOOL)tableView:(UITableView *)tableView canMoveRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:canMoveRowAtIndexPath:")
    public native boolean tableView$canMoveRowAtIndexPath$(UITableView tableView, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (NSArray *)sectionIndexTitlesForTableView:(UITableView *)tableView;", selector = "sectionIndexTitlesForTableView:")
    public native NSArray sectionIndexTitlesForTableView$(UITableView tableView);

    @ObjCMethodSign(sign = "- (NSInteger)tableView:(UITableView *)tableView sectionForSectionIndexTitle:(NSString *)title atIndex:(NSInteger)index;", selector = "tableView:sectionForSectionIndexTitle:atIndex:")
    public native @NSInteger long tableView$sectionForSectionIndexTitle$atIndex$(UITableView tableView, NSString title, @NSInteger long index);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView commitEditingStyle:(UITableViewCellEditingStyle)editingStyle forRowAtIndexPath:(NSIndexPath *)indexPath;", selector = "tableView:commitEditingStyle:forRowAtIndexPath:")
    public native void tableView$commitEditingStyle$forRowAtIndexPath$(UITableView tableView, UITableViewCellEditingStyle editingStyle, NSIndexPath indexPath);

    @ObjCMethodSign(sign = "- (void)tableView:(UITableView *)tableView moveRowAtIndexPath:(NSIndexPath *)sourceIndexPath toIndexPath:(NSIndexPath *)destinationIndexPath;", selector = "tableView:moveRowAtIndexPath:toIndexPath:")
    public native void tableView$moveRowAtIndexPath$toIndexPath$(UITableView tableView, NSIndexPath sourceIndexPath, NSIndexPath destinationIndexPath);
}
