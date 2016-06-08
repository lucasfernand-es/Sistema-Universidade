/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Util;

import VO.ValueObject;
import controller.BaseController;
import controller.Util.TypeData;
import controller.Util.TypeDataOperation;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import view.ViewHelper;

/**
 *
 * @author lucasfernandes
 */
public class JComboBoxTypeData {
    
    private final JComboBox jComboBox;
    private final TypeData typeData;
    
    public JComboBoxTypeData (JComboBox jComboBox, TypeData typeData)
    {
        this.jComboBox = jComboBox;
        this.typeData = typeData;
    }
    
    
    public JComboBox getjComboBox() {
        return jComboBox;
    }

    public TypeData getTypeData() {
        return typeData;
    }

    
    public void populateComboBox() {
        
        populateComboBoxType(0, null);
        
    }
    
    private void populateComboBoxType(int type, ValueObject valueObject)
    {
        this.jComboBox.removeAllItems();
        
        BaseController baseController = new BaseController(this.typeData);
        
        List<ValueObject> listData = new ArrayList();
        switch(type)
        {
            case 1:
                if(TypeDataOperation.isClassOfTypeData(this.typeData, valueObject))
                    listData = baseController.search(valueObject);
                break;
            default:
                listData = baseController.search();
                break;
        }
        
        listData.stream().forEach((data) -> {
            this.jComboBox.addItem(data);
        });
    }
    
    public void populateComboBox(ValueObject valueObject)
    {
        populateComboBoxType(1, valueObject);
    }
    
    public ValueObject getObject(int index)
    {   
        return (ValueObject) this.jComboBox.getItemAt(index);
    }
    
    public ValueObject getObject()
    {   
        return (ValueObject) this.jComboBox.getSelectedItem();
    }
    
    public int getObjectIndex(ValueObject valueObject) {
        
        for(int i = 0; i < this.jComboBox.getItemCount(); i++)
        {
            ValueObject item = (ValueObject) this.jComboBox.getItemAt(i);
            
            if( item.getId() == valueObject.getId() )
                return i;
        }
        
        return 0;
    }
    
    public static JComboBox getJComboBox(List<JComboBoxTypeData> listJComboBoxTypeData, TypeData typeData)
    {
        for(JComboBoxTypeData jComboBoxTypeData: listJComboBoxTypeData)
        {
            if(jComboBoxTypeData.getTypeData() == typeData)
                return jComboBoxTypeData.getjComboBox();
        }
            
        return null;
    }
    
    public static JComboBoxTypeData getJComboBoxTypeData(List<JComboBoxTypeData> listJComboBoxTypeData, TypeData typeData)
    {
        for(JComboBoxTypeData jComboBoxTypeData: listJComboBoxTypeData)
        {
            if(jComboBoxTypeData.getTypeData() == typeData)
                return jComboBoxTypeData;
        }
            
        return null;
    }
    
    public static void setItem(List<JComboBoxTypeData> listJComboBoxTypeData, TypeData typeData, ValueObject valueObject)
    {
        JComboBoxTypeData tempJComboBoxTypeData = JComboBoxTypeData.getJComboBoxTypeData(listJComboBoxTypeData, typeData);
        
        if(tempJComboBoxTypeData == null)
        {
            ViewHelper.errorMessage("Não há jComboBox do tipo" + TypeDataOperation.getTypeDataString(typeData));
            return;
        }
        
        int index = tempJComboBoxTypeData.getObjectIndex(valueObject);
        //System.out.println("INDEX = " + index + " - " + typeData);
        tempJComboBoxTypeData.getjComboBox().setSelectedIndex(index);
        
    }
            
            
}
