/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labb1fix;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author william
 */
public class listModel extends AbstractListModel{
    List<String> chatDataList;
    public listModel() {
        chatDataList = new ArrayList<>();
    }
    
    public void addChat(String chatData){
        chatDataList.add(chatData);
        fireContentsChanged(chatData, 0, chatDataList.size()-1);
    }

    public void removeall(){
        chatDataList.removeAll(chatDataList);   
    }
    
    @Override
    public int getSize() {
        return chatDataList.size();
    }

    @Override
    public Object getElementAt(int index) {
        if(index >= chatDataList.size()){
            throw new IndexOutOfBoundsException("chatDataList, "
                    + "index out of bounds, " + index + " > " +
                    chatDataList.size() + ".");
        }
        return chatDataList.get(index);
    }
    
}
